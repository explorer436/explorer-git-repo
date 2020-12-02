
# Table of Contents

1.  [Tools common for all OSs](#org1df294a)
    1.  [IDEs :](#orge34dd3e)
    2.  [Text editors](#orgafbedfc)
    3.  [Browsers](#org394bfac)
    4.  [Miscellaneous](#org4c76b20)
2.  [Tools for Windows](#org0cb7226)
3.  [Tools for Linux](#org0680c1b)
4.  [Tools for Android (alphabetical order)](#org98864de)
5.  [How to use multiple workspaces](#org287fe2c)
    1.  [Multiple workspaces in Windows](#org0ead19b)
6.  [Ready API/Soap UI preferences](#orgc3b3f8a)
7.  [Android alternatives](#org63bcdd0)
8.  [Wizdler](#orgad45402)
9.  [OpenAPI spec editing tools](#org075d468)
10. [Putty](#org581ab05)
11. [Calibre book-reader customization](#org3fad0a6)
12. [Command to put computer to sleep](#orgdcbc372)
13. [Mouse issues in Windows](#orgf907a94)
14. [Lenovo Thinkpad tips](#org665b337)
15. [Windows VDEs running out of memory](#org03decc0)
16. [Tree](#org16d6885)
17. [Tips for searching and copying files and directories :](#orgc9da9ee)


<a id="org1df294a"></a>

# Tools common for all OSs


<a id="orge34dd3e"></a>

## IDEs :

-   Eclipse (Optional Plugins : TestNG, EclEmma Code Coverage, Spring Tools 4)
-   IntelliJ Idea (Probably don't need Visual Studio Code if we have this) One of the cons of this is, this is very memory intensive.
-   Visual Studio Code :
    -   Themes: 
        -   azure (nice theme but it doesn't apply to file menu on the left)
        -   light theme (I like to use it in daylight),
        -   GitHub Theme (nice theme that applies to file menu on the left)
    -   Plugins: 
        -   haskell-linter
        -   Haskell Syatax Highlighting
        -   Open in Vim (if working with Vim is not possible)
        -   Vim plugin for Visual Studio Code (this cuts down the pain of setting up something like Emacs)
        -   Markdown preview (Use ghostwriter instead of this if possible)
    -   Customizations:
        -   To remove the sideview bar (called the minimap), set "editor.minimap.enabled": false in your user or workspace settings.


<a id="orgafbedfc"></a>

## Text editors

1.  Vim
2.  gVim


<a id="org394bfac"></a>

## Browsers

1.  Firefox(lastpass, instapaper, Dark Reader)
2.  Tor browser


<a id="org4c76b20"></a>

## Miscellaneous

Calibre ebook editor and viewer


<a id="org0cb7226"></a>

# Tools for Windows

-   Git + Good git interface for Windows

-   Text editors : 
    -   Notepad++ - plugins: Compare plugin,XML tools plugin,

-   7 zip

-   Console Emulation program - ConEmu


<a id="org0680c1b"></a>

# Tools for Linux

-   Git + Good git interface for Linux - 
    -   If we can work with Vim and vim-fugitive, that, when used along with terminal, should be enough for pretty much everything related to Git.
    -   gitg (lighter and faster - lets us stage individual lines and chunks)
    -   GitAhead (Good tool to understand the history. Did not use it very extensively though. Can it be helpful with resolving merge conflicts and rebasing? Have to use it with bigger projects to figure that out.)
    -   Eclipse eGit plugin is probably the best. It works the same way in all OSs and it has all the features we really need.
-   Ghostwriter - good editor to work with markdown files. Formats them exactly the way github expects. One problem that I noticed with this app is, if you open a file in it, and make changes to that file using some other app at the same time (like Vim, VS Code, etc.) and save the changes to the file there, those changes are not reloaded into Ghostwriter automatically. What is worse is, as soon as the file is closed in Ghostwriter, the changes made to the file (using the other apps) are reverted. All those changes are lost. This is a bad use case. This app is good for looking at files and making changes to files but it is not great at working with other apps simultaneously. In order to get around these issues, use it to view markdown files but not to make changes to them. Use something else for making changes to the files and use ghostwriter only to view the markdown preview.
-   Broot (Directory navigators) - if you are not sure where in the file system a given file is, Broot will be very helpful in that scenario because it can scan the entire file system and show the location of the file to you.
-   File managers
    -   Thunar (works very well. no other file managers are really necessary if we have this.)
    -   PCManFM (not really necessary if you already have Thunar)
    -   Vifm is a curser based vi[m] like file manager extended with some useful ideas from mutt. If you use vi[m], vifm gives you complete keyboard control over your files without having to learn a new set of commands. It goes not just about vi[m] like keybindings, but also about modes, options, registers, commands and other things you might already like in vi[m].
-   System Monitors
    -   HTop
-   Screenshot utility
    -   Flameshot (never used)
-   Office suites
    -   Libre office (This works for most of the scenarios. If we have this, no other office suite is necessary.)
    -   Open office (never used)
    -   Calligra (never used)
    -   wps office? (used - the interface is good. But support for fonts is not as good as that of LibreOffice? Some fonts were totally unreadable)
-   img2pdf (to convert images into pdf documents) - (usage: in terminal: $ img2pdf img1.png img2.jpg -o out.pdf) (img2pdf &#x2013;help)
-   pdf arranger (to work with pdf documents - joining multiple pdf documents into one)
-   GNU web browser - to keep firefox and regular surfing separate (Chromium is an alternative to this).
-   Variety (Nitrogen is an alternative) - wallpaper utility tool. Generally, there are great wallpapers on unsplash.com. There is an option in Variety's preferences to pull wallpapers from unsplash.
-   USB Stick Formatter
-   USB Image Writer


<a id="org98864de"></a>

# Tools for Android (alphabetical order)

-   APAS (Algorithm Problems and Solutions)
-   Algorithms (visual explanation)
-   Alltrails
-   Authenticator (Microsoft)
-   Dropbox (optional)
-   DuckDuckGo
-   Fairmail (using this for Gmail and hotmail accounts right now)
-   Firefox (extensions - Dark Reader)
-   Foxit PDF Reader (for pdf files)
-   GPS Tools
-   Geeks for Geeks
-   GitHub
-   Glassdoor (Job search) Is there an app for indeed?
-   Instapaper (Reading)
-   Lastpass
-   LinkedIn (Job search) (Not using it all that much)
-   Mapquest (maps)
-   Mega Sync Client
-   Messenger (Facebook) (Messaging apps)
-   Moonreader (This has good support for txt and markdown files along with epub, mobi and a lot of other file types. A very good app.)
-   NetGuard
-   OsmAnd (maps)
-   Outlook (Microsoft) (For FusionAlliance Webmail and hotmail accounts - might also work for Gmail and other accounts) (Email client)
-   Podcasts (Google) (Podcasts)
-   Quora	 (Reading)
-   Spotify (Music)
-   Sync (cloud client)
-   The weather channel (weather)
-   Tor Browser (browser)
-   Tutanota (Email client)
-   Udemy
-   Vim Master
-   Walldrobe (wallpapers from Unsplash)
-   Whatsapp (Messaging apps)
-   Word (Microsoft) (for word files)
-   WriterP (simple text editor)
-   Yahoomail (good with Yahoo accounts - if this cannot be set up in other email clients - can we set it up in Microsoft Outlook app?) (Email client)
-   Youtube

---


<a id="org287fe2c"></a>

# How to use multiple workspaces

This is useful in both Windows and Linux. This makes the workflow so much easier than switching between windows in a single workspace. Using keyboard shortcuts make this even better. 

Hold down Ctrl + Alt and tap an arrow key to 
quickly move up, down, left, or right between workspaces, 
depending on how they’re laid out. 

Add the Shift key—so, press Shift + Ctrl + Alt and 
tap an arrow key—and you’ll switch between workspaces, 
taking the currently active window with you to the new workspace.


<a id="org0ead19b"></a>

## Multiple workspaces in Windows

1.  How to add a desktop in Windows 10:
    To add a virtual desktop, open up the new Task View pane by clicking the Task View button (two overlapping rectangles) on the taskbar, or by pressing the Windows Key + Tab. In the Task View pane, click New desktop to add a virtual desktop. If you have two or more desktops already open, the "Add a desktop" button will appear as a gray tile with a plus symbol. You can also quickly add a desktop without entering the Task View pane by using the keyboard shortcut Windows Key + Ctrl + D.

2.  How to switch between desktops:
    To switch between virtual desktops, open the Task View pane and click on the desktop you want to switch to. You can also quickly switch desktops without going into the Task View pane by using the keyboard shortcuts Windows Key + Ctrl + Left Arrow and Windows Key + Ctrl + Right Arrow.

3.  Move windows between desktops:
    To move a window from one desktop to another, you first have to open up the Task View pane and then hover over the desktop containing the window you want to move. The windows on that desktop will pop up; find the window you want to move, right-click it, and go to Move to and choose the desktop you want to move the window to. You can also drag and drop windows &#x2013; grab the window you want to move and drag it into the desired desktop.

4.  Close a desktop:
    To close a virtual desktop, open up the Task View pane and hover over the desktop you want to close until a small X appears in the upper right corner. Click the X to close the desktop. You can also close desktops without going into the Task View pane by using the keyboard shortcut Windows Key + Ctrl + F4 (this will close the desktop you're currently on).

---


<a id="orgc3b3f8a"></a>

# Ready API/Soap UI preferences

UI - Workspace type : Tabbed Desktop

ReadyAPI - Default SOAP request editor : XML
           Default REST request editor : Request
           Default response editor : XML

---


<a id="org63bcdd0"></a>

# Android alternatives

GrapheneOS
LineageOS (supports many older devices)

---


<a id="orgad45402"></a>

# Wizdler

Parses the WSDL files and generates SOAP messages for you # Wizdler

Recognizes WSDL information on the page to show you the available services and operations. Click the operation to generate the SOAP requests and view the response. By clicking the service, you can download WSDL and external XSD files in single ZIP file.

---


<a id="org075d468"></a>

# OpenAPI spec editing tools

Swagger YAML editing tool : <http://editor.swagger.io/>

use this to generate server code and client code as well.

Stoplight studio is another good one. 

---


<a id="org581ab05"></a>

# Putty

change password : \`passwd\`

---


<a id="org3fad0a6"></a>

# Calibre book-reader customization

In order to increase line spacing in paragraphs:

Preferences -> User Stylesheet -> p {line-height: 2}

---


<a id="orgdcbc372"></a>

# Command to put computer to sleep

Windows:

    rundll32.exe powrprof.dll,SetSuspendState 0,1,0

---


<a id="orgf907a94"></a>

# Mouse issues in Windows

Mouse cursor disappears in any dialogue or text box or document : 

If you want to change it to a larger one :
Control Panel -> Large icons -> Mouse -> Pointers -> Normal Select -> Browse -> aero<sub>arrow.cur</sub> (or any other one that you like)
Control Panel -> Large icons -> Mouse -> Pointers -> Text Select -> Browse -> aero<sub>arrow.cur</sub> (or any other one that you like)

a. Open Control Panel. 
b. In View by: Large icon view, click on Mouse.
c. Click the Pointer options tab and uncheck Hide pointer while typing.
d. Click on Apply and check the issue.

---


<a id="org665b337"></a>

# Lenovo Thinkpad tips

How do you turn on the light on top of the monitor?

To turn on the small light on the top of the monitor (when working in the dark and it is very difficult to see the keyboard) \`Fn + PgUp\` should do it.

---


<a id="org03decc0"></a>

# Windows VDEs running out of memory

Hi all, the C drive in one of my VDE slices seems to be running out of memory. 
It came with 50 GB initially and now it has just about 100MB memory available in it. 
I freed up some space by uninstalling some of the programs I was not using all that often and that freed up about 1 GB of space in the C drive but all that free space quickly got filled up by some processes running in the background. 
I submitted a request for 'clean up C drive' but that seems to have failed - twice. 
I cannot do anything with that slice because of the lack of available memory. 
I requested a new slice but I am trying to understand what it is that went wrong with it. 
Did any of you see this happen in the past?

Download WizTree on your slice, it'll tell you where all of your space is being used up.

By using this tool, after determining that 'C:\Windows\ccmcache' is the folder taking up all the space,

The ccmcache folder is used by System Center Configuration Manager (SCCM) client. This is where files downloaded by SCCM are stored. SCCM is an enterprise software management system used in many Windows environment, and provides operating system and software deployment services, remote management, reporting services, etc. You will typically only find this folder on systems in a managed enterprise environment.
SCCM caches files used for software deployment in the ccmcache folder. This may include software packages which are automatically installed on your machine, some types of software updates, etc. Files are not automatically removed from the ccmcache folder after they are used, but they are marked as being eligible for deletion. You should not manually delete files in this folder as you may accidentally delete something which has not been used yet. You should definitely not remove the folder altogether, as this would break SCCM and you would cease to automatically receive software packages from your network administrator.
You should be able to reduce the size of this folder using the ConfigMgr Control Panel. This will require local administrator privileges. To do this:
Open "Configuration Manager Properties" in the control panel. You may need to change the control panel to "icon view" instead of "category view".
Go to the "cache" tab
Click "Configure Settings" and acknowledge the UAC Prompt if prompted
The "Delete Files" button should become available. Click this button to clear files. It will automatically keep any files which should not be deleted.

---


<a id="org16d6885"></a>

# Tree

****How To View Directory Tree Structure In Linux****

Today, we are going to learn how to view directory structure using Tree command. This command will display the contents of a directory in a tree-like format. You might wonder why on the earth someone would use this command whilst we already have ls command to list the contents of a directory. Unlike ls command, Tree command is a recursive directory listing program that produces a depth indented listing of files. It is quite useful to find the directories that contains lot of sub-directories in Unix-like systems.

Install Tree
Tree command is available in the default repositories of most Linux distributions. So, it can be installed from the distribution's default package.

On Arch Linux and its derivatives: $ sudo pacman -S tree
On RHEL, CentOS, Fedora: $ sudo yum install tree Or, $ sudo dnf install tree
On SUSE/openSUSE: $ sudo zypper install tree
On Debian, Linux Mint, Ubuntu: $ sudo apt-get install tree

We have installed tree utility. Now, let us see some practical examples.

****View Directory Tree Structure In Linux****

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

****In Windows machines****

    $ tree /a /f > Catalog.txt

Options:

/A - Specifies that alternative characters (plus signs, hyphens, and vertical bars) be used to draw the tree diagram so that it can be printed by printers that don\`t support the line-drawing and box-drawing characters (DOS Versions 4 and 5).

/F - Displays the names of the files found within each directory listed.

Conclusion

As you can see in this guide, tree command will give you a nice graphical tree view of the directory structure. You can use this command when you want to view the contents of directories that have tons of other files/folders nested inside their folders.

---


<a id="orgc9da9ee"></a>

# Tips for searching and copying files and directories :

How to do file search for a string in a folder (including its sub folders) in Windows?

    C:\Users\user\Desktop\FolderName>findstr /S /I /M /C:"search text" *.*

How to find files on windows modified/created after a given date using the command line? You can use PowerShell to do this :

    Get-ChildItem -Recurse | Where-Object { $_.LastWriteTime -ge "12/27/2016" }

This also works with time: 

    { $_.LastWriteTime -ge "12/27/2016 20:00:00" }

How to copy everything from one folder to another folder?

    ROBOCOPY sourceFolder   destinationFolder /MIR /R:0 /W:0
    
    ROBOCOPY C:\Users\n123456\Desktop   C:\Users\n123456\Downloads\NewFolder /MIR /R:0 /W:0

Be careful before using this command. If there are files or folders in the destination folder before using this command, they will all be erased. Make sure this command is used to copy files into a new folder only.

In Mac OSX: A few commands that help in copying files in Mac OSX:

    cp -R "/Volumes/SIGNATURE/folder1" "/Users/explorer436/Google Drive"
    
    cp -R "/Volumes/SIGNATURE/folder2" "/Users/explorer436/Google Drive"
    
    cp -R "/Volumes/SIGNATURE/folder3/folder4/folder5" "/Volumes/SIGNATURE"

To list the files and folders in a directory and to list their sizes:

    du – displaying disk usage for a specific file, folder, directory, or whatever, is made easier to interpret with -h
    
    du -sh */

While you are using cp command to copy huge folders, to find out how much data is copied, go to Applications -> Utilities -> Activity Monitor -> Disk view

And look at the process name 'cp'

To copy only missing files from one folder to another, use rsync :

    rsync -av /Users/harshavardhanedupuganti/Google\ Drive/harsha_personal_stuff/  /Volumes/SIGNATURE/Google\ Drive/harsha_personal_stuff/
    
    rsync -av /source-path/source-dir /destination-path

rsync will copy only new and changed files to the new location.

It is important to understand how a trailing slash on the source argument functions. If there is a trailing slash then the contents of /source-path/source-dir will be copied to destination-path. If there is no trailing slash then source-dir itself will be copied to the destination and its contents will be another level down in the destination hierarchy.

So if you want to replicate one path to another include the trailing slash as follows:

    rsync -av /sourcepath/sourcedir/ /duplicatpath/sourcedir/

---

