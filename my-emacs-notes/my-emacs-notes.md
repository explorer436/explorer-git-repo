
# Table of Contents

1.  [My Emacs notes](#org2f011a0)
    1.  [Helpful tips related to configuration and other things related to Emacs that I find useful.](#orgf72d710)
        1.  [How to view the list of all the currently installed packages in Emacs?](#org679b5f7)
        2.  [How to add MELPA as another source of packages in addition to GNU's elpa?](#org7595b8a)
        3.  [How to work with org-mode and evil-mode?](#orga6e6107)
        4.  [Helpful commands](#org770e1f7)
        5.  [.emacs file](#org25b799e)
        6.  [Resources for emacs](#org427d64b)
        7.  [How to auto save an org document in markdown format?](#org5f091a0)
        8.  [Line numbers](#org43c07db)


<a id="org2f011a0"></a>

# My Emacs notes


<a id="orgf72d710"></a>

## Helpful tips related to configuration and other things related to Emacs that I find useful.


<a id="org679b5f7"></a>

### How to view the list of all the currently installed packages in Emacs?

If you are using Emacs in one machine, and if you want to set-up the exact same set-up settings in another machine, you need to view the list of installed packages from the package manager.

To see a list of the available packages : M-x list-packages

Run this command till you find the first row of installed package: "C-s installed"

Start selecting with C-SPC.

Go down till you reach built-in packages. Copy with M-w. C-x b for new buffer. Paste with C-y.C-x C-s to save file.

Another alternative is, simply copy the ".emacs" file from this computer to the other computer.

---


<a id="org7595b8a"></a>

### How to add MELPA as another source of packages in addition to GNU's elpa?

1.  Hint: In order to avoid having to do this multiple times when switching between multiple machines, save the \`.emacs\` settings in GitHub so that you can just move it from machine to machine.
2.  The alternative is: In a browser, visit MELPA website and grab the URL for the package archive "<https://melpa.org/packages/>"
    M-x customize-group -> package -> Go to "package archives" -> "INS" to insert a new entry. Provide archive name and archive URL. Set the "State" to "Save for future sessions".

After making changes to the config to add MELPA as a source of packages, run the following two commands:

1.  M-x package-refresh-contents (to refresh the list of packages)
2.  M-x package-install RET evil (to install the evil package)

To change to mode from some other mode : M-x evil-mode

---


<a id="orga6e6107"></a>

### How to work with org-mode and evil-mode?

It looks like Vim key bindings will work in Org mode as well.

---


<a id="org770e1f7"></a>

### Helpful commands

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
<td class="org-left">C-h m, C-h k, C-h f, C-h a</td>
<td class="org-left">Getting help on editing modes,keybindings and commands. (just remember C-h and read the prompt in the minibuffer)</td>
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
<td class="org-left">C-x C-f</td>
<td class="org-left">Visiting (opening) files. (This puts us in Emac's dired mode - directory editor). To create a new file, just start typing the name of the file that you want to create.</td>
</tr>


<tr>
<td class="org-left">C-x C-s</td>
<td class="org-left">Saving files</td>
</tr>


<tr>
<td class="org-left">g</td>
<td class="org-left">Refresh the listing in dired mode</td>
</tr>


<tr>
<td class="org-left">&#xa0;</td>
<td class="org-left">Refresh the listing in dired mode</td>
</tr>


<tr>
<td class="org-left">C-x b <b>untitled</b></td>
<td class="org-left">will open new buffer if not exist</td>
</tr>
</tbody>
</table>

---


<a id="org25b799e"></a>

### .emacs file

If anything goes wrong with the customizations, delete the ".emacs" file in the home directory and start from scratch again.

---

Where can I find my .emacs file for Emacs running on Windows?

If you want to look at the contents of the file:

Within Emacs, ~ at the beginning of a file name is expanded to your HOME directory, so you can always find your .emacs file with C-x C-f ~/.emacs.

If you are trying to find out where the file is as opposed to looking at the contents of the file:

It should be stored in the variable user-init-file. Use C-H v user-init-file RET to check. You can also open it directly by using M-x eval-expression RET (find-file user-init-file) RET

---


<a id="org427d64b"></a>

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


<tr>
<td class="org-left"><a href="https://cestlaz.github.io/stories/emacs/">https://cestlaz.github.io/stories/emacs/</a></td>
</tr>
</tbody>
</table>

---


<a id="org5f091a0"></a>

### How to auto save an org document in markdown format?

Install the package 'auto-org-md' and after editing the file in org-mode, switch to it using this : "M-x auto-org-md-mode" to toggle the auto save to markdown functionality on and off.

---


<a id="org43c07db"></a>

### Line numbers

How to show line numbers in files in emacs?

emacs has 2 line numbers mode.

Alt+x linum-mode ? old, hack, slow. Emacs 23 (released in 2009).

Alt+x global-display-line-numbers-mode ? Emacs 26 (released in 2018-05)

---

