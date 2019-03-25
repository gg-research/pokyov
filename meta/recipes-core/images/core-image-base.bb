SUMMARY = "A console-only image that fully supports the target device \
hardware."

# tools-testapps include i2c-tools
#  ref ./poky-ov/meta/class/core-image.bbclass for all the possible features that can be added here
##
## tools-testapps - i2c-tools
##
IMAGE_FEATURES += "\
splash \
dev-pkgs \
tools-sdk \
ssh-server-openssh \
tools-testapps \
"

#
# packages to install 
# mf - note I have added this 
# -- core-image-base must have a default set of pkgs it installs
#
IMAGE_INSTALL += "\
i2c-tools \
"

LICENSE = "MIT"

inherit core-image
