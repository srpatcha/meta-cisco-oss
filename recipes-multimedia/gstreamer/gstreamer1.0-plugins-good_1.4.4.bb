include gstreamer1.0-plugins-good.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=a6f89e2100d9b6cdffcea4f398e37343 \
                    file://common/coverage/coverage-report.pl;beginline=2;endline=17;md5=a4e1830fce078028c8f0974161272607 \
                    file://gst/replaygain/rganalysis.c;beginline=1;endline=23;md5=b60ebefd5b2f5a8e0cab6bfee391a5fe"
SRC_URI[md5sum] = "673cf9276952bd3937dafd817c9ead2b"
SRC_URI[sha256sum] = "2df90e99da45211c7b2525ae4ac34830a9e7784bd48c072c406c0cf014bdb277"
S = "${WORKDIR}/gst-plugins-good-${PV}"

