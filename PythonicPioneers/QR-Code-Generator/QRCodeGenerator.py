import qrcode
import os

def generate_qr_code(data, save_folder, file_name):
    # Create the QR code
    qr = qrcode.QRCode(
        version=1,
        error_correction=qrcode.constants.ERROR_CORRECT_L,
        box_size=10,
        border=4,
    )
    qr.add_data(data)
    qr.make(fit=True)
    
    # Create an image from the QR Code instance
    img = qr.make_image(fill='black', back_color='white')
    
    # Ensure the save folder exists
    if not os.path.exists(save_folder):
        os.makedirs(save_folder)
    
    # Define the full path for the file
    file_path = os.path.join(save_folder, file_name)
    
    # Save the image
    img.save(file_path)
    print(f"QR Code saved at {file_path}")

if __name__ == "__main__":
    # Prompt the user for the link
    data = input("Please enter the link you want to use for the QR code: ")
    
    # Define the folder and filename
    save_folder = "qrcodes"
    file_name = "generated_qr.png"
    
    # Generate the QR code
    generate_qr_code(data, save_folder, file_name)
