OpenEmbedded/Yocto Digi Embedded CERT-TOOLS Layer
===========================================

This layer installs the binaries needed to perform certification testing on the Qualcomm wireless radio used on the Digi Connectcore platforms.

SUPPORTED PLATFORMS
-------------------

  * Digi ConnectCore 6UL Family
    * CC6UL SBC Pro
      * [Digi P/N CC-WMX6UL-KIT](https://www.digi.com/products/embedded-systems/single-board-computers/connectcore-for-i-mx6ul-sbc-pro)
    * CC6UL SBC Express
      * [Digi P/N CC-WMX6UL-EXPRESS](https://www.digi.com/products/embedded-systems/single-board-computers/connectcore-for-i-mx6ul-sbc-express)     


INSTALLATION
------------

1. Install Digi Embedded Yocto (DEY) distribution (dey-2.4-r2).

    https://github.com/digi-embedded/dey-manifest#installing-digi-embedded-yocto

2. Clone the *cert-tools* Yocto layer under the Digi Embedded Yocto source
   directory.

        #> cd <DEY-INSTALLDIR>/sources
        #> git clone https://stash.digi.com/scm/~cameronh/meta-cert-tools.git -b rocko

CREATE AND BUILD A PROJECT
--------------------------

1. Create a project for your ConnectCore 6UL target platform.

        #> mkdir <project-dir>
        #> cd <project-dir>
        #> . <DEY-INSTALLDIR>/mkproject.sh -p <target_platform>

2. Add the *cert-tools* layer to the project's *bblayers.conf*
  configuration file.

        #> bitbake-layers add-layer <DEY-INSTALLDIR>/sources/cert-tools

3. Edit the project's local.conf, adding the below line.

        IMAGE_INSTALL_append = " cert-tools"
        
4. Build the images.

        #> bitbake dey-image-qt

5. Deploy the images.

6. The Btdiag and Qcmbr applications can be found in /usr/sbin.

LICENSE
-------
Insert appropriate license statement here...
