
# Table of Contents

1		.  [Tools common for all OSs](#org51b01bf)
    1.  [IDEs :](#org82d5321)
    2.  [Text editors](#orgd4bd6d8)
    3.  [Browsers](#orgb6f2436)
    4.  [Miscellaneous](#org4d595f2)
2.  [Windows](#orgcef6bba)
3.  [Linux](#org3d30fa9)
4.  [Android (alphabetical order)](#orge644b31)
5.  [How to use multiple workspaces](#org82ace7c)


<a id="org51b01bf"></a>

# Tools common for all OSs


<a id="org82d5321"></a>

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


<a id="orgd4bd6d8"></a>

## Text editors

1.  Vim
2.  gVim


<a id="orgb6f2436"></a>

## Browsers

1.  Firefox(lastpass, instapaper)
2.  Tor browser


<a id="org4d595f2"></a>

## Miscellaneous

Calibre ebook editor and viewer


<a id="orgcef6bba"></a>

# Windows

-   Git + Good git interface for Windows

-   Text editors : 
    -   Notepad++ - plugins: Compare plugin,XML tools plugin,

-   7 zip

-   Console Emulation program - ConEmu


<a id="org3d30fa9"></a>

# Linux

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


<a id="orge644b31"></a>

# Android (alphabetical order)

-   APAS (Algorithm Problems and Solutions)
-   Algorithms (visual explanation)
-   Alltrails
-   Authenticator (Microsoft)
-   Dropbox (optional)
-   DuckDuckGo
-   Fairmail (using this for Gmail and hotmail accounts right now)
-   Firefox (browser)
-   Foxit PDF Reader (for pdf files)
-   GPS Tools
-   Geeks for Geeks
-   GitHub
-   Glassdoor (Job search) Is there an app for indeed?
-   Instapaper (Reading)
-   Lastpass
-   LinkedIn (Job search) (Not using it all that much)
-   Mapquest (maps)
-   Mega Client
-   Mega Sync
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


<a id="org82ace7c"></a>

# How to use multiple workspaces

This is useful in both Windows and Linux. This makes the workflow so much easier than switching between windows in a single workspace.
Keyboard shortcuts are available. 

Hold down Ctrl + Alt and tap an arrow key to 
quickly move up, down, left, or right between workspaces, 
depending on how they’re laid out. 

Add the Shift key—so, press Shift + Ctrl + Alt and 
tap an arrow key—and you’ll switch between workspaces, 
taking the currently active window with you to the new workspace.

---

**Ready API/Soap UI preferences**

UI - Workspace type : Tabbed Desktop

ReadyAPI - Default SOAP request editor : XML
           Default REST request editor : Request
           Default response editor : XML

---

**Android alternatives**

GrapheneOS
LineageOS (supports many older devices)

---

**Wizdler**

Parses the WSDL files and generates SOAP messages for you # Wizdler

Recognizes WSDL information on the page to show you the available services and operations. Click the operation to generate the SOAP requests and view the response. By clicking the service, you can download WSDL and external XSD files in single ZIP file.

---

**OpenAPI spec editing tools**

Swagger YAML editing tool : <http://editor.swagger.io/>

use this to generate server code and client code as well.

Stoplight studio is another good one. 

---

