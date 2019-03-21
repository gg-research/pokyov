SUMMARY = "A console-only image that fully supports the target device \
hardware."

IMAGE_FEATURES += "splash dev-pkgs tools-sdk i2c-tools ssh-server-openssh"

LICENSE = "MIT"

inherit core-image
