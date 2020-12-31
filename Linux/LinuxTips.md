
# Table of Contents

1.  [List of things that I find useful](#org0129c9c)
    1.  [Search for files](#orge2920b1)
    2.  [How to rename a file from terminal in Linux?](#org9133681)
    3.  [Recursive copy](#org830bac2)
    4.  [System commands](#org0a2b1c2)
    5.  [Check the PATH](#orgc54bf09)
    6.  [Installing tar files](#org79afdd8)
    7.  [View ip address](#org441d0d4)
    8.  [System information](#orgdb29c51)
    9.  [list commands](#orge057447)
    10. [Packages](#org3f4c2fa)
    11. [Docker](#orga8286dc)
    12. [Editing videos](#org4df1d6e)
    13. [How to install Homebrew?](#orgfa42a33)
    14. [XFCE tips](#orgb2f5d00)
    15. [Fedora tips :](#org59a1274)
    16. [How to execute .sh programs](#orge6eeae0)
    17. [How to install OSS code (the open source version of Visual Studio Code) in Fedora?](#org347559b)
    18. [How to Remove Files and Directories Using Linux Command Line](#orgc003a8e)


<a id="org0129c9c"></a>

# List of things that I find useful


<a id="orge2920b1"></a>

## Search for files

command to search for a file in linux : locate fileName


<a id="org9133681"></a>

## How to rename a file from terminal in Linux?

One option:
vifm (a tool that works with vim shortcuts) is an alternative to this. Using vifm, we can change the name of a file or folder using \`cw\` (change word).

Another option:
In order to rename a file in Linux you can use either of two approaches

1.  Create a copy of the existing file with the new desired name and then delete the old file.
    
        $ cp oldfile newfile
    
    This creates a copy of the same file with a new name in the same location.
    
        $ rm oldfil
    
    This will delete the old file keeping the newfile intact.

2.  Rename the file by moving it with the mv command.
    
    Rename by moving
    
        $mv old-file-name  new-file-name
    
    This just moves the old file, to a new name.

---


<a id="org830bac2"></a>

## Recursive copy

To copy a directory, including all its files and subdirectories, to another directory, enter (copy directories recursively):

    $ cp -R * /home/explorer436/Downloads/destinationFolder (We might have to create destinationFolder before running this command)

To zip all the contents of the current folder from command line : 

    zip -r BooksForAkhil.zip *

To zip all the contents of the a folder from some other location in command line : 

    zip -r FilesForAkhil.zip /home/harshavardhanedupuganti/Downloads/FilesForAkhil

---


<a id="org0a2b1c2"></a>

## System commands

<table border="2" cellspacing="0" cellpadding="6" rules="groups" frame="hsides">


<colgroup>
<col  class="org-left" />

<col  class="org-left" />
</colgroup>
<tbody>
<tr>
<td class="org-left">systemctl suspend</td>
<td class="org-left">command to put the system in sleep/suspend mode</td>
</tr>


<tr>
<td class="org-left">systemctl hibernate</td>
<td class="org-left">command to put the system in hibernate mode</td>
</tr>


<tr>
<td class="org-left">reboot</td>
<td class="org-left">command to reboot from terminal</td>
</tr>
</tbody>
</table>

---


<a id="orgc54bf09"></a>

## Check the PATH

To check the PATH, logged in as yourself, run the command (from the system terminal), type 

    env | grep PATH

---


<a id="org79afdd8"></a>

## Installing tar files

command to install a tar file in linux : how to use sudo command to install .tar.gz :
Open a console, and go to the directory where the file is

    tar -zxvf file.tar.gz

---


<a id="org441d0d4"></a>

## View ip address

Command to view ip address: 

    hostname -I

---


<a id="orgdb29c51"></a>

## System information

To figure out if your computer has 64 bit or 32 bit processor :  

    uname -a
    lscpu (look at the architecture row)

---


<a id="orge057447"></a>

## list commands

<table border="2" cellspacing="0" cellpadding="6" rules="groups" frame="hsides">


<colgroup>
<col  class="org-left" />

<col  class="org-left" />
</colgroup>
<tbody>
<tr>
<td class="org-left">ls &#x2013;all</td>
<td class="org-left">command to show all files and folders including hidden ones</td>
</tr>


<tr>
<td class="org-left">ls -l &#x2013;block-size=M</td>
<td class="org-left">(round file sizes to the nearest MB) To make `ls` show file sizes in megabytes</td>
</tr>


<tr>
<td class="org-left">ls -l &#x2013;block-size=MB</td>
<td class="org-left">To make `ls` show file sizes in megabytes</td>
</tr>


<tr>
<td class="org-left">ls -l &#x2013;block-size=K</td>
<td class="org-left">To make `ls` show file sizes in kilobytes</td>
</tr>
</tbody>
</table>

---

Toggle full screen : F11
E212: Can't open file for writing
Vim has a builtin help system. You might want to edit the file as a superuser as "sudo vim FILE"

---


<a id="org3f4c2fa"></a>

## Packages

List of software package management systems
<https://en.wikipedia.org/wiki/List_of_software_package_management_systems#Linux> 

To update the installed packages and package cache on your instance.

for systems using RPM (redhat package manager): sudo yum update -y
arch linux: pacman -Syu

Removing Package:

In case if we need to remove any package use -e command line switch with the package name.

rpm -e package-1.2.3.rpm

---

How do I install a .deb file via the command line?

Packages are manually installed via the dpkg command (Debian Package Management System). dpkg is the backend to commands like apt-get and aptitude, which in turn are the backend for GUI install apps like the Software Center and Synaptic.

Since dpkg is the base, you can use it to install packaged directly from the command line.
Install a package
sudo dpkg -i DEB<sub>PACKAGE</sub>

If dpkg reports an error due to dependency problems, you can run sudo apt-get install -f to download the missing dependencies and configure everything.

Remove a package
sudo dpkg -r PACKAGE<sub>NAME</sub>

Fedora uses rpm packages.
Install RPM File With Yum (Fedora or RedHat Linux)
You can use the yum package manager to install .rpm files.
Enter the following:
sudo yum localinstall sample<sub>file.rpm</sub>
The localinstall option instructions yum to look at your current working directory for the installation file.

update fedora from command line : dnf upgrade

command to install rpm package in fedora : 
sudo dnf install NAME<sub>OF</sub><sub>RPM.rpm</sub>

To install a rpm package using command line on redhat based system use -i command line switch with rpm command.
rpm -i package-1.2.3.rpm

You can also use YUM or DNF package manager to install downloaded rpm file. Its benefit to resolve dependencies required for the package
yum localinstall package-1.2.3.rpm     ## CentOS, RHEL systems 
dnf localinstall package-1.2.3.rpm     ## Fedora systems

differences about rpm -Uvh foo.rpm and sudo dnf foo.rpm . The main difference is dnf resolves dependency problems.

---

Configure RPMfusion Yum Repository : 

Some packages/frameworks may be available only in RPMFusion repository. So, we may have to add it to Fedora using the following commands :

    sudo dnf -y install https://download1.rpmfusion.org/free/fedora/rpmfusion-free-release-$(rpm -E %fedora).noarch.rpm
    sudo dnf -y install https://download1.rpmfusion.org/nonfree/fedora/rpmfusion-nonfree-release-$(rpm -E %fedora).noarch.rpm

After the repository is added, they can be installed using commands like the one below :

    sudo dnf -y install ffmpeg

---


<a id="orga8286dc"></a>

## Docker

To check if docker is running : 
sudo service docker status

---


<a id="org4df1d6e"></a>

## Editing videos

Kdenlive - good tool for editing videos.

---

$ gs -sDEVICE=pdfwrite -dCompatibilityLevel=1.4 -dPDFSETTINGS=/screen -dNOPAUSE -dQUIET -dBATCH -sOutputFile=out.pdf in.pdf

$ shrinkpdf in.pdf out.pdf

---

Command to convert m4a to mp3 : ffmpeg -i input.m4a -acodec libmp3lame -ab 128k output.mp3

---


<a id="orgfa42a33"></a>

## How to install Homebrew?

<https://en.wikipedia.org/wiki/Homebrew_(package_manager)> 

Run the following to install Homebrew:

    sh -c "$(curl -fsSL https://raw.githubusercontent.com/Linuxbrew/install/master/install.sh)"

Next, add Homebrew to your PATH by running the following commands.

    These commands work on all major flavors of Linux by adding either `~/.profile` on Debian/Ubuntu or `~/.bash_profile` on CentOS/Fedora/RedHat:

    test -d ~/.linuxbrew && eval $(~/.linuxbrew/bin/brew shellenv)
    test -d /home/linuxbrew/.linuxbrew && eval $(/home/linuxbrew/.linuxbrew/bin/brew shellenv)
    test -r ~/.bash_profile && echo "eval \$($(brew --prefix)/bin/brew shellenv)" >>~/.bash_profile
    echo "eval \$($(brew --prefix)/bin/brew shellenv)" >>~/.profile

Verify that Homebrew is installed: \`brew &#x2013;version\`

---


<a id="orgb2f5d00"></a>

## XFCE tips

In XFCE, there is a utility program called 'Preferred Applications' that lets you change the default applications for browser, mail reader, file manager and terminal emulator. If you want to change the default applications, this is a very helpful tool.

---


<a id="org59a1274"></a>

## Fedora tips :

pdf file modification in fedora : use the pdfmod utility that comes with fedora

To install gVim on fedora : yum install vim-X11
To install emacs on fedora : sudo yum install emacs

---


<a id="orge6eeae0"></a>

## How to execute .sh programs

Either make the file executable, and then run it while specifying the path:

    chmod +x somefile.sh
    ./somefile.sh

or, pass it to the shell interpreter like this: sh somefile.sh

---


<a id="org347559b"></a>

## How to install OSS code (the open source version of Visual Studio Code) in Fedora?

RHEL, Fedora, and CentOS based distributions#

We currently ship the stable 64-bit VS Code in a yum repository, the following script will install the key and repository:

    sudo rpm --import https://packages.microsoft.com/keys/microsoft.asc
    sudo sh -c 'echo -e "[code]\nname=Visual Studio Code\nbaseurl=https://packages.microsoft.com/yumrepos/vscode\nenabled=1\ngpgcheck=1\ngpgkey=https://packages.microsoft.com/keys/microsoft.asc" > /etc/yum.repos.d/vscode.repo'

Then update the package cache and install the package using dnf (Fedora 22 and above):

    sudo dnf check-update
    sudo dnf install code

---


<a id="orgc003a8e"></a>

## How to Remove Files and Directories Using Linux Command Line

To remove (or delete) a file in Linux from the command line, use either the rm (remove) or unlink command.
The unlink command allows you to remove only a single file, while with rm you can remove multiple files at once.
Be extra careful when removing files or directories, because once the file is deleted, it cannot be easily recovered.

To delete a single file, use the rm or unlink command followed by the file name:

    unlink filename
    rm filename

If the file is write-protected, you will be prompted for confirmation.

To delete multiple files at once, use the rm command followed by the file names separated by space. 

    rm filename1 filename2 filename3

You can also use a wildcard (\*) and regular expansions to match multiple files. For example, to remove all .pdf files in the current directory, use the following command:

    rm *.pdf

When using regular expansions, first list the files with the ls command so that you can see what files will be deleted before running the rm command.

Use the rm with the -i option to confirm each file before deleting it:

    rm -i filename(s)

To remove files without prompting even if the files are write-protected pass the -f (force) option to the rm command:

    rm -f filename(s)

You can also combine rm options. For example, to remove all .txt files in the current directory without a prompt in verbose mode, use the following command:

    rm -fv *.txt

****How to Remove Directories****

In Linux, you can remove/delete directories with the rmdir and rm.

rmdir is a command-line utility for deleting empty directories while with rm you can remove directories and their contents recursively.

To remove an empty directory, use either rmdir or rm -d followed by the directory name:

    rm -d dirname
    rmdir dirname

To remove non-empty directories and all the files within them, use the rm command with the-r (recursive) option:

    rm -r dirname

If a directory or a file within the directory is write-protected, you will be prompted to confirm the deletion.

To remove non-empty directories and all the files without being prompted, use rm with the -r (recursive) and -f options:

    rm -rf dirname

To remove multiple directories at once, use the rm -r command followed by the directory names separated by space.

    rm -r dirname1 dirname2 dirname3

Same as with files you can also use a wildcard (\*) and regular expansions to match multiple directories.

---

