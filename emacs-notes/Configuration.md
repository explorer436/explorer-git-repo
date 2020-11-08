Emacs custom configurations:

How to view the list of all the currently installed packages in Emacs?

I am using Emacs in one machine. I have installed lots of packages from the package manager, and I want to use my settings on another machine.

To see a list of the available packages : M-x list-packages
Run this command till you find the first row of installed package: "C-s installed"
Start selecting with C-SPC.
Go down till you reach built-in packages. Copy with M-w. C-x b for new buffer. Paste with C-y.C-x C-s to save file.

Only advantage that I see is this is a tad more descriptive. Showing a small description of your packages. useful when you install some packages and forget about it.

-------------------
How to add MELPA as another source of packages in addition to GNU's elpa?
(In a browser, visit MELPA website and grab the URL for the package archive "https://melpa.org/packages/")

M-x customize-group -> package -> Go to "package archives" -> "INS" to insert a new entry. Provide archive name and set the "State" to "Save for future sessions".

After making changes to the config, run the following two commands:
  M-x package-refresh-contents
  M-x package-install RET evil

To change modes: M-x evil-mode
-------------------

How to work with org-mode and evil-mode? It looks like Vim key bindings will work in Org mode as well.