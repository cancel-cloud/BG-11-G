# QR Code Generator

This is a simple Python script that generates QR codes from user-provided links and saves them to a specified folder.

## Requirements

- Python 3.10
- Conda (for managing environments)
- `qrcode` library
- `Pillow` library

## Setup

1. **Create and activate the Conda environment:**

    ```bash
    conda create --name school python=3.10
    conda activate school
    ```

2. **Install the required packages:**

    ```bash
    conda install -c conda-forge qrcode
    conda install -c conda-forge pillow
    ```

## Usage

1. **Clone or download this repository to your local machine.**

2. **Navigate to the directory containing the script:**

    ```bash
    cd path/to/your/directory
    ```

3. **Run the script:**

    ```bash
    python QRCodeGenerator.py
    ```

4. **Enter the link you want to generate a QR code for when prompted:**

    ```bash
    Please enter the link you want to use for the QR code: https://www.example.com
    ```

5. **The script will generate a QR code and save it in the `qrcodes` folder with the filename `generated_qr.png`.**

## Example

Here is an example of how to use the script:

```bash
$ python QRCodeGenerator.py
Please enter the link you want to use for the QR code: https://www.example.com
QR Code saved at qrcodes/generated_qr.png
```

## Script Overview

The script performs the following steps:

1. Prompts the user to enter a link.
2. Generates a QR code from the provided link.
3. Ensures the save folder exists.
4. Saves the generated QR code image to the specified folder.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.