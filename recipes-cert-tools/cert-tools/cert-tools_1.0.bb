# 
# Insert appropriate license below 
LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MPL-2.0;md5=815ca599c9df247a0c7f619bab123dad"

FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"

SRC_URI += "      \
    file://Btdiag \
    file://Qcmbr  \
"

DEPENDS = "bluez5"

do_install() {
    # Install binaries into /usr/sbin
    install -d ${D}${sbindir}
    install -m 0655 ${WORKDIR}/Btdiag ${D}${sbindir}
    install -m 0655 ${WORKDIR}/Qcmbr ${D}${sbindir}
}

INSANE_SKIP_${PN}_append = "already-stripped"

COMPATIBLE_MACHINE = "(ccardimx28|ccimx6$|ccimx6ul)"

