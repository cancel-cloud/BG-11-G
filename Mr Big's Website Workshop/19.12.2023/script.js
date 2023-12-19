function encrypt() {
    const inputText = document.getElementById('inputText').value;
    const key = document.getElementById('key').value;
    const encryptedText = binaryXOR(inputText, key);
    document.getElementById('result').textContent = encryptedText;
}

function decrypt() {
    const encryptedText = document.getElementById('inputText').value;
    const key = document.getElementById('key').value;
    const decryptedText = binaryXOR(encryptedText, key);
    document.getElementById('result').textContent = decryptedText;
}

function binaryXOR(input, key) {
    let result = '';
    for (let i = 0; i < input.length; i++) {
        let charCode = input.charCodeAt(i) ^ key.charCodeAt(i % key.length);
        result += String.fromCharCode(charCode);
    }
    return result;
}
