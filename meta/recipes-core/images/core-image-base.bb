SUMMARY = "A console-only image that fully supports the target device \
hardware."

# tools-testapps include i2c-tools
#  ref ./poky-ov/meta/class/core-image.bbclass for all the possible features that can be added here
##
IMAGE_FEATURES += "splash dev-pkgs tools-sdk ssh-server-openssh tools-testapps"

LICENSE = "MIT"

inherit core-image
