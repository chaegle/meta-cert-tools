OpenEmbedded/Yocto Digi Embedded CERT-TOOLS Layer
===========================================

This layer installs the binaries needed to perform certification testing on the Qualcomm wireless radio used on the Digi Connectcore platforms.

SUPPORTED PLATFORMS
-------------------

This layer supports ALL ConnectCore 6 family SBC and SOM variants possessing the Qualcomm QCA6564 wireless radio.

  * ConnectCore 6N
  * ConnectCore 6UL
  * ConnectCore 6Plus
  * ConnectCard for i.MX28N (dey-1.6 ONLY)

The original ConnectCore 6 (SBC/SOM) with the Atheros AR62xx wireless radio is NOT supported.

This layer has been tested against the following Digi Embedded Yocto (DEY) releases.

  * dey-3.2 (gatesgarth)
  * dey-3.0 (zeus)
  * dey-2.6 (thud)
  * dey-2.4 (rocko)
  * dey-2.2 (morty)
  * dey-2.0 (jethro)
  * dey-1.6 (daisy)

INSTALLATION
------------

1. Install Digi Embedded Yocto (DEY), per the published instructions.


2. Clone meta-cert-tool layer to your local workstation.

        #> cd <DEY-INSTALLDIR>/sources
        #> git clone https://github.com/chaegle/meta-cert-tools.git

CREATE AND BUILD A PROJECT
--------------------------

1. Create a project for your ConnectCore 6[N|UL|Plus] target platform.

        #> mkdir <project-dir>
        #> cd <project-dir>
        #> . <DEY-INSTALLDIR>/mkproject.sh -p <target_platform>

2. Add the *cert-tools* layer to the project's *bblayers.conf*
  configuration file.

        #> bitbake-layers add-layer <DEY-INSTALLDIR>/sources/meta-cert-tools

3. Edit the project's local.conf, adding the below line.

        IMAGE_INSTALL_append = " cert-tools"
        
4. Build the images.

        #> bitbake dey-image-qt

5. Deploy the images.

6. The Btdiag and Qcmbr applications can be found in /usr/sbin.

LICENSE
-------
Insert appropriate license statement here...
