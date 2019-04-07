SUMMARY = "A console-only image that fully supports the target device \
hardware."

# tools-testapps include i2c-tools
#  ref ./poky-ov/meta/classes/core-image.bbclass for all the possible features that can be added here
##
## tools-testapps - i2c-tools
##
IMAGE_FEATURES += "\
splash \
dev-pkgs \
tools-sdk \
ssh-server-openssh \
"

#
# packages to install 
# mf - note I have added this 
# -- core-image-base must have a default set of pkgs it installs
#
# Note according to ./documentation/../ref-variables.xml the
# += format here can cause ordering issues
# IMAGE_INSTALL += "i2c-tools"
# 
# it is better to use this. Note the prepended space.
#
IMAGE_INSTALL_append = " i2c-tools python-pyserial git cmake"

LICENSE = "MIT"

inherit core-image
