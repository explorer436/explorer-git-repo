
# Table of Contents

1.  [My Emacs notes](#orgb3baee1)
    1.  [Helpful tips related to configuration and other things related to Emacs that I find useful.](#org325a8de)
        1.  [How to view the list of all the currently installed packages in Emacs?](#org3a8996d)
        2.  [How to add MELPA as another source of packages in addition to GNU's elpa?](#org0c85336)
        3.  [How to work with org-mode and evil-mode? It looks like Vim key bindings will work in Org mode as well.](#orgdaa1f7a)
        4.  [Commands](#org227ea38)
        5.  [Other hints](#org8e313d2)
        6.  [Resources for emacs](#orgbed8a24)


<a id="orgb3baee1"></a>

# My Emacs notes


<a id="org325a8de"></a>

## Helpful tips related to configuration and other things related to Emacs that I find useful.


<a id="org3a8996d"></a>

### How to view the list of all the currently installed packages in Emacs?

I am using Emacs in one machine. I have installed lots of packages from the package manager, and I want to use my settings on another machine.

To see a list of the available packages : M-x list-packages
Run this command till you find the first row of installed package: "C-s installed"
Start selecting with C-SPC.
Go down till you reach built-in packages. Copy with M-w. C-x b for new buffer. Paste with C-y.C-x C-s to save file.


<a id="org0c85336"></a>

### How to add MELPA as another source of packages in addition to GNU's elpa?

1.  The easiest way is to copy the saved ".emacs" file from GitHub repo.
2.  The alternative is: In a browser, visit MELPA website and grab the URL for the package archive "<https://melpa.org/packages/>"
    M-x customize-group -> package -> Go to "package archives" -> "INS" to insert a new entry. Provide archive name and archive URL. Set the "State" to "Save for future sessions".

After making changes to the config to add MELPA as a source of packages, run the following two commands:
  M-x package-refresh-contents (to refresh the list of packages)
  M-x package-install RET evil (to install the evil package)

To change to mode from some other mode : M-x evil-mode


<a id="orgdaa1f7a"></a>

### How to work with org-mode and evil-mode? It looks like Vim key bindings will work in Org mode as well.


<a id="org227ea38"></a>

### Commands

<table border="2" cellspacing="0" cellpadding="6" rules="groups" frame="hsides">


<colgroup>
<col  class="org-left" />

<col  class="org-left" />
</colgroup>
<tbody>
<tr>
<td class="org-left">Command</td>
<td class="org-left">Description</td>
</tr>


<tr>
<td class="org-left">&#xa0;</td>
<td class="org-left">&#xa0;</td>
</tr>


<tr>
<td class="org-left">C-x b and C-x C-b</td>
<td class="org-left">Switching between buffers</td>
</tr>


<tr>
<td class="org-left">C-g</td>
<td class="org-left">Cancelling half-entered commands</td>
</tr>


<tr>
<td class="org-left">C-h m, C-h k, C-h f, C-h a(just remember C-h and read the prompt in the minibuffer)</td>
<td class="org-left">Getting help on editing modes,keybindings and commands</td>
</tr>


<tr>
<td class="org-left">C-x C-c</td>
<td class="org-left">Quitting Emacs</td>
</tr>


<tr>
<td class="org-left">C-h i</td>
<td class="org-left">The info directory</td>
</tr>


<tr>
<td class="org-left">C-x k</td>
<td class="org-left">kill buffer</td>
</tr>


<tr>
<td class="org-left">M-x</td>
<td class="org-left">Invoking commands by name</td>
</tr>


<tr>
<td class="org-left">M-x customize</td>
<td class="org-left">to enter customization menu</td>
</tr>


<tr>
<td class="org-left">C-x C-f (This puts us in Emac's dired mode - directory editor)</td>
<td class="org-left">Visiting (opening) files</td>
</tr>


<tr>
<td class="org-left">C-x C-s</td>
<td class="org-left">Saving files</td>
</tr>


<tr>
<td class="org-left">g</td>
<td class="org-left">Refresh the listing in dired mode</td>
</tr>
</tbody>
</table>


<a id="org8e313d2"></a>

### Other hints

If anything goes wrong with the customizations, delete the ".emacs" file in the home directory and start from scratch again.


<a id="orgbed8a24"></a>

### Resources for emacs

How to learn Emacs :: About this guide to Emacs - <https://david.rothlis.net/emacs/howtolearn.html>   
MELPA - <http://melpa.org/#/> 
mastering-emacs-in-one-year - <https://github.com/redguardtoo/mastering-emacs-in-one-year-guide> 
From Vim to Emacs in Fourteen Days - <https://blog.aaronbieber.com/2015/05/24/from-vim-to-emacs-in-fourteen-days.html> 
Howardism - <http://howardism.org/> 
Magit User Manual - <https://magit.vc/manual/magit/> 
The Org Manual - <https://orgmode.org/manual/index.html> 
Org mode beginning at the basics - <https://orgmode.org/worg/org-tutorials/org4beginners.html> 
EmacsWiki - <https://www.emacswiki.org/emacs/SiteMap> 
Xah Emacs Site - <http://ergoemacs.org/index.html> 
<https://jaderholm.com/screencasts.html>

