# CPU_RAM_GPU.py
import time
import streamlit as st
import matplotlib.pyplot as plt
import mplcursors
from Hardware import get_cpu_info, get_ram_info, get_gpu_info

st.title('Real-time Hardware Monitoring')

cpu_container = st.empty()
ram_container = st.empty()
gpu_container = st.empty()
st_plot = st.empty()

cpu_data = []
ram_data = []
gpu_data = []
counter = 0
max_iterations = 20

while counter < max_iterations:
    cpu_percent = get_cpu_info()
    ram_percent = get_ram_info()
    gpu_percent = get_gpu_info()
    
    cpu_data.append(cpu_percent)
    ram_data.append(ram_percent)
    gpu_data.append(gpu_percent)
    
    if len(cpu_data) > 100:
        cpu_data.pop(0)
        ram_data.pop(0)
        gpu_data.pop(0)
    
    cpu_container.write(f"CPU Usage: {cpu_percent}%")
    ram_container.write(f"RAM Usage: {ram_percent}%")
    gpu_container.write(f"GPU Load: {gpu_percent}%")
    
    plt.figure(figsize=(10, 5))
    plt.plot(cpu_data, label='CPU Usage %', color='blue')
    plt.plot(ram_data, label='RAM Usage %', color='green')
    plt.plot(gpu_data, label='GPU Load %', color='red')
    plt.xlabel('Time (seconds)')
    plt.ylabel('Usage %')
    plt.title('Real-time Hardware Usage')
    plt.legend(loc='upper left')
    
    cursor = mplcursors.cursor(hover=True)
    cursor.connect("add", lambda sel: sel.annotation.set_text(f'{sel.target[1]:.2f}%'))
    
    st_plot.pyplot(plt)
    
    time.sleep(1)
    counter += 1
