from flask import Flask, jsonify, request, render_template
import numpy as np
import random
import traceback
import csv
import time

app = Flask(__name__)

SIZE = 4
START_TIME = time.time()

def initialize_game():
    board = np.zeros((SIZE, SIZE), dtype=int)
    add_random_tile(board)
    add_random_tile(board)
    return board, 0

def add_random_tile(board):
    empty_cells = [(i, j) for i in range(SIZE) for j in range(SIZE) if board[i, j] == 0]
    if empty_cells:
        i, j = random.choice(empty_cells)
        board[i, j] = 2 if random.random() < 0.9 else 4

def compress(board):
    new_board = np.zeros((SIZE, SIZE), dtype=int)
    for i in range(SIZE):
        pos = 0
        for j in range(SIZE):
            if board[i, j] != 0:
                new_board[i, pos] = board[i, j]
                pos += 1
    return new_board

def merge(board):
    score = 0
    for i in range(SIZE):
        for j in range(SIZE - 1):
            if board[i, j] == board[i, j + 1] and board[i, j] != 0:
                board[i, j] *= 2
                board[i, j + 1] = 0
                score += board[i, j]
    return board, score

def reverse(board):
    return np.flip(board, axis=1)

def transpose(board):
    return np.transpose(board)

def move_left(board):
    new_board = compress(board)
    new_board, score = merge(new_board)
    new_board = compress(new_board)
    return new_board, score

def move_right(board):
    new_board = reverse(board)
    new_board, score = move_left(new_board)
    new_board = reverse(new_board)
    return new_board, score

def move_up(board):
    new_board = transpose(board)
    new_board, score = move_left(new_board)
    new_board = transpose(new_board)
    return new_board, score

def move_down(board):
    new_board = transpose(board)
    new_board, score = move_right(new_board)
    new_board = transpose(new_board)
    return new_board, score

def get_available_moves(board):
    moves = []
    for direction in [move_left, move_right, move_up, move_down]:
        new_board, _ = direction(board)
        if not np.array_equal(board, new_board):
            moves.append(direction)
    return moves

def evaluate_board(board):
    return np.sum(board * (np.arange(SIZE**2).reshape(SIZE, SIZE) + 1))

def expectimax(board, depth, is_maximizing_player):
    if depth == 0 or not get_available_moves(board):
        return evaluate_board(board)
    
    if is_maximizing_player:
        max_eval = float('-inf')
        for move in get_available_moves(board):
            new_board, _ = move(board)
            eval = expectimax(new_board, depth - 1, False)
            max_eval = max(max_eval, eval)
        return max_eval
    else:
        empty_cells = [(i, j) for i in range(SIZE) for j in range(SIZE) if board[i, j] == 0]
        if not empty_cells:
            return evaluate_board(board)
        avg_eval = 0
        for i, j in empty_cells:
            for tile_value in [2, 4]:
                board[i, j] = tile_value
                avg_eval += 0.9 * expectimax(board, depth - 1, True) if tile_value == 2 else 0.1 * expectimax(board, depth - 1, True)
                board[i, j] = 0
        avg_eval /= len(empty_cells)
        return avg_eval

def find_best_move(board, depth=3):
    best_score = float('-inf')
    best_move = None
    for move in get_available_moves(board):
        new_board, _ = move(board)
        score = expectimax(new_board, depth - 1, False)
        if score > best_score:
            best_score = score
            best_move = move
    return best_move

board, score = initialize_game()

def save_statistics(score, duration):
    with open('statistics.csv', mode='a', newline='') as file:
        writer = csv.writer(file)
        writer.writerow([score, duration])

@app.route('/')
def index():
    return render_template('index.html')

@app.route('/move', methods=['POST'])
def move():
    global board, score
    try:
        if request.is_json:
            data = request.get_json()
            direction = data.get('direction')
        else:
            direction = None

        if direction == 'up':
            board, move_score = move_up(board)
        elif direction == 'down':
            board, move_score = move_down(board)
        elif direction == 'left':
            board, move_score = move_left(board)
        elif direction == 'right':
            board, move_score = move_right(board)
        else:
            best_move = find_best_move(board)
            if best_move:
                board, move_score = best_move(board)
            else:
                move_score = 0
        
        score += move_score
        add_random_tile(board)
        return jsonify({'board': board.tolist(), 'score': int(score)})
    except Exception as e:
        traceback.print_exc()
        return jsonify({'error': str(e)}), 500

@app.route('/reset', methods=['POST'])
def reset():
    global board, score, START_TIME
    duration = time.time() - START_TIME
    save_statistics(score, duration)
    board, score = initialize_game()
    START_TIME = time.time()
    return jsonify({'board': board.tolist(), 'score': score})

if __name__ == '__main__':
    app.run(debug=True)
