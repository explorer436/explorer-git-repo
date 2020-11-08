
# Table of Contents

1.  [My Emacs notes](#org576c81d)
    1.  [Helpful tips related to configuration and other things related to Emacs that I find useful.](#org106b62f)
        1.  [How to view the list of all the currently installed packages in Emacs?](#orgb48465e)
        2.  [How to add MELPA as another source of packages in addition to GNU's elpa?](#orgae0997b)
        3.  [How to work with org-mode and evil-mode?](#orgd29276e)
        4.  [Commands](#org75bca50)
        5.  [Other hints](#orga2f935a)
        6.  [Resources for emacs](#org76bfc19)
        7.  [How to auto save an org document in markdown format?](#org2253ff5)


<a id="org576c81d"></a>

# My Emacs notes


<a id="org106b62f"></a>

## Helpful tips related to configuration and other things related to Emacs that I find useful.


<a id="orgb48465e"></a>

### How to view the list of all the currently installed packages in Emacs?

I am using Emacs in one machine. I have installed lots of packages from the package manager, and I want to use my settings on another machine.

To see a list of the available packages : M-x list-packages
Run this command till you find the first row of installed package: "C-s installed"
Start selecting with C-SPC.
Go down till you reach built-in packages. Copy with M-w. C-x b for new buffer. Paste with C-y.C-x C-s to save file.


<a id="orgae0997b"></a>

### How to add MELPA as another source of packages in addition to GNU's elpa?

1.  The easiest way is to copy the saved ".emacs" file from GitHub repo.
2.  The alternative is: In a browser, visit MELPA website and grab the URL for the package archive "<https://melpa.org/packages/>"
    M-x customize-group -> package -> Go to "package archives" -> "INS" to insert a new entry. Provide archive name and archive URL. Set the "State" to "Save for future sessions".

After making changes to the config to add MELPA as a source of packages, run the following two commands:
  M-x package-refresh-contents (to refresh the list of packages)
  M-x package-install RET evil (to install the evil package)

To change to mode from some other mode : M-x evil-mode


<a id="orgd29276e"></a>

### How to work with org-mode and evil-mode?

It looks like Vim key bindings will work in Org mode as well.


<a id="org75bca50"></a>

### Commands

<table border="2" cellspacing="0" cellpadding="6" rules="groups" frame="hsides">


<colgroup>
<col  class="org-left" />

<col  class="org-left" />
</colgroup>
<thead>
<tr>
<th scope="col" class="org-left">Command</th>
<th scope="col" class="org-left">Description</th>
</tr>
</thead>

<tbody>
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


<a id="orga2f935a"></a>

### Other hints

If anything goes wrong with the customizations, delete the ".emacs" file in the home directory and start from scratch again.


<a id="org76bfc19"></a>

### Resources for emacs

<table border="2" cellspacing="0" cellpadding="6" rules="groups" frame="hsides">


<colgroup>
<col  class="org-left" />
</colgroup>
<tbody>
<tr>
<td class="org-left">How to learn Emacs :: About this guide to Emacs - <a href="https://david.rothlis.net/emacs/howtolearn.html">https://david.rothlis.net/emacs/howtolearn.html</a></td>
</tr>


<tr>
<td class="org-left">MELPA - <a href="http://melpa.org/#/">http://melpa.org/#/</a></td>
</tr>


<tr>
<td class="org-left">mastering-emacs-in-one-year - <a href="https://github.com/redguardtoo/mastering-emacs-in-one-year-guide">https://github.com/redguardtoo/mastering-emacs-in-one-year-guide</a></td>
</tr>


<tr>
<td class="org-left">From Vim to Emacs in Fourteen Days - <a href="https://blog.aaronbieber.com/2015/05/24/from-vim-to-emacs-in-fourteen-days.html">https://blog.aaronbieber.com/2015/05/24/from-vim-to-emacs-in-fourteen-days.html</a></td>
</tr>


<tr>
<td class="org-left">Howardism - <a href="http://howardism.org/">http://howardism.org/</a></td>
</tr>


<tr>
<td class="org-left">Magit User Manual - <a href="https://magit.vc/manual/magit/">https://magit.vc/manual/magit/</a></td>
</tr>


<tr>
<td class="org-left">The Org Manual - <a href="https://orgmode.org/manual/index.html">https://orgmode.org/manual/index.html</a></td>
</tr>


<tr>
<td class="org-left">Org mode beginning at the basics - <a href="https://orgmode.org/worg/org-tutorials/org4beginners.html">https://orgmode.org/worg/org-tutorials/org4beginners.html</a></td>
</tr>


<tr>
<td class="org-left">EmacsWiki - <a href="https://www.emacswiki.org/emacs/SiteMap">https://www.emacswiki.org/emacs/SiteMap</a></td>
</tr>


<tr>
<td class="org-left">Xah Emacs Site - <a href="http://ergoemacs.org/index.html">http://ergoemacs.org/index.html</a></td>
</tr>


<tr>
<td class="org-left"><a href="https://jaderholm.com/screencasts.html">https://jaderholm.com/screencasts.html</a></td>
</tr>

<tbody>
<tr>
</tr>
</tbody>
</table>


<a id="org2253ff5"></a>

### How to auto save an org document in markdown format?

Install the package 'auto-org-md' and after editing the file in org-mode, switch to it using this : "M-x auto-org-md-mode" to toggle the auto save to markdown functionality on and off.

