The first step is to try to determine if the keyboard is identified by the OS at all. 
To figure that out, run `lsusb` and see if the keyboard shows up in the list there. If it is detected in `lsusb`, that is a good sign. (Take a look at the command `lsusb` and the various options available with it. It can be very helpful).

After that, run `dmesg | tail`. That will give us an output that looks like this.

```
[explorer436@explorer436-cf52ekmbdam /]$ dmesg | tail
[28600.645427] usb 5-1: Product: ThinkPad Compact USB Keyboard with TrackPoint
[28600.645429] usb 5-1: Manufacturer: Lenovo
[28677.746150] usb 5-1: USB disconnect, device number 2
[28721.919361] usb 5-1: new full-speed USB device number 3 using uhci_hcd
[28722.116427] usb 5-1: New USB device found, idVendor=17ef, idProduct=6047, bcdDevice= 3.30
[28722.116435] usb 5-1: New USB device strings: Mfr=1, Product=2, SerialNumber=0
[28722.116440] usb 5-1: Product: ThinkPad Compact USB Keyboard with TrackPoint
[28722.116445] usb 5-1: Manufacturer: Lenovo
[30307.478599] audit: type=1130 audit(1603031368.217:714): pid=1 uid=0 auid=4294967295 ses=4294967295 msg='unit=NetworkManager-dispatcher comm="systemd" exe="/usr/lib/systemd/systemd" hostname=? addr=? terminal=? res=success'
[30318.015193] audit: type=1131 audit(1603031378.753:715): pid=1 uid=0 auid=4294967295 ses=4294967295 msg='unit=NetworkManager-dispatcher comm="systemd" exe="/usr/lib/systemd/systemd" hostname=? addr=? terminal=? res=success'
```

The key pieces of information we are looking for in the output of the above command are `idVendor` and `idProduct`.
idVendor=17ef, idProduct=6047

Note: The idVendor and idProduct can also be determined by looking at the file `usb.ids` - which is usually located at `/usr/share/misc/usb.ids`. If you cannot find the file there, use broot to figure out where the file is. In ArcoLinux, it is located here `/usr/share/hwdata/usb.ids`
In that file, we will see info that looks like this:
```
17ef  Lenovo
        1000  ThinkPad X6 UltraBase
        1003  Integrated Smart Card Reader
        1004  Integrated Webcam
        1005  ThinkPad X200 Ultrabase (42X4963 )
        1008  Hub
        100a  ThinkPad Mini Dock Plus Series 3
        100f  ThinkPad Ultra Dock Hub
        1010  ThinkPad Ultra Dock Hub
        1020  ThinkPad Dock Hub
        1021  ThinkPad Dock Hub [Cypress HX2VL]
        3049  ThinkPad OneLink integrated audio
        304b  AX88179 Gigabit Ethernet [ThinkPad OneLink GigaLAN]
        304f  RTL8153 Gigabit Ethernet [ThinkPad OneLink Pro Dock]
        3060  ThinkPad Dock
        3062  ThinkPad Dock Ethernet [Realtek RTL8153B]
        3063  ThinkPad Dock Audio
        3066  ThinkPad Thunderbolt 3 Dock MCU
        3069  ThinkPad TBT3 LAN
        306a  ThinkPad Thunderbolt 3 Dock Audio
        3815  ChipsBnk 2GB USB Stick
        4802  Vc0323+MI1310_SOC Camera
        4807  UVC Camera
        480c  Integrated Webcam
        480d  Integrated Webcam [R5U877]
        480e  Integrated Webcam [R5U877]
        480f  Integrated Webcam [R5U877]
        4810  Integrated Webcam [R5U877]
        4811  Integrated Webcam [R5U877]
        4812  Integrated Webcam [R5U877]
        4813  Integrated Webcam [R5U877]
        4814  Integrated Webcam [R5U877]
        4815  Integrated Webcam [R5U877]
        4816  Integrated Webcam
        481c  Integrated Webcam
        481d  Integrated Webcam
        6004  ISD-V4 Tablet Pen
        6007  Smartcard Keyboard
        6009  ThinkPad Keyboard with TrackPoint
        600e  Optical Mouse
        6014  Mini Wireless Keyboard N5901
        6019  M-U0025-O Mouse
        6022  Ultraslim Plus Wireless Keyboard and Mouse
        6025  ThinkPad Travel Mouse
        602d  Black Silk Keyboard
        6032  Wireless Dongle for Keyboard and Mouse
        6044  ThinkPad Laser Mouse
        6047  ThinkPad Compact Keyboard with TrackPoint
        604b  Precision Wireless Mouse
```


After determining the idVendor and idProduct for the device that we want to work with,


You can pass usbcore quirks as kernel parameters, see this page : https://raw.githubusercontent.com/torva … meters.txt
Should be `usbcore.quirks=17ef:6047:gki`

I added the parameter to my loader config file and it works!
Reference: Where to put the parameter for anyone who has the same problem:  https://wiki.archlinux.org/index.php/Kernel_parameters

GRUB

To make the change persistent after reboot, you could manually edit /boot/grub/grub.cfg with the exact line from above, but the best practice is to: 
Edit /etc/default/grub and append your kernel options between the quotes in the GRUB_CMDLINE_LINUX_DEFAULT line:
GRUB_CMDLINE_LINUX_DEFAULT="quiet splash"
And then automatically re-generate the grub.cfg file with:
`$ grub-mkconfig -o /boot/grub/grub.cfg`

