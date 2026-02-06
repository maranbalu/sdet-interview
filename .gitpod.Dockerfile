FROM gitpod/workspace-full-vnc

# Install Maven, Chrome, ChromeDriver, and Firefox
RUN sudo apt-get update && \
    sudo apt-get install -y \
    maven \
    chromium-browser \
    chromium-chromedriver \
    firefox-esr \
    && sudo apt-get clean && \
    sudo rm -rf /var/lib/apt/lists/*

# Set ChromeDriver path
ENV CHROMEDRIVER_PATH=/usr/bin/chromedriver
