How To View Directory Tree Structure In Linux

Today, we are going to learn how to view directory structure using Tree command. This command will display the contents of a directory in a tree-like format. You might wonder why on the earth someone would use this command whilst we already have ls command to list the contents of a directory. Unlike ls command, Tree command is a recursive directory listing program that produces a depth indented listing of files. It is quite useful to find the directories that contains lot of sub-directories in Unix-like systems.

Install Tree
Tree command is available in the default repositories of most Linux distributions. So, it can be installed from the distribution's default package.

On Arch Linux and its derivatives: $ sudo pacman -S tree

On RHEL, CentOS, Fedora: $ sudo yum install tree
Or, $ sudo dnf install tree

On SUSE/openSUSE: $ sudo zypper install tree

On Debian, Linux Mint, Ubuntu: $ sudo apt-get install tree

We have installed tree utility. Now, let us see some practical examples.

View Directory Tree Structure In Linux


If you run the tree command without any arguments, the tree command will display all contents of the current working directory in a tree-like format.  
$ tree
Upon completion of listing all files/directories found, tree returns the total number of files and/or directories listed. As you see in the above output, the current directory contains 3321 sub-directories, and 40023 files.


To list the files of the specific directory in a tree-like format, say for example /etc, run:
$ tree /etc/


By default, Tree will notdoesn't list the hidden files. If you want to list the hidden files, use -a parameter like below.
$ tree -a /etc/


Now, check the above output. The total of number of directories and files are higher than the previous output. It is because, this time the tree command lists all directories and files including hidden files.


 
To view the directory structure in a colored format, use -C parameter.
$ tree -C /etc/


Did you notice? Now, the tree command lists the directories and files in different colors. This is will useful to easily distinguish the directories and files.

 
As you may have noticed, all of the above commands lists the sub-directories and files. You can also list only the directories using -d parameter like below.
$ tree -d /etc/


You can also display the directory listing line by line using the following command:
$ tree -d /etc/ | less
Press ENTER to navigate through the output.

By default, Tree command will list all sub-directories and the files inside the main directory. To limit the depth or of level of recursion, use -L parameter like below.
$ tree -L 2 /etc
Here, L indicates the maximum display depth of the directory tree.

For more details, refer the man pages.
$ man tree


------------------------------------------------

In Windows machines : 
$ tree /a /f > Catalog.txt

Options:

/A - Specifies that alternative characters (plus signs, hyphens, and vertical bars) be used to draw the tree diagram so that it can be printed by printers that don`t support the line-drawing and box-drawing characters (DOS Versions 4 and 5).

/F - Displays the names of the files found within each directory listed.


--------------------------

Conclusion
As you can see in this guide, tree command will give you a nice graphical tree view of the directory structure. You can use this command when you want to view the contents of directories that have tons of other files/folders nested inside their folders.

