
How to view the list of all the currently installed packages in Emacs?

I am using Emacs in one machine. I have installed lots of packages from the package manager, and I want to use my settings on another machine.

M-x list-packages.
C-s installed till you find the first row of installed package.
Start selecting with C-SPC.
Go down till you reach built-in packages. Copy with M-w. C-x b for new buffer. Paste with C-y.C-x C-s to save file.

Only advantage that I see is this is a tad more descriptive. Showing a small description of your packages. useful when you install some packages and forget about it.
