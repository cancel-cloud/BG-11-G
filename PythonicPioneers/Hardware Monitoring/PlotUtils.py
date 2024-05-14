# PlotUtils.py
import matplotlib.pyplot as plt

def save_data(data):
    return data[:100]

def plot_data(data):
    plt.plot(data)
    plt.xlabel('Sample')
    plt.ylabel('CPU Usage %')
    plt.title('CPU Usage Simulation')
    plt.show()
