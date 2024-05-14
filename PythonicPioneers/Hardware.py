# Hardware.py
import psutil
import GPUtil
import platform

def get_cpu_info():
    return psutil.cpu_percent(interval=1)

def get_ram_info():
    return psutil.virtual_memory().percent

def get_gpu_info():
    if platform.system() == "Darwin":  # Check if the system is macOS
        try:
            gpus = GPUtil.getGPUs()
            gpu_load = gpus[0].load if gpus else 0
            return gpu_load
        except:
            return 0
    return 0

