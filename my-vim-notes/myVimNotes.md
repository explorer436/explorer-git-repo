
# Table of Contents

1.  [My Vim notes](#org0305840)
    1.  [Helpful tips related to configuration and other things related to Vim that I find useful.](#org2488d36)
        1.  [Search tips](#org672ccf6)
        2.  [Scrolling](#org483bec4)
        3.  [Sorting](#org8472ccd)
        4.  [Spell check](#org22861a3)
        5.  [Non empty lines](#org314015f)
        6.  [Split](#orgfde923a)
        7.  [Terminal](#org9aa2b90)
        8.  [Marks](#orgbf58c9e)
        9.  [Registers and copy and paste](#org45f6454)
        10. [Research](#org561ead6)
        11. [Vim completion](#org0dc2315)
        12. [Word and text manipulation](#org1d98d51)
        13. [Working with multiple files](#org270ee24)
        14. [cTags in Vim](#org104bb8c)
        15. [Deleting](#org4ea8fd2)
        16. [File comparison with Vim](#org8ac03f1)
        17. [Grep](#orge653c1e)
        18. [Indentation](#orgcd40c86)
        19. [Line numbers](#org373e5f5)
        20. [Lower case Upper case](#orge8fb5f7)
        21. [Manual insertion of numbered lists](#org05e173c)
        22. [Macros](#org566e0b0)
        23. [Netrw](#orga508608)
        24. [Open questions](#org62662da)
        25. [Helpful links :](#org48f6319)


<a id="org0305840"></a>

# My Vim notes


<a id="org2488d36"></a>

## Helpful tips related to configuration and other things related to Vim that I find useful.


<a id="org672ccf6"></a>

### Search tips

    

<table border="2" cellspacing="0" cellpadding="6" rules="groups" frame="hsides">


<colgroup>
<col  class="org-left" />

<col  class="org-left" />
</colgroup>
<tbody>
<tr>
<td class="org-left">What to Type</td>
<td class="org-left">What it does</td>
</tr>


<tr>
<td class="org-left">[i</td>
<td class="org-left">show first line containing word under the cursor</td>
</tr>


<tr>
<td class="org-left">[I or ]I</td>
<td class="org-left">show every line containing word under the cursor</td>
</tr>


<tr>
<td class="org-left">:g/pattern/</td>
<td class="org-left">show every line matching the regular expression pattern</td>
</tr>
</tbody>
</table>

---


<a id="org483bec4"></a>

### Scrolling

1.  Moving the cursor gracefully :

    // TODO - Convert this into a table.j
    
        ~ first non-blank character on next line? [Control][Enter]
        ~ first non-blank character on previous line? -
        M/H/L : Move cursor to middle/top/bottom of screen (move only the cursor without moving the screen)
        first and last non blank characters in a line : ^ and g_
        first and last characters in a line : 0 and $
        To move to the beginning of the next or previous sentence, ( and ) can be used. 
        Paragraphs can be navigated using { and }.  The definition of a paragraph is based on nroff macros (read man nroff if you want to figure out what that means). 
        This generally works quite well for navigating between large space-separated blocks in a programming language.
        Another useful command is %, which moves to the next or previous related item. 
        Items include brackets, opening and closing c-style comments, and C preprocessor conditionals. 
        I find myself using % a lot depending on the programming language.

2.  SCROLLING :

    Scroll up and down through a page gracefully using Vim the following keystrokes:
    
        [Control][b] - Moves screen up one page, cursor to last line
        [Control][f] - Moves screen down one page, cursor to first line
        Half-page navigations
        [Control][u] - Moves cursor & screen up ½ page
        [Control][d] - Moves cursor & screen down ½ page
        One-line movements:
        [Control][E] - move the page/screen up by one line
        [Control][Y] - move the page/screen down by one line
        I lose visual context every time for the former two, so I have developed the bad habit of hitting the latter (Ctrl-Y and Ctrl-E) repetitively. 
        Ctrl-y and Ctrl-e only change the cursor position if it would be moved off screen.
    
    To leave the cursor in the same column when you use Ctrl+D, Ctrl+F, Ctrl+B, Ctrl+U, G, H, M, L, gg
    you should define the following option:
    
    :set nostartofline

3.  Move the page using these commands:

        zt - move current line to the top of the screen
        zz - move current line to the middle of the screen (Careful with zz, if you happen to have Caps Lock on accidentally, you will save and exit vim!)
        zb - move current line to the bottom of the screen
        
        :N : Go to line N
        N% : Go to the line N percent through the file
        N| : Go to column N
    
    ---


<a id="org8472ccd"></a>

### Sorting

Imagine you’re working in vim. You come across this code:

    gem 'clearance', '1.0.0.rc4'
    gem 'neat'
    gem 'stripe'
    gem 'pg'
    gem 'thin'
    gem 'rails', '3.2.11'
    gem 'bourbon'
    gem 'simple_form'
    gem 'strong_parameters'

You want to sort the list alphabetically. You select the lines visually:

Shift + V : You invoke the sort function

:sort
You rejoice:

    gem 'bourbon'
    gem 'clearance', '1.0.0.rc4'
    gem 'neat'
    gem 'pg'
    gem 'rails', '3.2.11'
    gem 'simple_form'
    gem 'stripe'
    gem 'strong_parameters'
    gem 'thin'
    You dig deeper:

:help sort

---


<a id="org22861a3"></a>

### Spell check

To turn  it off \`:set nospell\`

Using Spellchecking:

To move to a misspelled word, use \`]s\` (the next misspelled word) and \`[s\` (the previous misspelled word).

Once the cursor is on the word, use z=, and Vim will suggest a list of alternatives that it thinks may be correct. If the list does not contain the word we are looking for, dismiss it with \`Esc\`

What if Vim is wrong, and the word is correct? 
zg - Add the current word to Vim's spell file. 
zw - Remove the current word from Vim's spell file.
zug - Revert zg or zw command for the current word.

Usually, this is where the spell file will be :
~/.vim/spell/en.utf-8.add

How to use it from insert modes?
Ctrl x - Ctrl s
Vim scans backward from the cursor position, stopping when it finds a mis-spelt word. It then builds a word list from suggested corrections and presents them in an autocomplete pop-up menu.

---


<a id="org314015f"></a>

### Non empty lines

To do something only to non-empty lines, use \`:g/./\` before the command.
     :g/./ s/$/;/

To do something only to the visually selected non-empty lines, use the same approach.

---


<a id="orgfde923a"></a>

### Split

Opening Vim help in a vertical split window

:vertical (vert)

:vert help

You can also control whether the window splits on the left/top or the right/bottom with topleft (to) and botright (bo). For example, to open help in the right window of a vertical split:

:vert bo help

---


<a id="org9aa2b90"></a>

### Terminal

Launch terminal from within Vim using \`:term\`

---


<a id="orgbf58c9e"></a>

### Marks

<https://vim.fandom.com/wiki/Using_marks>

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
<td class="org-left">ma</td>
<td class="org-left">set mark a at current cursor location</td>
</tr>


<tr>
<td class="org-left">'a</td>
<td class="org-left">jump to line of mark a (first non-blank character in line)</td>
</tr>


<tr>
<td class="org-left">`a</td>
<td class="org-left">jump to position (line and column) of mark a</td>
</tr>


<tr>
<td class="org-left">d'a</td>
<td class="org-left">delete from current line to line of mark a</td>
</tr>


<tr>
<td class="org-left">d`a</td>
<td class="org-left">delete from current cursor position to position of mark a</td>
</tr>


<tr>
<td class="org-left">c'a</td>
<td class="org-left">change text from current line to line of mark a</td>
</tr>


<tr>
<td class="org-left">y`a</td>
<td class="org-left">yank text to unnamed buffer from cursor to position of mark a</td>
</tr>


<tr>
<td class="org-left">:marks</td>
<td class="org-left">list all the current marks</td>
</tr>


<tr>
<td class="org-left">:marks aB</td>
<td class="org-left">list marks a, B</td>
</tr>
</tbody>
</table>

---


<a id="org45f6454"></a>

### Registers and copy and paste

COPY AND PASTE:
How to copy a line in vim and paste it in a different program (a browser or word document or email):
shift v (to select the line)
(") quotation mark to select a register
(+) we want to select the + register
y - to yank

Now, go to the other program and press Cntrol v to paste it.

In the same way, if we want to copy something from a broser, copy it there and go to vim:
" (to select a register) + (to select the + register) p (to paste it)

When you copy something using the key 'y', go to a different location and delete a word in this location using the key 'd', and try to paste the text that was yanked before using either 'p' or 'P', the deleted word gets inserted instead of the word that was yanked earlier. This is very annoying. The reason for this is that when a word is deleted using the key 'd', it is also saved into the unnamed register, replacing the word that was originally yanked. When pasting text in the new location, paste it form the 0 (zero) register because, when a word is yanked, it is saved into the unnamed register and also the 0 register. But when a word is deleted using the key 'd', it is only put into the unnamed register but not into the 0 register. 
Another way to paste the text without using registers at all is to visually select the text that you want to replace and use the key 'p' (to paste).

---

Issue with copying/pasting to/from system clipboard?

Be aware that copying/pasting from the system clipboard will not work if :echo has('clipboard') returns 0. In this case, vim is not compiled with the +clipboard feature and you'll have to install a different version or recompile it. Some linux distros supply a minimal vim installation by default, but generally if you install the vim-gtk or vim-gtk3 package you can get the extra features.

---

"Hello" is in the "a" register
"world" is in the "b" register

How can I quickly type "Hello world"?

---


<a id="org561ead6"></a>

### Research

Interesting comments about Vim :

It's simply a piece of software that integrates several tools needed for Development in a single instance. Vim comes bare bone but plug ins can easily be installed using Plug ins Manager such as Vundle or Vim Plug.

It can then provide for capabilities including but not limited to:

-   Version control within a few strokes such as GitGutter and Fugitive e.g. :Gstatus

-   Syntax checking using Syntastic

-   NERDTree to provide Tree like document view

-   Goyo providing Zen Mode

-   Plethora of themes and awesome power lines such as Airline

-   Spell checker that comes by default

-   EasyMotion for rapid motion throughout a document without the use of the mouse

-   Additional support for languages such as Markdown

---

How to switch between Vim and terminal when using Vim in a terminal (found this when looking for differences between Vim and GVim)

With vim (not gVim) you can get benefit from ctrl-Z

if you want to test your codes in shell/terminal, or execute some shell commands during your editing. 
In vim you can just ctrl-z to back to terminal do what you want, and fg back to vim. 
With Gvim, you cannot do that. 

---


<a id="org0dc2315"></a>

### Vim completion

Let Vim do the typing by George Brocklehurst (@georgebrock)

Even if you're good at it, typing is still slower and more error-prone than not typing. This presentation will explore a few ways to avoid typing by getting Vim to do the typing for you.

1.  Vi, or Emacs?

    As modal editors, Vi and Vim tend to avoid modifier keys in favour of modes. The behaviour of a key stoke is dictated by the editor's mode. This is different from Emacs-like editors, where behaviour is modified by pressing modifier keys instead of changing mode.
    
    Everything in this presentation uses modifier keys in insert mode: the commands might feel more like Emacs commands than Vim commands, but they are useful, and have their place in the Vim editing philosophy.
    
    Vim users like to be efficient, and part of that efficiency is making changes as atomic edits. An atomic edit can be repeated (using .) or undone (using u). A single insert updates the . register, making the inserted text readily available. Sometimes, when we're inserting text that includes something Vim's already seen – either because it's in one of our files, a symbol in our program, or something from one of our registers – it's more efficient not to change mode, and to reach for a modifier key instead.

2.  A few of my favourite things

    ****Insert text from a register****
    
    \`ctrl+r\`
    
    ****Last inserted text****
    
    \`ctrl+a\`
    
    There are three common cases where we want to insert something Vim's already seen as part of a larger insert:
    
    1.  Insert from a register, using ctrl+rregister.
    2.  Insert the same text as the previous insert, using ctrl+a. This is similar to ctrl+r..
    3.  Complete a partially-typed word or phrase, which will be the focus of this presentation.

3.  Completion

    ****Simple word completion****
    
    \`ctrl+p\`
    
    or
    
    \`ctrl+n\`
    
    -   \`ctrl+p\` finds the previous matching completion for the partially typed word.
    
    -   \`ctrl+n\` finds the next matching completion for the partially typed word.
    
    -   \`ctrl+p\` is usually more useful, because you're more likely to be looking for a word you just used than a word you're about to use.
    
    -   Where Vim looks for completions is controlled by the complete setting. The default is .,w,b,u,t,i, which means Vim will look in:
        
        1.  The current buffer.
        2.  Buffers in other windows.
        3.  Other loaded buffers.
        4.  Unloaded buffers.
        5.  Tags.
        6.  Included files.
        
        I also like to add kspell to the end of the list:
        
        1.  The active spell checking dictionary, when spell checking is enabled.
        
        ****Tag completion****
    
    \`ctrl+xctrl+]\`
    
    Sometimes, you know that the word you want to complete isn't just any old word that appears in your file or files; you know you're trying to complete a symbol from your program.
    
    If you're using ctags(1) then you can complete a word in your tags file using \`ctrl+xctrl+]\`.
    
    The initial \`ctrl+x\` puts Vim into a completion mode, which is a sub-mode of insert mode. We'll see this prefix again.
    
    When the completion menu appears, you can use \`ctrl+p\` and \`ctrl+n\` to navigate through the options.
    
    ****Filename completion****
    
    \`ctrl+xctrl+f\`
    
    Filename completion will complete paths relative to the current working directory, similar to tab completion in Unix shells.
    
    ****Context-aware word completion****
    
    \`ctrl+xctrl+p\`
    
    or
    
    \`ctrl+xctrl+n\`
    
    Repeat the command to continue adding matches, e.g. in a document that contained the string Hello world, you could type \`Helctrl+xctrl+p\` to complete \`Hello\`, and then immediately repeating \`ctrl+xctrl+p\` would add world.
    
    At any point, if there are multiple possible matches, you can use \`ctrl+p\` and \`ctrl+n\` to navigate through the options.

4.  Context-aware line completion

    \`ctrl+xctrl+l\`
    
    As with word completion, you can repeat the command to continue adding matches.

5.  Language-aware completion

    \`ctrl+xctrl+o\`
    
    If you have Vim's filetype plugins enables, you will have access to omnicomplete for some languages. This completion style will complete language keywords and built in classes or functions.
    
    For example, in a Ruby file, typing "Hello world".capctrl+xctrl+o would complete to "Hello world".capitalize or "Hello world".capitalize!.

6.  Insert mode completion : \`Cntrl N\`

7.  Omni completion : \`<sup>O</sup> ^N ^P\`

8.  Completion tips :

    ~ vim is very completion friendly
    
    ~ just use <Tab> on command line
    
    ~ for filenames, set ‘wildmenu’ and ‘wildmode’ (I like "list:longest,full")
    
    ~ :new ~/dev/fo<Tab> - complete filename
    
    ~ :help ‘comp<Tab> - complete option name
    
    ~ :re<Tab> - complete command
    
    ~ hit <Tab> again to cycle, CTRL-N for next match, CTRL-P for previous
    
    ---


<a id="org1d98d51"></a>

### Word and text manipulation

<https://vim.fandom.com/wiki/Search_and_replace#substitute_last_search>

1.  WORD MANIPULATION:

    Quickly change word or line : To quickly change a word you can use cw,caw (change a word) or ciw (change in word). Use c$ or just C to quickly change from the cursor to the end of a line, cc to change an entire line, or cis (change in sentense) for a sentence
    
    To append something to a word (at the end of the word) - ea
    
    To delete a word along with the whitespace after the word - dw (vw to select in visual mode)
    To delete a word but not the the whitespace after the word - de (ve to select in visual mode)

2.  TEXT SELECTION :

    If you want to do the same thing to a collection of lines, like cut, copy, sort, or format, you first need to select the text. Get out of insert mode, hit one of the options below, and then move up or down a few lines. You should see the selected text highlighted.
    
    V       - selects entire lines 
    v       - selects range of text
    ctrl-v  - selects columns
    gv      - reselect block
    
    After selecting the text, try d to cut/delete, or y to copy, or :s/match/replace/, or :center, or !sort, or&#x2026;
    Move to cursor where you would like to paste.
    Press P to paste before the cursor, or p to paste after.

3.  SEARCH AND REPLACE :

    How do I convert all occurrences of ABC to XYZ in a file using the vi/vim editor?  :1,$s/ABC/XYZ/g   and then press [Enter]. This vi command replaces every occurrence of ABC with XYZ on every line, and even when there are multiple occurrences on a line.  Note that in this example, the "g" character at the end of the command means "global". If you don't use this "g" the tab character will only be replaced the first time it is seen on a line, but if you add the "g" at the end of the command every tab character in each line will be replaced.
    
    / : Search
    \*/# : Search forward/back for word under cursor
    
    :%s/search<sub>for</sub><sub>this</sub>/replace<sub>with</sub><sub>this</sub>/    - search whole file and replace
    :%s/search<sub>for</sub><sub>this</sub>/replace<sub>with</sub><sub>this</sub>/c   - confirm each replace
    To convert each tab in the file to four spaces : 1,$s/\t/    *g
    How to replace all tabs with spaces :%s*\t/    /g
    
    General tips for searching : 
    
    /pattern       - search forward for pattern
    ?pattern       - search backward
    n              - repeat forward search
    N              - repeat backward
    
    :set ignorecase - case insensitive
    :set smartcase  - use case if any caps used 
    :set incsearch  - show match as search proceeds
    :set hlsearch   - search highlighting
    
    More cool searching tricks:
    \`\`\`
    
    -   - search for word currently under cursor
    
    g\*              - search for partial word under cursor (repeat with n)
    ctrl-o, ctrl-i  - go through jump locations
    [I              - show lines with matching word under cursor
    \`\`\`
    
    ---
    
    \`:g/<pattern>/j\` to join lines within a pattern
    
    To join the subsequent line with a line containing a certain text: \`:g/.\*\_<sub>text</sub>.\*/j\`
    
    ---
    
    \`:%s/{\\<sub>s</sub>.\*\_<sub>text</sub>/{\_<sub>text</sub>/g\` - Join two lines with a pattern ending on one line and a pattern beginning on the subsequent line.
    
    This looks for lines ending with \`{\` and a next line starting with the text (a wildcard) \`\_<sub>text</sub>\` and joins them into a single line.
    
    ---
    
    \`:%s/' ,/',\r/g\` - Replace each \`' },\` in the current file by a new line. 
    
    ---
    
    \`:{\\\_$\\<sub>s</sub>\*\_<sub>prefix</sub>\` - This searches for lines ending with \`{\` and a subsequent line starting with \`\_<sub>prefix</sub>\`. 
    
    \`:',\\\_$\\<sub>s</sub>\*\_<sub>text</sub>\` - This searches for lines ending with \`',\` and a subsequent line starting with \`\_<sub>text</sub>\`.
    
    \`:%s/',\\\_$\\<sub>s</sub>\*\_<sub>text</sub>/',\_<sub>text</sub>/g\` - This searches for lines ending with \`',\` and a subsequent line starting with \`\_<sub>text</sub>\` and joins the two lines together.
    
    \`:%s/{\\\_$\\<sub>s</sub>\*\_<sub>prefix</sub>/{\_<sub>prefix\g</sub>\` - This searches for lines ending with \`{\` and a subsequent line starting with \`\_<sub>prefix</sub>\` and joins the two lines together.
    
    \`:g/.\*\_<sub>prefix</sub>.\*\_<sub>text</sub>.\* },\\\_$/normal! @a\` - Record a macro in register a and play it on a pattern match.
    
    ---
    
    How to mix global command and replace command : 
    
    \`:g/pattern<sub>to</sub><sub>match</sub>/ s/text<sub>to</sub><sub>search</sub>/text<sub>to</sub><sub>replace</sub>/gc\`
    
    Using the above command or variants of it, we can search for patterns in the entire file and do replace operations on those specific lines.
    
    ---
    
    How to select a word within Vim and replace it with something else?
    
    (a quick search on the internet shows many ways to do this. but here is a simple way to do it)
    
    \`:%s//bar/g\`
        Replace each match of the last search pattern with 'bar'. 
        For example, you might first place the cursor on the word foo then press \* to search for that word. 
        The above substitute would then change all words exactly matching 'foo' to 'bar'.
    
    Refer to [this page](<https://vim.fandom.com/wiki/Search_and_replace#substitute_last_search>) for more examples

4.  COUNTING WORDS OR PATTERNS

    -   Count the number of occurrences of a word or pattern in the current file : 
        
        (first use \* on the word)
        
        after that, use the following command to get a count : \`%s///gn\`
        
        We are actually calling the :substitute command, but the n flag suppresses the usual behaviour.
        Instead of replacing each match witht the target, it simply counts the number of matches and then echoes the result below the command line.
        Do not omit any of the forward slashes.
        g stands for global (in the curent file).
    
    -   Find all occurrences of a word in the current file and populate the quickfix list window
        
        \`:vim *pattern* % | cw\`
    
    ---
    
    ~ & - repeat last substitution on current line
    
    ---
    
    Insert mode tips :
    
    gi - (incredibly handy) - goes to Insert mode where you left it last time
    e.g. scenario: edit something, exit Insert, go look at something else, then gi back to restart editing
    
    CTRL-T and CTRL-D (tab and de-tab)
    inserts or deletes one shiftwidth of indent at the start of the line
    
    ---


<a id="org270ee24"></a>

### Working with multiple files

<https://vim.fandom.com/wiki/Quick_tips_for_using_tab_pages>
<https://vim.fandom.com/wiki/Using_tab_pages>
<http://vimdoc.sourceforge.net/htmldoc/tabpage.html>

How to view all open buffers?
:buffers

This will show a numbered list with all open buffers. To go to a specific buffer (file), do 
:b5 (to go to the buffer with the number 5)
Tip: the numbers on buffers do not during a session.

How to view all open tabs?
:tabs		List the tab pages and the windows they contain.
		Shows a ">" for the current window.
		Shows a "+" for modified buffers.
		For example:
			Tab page 1 ~

-   tabpage.txt ~
    ex<sub>docmd.c</sub> ~

Tab page 2 ~
>   main.c ~

This will show a numbered list with all open tabs. To go to a specific tab, do 
:5gt (to go to the tab with the number 5)

g<Tab>		Go to the last accessed tab page.

REORDERING TAB PAGES:

:tabm[ove] +[N]
:tabm[ove] -[N]
		Move the current tab page N places to the right (with +) or to
		the left (with -). >
		    :tabmove -	" move the tab page to the left
		    :tabmove -1	" as above
		    :tabmove +	" move the tab page to the right
		    :tabmove +1	" as above

---

Open question - how to move buffers from one tab to another or into split windows when wanted?
It may not be such a great idea to work on multiple windows in a given tab, unless there is a need for it.
Always prefer to work only on one buffer in a tab because that will give maximum visibility into the open buffer.
If there is a need to work on another file/buffer at the same time, put it in a separate tab.
For now, just go to the tab that you want to open split windows in and use :vsp to split it and open the file that you want to view as a split window.

---

How to open buffers in tabs from netrw
Open it in a window and move it into a tab using Cntrl W T

How do I move an existing window to a new tab?

Is there a way to take an existing window (split) and put it into a new tab?  Ctrl W followed by T

---

Opening a tab with an empty buffer : 

To create a new file in a new tab : tabnew

This will open a new tab with an empty buffer.  

---

Switching between tabs in Vim:  

1.  Go to the next tab :gt
2.  Go to the previous tab: gT
3.  Go to a numbered tab: nnn gt

---

Some more tab tips :

~ :tabe <file> to edit file in a new tab
~ :tabc to close
~ :tabn, :tabp (or gt, gT to switch) 
~ probably want to map these for easier navigation (if gt, gT are too difficult)

---

How do I change the current split's width and height?

There are several window commands that allow you to do this:

Ctrl+W <del>/-: increase/decrease height (ex. 20<C-w></del>)
Ctrl+W >/<: increase/decrease width (ex. 30<C-w><)
Ctrl+W <span class="underline">: set height (ex. 50<C-w></span>)
Ctrl+W |: set width (ex. 50<C-w>|)
Ctrl+W =: equalize width and height of all windows
See also: :help CTRL-W

---

(this is the general method to update multiple java files at once)

If you want to open all files matching the pattern in subfolders - :args **\*/**.java

To replace four white spaces in java files with a tab use this - :bufdo exexute "%s/    /(press tab)/g" | update

1.  :bufdo execute "%s/(press tab){/{/g" | update
2.  :bufdo execute "global/^{/normal -gJ" | update
3.  :bufdo execute "%s/){/) {/g" | update

---


<a id="org104bb8c"></a>

### cTags in Vim

<https://andrew.stwrt.ca/posts/vim-ctags/>

---

CTAGS : 

To install ctags in centos:

1.  Find the package you want to install
    $ yum list **ctags**
2.  Install package
    $ yum install <packagename>

How to generate tags and use them for navigation in a big java project?
Go to the root folder of the project and execute this command : ctags -R

The next step is to get the full path of this tags file - in Linux, use the readlink utility to get the full path.
[n0281526@VDDP14P-4UCXMSH renters-api-sb2]$ readlink -f tags
/home/n0281526/Downloads/GitRepositories/renters-api-sb2/tags

open a file in the root folder of the project and run this command from within vim (use semi-colon and then type it)
set tags=./tags;/
(It starts with a tags file in the current directory and goes up to the root directory.)

---

One line that always goes in my .vimrc:
set tags=./tags;/
This will look in the current directory for "tags", and work up the tree towards root until one is found. IOW, you can be anywhere in your source tree instead of just the root of it.

---

Ctrl+] - go to definition
Ctrl+T - Jump back from the definition.
Ctrl+W Ctrl+] - Open the definition in a horizontal split

Add these lines in vimrc
map <C-\\> :tab split<CR>:exec("tag ".expand("<cword>"))<CR>
map <A-]> :vsp <CR>:exec("tag ".expand("<cword>"))<CR>

Ctrl+\\ - Open the definition in a new tab
Alt+] - Open the definition in a vertical split

After the tags are generated. You can use the following keys to tag into and tag out of functions:

Ctrl+Left MouseClick - Go to definition
Ctrl+Right MouseClick - Jump back from definition

---


<a id="org4ea8fd2"></a>

### Deleting

vim delete up until a word

Put your cursor at the point you want to start at.

Make sure you're in command mode.

hit v to start a visual selection

then hit / and type the word you're looking for to select up to it, then press enter to make the selection

then hit d to delete the text 

---

To delete a word along with the whitespace after the word - dw (vw to select in visual mode)

To delete a word but not the the whitespace after the word - de (ve to select in visual mode)

---

To remove unnecessary spaces and tabs in empty lines in Vim-

In a search, \s finds whitespace (a space or a tab), and \\+ finds one or more occurrences.

The following command deletes any trailing whitespace at the end of each line. If no trailing whitespace is found no change occurs, and the e flag means no error is displayed.

\`:%s/\s\\+$//e\`

(this did not work with eclipse vim plugin)

---

Delete all text before search pattern : 
If you have a file that looks like below
1: #sometext
2: #sometext
3: #sometext
If you want to delete the text before the pattern ":" (colon). I have used the following command to replace every :%s/^.\*/\\://
If want to delete the texts after the pattern ":" (colon). I have used the following command to replace every :%s/\\:.\*$//
I would like to learn other ways to do.

Another answer : 
Do you want to not include the colon?
If so, then for deleting everything before (but not including) the colon :%s/.\*\ze://
And for everything after :%s/:\zs.\*//
See :help \zs and :help \ze for more info.

These atoms are amazing! After I discovered them, I started using them all the time. I remember them as z == zero-width (since they don't match anything).

If you want to delete all characters before "Hello", you can do
:%s/.\*Hello/Hello/
Note that .\* is greedy, i.e. it will eat all occurrences of "Hello" till it finds the last one. If you have a line:
abcHellodefHelloghi - it will become - Helloghi
If you want a non-greedy solution, try - :%s/.\\{-}Hello/Hello

---

Removing duplicate rows in vi :sort u

---

How to “delete all blank(empty) lines” 
To delete blank lines in vim (empty lines), use this command - :g/^$/d

The g character says, “perform the following operation globally in this file.” (Operate on all lines in this file.)
The forward slash characters enclose the pattern I’m trying to match. In this case I want to match blank lines, so I use the regular expression ^$. Here the ^ means “beginning of line,” and $ means “end of line,” so with no characters in between them, this vim regex means “blank line.” (If I had typed ^abc$, that would mean, “find a line with only the sequence of characters ‘abc’”.)
The d at the end of the command says, “When you find this pattern, delete the line.”

In a similar way, to delete Lines Beginning With A certain text In Vim :g/<sup>(enter text here)</sup>/d

---

delete line containing certain text in vim with prompt :%s/.\*text.\*\n//gc
The substitute command works by 

1.  adding a wildcard
2.  and adding an end-of-line.

---

How to delete all lines that do NOT contain a certain word in Vim?

\`:%g!/price/d\`

to delete every line that doesn't contain the word "price"

---

The following command deletes any trailing whitespace at the end of each line. If no trailing whitespace is found no change occurs, and the e flag means no error is displayed.

:%s/\s\\+$//e

---


<a id="org8ac03f1"></a>

### File comparison with Vim

Comparing two files in Vim

Open the side by side view:
Ctrl+w v

Change between them:
Ctrl+w h or l

Checkout the vimdiff command, part of the vim package, if you want a diff-like view:
(from terminal)
vimdiff file1.txt file2.txt

---

Or just open the first file in VIM, then 
:vert diffsplit ./file2 (if file2 is in the same folder as file1)
(or)
:vert diffsplit file2

:vert makes it split the screen vertically.
diffsplit does a diff, and splits the files and scrolls locks them.

---


<a id="orge653c1e"></a>

### Grep

Sometimes, it is best not to run grep within Vim and to run it standalone in terminal :

In terminal, navigate to the project folder and use this : grep -r -n -l i text<sub>to</sub><sub>search</sub> \*

-r recursive - search in current and sub directories
-n show line numbers in the results
-l only list the names of the files
i case insensitive search. grep is case sensitive by default

-   search in files of all types

How to exclude one specific folder or a list of folders from the search results? e.g. 'node<sub>modules</sub>' in a javascript project?

---


<a id="orgcd40c86"></a>

### Indentation

INDENTATION :     
\`\`\`
    Example line
	This is part of the parsed line
	Thats goes one
    End of line
\`\`\`

How to remove all spaces in front of these lines? The final text should be:
Example line
This is part of the parsed line
Thats goes one
End of line

Answer : To format a line to the left I use :left. Use this format an entire file :%le

---

How to insert white spaces before a line?
Here's one way to move selected text over a few spaces:

-   select a chunk of code using capital V and the arrow keys (or j, k)
-   type colon
-   then type s/^/   /
-   hit return

What you've done is replace the beginning of each selected line (the ^ symbol means "the beginning of the line") with spaces. 

---


<a id="org373e5f5"></a>

### Line numbers

---

LINE NUMBERS in text editor :
To display line numbers :set number (To turn off the line number display :set nonumber)

To enable line numbers on startup, simply add the following to your vimrc - set number

Relative Line Numbers : To display line numbers relative to the line with the cursor, :set relativenumber or :set norelativenumber

---


<a id="orge8fb5f7"></a>

### Lower case Upper case

How to change lower case letters words to upper case words? 

How to change upper case words to lower case words?

You can change the case of text:

Toggle case "HellO" to "hELLo" with g~ then a movement (word or end of line). 
Uppercase "HellO" to "HELLO" with gU then a movement (word or end of line). 
Lowercase "HellO" to "hello" with gu then a movement (word or end of line). 

Alternatively(easier to remember), you can visually select text then press ~ to toggle case, or U to convert to uppercase, or u to convert to lowercase. 

---


<a id="org05e173c"></a>

### Manual insertion of numbered lists

How to insert numbered bullet list for a few lines in a file?

It's not a macro solution, but at least it's easy:

To add numbers to all lines - 

It's possible to use :%!nl -ba or :%!cat -n commands which will add line numbers to all the lines.

On Windows, you've to have Cygwin/MSYS/SUA installed.

Add numbers to selected lines - 

To add numbers only for selected lines, please select them in visual mode (v and cursors), then when finished - execute the command: :%!nl (ignore blank lines) or :%!cat -n (blank lines included).

Formatting

To remove extra spaces, select them in visual block (Ctrl+v) and remove them (x).

To add some characters (., :, )) after the numbers, select them in visual block (Ctrl+v), then append the character (A, type the character, then finish with Esc).

---


<a id="org566e0b0"></a>

### Macros

Recording a macro is a great way to perform a one-time task, or to get things done quickly when you don't want to mess with Vim script or mappings, or if you do not yet know how to do it more elegantly. 

Recording a macro

Each register is identified by a letter a to z. To enter a macro, type: q<letter><commands>q

To execute the macro <number> times (once by default), type: <number>@<letter>

So, the complete process looks like:

-   qd 	start recording to register d
-   &#x2026; 	your complex series of commands
-   q 	stop recording
-   @d 	execute your macro
-   @@ 	execute your macro again

---

In Vim, how do we apply a macro to a set of lines?

Use the normal command in Ex mode to execute the macro on multiple/all lines:

Execute the macro stored in register a on lines 5 through 10.
:5,10norm! @a

Execute the macro stored in register a on lines 5 through the end of the file.
:5,$norm! @a

Execute the macro stored in register a on all lines.
:%norm! @a

Execute the macro store in register a on all lines matching pattern.
Use global to run the macro 'a' on all lines that contain 'pattern'
:g/pattern/norm! @a (:g/pattern/normal! @a)

To execute the macro on visually selected lines, press V and the j or k until the desired region is selected. Then type :norm! @a and observe the that following input line is shown.
:'<,'>norm! @a
Enter :help normal in vim to read more.
For help, check: :help global.

---


<a id="orga508608"></a>

### Netrw

Vim documentation: <http://vimdoc.sourceforge.net/htmldoc/pi_netrw.html#netrw>

Open question - netrw - always fix the width at 25%. Right now, it is at 25% on start-up but when a new buffer is opened, its size is changing.

---

How to : always show line numbers in netrw:
		    " netrw<sub>bufsettings</sub> - you can control netrw's buffer settings; change
		    " these if you want to change line number displays, relative line number
		    " displays and other settings in netrw menu.
			let g:netrw<sub>bufsettings</sub> = 'noma nomod nu nobl nowrap ro'

---

The file explorer is just another Vim buffer, so you can navigate up and down with k and j keys, or jump to the bottom with G, etc. If it is a large file listing, you may be quicker finding your target by searching for it.

There are a handful of useful commands for opening the file explorer - either in the current window or a split, focusing on the project root, or the directory of the most recent file edited. This table summarizes:
lazy 	mnemonic 	open file explorer
:e. 	:edit . 	at current working directory
:sp. 	:split . 	in split at current working directory
:vs. 	:vsplit . 	in vertical split at current working directory
:E 	:Explore 	at directory of current file
:Se 	:Sexplore 	in split at directory of current file
:Vex 	:Vexplore 	in vertical split at directory of current file

Manipulating the filesystem

The file explorer includes commands for creating new files and directories, as well as renaming or deleting existing ones. This table summarizes these:
command 	action
% 	create a new file
d 	create a new directory
R 	rename the file/directory under the cursor
D 	Delete the file/directory under the cursor
Further Reading

:help netrw
:help :edit
:help :Explore
:help netrw-% - create new file
:help netrw-d - create new directory
:help netrw-R - renaming files or directories
:help netrw-D - deleting files or directories

---

Invoking netrw can be achieved in three ways
    :Explore (:E) - opens netrw in the current window
    :Sexplore (:Sex) - opens netrw in a horizontal split
    :Vexplore (:Vex) - opens netrw in a vertical split
    :Texplore (:Tex) - opens netrw in a new tab (use Cntrl PgUp, Cntrl PgDn to switch between tabs)

---

Changing the directory view in netrw
With the directory browser open hit i to cycle through the view types. There are four different view types: thin, long, wide and tree. A preferred view type can be made permanent by setting it in a .vimrc file.

let g:netrw<sub>liststyle</sub> = 3

---

Removing the banner
The directory banner is mostly useless. To remove it temporarily press I. To remove it permanently add the following to your .vimrc.

let g:netrw<sub>banner</sub> = 0

---

Changing how files are opened
By default files will be opened in the same window as the netrw directory browser. To change this behaviour the netrw<sub>browse</sub><sub>split</sub> option may be set. The options are as follows
    1 - open files in a new horizontal split
    2 - open files in a new vertical split
    3 - open files in a new tab
    4 - open in previous window
To make the selection permanent add the following to your .vimrc.

let g:netrw<sub>browse</sub><sub>split</sub> = 1

---

Set the width of the directory explorer
The width of the directory explorer can be fixed with the netrw<sub>browse</sub><sub>split</sub> option. The following sets the width to 25% of the page.

let g:netrw<sub>winsize</sub> = 25

---

NERDtree like setup
If NERDtree is your thing netrw can give you a similar experience with the following settings

let g:netrw<sub>banner</sub> = 0
let g:netrw<sub>liststyle</sub> = 3
let g:netrw<sub>browse</sub><sub>split</sub> = 4
let g:netrw<sub>altv</sub> = 1
let g:netrw<sub>winsize</sub> = 25
augroup ProjectDrawer
  autocmd!
  autocmd VimEnter \* :Vexplore
augroup END

---

Vim also supports arbitrary commands to be run following !. For a quick directory listing the following works&#x2026;  :! ls -lF
For a more complex command other commands like ack, grep or find can be used.

---

There are a number of ways to open files in vim and if that is what you use netrw for. 

Using find within vim can open files and supports tab completion.
:find path/to/file.txt

To open a file in a vertical split use the following. This also supports tab completion.
:vs path/to/file.txt

To open a file in a horizontal split use the following. This also supports tab completion.
:sp path/to/file.txt

To open a file in a new tab use the following. This also supports tab completion.
:tabnew path/to/file.txt

---

How do I configure .vimrc so that line numbers display in netrw in Vim?

I'm using netrw to read directory listings in Vim, and I would like to display line numbers in my netrw tabs (so I can use :24 to navigate through directory listings faster). I'm using "set number" in my vimrc to enable line numbers when editing files, but this does not display line numbers in netrw.

When in netrw, if I type the command ":set number", the line numbers display, but as soon as I change directories the line numbers go away.

Is there a configuration option I can put in .vimrc that will make line numbers show up in netrw windows?

From autoload/netrw.vim in the runtime:

call s:NetrwInit("g:netrw<sub>bufsettings</sub>" , "noma nomod nonu nobl nowrap ro")

s:NetrwInit overrides a variable only if it is not defined.

Therefore put let g:netrw<sub>bufsettings</sub> = 'noma nomod nu nobl nowrap ro' in your vimrc and it should work. 

---


<a id="org62662da"></a>

### Open questions

Open question - how to move an entire paragraph (or block of code) up? (like alt up arrow  or down arrow in visual studio code)
Open question - how to move an entire line up? (like alt up arrow  or down arrow in visual studio code)
Put the cursor on the first line (the line that needs to be moved to the next line) and do "ddpP" (deleting it from its current position and pasting if after the subsequent line). This will work with single lines. This will not work with paragraphs.
Open question - how to do file comparison using Vim?
What is Vim maillist archives? Bram Moolenar talks about it in the talk "7 tips for highly effective text editiong"
How to use folding in Vim? 
To minimise the method/function implementation. (-) - minus? need a working example.
color schemes in Vim
vimrc shortcut for finding and displaying all the occurences of a word

---


<a id="org48f6319"></a>

### Helpful links :

<table border="2" cellspacing="0" cellpadding="6" rules="groups" frame="hsides">


<colgroup>
<col  class="org-left" />
</colgroup>
<tbody>
<tr>
<td class="org-left"><a href="https://vim.fandom.com/wiki/Search_across_multiple_lines">https://vim.fandom.com/wiki/Search_across_multiple_lines</a></td>
</tr>


<tr>
<td class="org-left"><a href="https://vimhelp.org/">https://vimhelp.org/</a></td>
</tr>


<tr>
<td class="org-left"><a href="https://sanctum.geek.nz/arabesque/advanced-vim-macros/">https://sanctum.geek.nz/arabesque/advanced-vim-macros/</a></td>
</tr>


<tr>
<td class="org-left"><a href="https://vim.fandom.com/wiki/Copy,_cut_and_paste">https://vim.fandom.com/wiki/Copy,_cut_and_paste</a></td>
</tr>
</tbody>
</table>

