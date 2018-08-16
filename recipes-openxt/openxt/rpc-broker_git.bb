DESCRIPTION = "RPC Broker"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=4ce87f3facb6f911c142c8bef9bfb380"
DEPENDS = "json-c libwebsockets libv4v dbus libxml2"

PV = "0+git${SRCPV}"

SRCREV = "${AUTOREV}"
SRC_URI = "git://github.com/tijko/rpc-broker;protocol=https;branch=master"

S = "${WORKDIR}/git/"

EXTRA_OECONF += ""
EXTRA_OEMAKE += ""

inherit autotools
inherit pkgconfig

