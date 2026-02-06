{ pkgs }: {
  deps = [
    pkgs.jdk17
    pkgs.maven
    pkgs.chromium
    pkgs.chromedriver
  ];
}
