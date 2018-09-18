SUMMARY = "A console-only image that fully supports the target device \
hardware."

IMAGE_INSTALL += "packagegroup-core-buildessential"

IMAGE_FEATURES += "splash dev-pkgs"

LICENSE = "MIT"

inherit core-image
