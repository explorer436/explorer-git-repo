How to launch terminal in Linux : 

Super key (Windows) + T

-------------------------------------------------------------------

To figure out if your computer has 64 bit or 32 bit processor :  
uname -a
lscpu (look at the architecture row)

-------------------------------------------------------------------

ls --all (command to show all files and folders including hidden ones)
How do I make `ls` show file sizes in megabytes?
ls -l --block-size=M (round file sizes to the nearest MB)
ls -l --block-size=MB
ls -l --block-size=K

-------------------------------------------------------------------

Toggle full screen : F11
E212: Can't open file for writing
Vim has a builtin help system.
You might want to edit the file as a superuser as "sudo vim FILE"

-------------------------------------------------------------------

To update the installed packages and package cache on your instance.
sudo yum update -y

-------------------------------------------------------------------

To check if docker is running : 
sudo service docker status

-------------------------------------------------------------------

Kdenlive - good tool for editing videos.

-------------------------------------------------------------------
Recursive copy
To copy a directory, including all its files and subdirectories, to another directory, enter (copy directories recursively):
$ cp -R * /home/mycomputer/backup

-------------------------------------------------------------------
To zip all the contents of the current folder from command line : zip -r BooksForAkhil.zip *
To zip all the contents of the a folder from some other location in command line : zip -r FilesForAkhil.zip /home/harshavardhanedupuganti/Downloads/FilesForAkhil

-----------------------------------------------------------------

command to reboot from terminal : reboot

-----------------------------------------------------------------

$ gs -sDEVICE=pdfwrite -dCompatibilityLevel=1.4 -dPDFSETTINGS=/screen -dNOPAUSE -dQUIET -dBATCH -sOutputFile=out.pdf in.pdf

$ shrinkpdf in.pdf out.pdf

-----------------------------------------------------------------

Command to convert m4a to mp3 : ffmpeg -i input.m4a -acodec libmp3lame -ab 128k output.mp3

-----------------------------------------------------------------

command to install a tar file in linux : how to use sudo command to install .tar.gz :
Open a console, and go to the directory where the file is
Type: tar -zxvf file.tar.gz

------------------------------------------------------------------

command to search for a file in linux : locate fileName

---------------------------------------------------------------------

Removing Package:
In case if we need to remove any package use -e command line switch with the package name.

rpm -e package-1.2.3.rpm

Command to view ip address: hostname -I

---------------


How do I install a .deb file via the command line?

Packages are manually installed via the dpkg command (Debian Package Management System). dpkg is the backend to commands like apt-get and aptitude, which in turn are the backend for GUI install apps like the Software Center and Synaptic.

Since dpkg is the base, you can use it to install packaged directly from the command line.
Install a package
sudo dpkg -i DEB_PACKAGE

If dpkg reports an error due to dependency problems, you can run sudo apt-get install -f to download the missing dependencies and configure everything.

Remove a package
sudo dpkg -r PACKAGE_NAME

---------------------------------------------------------------

Run the following to install Homebrew:
sh -c "$(curl -fsSL https://raw.githubusercontent.com/Linuxbrew/install/master/install.sh)"

Next, add Homebrew to your PATH by running the following commands. These commands work on all major flavors of Linux by adding either `~/.profile` on Debian/Ubuntu or `~/.bash_profile` on CentOS/Fedora/RedHat:

```
test -d ~/.linuxbrew && eval $(~/.linuxbrew/bin/brew shellenv)
test -d /home/linuxbrew/.linuxbrew && eval $(/home/linuxbrew/.linuxbrew/bin/brew shellenv)
test -r ~/.bash_profile && echo "eval \$($(brew --prefix)/bin/brew shellenv)" >>~/.bash_profile
echo "eval \$($(brew --prefix)/bin/brew shellenv)" >>~/.profile
```

Verify that Homebrew is installed: `brew --version`

---------------------------------------------------------------

To check your PATH, logged in as yourself, you can issue the command (from this system terminal), type "env | grep PATH"

---------------------------------------------------------------

In XFCE, there is a utility program called 'Preferred Applications' that lets you change the default applications for browser, mail reader, file manager and terminal emulator. If you want to change the default applications, this is a very helpful tool.

---------------------------------------------------------------

Fedora tips : 

Fedora uses rpm packages.
Install RPM File With Yum (Fedora or RedHat Linux)
You can use the yum package manager to install .rpm files.
Enter the following:
sudo yum localinstall sample_file.rpm
The localinstall option instructions yum to look at your current working directory for the installation file.

pdf file modification in fedora : use the pdfmod utility that comes with fedora

To install gVim on fedora : yum install vim-X11
To install emacs on fedora : sudo yum install emacs

update fedora from command line : dnf upgrade

command to install rpm package in fedora : 
sudo dnf install NAME_OF_RPM.rpm

To install a rpm package using command line on redhat based system use -i command line switch with rpm command.
rpm -i package-1.2.3.rpm


You can also use YUM or DNF package manager to install downloaded rpm file. Its benefit to resolve dependencies required for the package
yum localinstall package-1.2.3.rpm     ## CentOS, RHEL systems 
dnf localinstall package-1.2.3.rpm     ## Fedora systems

differences about rpm -Uvh foo.rpm and sudo dnf foo.rpm . The main difference is dnf resolves dependency problems.

How to execute .sh programs in fedora :
Either make the file executable, and then run it while specifying the path:
chmod +x somefile.sh
./somefile.sh

or, pass it to the shell interpreter like this:
sh somefile.sh

