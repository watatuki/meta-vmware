SUMMARY = "Startup script for the Weston Wayland compositor"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690"

SRC_URI = "file://weston.ini"

S = "${WORKDIR}"

do_install() {
	install -d ${D}/${sysconfdir}/xdg/weston
	install -m755 ${WORKDIR}/weston.ini ${D}/${sysconfdir}/xdg/weston/weston.ini
}

