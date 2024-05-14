
# Real-time Hardware Monitoring Dashboard

This project provides a real-time hardware monitoring dashboard using Streamlit and Jupyter notebooks. It displays the usage of CPU, RAM, and GPU, and allows for interactive plots with hover functionality.

## Features

- Real-time CPU, RAM, and GPU monitoring.
- Interactive plots with hover functionality to display percentage values.
- Separate Jupyter notebooks for data simulation and analysis.

## Requirements

- macOS
- Conda (Miniforge recommended)

## Installation

### Step 1: Install Miniforge via Homebrew

If you don't have Homebrew installed, install it first:
```bash
/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
```

Then, install Miniforge using Homebrew:
```bash
brew install miniforge
```

### Step 2: Create and Set Up the Conda Environment

1. **Create the Conda Environment:**
    ```bash
    conda create -n school python=3.10
    ```

2. **Activate the Conda Environment:**
    ```bash
    conda activate school
    ```

3. **Install Required Packages:**
    ```bash
    conda install -c conda-forge psutil gputil streamlit matplotlib jupyter
    pip install mplcursors
    ```

### Step 3: Clone the Repository

Clone this repository to your local machine:
```bash
git clone https://github.com/yourusername/your-repo-name.git
cd your-repo-name
```

## Usage

### Running the Jupyter Notebooks

1. **Start Jupyter Notebook:**
    ```bash
    jupyter notebook
    ```

2. **Open and Run Notebooks:**
    - `RAM_CPU_GPU.ipynb`
    - `CPU_Simulation.ipynb`

### Running the Streamlit Application

1. **Navigate to the Script Directory:**
    ```bash
    cd path_to_your_script_directory
    ```

2. **Run the Streamlit Application:**
    ```bash
    streamlit run CPU_RAM_GPU.py
    ```

3. **Access the Application:**
    - Open your web browser and go to the URL provided by Streamlit, typically `http://localhost:8501`.

## Files

- `Hardware.py`: Contains functions to retrieve CPU, RAM, and GPU usage.
- `CPU_RAM_GPU.py`: Streamlit application script for real-time monitoring.
- `RAM_CPU_GPU.ipynb`: Jupyter notebook for initial hardware monitoring analysis.
- `CPU_Simulation.ipynb`: Jupyter notebook for simulating CPU data.
- `PlotUtils.py`: Contains utility functions for plotting data.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments

- [psutil](https://github.com/giampaolo/psutil)
- [GPUtil](https://github.com/anderskm/gputil)
- [Streamlit](https://streamlit.io/)
- [Matplotlib](https://matplotlib.org/)
- [mplcursors](https://mplcursors.readthedocs.io/en/stable/)

---

Feel free to contribute and raise issues on GitHub!
```

### Instructions for Creating the Conda Environment and Installing Packages

1. **Create the Conda Environment:**
    ```bash
    conda create -n school python=3.10
    ```

2. **Activate the Conda Environment:**
    ```bash
    conda activate school
    ```

3. **Install Required Packages:**
    ```bash
    conda install -c conda-forge psutil gputil streamlit matplotlib jupyter
    pip install mplcursors
    ```

This `README.md` file provides a comprehensive guide for setting up the environment, running the application, and understanding the project structure. Make sure to replace the placeholders like `yourusername` and `your-repo-name` with the actual values relevant to your GitHub repository.