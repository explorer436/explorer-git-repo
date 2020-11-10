
# Table of Contents

1.  [My Vim notes](#orgb5f6b4c)
    1.  [Helpful tips related to configuration and other things related to Vim that I find useful.](#org4afe751)
        1.  [Search tips](#orge64c85f)
        2.  [Scrolling](#orgd659c00)
        3.  [Sorting](#orgd640e92)
        4.  [Spell check](#orgd4f6264)
        5.  [Non empty lines](#org64ddc61)
        6.  [Split](#orgad70e19)
        7.  [Terminal](#orgbd6cdf9)
        8.  [Marks](#org683ef7f)


<a id="orgb5f6b4c"></a>

# My Vim notes


<a id="org4afe751"></a>

## Helpful tips related to configuration and other things related to Vim that I find useful.


<a id="orge64c85f"></a>

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


<a id="orgd659c00"></a>

### Scrolling

1.  Moving the cursor gracefully :

    // TODO - Convert this into a table.
    
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


<a id="orgd640e92"></a>

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


<a id="orgd4f6264"></a>

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


<a id="org64ddc61"></a>

### Non empty lines

To do something only to non-empty lines, use \`:g/./\` before the command.
     :g/./ s/$/;/

To do something only to the visually selected non-empty lines, use the same approach.


<a id="orgad70e19"></a>

### Split

Opening Vim help in a vertical split window

:vertical (vert)

:vert help

You can also control whether the window splits on the left/top or the right/bottom with topleft (to) and botright (bo). For example, to open help in the right window of a vertical split:

:vert bo help


<a id="orgbd6cdf9"></a>

### Terminal

Launch terminal from within Vim using \`:term\`


<a id="org683ef7f"></a>

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

