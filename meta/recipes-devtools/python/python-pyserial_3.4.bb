SUMMARY = "Python Serial Port Extension"
HOMEPAGE = "https://github.com/pyserial/pyserial"
SECTION = "devel/python"
LICENSE = "BSD"
# LIC_FILES_CHKSUM = "file://LICENSE;md5=66c2378a96b307d56bfb3a9e58edafa8"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d476d94926db6e0008a5b3860d1f5c0d"

## SRC_URI = "https://pypi.python.org/packages/source/p/pexpect/pexpect-${PV}.tar.gz"
SRC_URI = "https://pypi.python.org/pypi/pyserial/pyserial-${PV}.tar.gz"
SRC_URI[md5sum] = "ed6183b15519a0ae96675e9c3330c69b"
SRC_URI[sha256sum] = "6e2d401fdee0eab996cf734e67773a0143b932772ca8b42451440cfed942c627"

# UPSTREAM_CHECK_URI = "https://pypi.python.org/pypi/pexpect"
UPSTREAM_CHECK_URI = "https://pypi.python.org/pypi/pyserial"

# S = "${WORKDIR}/pexpect-${PV}"
S = "${WORKDIR}/pyserial-${PV}"

inherit distutils

RDEPENDS_${PN} = "\
    python-core \
    python-io \
    python-terminal \
    python-resource \
    python-fcntl \
"

BBCLASSEXTEND = "nativesdk"


