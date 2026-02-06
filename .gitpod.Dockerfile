FROM gitpod/workspace-full-vnc

# Install Java JDK 17, Maven, Chrome, ChromeDriver, and Firefox
RUN sudo apt-get update && \
    sudo apt-get install -y \
    openjdk-17-jdk \
    maven \
    chromium-browser \
    chromium-chromedriver \
    firefox-esr \
    && sudo apt-get clean && \
    sudo rm -rf /var/lib/apt/lists/*

# Set environment variables
ENV JAVA_HOME=/usr/lib/jvm/java-17-openjdk-amd64
ENV CHROMEDRIVER_PATH=/usr/bin/chromedriver
ENV PATH="${JAVA_HOME}/bin:${PATH}"
