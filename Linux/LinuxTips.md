
# Table of Contents

1.  [Terminal](#orga6c3ba1)
    1.  [How to rename a file from terminal in Linux?](#orgac1696e)
    2.  [How to launch terminal in Linux :](#orgcdb8960)
2.  [How to Remove Files and Directories Using Linux Command Line](#org029c9fe)


<a id="orga6c3ba1"></a>

# Terminal


<a id="orgac1696e"></a>

## How to rename a file from terminal in Linux?

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


<a id="orgcdb8960"></a>

## How to launch terminal in Linux :

Super key (Windows) + T

command to reboot from terminal : reboot

To check your PATH, logged in as yourself, you can issue the command (from this system terminal), type "env | grep PATH"

command to search for a file in linux : locate fileName

command to install a tar file in linux : how to use sudo command to install .tar.gz :
Open a console, and go to the directory where the file is
Type: tar -zxvf file.tar.gz

Recursive copy

To copy a directory, including all its files and subdirectories, to another directory, enter (copy directories recursively):
$ cp -R \* /home/explorer436/Downloads/destinationFolder (We might have to create destinationFolder before running this command)

To zip all the contents of the current folder from command line : zip -r BooksForAkhil.zip \*
To zip all the contents of the a folder from some other location in command line : zip -r FilesForAkhil.zip /home/harshavardhanedupuganti/Downloads/FilesForAkhil

Command to view ip address: hostname -I

---

vifm (a tool that works with vim shortcuts) is an alternative to this. Using vifm, we can change the name of a file or folder using \`cw\` (change word).

---

To figure out if your computer has 64 bit or 32 bit processor :  
uname -a
lscpu (look at the architecture row)

---

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

To update the installed packages and package cache on your instance.
sudo yum update -y

---

To check if docker is running : 
sudo service docker status

---

Kdenlive - good tool for editing videos.

---

$ gs -sDEVICE=pdfwrite -dCompatibilityLevel=1.4 -dPDFSETTINGS=/screen -dNOPAUSE -dQUIET -dBATCH -sOutputFile=out.pdf in.pdf

$ shrinkpdf in.pdf out.pdf

---

Command to convert m4a to mp3 : ffmpeg -i input.m4a -acodec libmp3lame -ab 128k output.mp3

---

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

---

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

In XFCE, there is a utility program called 'Preferred Applications' that lets you change the default applications for browser, mail reader, file manager and terminal emulator. If you want to change the default applications, this is a very helpful tool.

---

Fedora tips : 

Fedora uses rpm packages.
Install RPM File With Yum (Fedora or RedHat Linux)
You can use the yum package manager to install .rpm files.
Enter the following:
sudo yum localinstall sample<sub>file.rpm</sub>
The localinstall option instructions yum to look at your current working directory for the installation file.

pdf file modification in fedora : use the pdfmod utility that comes with fedora

To install gVim on fedora : yum install vim-X11
To install emacs on fedora : sudo yum install emacs

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

How to execute .sh programs in fedora :

Either make the file executable, and then run it while specifying the path:

    chmod +x somefile.sh
    ./somefile.sh

or, pass it to the shell interpreter like this: sh somefile.sh

---

Configure RPMfusion Yum Repository : 

Some packages/frameworks may be available only in RPMFusion repository. So, we may have to add it to Fedora using the following commands :

    sudo dnf -y install https://download1.rpmfusion.org/free/fedora/rpmfusion-free-release-$(rpm -E %fedora).noarch.rpm
    sudo dnf -y install https://download1.rpmfusion.org/nonfree/fedora/rpmfusion-nonfree-release-$(rpm -E %fedora).noarch.rpm

After the repository is added, they can be installed using commands like the one below :

    sudo dnf -y install ffmpeg

---

How to install OSS code (the open source version of Visual Studio Code) in Fedora?

RHEL, Fedora, and CentOS based distributions#

We currently ship the stable 64-bit VS Code in a yum repository, the following script will install the key and repository:

    sudo rpm --import https://packages.microsoft.com/keys/microsoft.asc
    sudo sh -c 'echo -e "[code]\nname=Visual Studio Code\nbaseurl=https://packages.microsoft.com/yumrepos/vscode\nenabled=1\ngpgcheck=1\ngpgkey=https://packages.microsoft.com/keys/microsoft.asc" > /etc/yum.repos.d/vscode.repo'

Then update the package cache and install the package using dnf (Fedora 22 and above):

    sudo dnf check-update
    sudo dnf install code

---


<a id="org029c9fe"></a>

# How to Remove Files and Directories Using Linux Command Line

****How to Remove Files****

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

