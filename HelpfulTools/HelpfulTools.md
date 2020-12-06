
# Table of Contents

1.  [Tools common for all OSs](#org50f1177)
    1.  [IDEs :](#org8cea47a)
    2.  [Text editors](#org2c23988)
    3.  [Browsers](#org634eff8)
    4.  [Miscellaneous](#org1c47451)
2.  [Tools for Windows](#orgb8bb3ce)
3.  [Tools for Linux](#org4287534)
4.  [Tools for Android (alphabetical order)](#org57e5522)
5.  [How to use multiple workspaces](#org703eac6)
    1.  [Multiple workspaces in Windows](#org0959343)
6.  [Ready API/Soap UI preferences](#org1bc4ec5)
7.  [Android alternatives](#orgc90779f)
8.  [Wizdler](#orgd3b5c5f)
9.  [OpenAPI spec editing tools](#orgc85028a)
10. [Putty](#orgd1a6019)
11. [Calibre book-reader customization](#orgc5bc6ef)
12. [Command to put computer to sleep](#org5a7f22c)
13. [Mouse issues in Windows](#orge94af26)
14. [Lenovo Thinkpad tips](#orgf70ff3d)
15. [Windows VDEs running out of memory](#org73e8520)
16. [Tree](#org324a61d)
17. [Tips for searching and copying files and directories :](#orgb21a87f)
18. [Killing a process](#org98d3797)
19. [Postman tips](#org0535440)
20. [Running jar files from terminal](#orgf8892d6)
21. [Cntlm](#org2c99d34)
22. [Commands to run tests on individual files](#org0903822)
23. [Gradle commands](#org692e4b8)
24. [Cygwin](#org68e61e6)
25. [Hosts file](#org59be9f8)
26. [SonarQube](#org94c8af6)
27. [WID - clean and build tips](#org70004c6)
28. [Issues encountered while working with MongoDB](#orgfb4160f)


<a id="org50f1177"></a>

# Tools common for all OSs


<a id="org8cea47a"></a>

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


<a id="org2c23988"></a>

## Text editors

1.  Vim
2.  gVim


<a id="org634eff8"></a>

## Browsers

1.  Firefox(lastpass, instapaper, Dark Reader)
2.  Tor browser


<a id="org1c47451"></a>

## Miscellaneous

Calibre ebook editor and viewer


<a id="orgb8bb3ce"></a>

# Tools for Windows

-   Git + Good git interface for Windows

-   Text editors : 
    -   Notepad++ - plugins: Compare plugin,XML tools plugin,

-   7 zip

-   Console Emulation program - ConEmu


<a id="org4287534"></a>

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
-   Xfce4-screenshooter


<a id="org57e5522"></a>

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
-   Moonreader (This has good support for txt and markdown files along with epub, mobi and a lot of other file types. A very good app.)
-   NetGuard
-   OsmAnd (maps)
-   Outlook (Microsoft) (For FusionAlliance Webmail and hotmail accounts - might also work for Gmail and other accounts) (Email client)
-   Podcasts (Google) (Podcasts)
-   Quora	 (Reading)
-   Signal (Messaging apps)
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


<a id="org703eac6"></a>

# How to use multiple workspaces

This is useful in both Windows and Linux. This makes the workflow so much easier than switching between windows in a single workspace. Using keyboard shortcuts make this even better. 

Hold down Ctrl + Alt and tap an arrow key to 
quickly move up, down, left, or right between workspaces, 
depending on how they’re laid out. 

Add the Shift key—so, press Shift + Ctrl + Alt and 
tap an arrow key—and you’ll switch between workspaces, 
taking the currently active window with you to the new workspace.


<a id="org0959343"></a>

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


<a id="org1bc4ec5"></a>

# Ready API/Soap UI preferences

UI - Workspace type : Tabbed Desktop

ReadyAPI - Default SOAP request editor : XML
           Default REST request editor : Request
           Default response editor : XML

Groovy<sub>script</sub><sub>to</sub><sub>read</sub><sub>attributes</sub><sub>from</sub><sub>response</sub><sub>in</sub><sub>SoapUI</sub><sub>and</sub><sub>write</sub><sub>contents</sub><sub>to</sub><sub>a</sub><sub>file</sub>

    import com.eviware.soapui.support.XmlHolder
    
    def response = testRunner.testCase.testSteps["TestRequest"].testRequest.response.getRequest().getResponseContentAsXml()
    
    def responseAsXml = new XmlHolder( response )
    
    responseAsXml.declareNamespace( 'ns2', 'http://abcd.com/test/xyz/service/specificservice/v1_0')
    
    def RqUID = responseAsXml.getNodeValue("//ns2:getResponse/response/RqUID")
    log.info("RqUID [" + RqUID + "]")
    
    def payload = responseAsXml.getNodeValue("//ns2:getResponse/response/Payload")
    log.info("payl [" + payload + "]")
    
    def responseFile = new PrintWriter ("C:\\Users\\explorer\\Downloads\\folder\\" + RqUID + ".txt")
    
    responseFile.println(payload)
    
    responseFile.flush()
    
    responseFile.close()

---


<a id="orgc90779f"></a>

# Android alternatives

GrapheneOS
LineageOS (supports many older devices)

---


<a id="orgd3b5c5f"></a>

# Wizdler

Parses the WSDL files and generates SOAP messages for you # Wizdler

Recognizes WSDL information on the page to show you the available services and operations. Click the operation to generate the SOAP requests and view the response. By clicking the service, you can download WSDL and external XSD files in single ZIP file.

---


<a id="orgc85028a"></a>

# OpenAPI spec editing tools

Swagger YAML editing tool : <http://editor.swagger.io/>

use this to generate server code and client code as well.

Stoplight studio is another good one. 

---


<a id="orgd1a6019"></a>

# Putty

change password : 

    passwd

---


<a id="orgc5bc6ef"></a>

# Calibre book-reader customization

In order to increase line spacing in paragraphs:

Preferences -> User Stylesheet -> p {line-height: 2}

---


<a id="org5a7f22c"></a>

# Command to put computer to sleep

Windows:

    rundll32.exe powrprof.dll,SetSuspendState 0,1,0

---


<a id="orge94af26"></a>

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


<a id="orgf70ff3d"></a>

# Lenovo Thinkpad tips

How do you turn on the light on top of the monitor?

To turn on the small light on the top of the monitor (when working in the dark and it is very difficult to see the keyboard) 

    Fn + PgUp

---


<a id="org73e8520"></a>

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


<a id="org324a61d"></a>

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

/A - Specifies that alternative characters (plus signs, hyphens, and vertical bars) be used to draw the tree diagram so that it can be printed by printers that don't support the line-drawing and box-drawing characters (DOS Versions 4 and 5).

/F - Displays the names of the files found within each directory listed.

Conclusion

As you can see in this guide, tree command will give you a nice graphical tree view of the directory structure. You can use this command when you want to view the contents of directories that have tons of other files/folders nested inside their folders.

---


<a id="orgb21a87f"></a>

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


<a id="org98d3797"></a>

# Killing a process

    ****In Windows machines****
If you need to kill a process manually on Windows it’s actually pretty easy. First, fire up a command prompt and type the following command.

    netstat -a -o -n

To kill the process we need to find the PID of the process in question. I just run down the list by port until I find port 8080 and here you will see the process id was 28344.

Finally, with the PID we can run the following command to kill the process

    taskkill /F /PID 28344

****In Linux****

This command will print you PID of process bound on that port :

    fuser 8080/tcp

And this command will kill that process : 

    fuser -k 8080/tcp

****Issue with port 80 being blocked****

If anyone is running into issues with port 80 blocked while setting up their new slice, I have a workaround if you would like to use it. I have an open ticket with VDE support to see about getting the Citrix Virtual Desktop Service changed to a different port.  I will let you know when they have verified this fix or have a different workaround.
I have been able to successfully reboot my slice several times and log back into the Citrix Workspace with no issue.
Verify it is the Citrix Desktop Service running over port 80 by using the following command (as Admin):

    netsh http show servicestate | findstr HTTP

Run the following command to change its port (you should run netstat -aon to make sure the number you choose is free).

    C:\Program Files\Citrix\Virtual Desktop Agent\Agent Configuration\Agentconfig.exe /portnumber:4150

Restart the Citrix Service (or reboot your machine)

---


<a id="org0535440"></a>

# Postman tips

Script to read fields from a JSON response and set it as a collection variable that can be used in the subsequent steps:

    var jsonData = JSON.parse(responseBody);
    pm.collectionVariables.set("quoteId", jsonData.data.quoteId);

Script to read fields from a SOAP response and set it as a collection variable that can be used in the subsequent steps:

    var parseString = require('xml2js').parseString;
    var stripPrefix = require('xml2js').processors.stripPrefix;
    
    parseString(responseBody, { tagNameProcessors: [ stripPrefix ] }, function(err, js) {
        if(err) throw err;
    
        var companysQuoteNumber = js.Envelope.Body[0].rateResponse[0].response[0].HomePolicyQuoteInqRs[0].PersPolicy[0].QuoteInfo[0].CompanysQuoteNumber[0];
    
        pm.collectionVariables.set("companysQuoteNumber", companysQuoteNumber);
    });

(A simpler way is to use xml2json but it will not remove the namespaces from the json and if the namespaces are dynamically changing, it can be a problem)

---


<a id="orgf8892d6"></a>

# Running jar files from terminal

    java -jar jarFileName.jar

---


<a id="org2c99d34"></a>

# Cntlm

Updating password in cntlm : 

In a Linux slice, cntlm config file is usually located here : 

    /etc/cntlm.conf
    or
    /usr/local/etc/cntlm.conf

Many corporate security policies require regular password changes, CNTLM makes these very easy.

First, get the hashes for the new password with: 

    cntlm -H

Copy and paste those hashes into your cntlm.conf file located at: 

    /etc/cntlm.conf
    or 
    /usr/local/etc/cntlm.conf

(if you get this error while trying to edit the file : readonly option is set (add ! to override) - 
This happens when the user is trying to write on a file without the right permissions. Login as root using sudo su and now you can do the edit.)

Restart your CNTLM instance and reconnect, you should be good to go 

    : brew services restart cntlm (if you have brew installed)

If this doesn't work, restarting the slice using the command 'reboot' works.

---


<a id="org0903822"></a>

# Commands to run tests on individual files

****Command to run cucumber tests alone if you are using gradle****

    ./gradlew test --tests pagro.project.RunCukesTest*

****for a javascript project****

    npx jest ./src/main/module/Operation/OperationService.test.ts
    npm run test -- ./src/main/module/Operation/OperationService.test.ts

---


<a id="org692e4b8"></a>

# Gradle commands

Go to the EAR folder in command prompt:

    C:\XXXXXXXXXXXXXEAR

And use this command to build EAR.

    gradle clean ear --info
    gradle clean testall --info
    gradle clean testAll ear –-info

From folder :      C:\XXXXXXXXXXEAR\build\distributions
To folder :        C:\WASLP<sub>dev\tools\WASLP8559\wlp\usr\servers\default\dropins</sub>
Windows command to copy the EAR from a source folder to a destination folder:

    xcopy C:\XXXXXXXXXXXXXXEAR\build\distributions C:\WASLP_dev\tools\WASLP8559\wlp\usr\servers\default\dropins

From folder :      C:\Users\n0281526\Documents\services-property-insurance-partner-exchange\PiAcordSalesMediationServiceEAR
To folder :        C:\WASLP<sub>dev\tools\WASLP8559\wlp\usr\servers\default\dropins</sub>
Windows command to copy the EAR from a source folder to a destination folder:

    xcopy C:\WASLP_dev\workspaces\git_repo\services-property-insurance-partner-exchange\PiAcordSalesMediationServiceEAR\build\distributions C:\WASLP_dev\tools\WASLP8559\wlp\usr\servers\default\dropins

To exclude a few tasks from the build process : 

    ./gradlew build -x checkstyleMain -x findbugsMain -x test -x jacocoTestCoverageVerification -x pmdMain

---


<a id="org68e61e6"></a>

# Cygwin

Cygwin Must Have Packages - Tutorial Table of Contents

Cygwin: 3:05 : <https://www.cygwin.com>

****Packages****

lynx, wget, curl, rsync

python, python3

bzip, tar

bash-completion

vim, vim-common

tmux

git

diffutils

make

gcc-c, gcc-g++, gcc-fortran

openssh

****Useful Stuff****

cd /bin

curl <https://github.com/git/git/raw/master/contrib/completion/git-completion.bash> -OL

source git-completion.bash

source /bin/git-completion.bash

source ~/.bashrc

****Download apt-cyg. It is used to install packages****

cd ~

lynx -source rawgit.com/transcode-open/apt-cyg/master/apt-cyg greaterThanSign apt-cyg

OR

curl rawgit.com/transcode-open/apt-cyg/master/apt-cyg -OL -k

After that, run this:

install apt-cyg /bin

****How to use apt-cyg to install packages?****

apt-cyg install nano

apt-cyg install zip

apt-cyg install unzip

Next, lets add some shortcuts. Open bashrc file. You can use Vim or nano.

vim ~/.bashrc or nano ~/.bashrc

alias desktop="cd C:/Users/huyle/Desktop"

alias open='cygstart'

alias reload='source ~/.bash<sub>profile</sub>'

export PATH="\({HOME}/bin:\){PATH}"

After making these changes, 'source' the bashrc file using 'source ~/.bashrc'

****Tabs and Hotkeys****

Cygwin does not have tabs. So, we have to use something else that supports tabs.

Use Console2 or any of your favorite terminal emulators.

Console2: <https://sourceforge.net/projects/cons>&#x2026;

These will be helpful while configuring the terminal emulator to use Cygwin.

For icon, use this: "C:\cygwin64\Cygwin-Terminal.ico"

For shell, use this: "C:\cygwin64\bin\mintty.exe"

****Integrate with Command Prompt****

For 64 bit, add C:\Users\\<username>\cygwin64\bin; to the end of the environment variables.

---


<a id="org59be9f8"></a>

# Hosts file

Access your hosts file on your services slice (C:\Windows\System32\drivers\etc)

---


<a id="org94c8af6"></a>

# SonarQube

How to run SonarQube in local slice or developer machine ?

Get Started in Two Minutes Guide
Download the SonarQube Community Edition

Unzip it, let's say in C:\sonarqube or /etc/sonarqube

Start the SonarQube Server:

    C:\sonarqube\bin\windows-x86-xx\StartSonar.bat

    /etc/sonarqube/bin/[OS]/sonar.sh console

Log in to <http://localhost:9000> with System Administrator credentials (admin/admin)

For multi-language projects, remove the property "sonar.language=java" from "sonar-project.properties"

---


<a id="org70004c6"></a>

# WID - clean and build tips

List only files of a particular extension with the DIR command:

    `dir *.class`
    
    `dir /S *.class`

will show files with ".class" suffix in specified directory and all sub-directories.
This approach works with files of any extension. e.g. .txt

When you do a full clean/build within wid it takes quite some time to do the clean part.  
So, before you do a clean/build,  close WID, then go into a cmd prompt into your workspace and
use the command  'del \*.class /s' to delete the compiled class files.
It takes about 10 seconds instead of letting wid do the clean in like 15 minutes.

---


<a id="orgfb4160f"></a>

# Issues encountered while working with MongoDB

Issues encountered while working on Employee Lambdas using MongoDB : 

mongodb is refusing connections:
go to AWS security group and open up port 27107 (port range 0 - 65535)

---

