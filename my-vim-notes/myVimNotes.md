
# Table of Contents

1.  [My Vim notes](#orgf95e39c)
    1.  [Helpful tips related to configuration and other things related to Vim that I find useful.](#orgd5e1a12)
        1.  [Movement](#org201b644)
        2.  [Scrolling](#org8ecfbb0)
        3.  [Folding](#org3592d66)
        4.  [Insertion & replace → insert mode](#orgc528122)
        5.  [Search and Substitution](#org1cea5ad)
        6.  [Sorting](#org474691f)
        7.  [Spell check](#orgedfb832)
        8.  [Non empty lines](#org3d4e0f2)
        9.  [Terminal](#org5c9bdfb)
        10. [Marks](#orgcf5a0b6)
        11. [Visual Mode](#org1b07ae8)
        12. [Registers and copy and paste](#org95ce9ba)
        13. [Ex commands](#orgad2981a)
        14. [Vim completion](#org92eef45)
        15. [Word and text manipulation](#orgd90aa70)
        16. [Working with multiple files](#orga4b0ecf)
        17. [Vim help](#orgce9a3e4)
        18. [Key mappings and abbreviations](#orge568988)
        19. [Tags in Vim](#org1159d04)
        20. [Deleting](#org3a58cf2)
        21. [File comparison with Vim](#orgfc22721)
        22. [Grep](#orgfba5397)
        23. [Indentation](#org19679a8)
        24. [Line numbers](#orgcc55a4d)
        25. [Lower case Upper case](#orgd615c64)
        26. [Manual insertion of numbered lists](#orgea762c4)
        27. [Macros](#org29fefdc)
        28. [Netrw](#org12b12c7)
        29. [Packages and plugins](#orgdfb1925)
        30. [git](#org853a8ee)
        31. [Helpful links](#orgd9e7216)
        32. [Open questions](#orgf9ab1ca)
        33. [Research](#orgd2aa6cd)
        34. [Miscellaneous](#orgfa218eb)
        35. [Plugins](#org0b66e59)


<a id="orgf95e39c"></a>

# My Vim notes


<a id="orgd5e1a12"></a>

## Helpful tips related to configuration and other things related to Vim that I find useful.


<a id="org201b644"></a>

### Movement

Moving the cursor gracefully without moving the page:

Basic Movement of the cursor:

<table border="2" cellspacing="0" cellpadding="6" rules="groups" frame="hsides">


<colgroup>
<col  class="org-left" />

<col  class="org-left" />
</colgroup>
<tbody>
<tr>
<td class="org-left">h l k j</td>
<td class="org-left">character left, right; line up, down</td>
</tr>


<tr>
<td class="org-left">b w</td>
<td class="org-left">word/token left, right</td>
</tr>


<tr>
<td class="org-left">ge e</td>
<td class="org-left">end of word/token left, right</td>
</tr>


<tr>
<td class="org-left">gm</td>
<td class="org-left">middle of line</td>
</tr>


<tr>
<td class="org-left">nG ngg</td>
<td class="org-left">line n, default the last, first</td>
</tr>


<tr>
<td class="org-left">n%</td>
<td class="org-left">percentage n of the file (n must be provided)</td>
</tr>


<tr>
<td class="org-left">n</td>
<td class="org-left">column n of current line</td>
</tr>


<tr>
<td class="org-left">%</td>
<td class="org-left">match of next brace, bracket, comment, #define. move to the next or previous related item. Items include brackets, opening and closing c-style comments, and C preprocessor conditionals. I find myself using % a lot depending on the programming language.</td>
</tr>


<tr>
<td class="org-left">nH</td>
<td class="org-left">line n from start of window</td>
</tr>


<tr>
<td class="org-left">nL</td>
<td class="org-left">line n from bottom of window</td>
</tr>


<tr>
<td class="org-left">M</td>
<td class="org-left">middle line of window</td>
</tr>


<tr>
<td class="org-left">(minus)</td>
<td class="org-left">move the cursor to the first non-blank character on the previous line</td>
</tr>


<tr>
<td class="org-left">(plus)</td>
<td class="org-left">move the cursor to the first non-blank character on the next line</td>
</tr>


<tr>
<td class="org-left">M/H/L</td>
<td class="org-left">move cursor to middle/top/bottom of screen (Move the cursor only. Do not move the screen)</td>
</tr>


<tr>
<td class="org-left">^ and g_</td>
<td class="org-left">move the cursor to the first and last non blank characters in a line</td>
</tr>


<tr>
<td class="org-left">0 and $</td>
<td class="org-left">move the cursor to the first and last characters in the current line</td>
</tr>


<tr>
<td class="org-left">( )</td>
<td class="org-left">move the cursor to the beginning of previous, next sentence</td>
</tr>


<tr>
<td class="org-left">{ and }</td>
<td class="org-left">Move the cursor to the beginning of previous or next paragraph.  The definition of a paragraph is based on nroff macros (read man nroff if you want to figure out what that means). This generally works quite well for navigating between large space-separated blocks in a programming language.</td>
</tr>
</tbody>
</table>

Complex movement of the cursor:

<table border="2" cellspacing="0" cellpadding="6" rules="groups" frame="hsides">


<colgroup>
<col  class="org-left" />

<col  class="org-left" />
</colgroup>
<tbody>
<tr>
<td class="org-left">B W</td>
<td class="org-left">space-separated word left, right</td>
</tr>


<tr>
<td class="org-left">gE E</td>
<td class="org-left">end of space-separated word left, right</td>
</tr>


<tr>
<td class="org-left">n_</td>
<td class="org-left">down n-1 line on first non-blank character</td>
</tr>


<tr>
<td class="org-left">g0</td>
<td class="org-left">beginning of screen line</td>
</tr>


<tr>
<td class="org-left">g^  g$</td>
<td class="org-left">first, last character of screen line</td>
</tr>


<tr>
<td class="org-left">gk gj</td>
<td class="org-left">screen line up, down</td>
</tr>


<tr>
<td class="org-left">fc Fc</td>
<td class="org-left">next, previous occurence of character c</td>
</tr>


<tr>
<td class="org-left">tc Tc</td>
<td class="org-left">before next, previous occurence of c</td>
</tr>


<tr>
<td class="org-left">; ,</td>
<td class="org-left">repeat last fFtT, in opposite direction</td>
</tr>


<tr>
<td class="org-left">(Two square bracket openings)</td>
<td class="org-left">start of section backward</td>
</tr>


<tr>
<td class="org-left">]]</td>
<td class="org-left">start of section forward</td>
</tr>


<tr>
<td class="org-left">[] ][</td>
<td class="org-left">end of section backward, forward</td>
</tr>


<tr>
<td class="org-left">[( ])</td>
<td class="org-left">unclosed (, ) backward, forward</td>
</tr>


<tr>
<td class="org-left">[{  ]}</td>
<td class="org-left">unclosed {, } backward, forward</td>
</tr>


<tr>
<td class="org-left">[m ]m</td>
<td class="org-left">start of backward, forward Java method</td>
</tr>


<tr>
<td class="org-left">[# ]#</td>
<td class="org-left">unclosed #if, #else, #endif backward, forward</td>
</tr>


<tr>
<td class="org-left">[* ]*</td>
<td class="org-left">start, end of <i>* *</i> backward, forward</td>
</tr>
</tbody>
</table>

---


<a id="org8ecfbb0"></a>

### Scrolling

Scroll up and down through a page gracefully using Vim the following keystrokes:

Move the page using these commands:

<table border="2" cellspacing="0" cellpadding="6" rules="groups" frame="hsides">


<colgroup>
<col  class="org-left" />

<col  class="org-left" />
</colgroup>
<tbody>
<tr>
<td class="org-left">zt or z↵</td>
<td class="org-left">set current line at top of window. move current line to the top of the screen</td>
</tr>


<tr>
<td class="org-left">zz or z.</td>
<td class="org-left">set current line at center of window. move current line to the middle of the screen (Careful with zz, if you happen to have Caps Lock on accidentally, you will save and exit vim)</td>
</tr>


<tr>
<td class="org-left">zb or z-</td>
<td class="org-left">set current line at bottom of window. move current line to the bottom of the screen</td>
</tr>


<tr>
<td class="org-left">zh zl</td>
<td class="org-left">scroll one character to the right, left</td>
</tr>


<tr>
<td class="org-left">zH zL</td>
<td class="org-left">scroll half a screen to the right, left</td>
</tr>


<tr>
<td class="org-left">[Control][b]</td>
<td class="org-left">Moves screen up (backward) one page, cursor to last line</td>
</tr>


<tr>
<td class="org-left">[Control][f]</td>
<td class="org-left">Moves screen down (forward) one page, cursor to first line</td>
</tr>


<tr>
<td class="org-left">[Control][u]</td>
<td class="org-left">Moves cursor &amp; screen up ½ page (Half-page navigations)</td>
</tr>


<tr>
<td class="org-left">[Control][d]</td>
<td class="org-left">Moves cursor &amp; screen down ½ page (Half-page navigations)</td>
</tr>


<tr>
<td class="org-left">[Control][E]</td>
<td class="org-left">move the page/screen up by one line (One-line movements)</td>
</tr>


<tr>
<td class="org-left">[Control][Y]</td>
<td class="org-left">move the page/screen down by one line (One-line movements)</td>
</tr>


<tr>
<td class="org-left">:N</td>
<td class="org-left">Go to line N</td>
</tr>


<tr>
<td class="org-left">N%</td>
<td class="org-left">Go to the line N percent through the file</td>
</tr>


<tr>
<td class="org-left">N(vertical pipe)</td>
<td class="org-left">Go to column N</td>
</tr>
</tbody>
</table>

I lose visual context every time for the former two, so I have developed the bad habit of hitting the latter (Ctrl-Y and Ctrl-E) repetitively. Ctrl-y and Ctrl-e only change the cursor position if it would be moved off screen.

To leave the cursor in the same column when you use Ctrl+D, Ctrl+F, Ctrl+B, Ctrl+U, G, H, M, L, gg you should define the following option:

    :set nostartofline

---


<a id="org3592d66"></a>

### Folding

<table border="2" cellspacing="0" cellpadding="6" rules="groups" frame="hsides">


<colgroup>
<col  class="org-left" />

<col  class="org-left" />
</colgroup>
<tbody>
<tr>
<td class="org-left">zfm</td>
<td class="org-left">create fold of movement m</td>
</tr>


<tr>
<td class="org-left">:rfo</td>
<td class="org-left">create fold for range r</td>
</tr>


<tr>
<td class="org-left">zd zE</td>
<td class="org-left">delete fold at cursor, all in window</td>
</tr>


<tr>
<td class="org-left">zo zc zO zC</td>
<td class="org-left">open, close one fold; recursively</td>
</tr>


<tr>
<td class="org-left">[z ]z</td>
<td class="org-left">move to start, end of current open fold</td>
</tr>


<tr>
<td class="org-left">zj zk</td>
<td class="org-left">move down, up to start, end of next fold</td>
</tr>
</tbody>
</table>

---


<a id="orgc528122"></a>

### Insertion & replace → insert mode

<table border="2" cellspacing="0" cellpadding="6" rules="groups" frame="hsides">


<colgroup>
<col  class="org-left" />

<col  class="org-left" />
</colgroup>
<tbody>
<tr>
<td class="org-left">i a</td>
<td class="org-left">insert before, after cursor</td>
</tr>


<tr>
<td class="org-left">I A</td>
<td class="org-left">insert at beginning, end of line</td>
</tr>


<tr>
<td class="org-left">gI</td>
<td class="org-left">insert text in first column</td>
</tr>


<tr>
<td class="org-left">o O</td>
<td class="org-left">open a new line below, above the current line</td>
</tr>


<tr>
<td class="org-left">rc</td>
<td class="org-left">replace character under cursor with c</td>
</tr>


<tr>
<td class="org-left">grc</td>
<td class="org-left">like r, but without affecting layout</td>
</tr>


<tr>
<td class="org-left">R</td>
<td class="org-left">replace characters starting at the cursor</td>
</tr>


<tr>
<td class="org-left">gR</td>
<td class="org-left">like R, but without affecting layout</td>
</tr>


<tr>
<td class="org-left">cm</td>
<td class="org-left">change text of movement command m</td>
</tr>


<tr>
<td class="org-left">cc or S</td>
<td class="org-left">change current line</td>
</tr>


<tr>
<td class="org-left">C</td>
<td class="org-left">change to the end of line</td>
</tr>


<tr>
<td class="org-left">s</td>
<td class="org-left">change one character and insert</td>
</tr>


<tr>
<td class="org-left">~</td>
<td class="org-left">switch case and advance cursor</td>
</tr>


<tr>
<td class="org-left">g~m</td>
<td class="org-left">switch case of movement command m</td>
</tr>


<tr>
<td class="org-left">gum gUm</td>
<td class="org-left">lowercase, uppercase text of movement m</td>
</tr>


<tr>
<td class="org-left">&lt;m &gt;m</td>
<td class="org-left">shift left, right text of movement m</td>
</tr>


<tr>
<td class="org-left">n&lt;&lt; n&gt;&gt;</td>
<td class="org-left">shift n lines left, right</td>
</tr>
</tbody>
</table>

INSERT MODE

<table border="2" cellspacing="0" cellpadding="6" rules="groups" frame="hsides">


<colgroup>
<col  class="org-left" />

<col  class="org-left" />
</colgroup>
<tbody>
<tr>
<td class="org-left">^Vc ^Vn</td>
<td class="org-left">insert char c literally, decimal value n</td>
</tr>


<tr>
<td class="org-left">^A</td>
<td class="org-left">insert previously inserted text</td>
</tr>


<tr>
<td class="org-left">^@</td>
<td class="org-left">same as ^A and stop insert → command mode</td>
</tr>


<tr>
<td class="org-left">^Rx ^R<sup>Rx</sup></td>
<td class="org-left">insert content of register x, literally</td>
</tr>


<tr>
<td class="org-left">^N ^P</td>
<td class="org-left">text completion before, after cursor</td>
</tr>


<tr>
<td class="org-left">^W</td>
<td class="org-left">delete word before cursor</td>
</tr>


<tr>
<td class="org-left">^U</td>
<td class="org-left">delete all inserted character in current line</td>
</tr>


<tr>
<td class="org-left">^D ^T</td>
<td class="org-left">shift left, right one shift width</td>
</tr>


<tr>
<td class="org-left">^Kc1c2 or c1←c2</td>
<td class="org-left">enter digraph \c1,c2\</td>
</tr>


<tr>
<td class="org-left">^Oc</td>
<td class="org-left">execute c in temporary command mode</td>
</tr>


<tr>
<td class="org-left">^X<sup>E</sup> ^X<sup>Y</sup></td>
<td class="org-left">scroll up, down</td>
</tr>


<tr>
<td class="org-left">&lt;esc&gt; or ^[</td>
<td class="org-left">abandon edition → command mode</td>
</tr>
</tbody>
</table>

ADVANCED INSERTION

<table border="2" cellspacing="0" cellpadding="6" rules="groups" frame="hsides">


<colgroup>
<col  class="org-left" />

<col  class="org-left" />
</colgroup>
<tbody>
<tr>
<td class="org-left">g?m</td>
<td class="org-left">perform rot13 encoding on movement m</td>
</tr>


<tr>
<td class="org-left">n<sup>A</sup> n<sup>X</sup></td>
<td class="org-left">+n, -n to number under cursor</td>
</tr>


<tr>
<td class="org-left">gqm</td>
<td class="org-left">format lines of movement m to fixed width</td>
</tr>


<tr>
<td class="org-left">:rce w↵</td>
<td class="org-left">center lines in range r to width w</td>
</tr>


<tr>
<td class="org-left">:rle i↵</td>
<td class="org-left">left align lines in range r with indent i</td>
</tr>


<tr>
<td class="org-left">:rri w↵</td>
<td class="org-left">right align lines in range r to width w</td>
</tr>


<tr>
<td class="org-left">!mc↵</td>
<td class="org-left">filter lines of movement m through command c</td>
</tr>


<tr>
<td class="org-left">n!!c↵</td>
<td class="org-left">filter n lines through command c</td>
</tr>


<tr>
<td class="org-left">:r!c↵</td>
<td class="org-left">filter range r lines through command c</td>
</tr>
</tbody>
</table>


<a id="org1cea5ad"></a>

### Search and Substitution

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

SEARCH & SUBSTITUTION

<table border="2" cellspacing="0" cellpadding="6" rules="groups" frame="hsides">


<colgroup>
<col  class="org-left" />

<col  class="org-left" />
</colgroup>
<tbody>
<tr>
<td class="org-left">/s↵  ?s↵</td>
<td class="org-left">search forward, backward for s</td>
</tr>


<tr>
<td class="org-left">/s/o↵  ?s?o↵</td>
<td class="org-left">search fwd, bwd for s with offset o</td>
</tr>


<tr>
<td class="org-left">n or /↵</td>
<td class="org-left">repeat forward last search</td>
</tr>


<tr>
<td class="org-left">N or ?↵</td>
<td class="org-left">repeat backward last search</td>
</tr>


<tr>
<td class="org-left"># *</td>
<td class="org-left">search backward, forward for word under cursor</td>
</tr>


<tr>
<td class="org-left">g# g*</td>
<td class="org-left">same, but also find partial matches</td>
</tr>


<tr>
<td class="org-left">gd gD</td>
<td class="org-left">local, global definition of symbol under cursor</td>
</tr>


<tr>
<td class="org-left">:rs/f/t/x↵</td>
<td class="org-left">substitute f by t in range r x: g-all occurrences, c-confirm changes</td>
</tr>


<tr>
<td class="org-left">:rs x↵</td>
<td class="org-left">repeat substitution with new r &amp; x</td>
</tr>
</tbody>
</table>

SPECIAL CHARACTERS IN SEARCH PATTERNS

<table border="2" cellspacing="0" cellpadding="6" rules="groups" frame="hsides">


<colgroup>
<col  class="org-left" />

<col  class="org-left" />
</colgroup>
<tbody>
<tr>
<td class="org-left">.   ^  $</td>
<td class="org-left">any single character, start, end of line</td>
</tr>


<tr>
<td class="org-left">\&lt; \&gt;</td>
<td class="org-left">start, end of word</td>
</tr>


<tr>
<td class="org-left">[c1-c2]</td>
<td class="org-left">a single character in range c1..c2</td>
</tr>


<tr>
<td class="org-left">[<sup>c1</sup>-c2]</td>
<td class="org-left">a single character not in range</td>
</tr>


<tr>
<td class="org-left">\i \k \I \K</td>
<td class="org-left">an identifier, keyword; excl. digits</td>
</tr>


<tr>
<td class="org-left">\f \p \F \P</td>
<td class="org-left">a file name, printable char.; excl. digits</td>
</tr>


<tr>
<td class="org-left">\s &sect;</td>
<td class="org-left">a white space, a non-white space</td>
</tr>


<tr>
<td class="org-left">\e \t \r \b</td>
<td class="org-left">&lt;esc&gt;, &lt;tab&gt;, &lt;↵&gt;, &lt;←&gt;</td>
</tr>


<tr>
<td class="org-left">\= * \+</td>
<td class="org-left">match 0..1, 0..∞, 1..∞ of preceding atoms</td>
</tr>


<tr>
<td class="org-left">\(pipe)</td>
<td class="org-left">separate two branches ( ≡ or)</td>
</tr>


<tr>
<td class="org-left">\( \)</td>
<td class="org-left">group patterns into an atom</td>
</tr>


<tr>
<td class="org-left">\&amp; \n</td>
<td class="org-left">the whole matched pattern, nth () group</td>
</tr>


<tr>
<td class="org-left">\u \l</td>
<td class="org-left">next character made upper, lowercase</td>
</tr>


<tr>
<td class="org-left">\c \C</td>
<td class="org-left">ignore, match case on next pattern</td>
</tr>
</tbody>
</table>

OFFSETS IN SEARCH COMMANDS

<table border="2" cellspacing="0" cellpadding="6" rules="groups" frame="hsides">


<colgroup>
<col  class="org-left" />

<col  class="org-left" />
</colgroup>
<tbody>
<tr>
<td class="org-left">n or +n</td>
<td class="org-left">n line downward in column 1</td>
</tr>


<tr>
<td class="org-left">(minus)n</td>
<td class="org-left">n line upward in column 1</td>
</tr>


<tr>
<td class="org-left">e+n e-n</td>
<td class="org-left">n characters right, left to end of match</td>
</tr>


<tr>
<td class="org-left">s+n s-n</td>
<td class="org-left">n characters right, left to start of match</td>
</tr>


<tr>
<td class="org-left">;sc</td>
<td class="org-left">execute search command sc next</td>
</tr>
</tbody>
</table>

---


<a id="org474691f"></a>

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

If you want to sort the list alphabetically, select the lines visually and run the command:

    :sort

That will result in this:

    gem 'bourbon'
    gem 'clearance', '1.0.0.rc4'
    gem 'neat'
    gem 'pg'
    gem 'rails', '3.2.11'
    gem 'simple_form'
    gem 'stripe'
    gem 'strong_parameters'
    gem 'thin'

If you want to dig deeper into the sort functionality:

    :help sort

---


<a id="orgedfb832"></a>

### Spell check

To turn it on \`:set spell\`. To turn it off \`:set nospell\`

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


<a id="org3d4e0f2"></a>

### Non empty lines

To do something only to non-empty lines, use \`:g/./\` before the command.
     :g/./ s/$/;/

To do something only to the visually selected non-empty lines, use the same approach.

---


<a id="org5c9bdfb"></a>

### Terminal

Launch terminal from within Vim using \`:term\`

---


<a id="orgcf5a0b6"></a>

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

MARKS AND MOTIONS

<table border="2" cellspacing="0" cellpadding="6" rules="groups" frame="hsides">


<colgroup>
<col  class="org-left" />

<col  class="org-left" />
</colgroup>
<tbody>
<tr>
<td class="org-left">mc</td>
<td class="org-left">mark current position with mark c ∈[a..Z]</td>
</tr>


<tr>
<td class="org-left">`c `C</td>
<td class="org-left">go to mark c in current, C in any file</td>
</tr>


<tr>
<td class="org-left">`0..9</td>
<td class="org-left">go to last exit position</td>
</tr>


<tr>
<td class="org-left">`` `"</td>
<td class="org-left">go to position before jump, at last edit</td>
</tr>


<tr>
<td class="org-left">`[ `]</td>
<td class="org-left">go to start, end of previously operated text</td>
</tr>


<tr>
<td class="org-left">:marks↵</td>
<td class="org-left">print the active marks list</td>
</tr>


<tr>
<td class="org-left">:jumps↵</td>
<td class="org-left">print the jump list</td>
</tr>


<tr>
<td class="org-left">n<sup>O</sup></td>
<td class="org-left">go to nth older position in jump list</td>
</tr>


<tr>
<td class="org-left">n<sup>I</sup></td>
<td class="org-left">go to nth newer position in jump list</td>
</tr>
</tbody>
</table>

---


<a id="org1b07ae8"></a>

### Visual Mode

<table border="2" cellspacing="0" cellpadding="6" rules="groups" frame="hsides">


<colgroup>
<col  class="org-left" />

<col  class="org-left" />
</colgroup>
<tbody>
<tr>
<td class="org-left">v V ^V</td>
<td class="org-left">start/stop highlighting characters, lines, block</td>
</tr>


<tr>
<td class="org-left">o</td>
<td class="org-left">exchange cursor position with start of highlighting</td>
</tr>


<tr>
<td class="org-left">gv</td>
<td class="org-left">start highlighting on previous visual area</td>
</tr>


<tr>
<td class="org-left">aw as ap</td>
<td class="org-left">select a word, a sentence, a paragraph</td>
</tr>


<tr>
<td class="org-left">ab aB</td>
<td class="org-left">select a block ( ), a block { }</td>
</tr>
</tbody>
</table>

---


<a id="org95ce9ba"></a>

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

<table border="2" cellspacing="0" cellpadding="6" rules="groups" frame="hsides">


<colgroup>
<col  class="org-left" />

<col  class="org-left" />
</colgroup>
<tbody>
<tr>
<td class="org-left">"x</td>
<td class="org-left">use register x for next delete, yank, put</td>
</tr>


<tr>
<td class="org-left">:reg↵</td>
<td class="org-left">show the content of all registers</td>
</tr>


<tr>
<td class="org-left">:reg x↵</td>
<td class="org-left">show the content of registers x</td>
</tr>


<tr>
<td class="org-left">ym</td>
<td class="org-left">yank the text of movement command m</td>
</tr>


<tr>
<td class="org-left">yy or Y</td>
<td class="org-left">yank current line into register</td>
</tr>


<tr>
<td class="org-left">p P</td>
<td class="org-left">put register after, before cursor position</td>
</tr>


<tr>
<td class="org-left">]p [p</td>
<td class="org-left">like p, P with indent adjusted</td>
</tr>


<tr>
<td class="org-left">gp gP</td>
<td class="org-left">like p, P leaving cursor after new text</td>
</tr>
</tbody>
</table>

---

UNDOING, REPEATING & REGISTERS

<table border="2" cellspacing="0" cellpadding="6" rules="groups" frame="hsides">


<colgroup>
<col  class="org-left" />

<col  class="org-left" />
</colgroup>
<tbody>
<tr>
<td class="org-left">u U</td>
<td class="org-left">undo last command, restore last changed line</td>
</tr>


<tr>
<td class="org-left">.  ^R</td>
<td class="org-left">repeat last changes, redo last undo</td>
</tr>


<tr>
<td class="org-left">n.</td>
<td class="org-left">repeat last changes with count replaced by n</td>
</tr>


<tr>
<td class="org-left">qc qC</td>
<td class="org-left">record, append typed characters in register c</td>
</tr>


<tr>
<td class="org-left">q</td>
<td class="org-left">stop recording</td>
</tr>


<tr>
<td class="org-left">@c</td>
<td class="org-left">execute the content of register c</td>
</tr>


<tr>
<td class="org-left">@@</td>
<td class="org-left">repeat previous @ command</td>
</tr>


<tr>
<td class="org-left">:@c↵</td>
<td class="org-left">execute register c as an Ex command</td>
</tr>


<tr>
<td class="org-left">:rg/p/c↵</td>
<td class="org-left">execute Ex command c on range r where pattern p matches</td>
</tr>
</tbody>
</table>

---

Copying and Moving Text

<table border="2" cellspacing="0" cellpadding="6" rules="groups" frame="hsides">


<colgroup>
<col  class="org-left" />

<col  class="org-left" />
</colgroup>
<tbody>
<tr>
<td class="org-left">"{a-zA-Z0-9.%#:-"}</td>
<td class="org-left">Use register {a-zA-Z0-9.%#:-"} for next delete, yank or put (use uppercase character to append with delete and yank) ({.%#:} only work with put).</td>
</tr>


<tr>
<td class="org-left">:reg[isters]</td>
<td class="org-left">Display the contents of all numbered and named registers.</td>
</tr>


<tr>
<td class="org-left">:reg[isters] {arg}</td>
<td class="org-left">Display the contents of the numbered and named registers that are mentioned in {arg}.</td>
</tr>


<tr>
<td class="org-left">:di[splay] [arg]</td>
<td class="org-left">Same as :registers.</td>
</tr>


<tr>
<td class="org-left">["x]y{motion}</td>
<td class="org-left">Yank {motion} text [into register x].</td>
</tr>


<tr>
<td class="org-left">["x]yy</td>
<td class="org-left">Yank [count] lines [into register x]</td>
</tr>


<tr>
<td class="org-left">["x]Y</td>
<td class="org-left">yank [count] lines [into register x] (synonym for yy).</td>
</tr>


<tr>
<td class="org-left">{Visual}["x]y</td>
<td class="org-left">Yank the highlighted text [into register x] (for {Visual} see Selecting Text).</td>
</tr>


<tr>
<td class="org-left">{Visual}["x]Y</td>
<td class="org-left">Yank the highlighted lines [into register x]</td>
</tr>


<tr>
<td class="org-left">:[range]y[ank] [x]</td>
<td class="org-left">Yank [range] lines [into register x].</td>
</tr>


<tr>
<td class="org-left">:[range]y[ank] [x] {count}</td>
<td class="org-left">Yank {count} lines, starting with last line number in [range] (default: current line), [into register x].</td>
</tr>


<tr>
<td class="org-left">["x]p</td>
<td class="org-left">Put the text [from register x] after the cursor [count] times.</td>
</tr>


<tr>
<td class="org-left">["x]P</td>
<td class="org-left">Put the text [from register x] before the cursor [count] times.</td>
</tr>


<tr>
<td class="org-left">["x]gp</td>
<td class="org-left">Just like "p", but leave the cursor just after the new text.</td>
</tr>


<tr>
<td class="org-left">["x]gP</td>
<td class="org-left">Just like "P", but leave the cursor just after the new text.</td>
</tr>


<tr>
<td class="org-left">:[line]pu[t] [x]</td>
<td class="org-left">Put the text [from register x] after [line] (default current line).</td>
</tr>


<tr>
<td class="org-left">:[line]pu[t]! [x]</td>
<td class="org-left">Put the text [from register x] before [line] (default current line).</td>
</tr>
</tbody>
</table>

---


<a id="orgad2981a"></a>

### Ex commands

EX COMMANDS (↵)

<table border="2" cellspacing="0" cellpadding="6" rules="groups" frame="hsides">


<colgroup>
<col  class="org-left" />

<col  class="org-left" />
</colgroup>
<tbody>
<tr>
<td class="org-left">:e f</td>
<td class="org-left">edit file f, unless changes have been made</td>
</tr>


<tr>
<td class="org-left">:e!  f</td>
<td class="org-left">edit file f always (by default reload current)</td>
</tr>


<tr>
<td class="org-left">:n :N</td>
<td class="org-left">edit next, previous file in list</td>
</tr>


<tr>
<td class="org-left">:rw</td>
<td class="org-left">write range r to current file</td>
</tr>


<tr>
<td class="org-left">:rw f</td>
<td class="org-left">write range r to file f</td>
</tr>


<tr>
<td class="org-left">:rw&gt;&gt;f</td>
<td class="org-left">append range r to file f</td>
</tr>


<tr>
<td class="org-left">:q :q!</td>
<td class="org-left">quit and confirm, quit and discard changes</td>
</tr>


<tr>
<td class="org-left">:wq or :x or ZZ</td>
<td class="org-left">write to current file and exit</td>
</tr>


<tr>
<td class="org-left">:wn :wN</td>
<td class="org-left">write file and edit next, previous one</td>
</tr>


<tr>
<td class="org-left">&lt;up&gt; &lt;down&gt;</td>
<td class="org-left">recall commands starting with current</td>
</tr>


<tr>
<td class="org-left">:r f</td>
<td class="org-left">insert content of file f below cursor</td>
</tr>


<tr>
<td class="org-left">:r!  c</td>
<td class="org-left">insert output of command c below cursor</td>
</tr>


<tr>
<td class="org-left">:args</td>
<td class="org-left">display the argument list</td>
</tr>


<tr>
<td class="org-left">:rco  a :rm  a</td>
<td class="org-left">copy, move range r below line a</td>
</tr>
</tbody>
</table>

---

SAVE ALL OPEN BUFFERS AT ONCE

Vim can open multiple files, each in its own buffer. Here is how to save all changes and continue working, or save all changes and exit Vim. It is also possible to quit all (discard changes).

<table border="2" cellspacing="0" cellpadding="6" rules="groups" frame="hsides">


<colgroup>
<col  class="org-left" />

<col  class="org-left" />
</colgroup>
<tbody>
<tr>
<td class="org-left">:wa</td>
<td class="org-left">write all changed files (save all changes), and keep working</td>
</tr>


<tr>
<td class="org-left">:xa</td>
<td class="org-left">exit all (save all changes and close Vim)</td>
</tr>


<tr>
<td class="org-left">:wqa</td>
<td class="org-left">same as :xa</td>
</tr>


<tr>
<td class="org-left">:qa</td>
<td class="org-left">quit all (close Vim, but not if there are unsaved changes)</td>
</tr>


<tr>
<td class="org-left">:qa!</td>
<td class="org-left">quit all (close Vim without saving—discard any changes)</td>
</tr>
</tbody>
</table>

The :wa and :xa commands only write a file when its buffer has been changed. By contrast, the :w command always writes the current buffer to its file (use :update to save the current buffer only if it has been changed).

Warning: If you enter :qa!, Vim will discard all changes without asking "are you sure?". 

---

EX RANGES

<table border="2" cellspacing="0" cellpadding="6" rules="groups" frame="hsides">


<colgroup>
<col  class="org-left" />

<col  class="org-left" />
</colgroup>
<tbody>
<tr>
<td class="org-left">, ;</td>
<td class="org-left">separates two lines numbers, set to first line</td>
</tr>


<tr>
<td class="org-left">n</td>
<td class="org-left">an absolute line number n</td>
</tr>


<tr>
<td class="org-left">.   $</td>
<td class="org-left">the current line, the last line in file</td>
</tr>


<tr>
<td class="org-left">% *</td>
<td class="org-left">entire file, visual area</td>
</tr>


<tr>
<td class="org-left">'t</td>
<td class="org-left">position of mark t</td>
</tr>


<tr>
<td class="org-left"><i>p</i> ?p?</td>
<td class="org-left">the next, previous line where p matches</td>
</tr>


<tr>
<td class="org-left">+n -n</td>
<td class="org-left">+n, -n to the preceding line number</td>
</tr>
</tbody>
</table>

---


<a id="org92eef45"></a>

### Vim completion

Let Vim do the typing by George Brocklehurst (@georgebrock)

Even if you're good at it, typing is still slower and more error-prone than not typing. This presentation will explore a few ways to avoid typing by getting Vim to do the typing for you.

1.  Vi, or Emacs?

    As modal editors, Vi and Vim tend to avoid modifier keys in favour of modes. The behaviour of a key stoke is dictated by the editor's mode. This is different from Emacs-like editors, where behaviour is modified by pressing modifier keys instead of changing mode.
    
    Everything in this presentation uses modifier keys in insert mode: the commands might feel more like Emacs commands than Vim commands, but they are useful, and have their place in the Vim editing philosophy.
    
    Vim users like to be efficient, and part of that efficiency is making changes as atomic edits. An atomic edit can be repeated (using .) or undone (using u). A single insert updates the . register, making the inserted text readily available. Sometimes, when we're inserting text that includes something Vim's already seen – either because it's in one of our files, a symbol in our program, or something from one of our registers – it's more efficient not to change mode, and to reach for a modifier key instead.

2.  A few of my favourite things

    ****Insert text from a register****
    
        `ctrl+r`
    
    ****Last inserted text****
    
        `ctrl+a`
    
    There are three common cases where we want to insert something Vim's already seen as part of a larger insert:
    
    1.  Insert from a register, using [Ctrl][r] register.
    2.  Insert the same text as the previous insert, using [Ctrl][a]. This is similar to [Ctrl][r][.]
    3.  Complete a partially-typed word or phrase, which will be the focus of the next few sections.

3.  Completion

    ****Simple word completion****
    
    [Ctrl][p]
    
    or
    
    [Ctrl][n]
    
    -   [Ctrl][p] finds the previous matching completion for the partially typed word.
    
    -   [Ctrl][n] finds the next matching completion for the partially typed word.
    
    -   [Ctrl][p] is usually more useful, because you're more likely to be looking for a word you just used than a word you're about to use.
    
    -   Where Vim looks for completions is controlled by the 'complete' setting. The default is .,w,b,u,t,i, which means Vim will look in:
        
        1.  The current buffer.
        2.  Buffers in other windows.
        3.  Other loaded buffers.
        4.  Unloaded buffers.
        5.  Tags.
        6.  Included files.
        
        I also like to add kspell to the end of the list:
        
        1.  The active spell checking dictionary, when spell checking is enabled.
        
        ****Tag completion****
    
    [Ctrl][x][Ctrl][]]
    
    Sometimes, you know that the word you want to complete isn't just any old word that appears in your file or files; you know you're trying to complete a symbol from your program.
    
    If you're using ctags, then you can complete a word in your tags file using [Ctrl][x][Ctrl][]]
    
    The initial [Ctrl][x] puts Vim into a completion mode, which is a sub-mode of insert mode. We'll see this prefix again.
    
    When the completion menu appears, you can use [Ctrl][p] and [Ctrl][n] to navigate through the options.
    
    ****Filename completion****
    
    [Ctrl][x][Ctrl][f]
    
    Filename completion will complete paths relative to the current working directory, similar to tab completion in Unix shells.
    
    ****Context-aware word completion****
    
    [Ctrl][x][Ctrl][p]
    
    or
    
    [Ctrl][x][Ctrl][n]
    
    Repeat the command to continue adding matches, e.g. in a document that contained the string "Hello world", you could type Hel[Ctrl][x][Ctrl][p] to complete \`Hello\`, and then immediately repeating [Ctrl][x][Ctrl][p] would add world.
    
    At any point, if there are multiple possible matches, you can use [Ctrl][p] and [Ctrl][n] to navigate through the options.

4.  Context-aware line completion

    [Ctrl][x][Ctrl][l]
    
    As with word completion, you can repeat the command to continue adding matches.

5.  Language-aware completion

    [Ctrl][x][Ctrl][o]
    
    If you have Vim's filetype plugins enables, you will have access to omnicomplete for some languages. This completion style will complete language keywords and built in classes or functions.
    
    For example, in a Ruby file, typing "Hello world".cap[Ctrl][x][Ctrl][o] would complete to "Hello world".capitalize or "Hello world".capitalize!.

6.  Insert mode completion : [Ctrl][N]

7.  Omni completion : ^O ^N ^P

8.  Completion tips :

    -   vim is very completion friendly
    -   just use <Tab> on command line
    -   for filenames, set ‘wildmenu’ and ‘wildmode’ (I like "list:longest,full")
    -   :new ~/dev/fo<Tab> - complete filename
    -   :help ‘comp<Tab> - complete option name
    -   :re<Tab> - complete command
    -   hit <Tab> again to cycle, CTRL-N for next match, CTRL-P for previous
    
    ---


<a id="orgd90aa70"></a>

### Word and text manipulation

<https://vim.fandom.com/wiki/Search_and_replace#substitute_last_search>

1.  WORD MANIPULATION:

    Quickly change word or line : To quickly change a word you can use cw,caw (change a word) or ciw (change in word). Use c$ or just C to quickly change from the cursor to the end of a line, cc to change an entire line, or cis (change in sentense) for a sentence
    
    <table border="2" cellspacing="0" cellpadding="6" rules="groups" frame="hsides">
    
    
    <colgroup>
    <col  class="org-left" />
    
    <col  class="org-left" />
    </colgroup>
    <tbody>
    <tr>
    <td class="org-left">ea</td>
    <td class="org-left">To append something to a word (at the end of the word)</td>
    </tr>
    
    
    <tr>
    <td class="org-left">dw (vw to select in visual mode)</td>
    <td class="org-left">To delete a word along with the whitespace after the word</td>
    </tr>
    
    
    <tr>
    <td class="org-left">de (ve to select in visual mode)</td>
    <td class="org-left">To delete a word but not the the whitespace after the word</td>
    </tr>
    </tbody>
    </table>

2.  TEXT SELECTION :

    If you want to do the same thing to a collection of lines, like cut, copy, sort, or format, you first need to select the text. Get out of insert mode, hit one of the options below, and then move up or down a few lines. You should see the selected text highlighted.
    
    <table border="2" cellspacing="0" cellpadding="6" rules="groups" frame="hsides">
    
    
    <colgroup>
    <col  class="org-left" />
    
    <col  class="org-left" />
    </colgroup>
    <tbody>
    <tr>
    <td class="org-left">V</td>
    <td class="org-left">selects entire lines</td>
    </tr>
    
    
    <tr>
    <td class="org-left">v</td>
    <td class="org-left">selects range of text</td>
    </tr>
    
    
    <tr>
    <td class="org-left">ctrl-v</td>
    <td class="org-left">selects columns</td>
    </tr>
    
    
    <tr>
    <td class="org-left">gv</td>
    <td class="org-left">reselect block</td>
    </tr>
    </tbody>
    </table>
    
    After selecting the text, try d to cut/delete, or y to copy, or :s/match/replace/, or :center, or !sort, or&#x2026;
    Move to cursor where you would like to paste.
    Press P to paste before the cursor, or p to paste after.

3.  SEARCH AND REPLACE :

    How do I convert all occurrences of ABC to XYZ in a file using the vi/vim editor?
    
        :1,$s/ABC/XYZ/g   and then press [Enter].
    
    This vi command replaces every occurrence of ABC with XYZ on every line, and even when there are multiple occurrences on a line.
    Note that in this example, the "g" character at the end of the command means "global".
    If you don't use this "g" the tab character will only be replaced the first time it is seen on a line, but if you add the "g" at the end of the command every tab character in each line will be replaced.
    
    ---
    
    How to select a word within Vim and replace it with something else?
    
    (a quick search on the internet shows many ways to do this. but here is a simple way to do it)
    
    \`:%s//bar/g\`
        Replace each match of the last search pattern with 'bar'. 
        For example, you might first place the cursor on the word foo then press \* to search for that word. 
        The above substitute would then change all words exactly matching 'foo' to 'bar'.
    
    Refer to [this page](<https://vim.fandom.com/wiki/Search_and_replace#substitute_last_search>) for more examples
    
    ---
    
        / : Search
        */# : Search forward/back for word under cursor
    
    <table border="2" cellspacing="0" cellpadding="6" rules="groups" frame="hsides">
    
    
    <colgroup>
    <col  class="org-left" />
    
    <col  class="org-left" />
    </colgroup>
    <tbody>
    <tr>
    <td class="org-left">:%s/search for this/replace with this/</td>
    <td class="org-left">search whole file and replace</td>
    </tr>
    
    
    <tr>
    <td class="org-left">:%s/search for this/replace with this/c</td>
    <td class="org-left">confirm each replace</td>
    </tr>
    
    
    <tr>
    <td class="org-left">1,$s/\t/    /g</td>
    <td class="org-left">To convert each tab in the file to four spaces</td>
    </tr>
    
    
    <tr>
    <td class="org-left">:%s/\t/    /g</td>
    <td class="org-left">How to replace all tabs with spaces</td>
    </tr>
    </tbody>
    </table>
    
    General tips for searching : 
    
    <table border="2" cellspacing="0" cellpadding="6" rules="groups" frame="hsides">
    
    
    <colgroup>
    <col  class="org-left" />
    
    <col  class="org-left" />
    </colgroup>
    <tbody>
    <tr>
    <td class="org-left">/pattern</td>
    <td class="org-left">search forward for pattern</td>
    </tr>
    
    
    <tr>
    <td class="org-left">?pattern</td>
    <td class="org-left">search backward</td>
    </tr>
    
    
    <tr>
    <td class="org-left">n</td>
    <td class="org-left">repeat forward search</td>
    </tr>
    
    
    <tr>
    <td class="org-left">N</td>
    <td class="org-left">repeat backward</td>
    </tr>
    
    
    <tr>
    <td class="org-left">:set ignorecase</td>
    <td class="org-left">case insensitive</td>
    </tr>
    
    
    <tr>
    <td class="org-left">:set smartcase</td>
    <td class="org-left">use case if any caps used</td>
    </tr>
    
    
    <tr>
    <td class="org-left">:set incsearch</td>
    <td class="org-left">show match as search proceeds</td>
    </tr>
    
    
    <tr>
    <td class="org-left">:set hlsearch</td>
    <td class="org-left">search highlighting</td>
    </tr>
    </tbody>
    </table>
    
    More cool searching tricks:
    
    <table border="2" cellspacing="0" cellpadding="6" rules="groups" frame="hsides">
    
    
    <colgroup>
    <col  class="org-left" />
    
    <col  class="org-left" />
    </colgroup>
    <tbody>
    <tr>
    <td class="org-left">*</td>
    <td class="org-left">search for word currently under cursor</td>
    </tr>
    
    
    <tr>
    <td class="org-left">g*</td>
    <td class="org-left">search for partial word under cursor (repeat with n)</td>
    </tr>
    
    
    <tr>
    <td class="org-left">ctrl-o, ctrl-i</td>
    <td class="org-left">go through jump locations</td>
    </tr>
    
    
    <tr>
    <td class="org-left">[I</td>
    <td class="org-left">show lines with matching word under cursor</td>
    </tr>
    </tbody>
    </table>
    
    ---
    
    <table border="2" cellspacing="0" cellpadding="6" rules="groups" frame="hsides">
    
    
    <colgroup>
    <col  class="org-left" />
    
    <col  class="org-left" />
    </colgroup>
    <tbody>
    <tr>
    <td class="org-left">:g/&lt;pattern&gt;/j</td>
    <td class="org-left">To join lines within a pattern</td>
    </tr>
    
    
    <tr>
    <td class="org-left">:g/.*(underscore)(underscore)text.*/j</td>
    <td class="org-left">To join the subsequent line with a line containing a certain text</td>
    </tr>
    
    
    <tr>
    <td class="org-left">:%s/{\(underscore)s.*(underscore)(underscore)text/{(underscore)(underscore)text/g</td>
    <td class="org-left">Join two lines with a pattern ending on one line and a pattern beginning on the subsequent line. This looks for lines ending with "{" and a next line starting with the text (a wildcard) "(underscore)(underscore)text" and joins them into a single line.</td>
    </tr>
    
    
    <tr>
    <td class="org-left">:%s/' ,/',\r/g</td>
    <td class="org-left">Replace each "' }," in the current file by a new line</td>
    </tr>
    
    
    <tr>
    <td class="org-left">:{\(underscore)$\(underscore)s*(underscore)(underscore)prefix</td>
    <td class="org-left">This searches for lines ending with `{` and a subsequent line starting with `(underscore)(underscore)prefix`.</td>
    </tr>
    
    
    <tr>
    <td class="org-left">:',\(underscore)$\(underscore)s*(underscore)(underscore)text</td>
    <td class="org-left">This searches for lines ending with `',` and a subsequent line starting with `(underscore)(underscore)text`.</td>
    </tr>
    
    
    <tr>
    <td class="org-left">:%s/',\(underscore)$\(underscore)s*(underscore)(underscore)text/',(underscore)(underscore)text/g</td>
    <td class="org-left">This searches for lines ending with `',` and a subsequent line starting with `(underscore)(underscore)text` and joins the two lines together.</td>
    </tr>
    
    
    <tr>
    <td class="org-left">:%s/{\(underscore)$\(underscore)s*(underscore)(underscore)prefix/{(underscore)(underscore)prefix\g</td>
    <td class="org-left">This searches for lines ending with `{` and a subsequent line starting with `(underscore)(underscore)prefix` and joins the two lines together.</td>
    </tr>
    
    
    <tr>
    <td class="org-left">:g/.*(underscore)(underscore)prefix.*(underscore)(underscore)text.* },\(underscore)$/normal! @a</td>
    <td class="org-left">Record a macro in register a and play it on a pattern match.</td>
    </tr>
    
    
    <tr>
    <td class="org-left">:g/pattern to match/ s/text to search/text to replace/gc</td>
    <td class="org-left">How to mix global command and replace command? Using the above command or variants of it, we can search for patterns in the entire file and do replace operations on those specific lines.</td>
    </tr>
    </tbody>
    </table>
    
    ---

4.  COUNTING WORDS OR PATTERNS

    -   Count the number of occurrences of a word or pattern in the current file : 
        
            (first use * on the word)
            
            after that, use the following command to get a count : %s///gn
        
        We are actually calling the :substitute command, but the n flag suppresses the usual behaviour.
        Instead of replacing each match witht the target, it simply counts the number of matches and then echoes the result below the command line.
        Do not omit any of the forward slashes.
        g stands for global (in the curent file).
    
    -   Find all occurrences of a word in the current file and populate the quickfix list window
        
            :vim /pattern/ % | cw
    
    ---
    
        ~ & -
    
    Repeat last substitution on current line
    
    ---
    
    Insert mode tips :
    
        gi - (incredibly handy) - goes to Insert mode where you left it last time
    
    e.g. scenario: edit something, exit Insert, go look at something else, then gi back to restart editing
    
        CTRL-T and CTRL-D (tab and de-tab)
    
    inserts or deletes one shiftwidth of indent at the start of the line
    
    ---


<a id="orga4b0ecf"></a>

### Working with multiple files

<https://vim.fandom.com/wiki/Quick_tips_for_using_tab_pages>
<https://vim.fandom.com/wiki/Using_tab_pages>
<http://vimdoc.sourceforge.net/htmldoc/tabpage.html>

1.  Buffers

    How to view all open buffers?
    :buffers
    
    This will show a numbered list with all open buffers. To go to a specific buffer (file), do \`:b5\` (to go to the buffer with the number 5)
    Tip: the numbers on buffers do not during a session.
    
    ---
    
    (This is the general method to update multiple java files at once)
    
    If you want to open all files matching the pattern in subfolders - :args **\*/**.java
    
    To replace four white spaces in java files with a tab use this - :bufdo exexute "%s/    /(press tab)/g" | update
    
        1. :bufdo execute "%s/(press tab){/{/g" | update
        1. :bufdo execute "global/^{/normal -gJ" | update
        1. :bufdo execute "%s/){/) {/g" | update
    
    ---

2.  Tabs

    CREATING AND CLOSING TABS
    
    <table border="2" cellspacing="0" cellpadding="6" rules="groups" frame="hsides">
    
    
    <colgroup>
    <col  class="org-left" />
    
    <col  class="org-left" />
    </colgroup>
    <tbody>
    <tr>
    <td class="org-left">:tabnew</td>
    <td class="org-left">To open a new tab with an empty buffer</td>
    </tr>
    
    
    <tr>
    <td class="org-left">:tabe &lt;file&gt;</td>
    <td class="org-left">to edit file in a new tab</td>
    </tr>
    
    
    <tr>
    <td class="org-left">:tabc</td>
    <td class="org-left">to close a tab and all the buffers in it</td>
    </tr>
    </tbody>
    </table>
    
        :tabs		List the tab pages and the windows they contain.
                	Shows a ">" for the current window.
                	Shows a "+" for modified buffers.
                	For example:
                		Tab page 1 ~
                		  + tabpage.txt ~
                		    ex_docmd.c ~
                		Tab page 2 ~
                		>   main.c ~
    
    This will show a numbered list with all open tabs. To go to a specific tab, do \`:5gt\` (to go to the tab with the number 5)
    
    <table border="2" cellspacing="0" cellpadding="6" rules="groups" frame="hsides">
    
    
    <colgroup>
    <col  class="org-left" />
    
    <col  class="org-left" />
    </colgroup>
    <tbody>
    <tr>
    <td class="org-left">:tabs</td>
    <td class="org-left">List the tab pages and the windows they contain.</td>
    </tr>
    
    
    <tr>
    <td class="org-left">g&lt;Tab&gt;</td>
    <td class="org-left">Go to the last accessed tab page.</td>
    </tr>
    
    
    <tr>
    <td class="org-left">:gt</td>
    <td class="org-left">Go to the next tab</td>
    </tr>
    
    
    <tr>
    <td class="org-left">: gT</td>
    <td class="org-left">Go to the previous tab</td>
    </tr>
    
    
    <tr>
    <td class="org-left">: nnn gt</td>
    <td class="org-left">Go to a numbered tab. For example, 3gt goes to tab 3</td>
    </tr>
    
    
    <tr>
    <td class="org-left">:tabn, :tabp</td>
    <td class="org-left">(or gt, gT to switch)</td>
    </tr>
    </tbody>
    </table>
    
    REORDERING TAB PAGES:
    
    <table border="2" cellspacing="0" cellpadding="6" rules="groups" frame="hsides">
    
    
    <colgroup>
    <col  class="org-left" />
    
    <col  class="org-left" />
    </colgroup>
    <tbody>
    <tr>
    <td class="org-left">:tabm2</td>
    <td class="org-left">moves the current tab to appear after tab 2. To move this tab to the first position, use :tabm0. To move this tab to the last position, just use :tabm</td>
    </tr>
    
    
    <tr>
    <td class="org-left">:tabm[ove] +[N]</td>
    <td class="org-left">Move the current tab page N places to the right (with +) or to the left (with -).</td>
    </tr>
    
    
    <tr>
    <td class="org-left">:tabm[ove] -[N]</td>
    <td class="org-left">Move the current tab page N places to the right (with +) or to the left (with -).</td>
    </tr>
    
    
    <tr>
    <td class="org-left">:tabmove -</td>
    <td class="org-left">move the tab page to the left</td>
    </tr>
    
    
    <tr>
    <td class="org-left">:tabmove -1</td>
    <td class="org-left">as above</td>
    </tr>
    
    
    <tr>
    <td class="org-left">:tabmove +</td>
    <td class="org-left">move the tab page to the right</td>
    </tr>
    
    
    <tr>
    <td class="org-left">:tabmove +1</td>
    <td class="org-left">as above</td>
    </tr>
    </tbody>
    </table>
    
    ---
    
    Open question - how to move buffers from one tab to another or into split windows when wanted?
    It may not be such a great idea to work on multiple windows in a given tab, unless there is a need for it.
    Always prefer to work only on one buffer in a tab because that will give maximum visibility into the open buffer.
    If there is a need to work on another file/buffer at the same time, put it in a separate tab.
    For now, just go to the tab that you want to open split windows in and use :vsp to split it and open the file that you want to view as a split window.
    
    ---
    
    How to open buffers in tabs from netrw: One way is to change netrw settings using vimrc. The other way is, open it in a window and move it into a tab using Cntrl W T
    
    How to move an existing window (split) and put it in a new tab?  Ctrl W followed by T
    
    ---

3.  Splits and Multiple windows

    How do I change the current split's width and height?
    
    <table border="2" cellspacing="0" cellpadding="6" rules="groups" frame="hsides">
    
    
    <colgroup>
    <col  class="org-left" />
    
    <col  class="org-left" />
    </colgroup>
    <tbody>
    <tr>
    <td class="org-left">Ctrl+W +/-</td>
    <td class="org-left">increase/decrease height (ex. 20&lt;C-w&gt;+)</td>
    </tr>
    
    
    <tr>
    <td class="org-left">Ctrl+W &gt;/&lt;</td>
    <td class="org-left">increase/decrease width (ex. 30&lt;C-w&gt;&lt;)</td>
    </tr>
    
    
    <tr>
    <td class="org-left">Ctrl+W _</td>
    <td class="org-left">set height (ex. 50&lt;C-w&gt;_)</td>
    </tr>
    
    
    <tr>
    <td class="org-left">Ctrl+W    (pipe)</td>
    <td class="org-left">set width (ex. 50&lt;C-w&gt;)</td>
    </tr>
    
    
    <tr>
    <td class="org-left">Ctrl+W =</td>
    <td class="org-left">equalize width and height of all windows</td>
    </tr>
    
    
    <tr>
    <td class="org-left">^Ws or :split↵</td>
    <td class="org-left">split window in two</td>
    </tr>
    
    
    <tr>
    <td class="org-left">^Wn or :new↵</td>
    <td class="org-left">create new empty window</td>
    </tr>
    
    
    <tr>
    <td class="org-left">^Wo or :on↵</td>
    <td class="org-left">make current window one on screen</td>
    </tr>
    
    
    <tr>
    <td class="org-left">^Wj ^Wk</td>
    <td class="org-left">move to window below, above</td>
    </tr>
    
    
    <tr>
    <td class="org-left">^Ww ^W<sup>W</sup></td>
    <td class="org-left">move to window below, above (wrap)</td>
    </tr>
    
    
    <tr>
    <td class="org-left">:e filename</td>
    <td class="org-left">Edit another file</td>
    </tr>
    
    
    <tr>
    <td class="org-left">:split filename</td>
    <td class="org-left">Split window and load another file</td>
    </tr>
    
    
    <tr>
    <td class="org-left">CTRL-W v</td>
    <td class="org-left">Vertical split current window</td>
    </tr>
    
    
    <tr>
    <td class="org-left">CTRL-W s</td>
    <td class="org-left">Horizontal split current window</td>
    </tr>
    
    
    <tr>
    <td class="org-left">CTRL-W Arrow Up</td>
    <td class="org-left">Move cursor up a window</td>
    </tr>
    
    
    <tr>
    <td class="org-left">CTRL-W CTRL-W</td>
    <td class="org-left">Move cursor to another window (cycle)</td>
    </tr>
    
    
    <tr>
    <td class="org-left">CTRL-W_</td>
    <td class="org-left">Maximize current window</td>
    </tr>
    
    
    <tr>
    <td class="org-left">CTRL-W=</td>
    <td class="org-left">Make all equal size</td>
    </tr>
    
    
    <tr>
    <td class="org-left">10 CTRL-W+</td>
    <td class="org-left">Increase window size by 10 lines</td>
    </tr>
    
    
    <tr>
    <td class="org-left">:vsplit file</td>
    <td class="org-left">Vertical split</td>
    </tr>
    
    
    <tr>
    <td class="org-left">:sview file</td>
    <td class="org-left">Same as split, but readonly</td>
    </tr>
    
    
    <tr>
    <td class="org-left">:hide</td>
    <td class="org-left">Close current window</td>
    </tr>
    
    
    <tr>
    <td class="org-left">:only</td>
    <td class="org-left">Keep only this window open</td>
    </tr>
    
    
    <tr>
    <td class="org-left">:ls</td>
    <td class="org-left">Show current buffers</td>
    </tr>
    
    
    <tr>
    <td class="org-left">:b 2</td>
    <td class="org-left">Open buffer #2 in this window</td>
    </tr>
    
    
    <tr>
    <td class="org-left">:bd[n]</td>
    <td class="org-left">Close current buffer. If [n] is given close buffer #n. #n can be gathered with :ls.</td>
    </tr>
    </tbody>
    </table>
    
    See also: :help CTRL-W
    
    These mappings will help it a little easier.
    (pressing + is too difficult. = is + without having to press shift.)
    (pressing - is easy enough.)
    nnoremap <Leader>= :vertical resize +5<CR>
    nnoremap <Leader>- :vertical resize -5<CR>
    
    ---


<a id="orgce9a3e4"></a>

### Vim help

Opening Vim help in a vertical split window

    :vertical (vert)
    
    :vert help

You can also control whether the window splits on the left/top or the right/bottom with topleft (to) and botright (bo). For example, to open help in the right window of a vertical split:

    :vert bo help

---


<a id="orge568988"></a>

### Key mappings and abbreviations

<table border="2" cellspacing="0" cellpadding="6" rules="groups" frame="hsides">


<colgroup>
<col  class="org-left" />

<col  class="org-left" />
</colgroup>
<tbody>
<tr>
<td class="org-left">:map c e↵</td>
<td class="org-left">map c ↦ e in normal &amp; visual mode</td>
</tr>


<tr>
<td class="org-left">:map!  c e↵</td>
<td class="org-left">map c ↦ e in insert &amp; cmd-line mode</td>
</tr>


<tr>
<td class="org-left">:unmap c↵  :unmap!  c↵</td>
<td class="org-left">remove mapping c</td>
</tr>


<tr>
<td class="org-left">:mk f↵</td>
<td class="org-left">write current mappings, settings&#x2026; to file f</td>
</tr>


<tr>
<td class="org-left">:ab c e↵</td>
<td class="org-left">add abbreviation for c ↦ e</td>
</tr>


<tr>
<td class="org-left">:ab c↵</td>
<td class="org-left">show abbreviations starting with c</td>
</tr>


<tr>
<td class="org-left">:una c↵</td>
<td class="org-left">remove abbreviation c</td>
</tr>
</tbody>
</table>

---


<a id="org1159d04"></a>

### Tags in Vim

cTags in Vim

<https://andrew.stwrt.ca/posts/vim-ctags/>

You would have to install cTags separately. It does not come with Vim.

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
This will look in the current directory for "tags", and work up the tree towards root until one is found. In other words, you can be anywhere in your source tree instead of just the root of it.

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

<table border="2" cellspacing="0" cellpadding="6" rules="groups" frame="hsides">


<colgroup>
<col  class="org-left" />

<col  class="org-left" />
</colgroup>
<tbody>
<tr>
<td class="org-left">:ta t↵</td>
<td class="org-left">jump to tag t</td>
</tr>


<tr>
<td class="org-left">:nta↵</td>
<td class="org-left">jump to nth newer tag in list</td>
</tr>


<tr>
<td class="org-left">^] ^T</td>
<td class="org-left">jump to the tag under cursor, return from tag</td>
</tr>


<tr>
<td class="org-left">:ts t↵</td>
<td class="org-left">list matching tags and select one for jump</td>
</tr>


<tr>
<td class="org-left">:tj t↵</td>
<td class="org-left">jump to tag or select one if multiple matches</td>
</tr>


<tr>
<td class="org-left">:tags↵</td>
<td class="org-left">print tag list</td>
</tr>


<tr>
<td class="org-left">:npo↵  :n<sup>T</sup>↵</td>
<td class="org-left">jump back from, to nth older tag</td>
</tr>


<tr>
<td class="org-left">:tl↵</td>
<td class="org-left">jump to last matching tag</td>
</tr>


<tr>
<td class="org-left">^W}  :pt t↵</td>
<td class="org-left">preview tag under cursor, tag t</td>
</tr>


<tr>
<td class="org-left">^W]</td>
<td class="org-left">split window and show tag under cursor</td>
</tr>


<tr>
<td class="org-left">^Wz or :pc↵</td>
<td class="org-left">close tag preview window</td>
</tr>
</tbody>
</table>

---


<a id="org3a58cf2"></a>

### Deleting

Deletion

<table border="2" cellspacing="0" cellpadding="6" rules="groups" frame="hsides">


<colgroup>
<col  class="org-left" />

<col  class="org-left" />
</colgroup>
<tbody>
<tr>
<td class="org-left">x X</td>
<td class="org-left">delete character under, before cursor</td>
</tr>


<tr>
<td class="org-left">dm</td>
<td class="org-left">delete text of movement command m</td>
</tr>


<tr>
<td class="org-left">dd D</td>
<td class="org-left">delete current line, to the end of line</td>
</tr>


<tr>
<td class="org-left">J gJ</td>
<td class="org-left">join current line with next, without space</td>
</tr>


<tr>
<td class="org-left">:rd↵</td>
<td class="org-left">delete range r lines</td>
</tr>


<tr>
<td class="org-left">:rdx↵</td>
<td class="org-left">delete range r lines into register x</td>
</tr>
</tbody>
</table>

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


<a id="orgfc22721"></a>

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


<a id="orgfba5397"></a>

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


<a id="org19679a8"></a>

### Indentation

    Example line
        This is part of the parsed line
        Thats goes one
    End of line

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


<a id="orgcc55a4d"></a>

### Line numbers

To display line numbers :set number (To turn off the line number display :set nonumber)

To enable line numbers on startup, simply add the following to your vimrc - set number

Relative Line Numbers : To display line numbers relative to the line with the cursor, :set relativenumber or :set norelativenumber

---


<a id="orgd615c64"></a>

### Lower case Upper case

How to change lower case letters words to upper case words? How to change upper case words to lower case words?

You can change the case of text:

    Toggle case "HellO" to "hELLo" with g~ then a movement (word or end of line). 
    Uppercase "HellO" to "HELLO" with gU then a movement (word or end of line). 
    Lowercase "HellO" to "hello" with gu then a movement (word or end of line). 

Alternatively(easier to remember), you can visually select text then press ~ to toggle case, or U to convert to uppercase, or u to convert to lowercase. 

---


<a id="orgea762c4"></a>

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


<a id="org29fefdc"></a>

### Macros

Recording a macro is a great way to perform a one-time task, or to get things done quickly when you don't want to mess with Vim script or mappings, or if you do not yet know how to do it more elegantly. 

Recording a macro

Each register is identified by a letter a to z. To enter a macro, type: q<letter><commands>q

To execute the macro <number> times (once by default), type: <number>@<letter>

So, the complete process looks like:

    * qd 	start recording to register d
    * ... 	your complex series of commands
    * q 	stop recording
    * @d 	execute your macro
    * @@ 	execute your macro again 

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


<a id="org12b12c7"></a>

### Netrw

Vim documentation: <http://vimdoc.sourceforge.net/htmldoc/pi_netrw.html#netrw>

Open question - netrw - always fix the width at 25%. Right now, it is at 25% on start-up but when a new buffer is opened, its size is changing.

---

How to : always show line numbers in netrw:

    " netrw_bufsettings - you can control netrw's buffer settings; change
    " these if you want to change line number displays, relative line number
    " displays and other settings in netrw menu.
        let g:netrw_bufsettings = 'noma nomod nu nobl nowrap ro'

The file explorer is just another Vim buffer, so you can navigate up and down with k and j keys, or jump to the bottom with G, etc. If it is a large file listing, you may be quicker finding your target by searching for it.

There are a handful of useful commands for opening the file explorer - either in the current window or a split, focusing on the project root, or the directory of the most recent file edited. This table summarizes:

<table border="2" cellspacing="0" cellpadding="6" rules="groups" frame="hsides">


<colgroup>
<col  class="org-left" />

<col  class="org-left" />

<col  class="org-left" />
</colgroup>
<tbody>
<tr>
<td class="org-left">lazy</td>
<td class="org-left">mnemonic</td>
<td class="org-left">open file explorer</td>
</tr>


<tr>
<td class="org-left">:e.</td>
<td class="org-left">:edit .</td>
<td class="org-left">at current working directory</td>
</tr>


<tr>
<td class="org-left">:sp.</td>
<td class="org-left">:split .</td>
<td class="org-left">in split at current working directory</td>
</tr>


<tr>
<td class="org-left">:vs.</td>
<td class="org-left">:vsplit .</td>
<td class="org-left">in vertical split at current working directory</td>
</tr>


<tr>
<td class="org-left">:E :</td>
<td class="org-left">Explore</td>
<td class="org-left">at directory of current file</td>
</tr>


<tr>
<td class="org-left">:Se</td>
<td class="org-left">:Sexplore</td>
<td class="org-left">in split at directory of current file</td>
</tr>


<tr>
<td class="org-left">:Vex</td>
<td class="org-left">:Vexplore</td>
<td class="org-left">in vertical split at directory of current file</td>
</tr>
</tbody>
</table>

Manipulating the filesystem

The file explorer includes commands for creating new files and directories, as well as renaming or deleting existing ones. This table summarizes these:

<table border="2" cellspacing="0" cellpadding="6" rules="groups" frame="hsides">


<colgroup>
<col  class="org-left" />

<col  class="org-left" />
</colgroup>
<tbody>
<tr>
<td class="org-left">command</td>
<td class="org-left">action</td>
</tr>


<tr>
<td class="org-left">%</td>
<td class="org-left">create a new file</td>
</tr>


<tr>
<td class="org-left">d</td>
<td class="org-left">create a new directory</td>
</tr>


<tr>
<td class="org-left">R</td>
<td class="org-left">rename the file/directory under the cursor</td>
</tr>


<tr>
<td class="org-left">D</td>
<td class="org-left">Delete the file/directory under the cursor</td>
</tr>
</tbody>
</table>

Invoking netrw can be achieved in three ways

<table border="2" cellspacing="0" cellpadding="6" rules="groups" frame="hsides">


<colgroup>
<col  class="org-left" />

<col  class="org-left" />
</colgroup>
<tbody>
<tr>
<td class="org-left">:Explore (:E)</td>
<td class="org-left">opens netrw in the current window</td>
</tr>


<tr>
<td class="org-left">:Sexplore (:Sex)</td>
<td class="org-left">opens netrw in a horizontal split</td>
</tr>


<tr>
<td class="org-left">:Vexplore (:Vex)</td>
<td class="org-left">opens netrw in a vertical split</td>
</tr>


<tr>
<td class="org-left">:Texplore (:Tex)</td>
<td class="org-left">opens netrw in a new tab (use Cntrl PgUp, Cntrl PgDn to switch between tabs)</td>
</tr>
</tbody>
</table>

---

NERDtree like setup
If NERDtree is your thing, netrw can give you a similar experience with the following settings

    let g:netrw_banner = 0 (To remove the directory banner)
    let g:netrw_liststyle = 3
    let g:netrw_browse_split = 4
    let g:netrw_altv = 1
    let g:netrw_winsize = 25
    augroup ProjectDrawer
      autocmd!
      autocmd VimEnter * :Vexplore
    augroup END

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

Further Reading
    :help netrw
    :help :edit
    :help :Explore

---


<a id="orgdfb1925"></a>

### Packages and plugins

Vim's official plugin install method:
<https://github.com/vim/vim/blob/03c3bd9fd094c1aede2e8fe3ad8fd25b9f033053/runtime/doc/repeat.txt#L515>

Manual installation of packages in Windows:
Create the folder "\\[your-name]\start" if it doesn't exist and clone the git repositories into it or manually copy the repositories into this folder.
C:\Program Files\Vim\vim82\pack\\[your-name]\start

Protip: To learn more about any plugin, simply prepend "<https://github.com/>" to any plugin name. So if you see this line in a .vimrc file:

    Plug 'pechorin/any-jump.vim'

change it to this to get the plugin's URL: 

    https://github.com/pechorin/any-jump.vim

---


<a id="org853a8ee"></a>

### git

1.  gitignore

    Vim creates temporary files throughout the project. One way to stop that is by using the following settings:   
    
        set nobackup       "no backup files
        set nowritebackup  "only in case you don't want a backup file while editing
        set noswapfile     "no swap files
    
    Instead of changing Vim settings, just add the following lines to the project's gitignore files
    
        *~
        *.swp
        *.swo

2.  If the command prompt does not recognize git in Windows machines

    I have an installation of Git for Windows, but when I try to use the git command in Command Prompt, I get the following error: 'git' is not recognized as an internal or external command, operable program or batch file. How to fix this problem?
    
    Have you correctly set your PATH to point at your Git installation?
    
    You need to add the following paths to PATH:
    
        C:\Program Files\Git\bin\
        
        C:\Program Files\Git\cmd\

3.  If Vim does not recognize Git

    Symptom : If there is an error when Vim is starting up due to the call plug#begin(), it indicates that Vim may not be recognizing Git appropriately. This might show up when using PlugInstall command or any other plugin manager.
    
    Do you have git installed on your system? What does :echo executable('git') say?
    
    If it says 0, then add these to the vimrc file:
    
    (for 32 bit machines)
    
        if has('win32')
        
            let $PATH .= ';' . 'C:/Program Files (x86)/Git/bin'
        
        endif
    
    (for 64 bit machines)
    
        if has('win64')
        
            let $PATH .= ';' . 'C:/Program Files/Git/bin/'
        
        endif

4.  If the plugin managing tools have trouble connecting to git when working in a corporate environment:

    Unable to resolve “unable to get local issuer certificate” using git on Windows with self-signed certificate
    
    Open Git Bash and run the command if you want to completely disable SSL verification.
    
        git config --global http.sslVerify false
    
    Note: This solution may open you to attacks like man-in-the-middle attacks. Therefore turn on verification again as soon as possible:
    
        git config --global http.sslVerify true 
    
    ---


<a id="orgd9e7216"></a>

### Helpful links

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

---


<a id="orgf9ab1ca"></a>

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


<a id="orgd2aa6cd"></a>

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


<a id="orgfa218eb"></a>

### Miscellaneous

<table border="2" cellspacing="0" cellpadding="6" rules="groups" frame="hsides">


<colgroup>
<col  class="org-left" />

<col  class="org-left" />
</colgroup>
<tbody>
<tr>
<td class="org-left">:sh↵  :!c↵</td>
<td class="org-left">start shell, execute command c in shell</td>
</tr>


<tr>
<td class="org-left">K</td>
<td class="org-left">lookup keyword under cursor with man</td>
</tr>


<tr>
<td class="org-left">:make↵</td>
<td class="org-left">start make, read errors and jump to first</td>
</tr>


<tr>
<td class="org-left">:cn↵  :cp↵</td>
<td class="org-left">display the next, previous error</td>
</tr>


<tr>
<td class="org-left">:cl↵  :cf↵</td>
<td class="org-left">list all errors, read errors from file</td>
</tr>


<tr>
<td class="org-left">^L ^G</td>
<td class="org-left">redraw screen, show filename and position</td>
</tr>


<tr>
<td class="org-left">g<sup>G</sup></td>
<td class="org-left">show cursor column, line, and character position</td>
</tr>


<tr>
<td class="org-left">ga</td>
<td class="org-left">show ASCII value of character under cursor</td>
</tr>


<tr>
<td class="org-left">gf</td>
<td class="org-left">open file which filename is under cursor</td>
</tr>


<tr>
<td class="org-left">:redir&gt;f↵</td>
<td class="org-left">redirect output to file f</td>
</tr>


<tr>
<td class="org-left">:mkview [f]</td>
<td class="org-left">save view configuration [to file f]</td>
</tr>


<tr>
<td class="org-left">:loadview [f]</td>
<td class="org-left">load view configuration [from file f]</td>
</tr>


<tr>
<td class="org-left">^@ ^K ^_  \  Fn ^Fn</td>
<td class="org-left">unmapped keys</td>
</tr>
</tbody>
</table>

---


<a id="org0b66e59"></a>

### Plugins

1.  Vim fugitive

    <https://github.com/tpope/vim-fugitive/blob/master/doc/fugitive.txt>
    
    To launch the git status window:
    
    <table border="2" cellspacing="0" cellpadding="6" rules="groups" frame="hsides">
    
    
    <colgroup>
    <col  class="org-left" />
    
    <col  class="org-left" />
    </colgroup>
    <tbody>
    <tr>
    <td class="org-left">:G</td>
    <td class="org-left">git status</td>
    </tr>
    
    
    <tr>
    <td class="org-left">:Gstatus</td>
    <td class="org-left">git status</td>
    </tr>
    </tbody>
    </table>
    
    When not in the git status window:
    
    <table border="2" cellspacing="0" cellpadding="6" rules="groups" frame="hsides">
    
    
    <colgroup>
    <col  class="org-left" />
    
    <col  class="org-left" />
    </colgroup>
    <tbody>
    <tr>
    <td class="org-left">:Gcommit</td>
    <td class="org-left">to open the commit window if you are not already in the git status window</td>
    </tr>
    
    
    <tr>
    <td class="org-left">:Gdiff</td>
    <td class="org-left">diff mode to see the changes for the curent file</td>
    </tr>
    </tbody>
    </table>
    
    In the Gstatus window:
    
    <table border="2" cellspacing="0" cellpadding="6" rules="groups" frame="hsides">
    
    
    <colgroup>
    <col  class="org-left" />
    
    <col  class="org-left" />
    </colgroup>
    <tbody>
    <tr>
    <td class="org-left">(minus)</td>
    <td class="org-left">stage if the file is not staged. unstage if the file is already staged. This also works in visual mode. If you want to stage/unstage more than one file at a time, visually select them and press minus.</td>
    </tr>
    
    
    <tr>
    <td class="org-left">Ctrl n</td>
    <td class="org-left">next file</td>
    </tr>
    
    
    <tr>
    <td class="org-left">Ctrl p</td>
    <td class="org-left">previous file</td>
    </tr>
    
    
    <tr>
    <td class="org-left">p</td>
    <td class="org-left">interactive staging. run `git add –patch` for current file</td>
    </tr>
    
    
    <tr>
    <td class="org-left">Enter</td>
    <td class="org-left">open a file for quick review. This opens that specific file in a split below. After opening the file, to see the diff view for that specific file, run :Gdiff</td>
    </tr>
    
    
    <tr>
    <td class="org-left">C</td>
    <td class="org-left">commit window</td>
    </tr>
    </tbody>
    </table>
    
    **Working with the git index**
    
    The git index is where you put changes that you want to be included in the next commit. If you are used to working with the command line git client, you might think of the index as an abstract concept. But with fugitive, you can actually read the index version of a file into a buffer by running::Gedit :path/to/file
    
    If you run :Gedit with no arguments from a working tree file, it will open the index version of that file. You can always open the index version of the current file by running any one of the following::Gedit
    
        :Gedit :0
        :Gedit :%
    
    It helps to understand the lifecycle of the index file between two commits. To begin with, the contents of the index and working copy files will be exactly the same as the most recent commit. As you make changes to your working copy, its contents begin to diverge from those of the index file. Staging a file updates the contents of the index file to match those of the working copy. When you commit your work, it is the contents of the index file that are saved with that commit object.
    
    **Comparing working copy with index version using :Gdiff**
    
    When you run::Gdiff on a work tree file without any arguments, fugitive performs a vimdiff against the index version of the file. This opens a vertical split window, with the index file on the left and the working copy on the right. The files always appear in that order, so you can commit that to memory.Wholesale reconciliationThe :Gread and :Gwrite commands can either add a file to the index or reset the file, depending on where they are called from. The following table and diagrams summarize the possibilities:
    
    <table border="2" cellspacing="0" cellpadding="6" rules="groups" frame="hsides">
    
    
    <colgroup>
    <col  class="org-left" />
    
    <col  class="org-left" />
    
    <col  class="org-left" />
    </colgroup>
    <tbody>
    <tr>
    <td class="org-left">command</td>
    <td class="org-left">active window</td>
    <td class="org-left">affect</td>
    </tr>
    
    
    <tr>
    <td class="org-left">:Gwrite</td>
    <td class="org-left">working copy</td>
    <td class="org-left">stage file</td>
    </tr>
    
    
    <tr>
    <td class="org-left">:Gread</td>
    <td class="org-left">working copy</td>
    <td class="org-left">checkout file</td>
    </tr>
    
    
    <tr>
    <td class="org-left">:Gwrite</td>
    <td class="org-left">index</td>
    <td class="org-left">checkout file</td>
    </tr>
    
    
    <tr>
    <td class="org-left">:Gread</td>
    <td class="org-left">index</td>
    <td class="org-left">stage file</td>
    </tr>
    </tbody>
    </table>
    
    **Piecemeal reconciliation**
    
    Vim’s built in :diffget and :diffput commands work a bit like :Gread and :Gwrite, except that they are more granular. Whereas :Gread will completely overwrite the current buffer with the contents of the other buffer, :diffget will only pull in a patch at a time.
    
    <table border="2" cellspacing="0" cellpadding="6" rules="groups" frame="hsides">
    
    
    <colgroup>
    <col  class="org-left" />
    
    <col  class="org-left" />
    
    <col  class="org-left" />
    </colgroup>
    <tbody>
    <tr>
    <td class="org-left">command</td>
    <td class="org-left">active window</td>
    <td class="org-left">affect</td>
    </tr>
    
    
    <tr>
    <td class="org-left">:diffput</td>
    <td class="org-left">working copy</td>
    <td class="org-left">stage hunk</td>
    </tr>
    
    
    <tr>
    <td class="org-left">:diffget</td>
    <td class="org-left">working copy</td>
    <td class="org-left">checkout hunk</td>
    </tr>
    
    
    <tr>
    <td class="org-left">:diffput</td>
    <td class="org-left">index</td>
    <td class="org-left">checkout hunk</td>
    </tr>
    
    
    <tr>
    <td class="org-left">:diffget</td>
    <td class="org-left">index</td>
    <td class="org-left">stage hunk</td>
    </tr>
    </tbody>
    </table>
    
    After making changes to the index file (using :diffget and/or :diffput), the status bar at the bottom will show a (+) plus sign indicating unsaved changes to the index file. Run :w on the index file to save the changes and stage the file. If the index file is not the active buffer, run :wa to save all the open buffers. This will make sure that the changes to the index file are saved and staged. If not, the changes to the index file may not be persisted and we would have to start all over again.
    
    **resolving merge conflicts with vimdiff**
    
    :Gdiff on a conflicted file opens 3-way diffWhen you run :Gdiff on a conflicted file, fugitive opens 3 split windows. They always appear in this order:
    
    1.  the left window contains the version from the target branch
    2.  the middle window contains the working copy of the file, complete with conflict markers
    3.  the right window contains the version from the merge branch
    
    The ‘target’ branch is the one that is active when you run git merge. Or in other words, it’s the HEAD branch. The ‘merge’ branch is the one that is named in the git merge command. In this scenario the ‘master’ branch is the target, and the ‘feature’ branch is merged into target, making it the merge branch.
    
    **Strategies for reconciling 3-way diffs**
    
    There are two basic strategies for reconciling a 3-way diff. You can either keep your cursor in the middle file, and run :diffget with the bufspec for the file containing the change you want to keep. Or you can position your cursor on the change that you want to keep, and run :diffput with the bufspec for the working copy file. We’ll take a look at each of these strategies in turn, starting with diffget.
    
    Introducing buffspecs
    
    In the context of a 2-way diff, the :diffget and :diffput commands are unambiguous. If you ask Vim to get the diff from the other window, there is only one place for it to look. When you do a 3-way merge, things get a little more complex. This time, it would be ambiguous if you were to tell Vim to fetch the changes from the other window. You have to specify which buffer to fetch the changes from by providing a [bufspec].The buffspec could either be the buffer number, or a partial match for the buffer’s name. Buffer numbers are assigned sequentially, so they will differ from session to session, but you can always be sure that they will uniquely identify their buffer.Fugitive follows a consistent naming convention when creating buffers for the target and merge versions of a conflicted file. The parent file from the target branch always includes the string //2, while the parent from the merge branch always contains //3. These partial matches are sufficient to uniquely identify the target and merge parents when using the :diffget command.
    
    <table border="2" cellspacing="0" cellpadding="6" rules="groups" frame="hsides">
    
    
    <colgroup>
    <col  class="org-left" />
    
    <col  class="org-left" />
    </colgroup>
    <tbody>
    <tr>
    <td class="org-left">parent version</td>
    <td class="org-left">buffspec</td>
    </tr>
    
    
    <tr>
    <td class="org-left">target</td>
    <td class="org-left">//2</td>
    </tr>
    
    
    <tr>
    <td class="org-left">merge</td>
    <td class="org-left">//3</td>
    </tr>
    </tbody>
    </table>
    
    **Resolving a 3-way diff with :diffget**
    
    The :diffget command modifies the current buffer by pulling a change over from one of the other buffers. In resolving a merge conflict, we want to treat target and merge parents as reference copies, pulling hunks of changes from those into the conflicted working copy. That means that we want to keep the middle buffer active, and run diffget with a reference to the buffer containing the change that we want to use.
    
        :diffget //2 - fetches the hunk from the target parent (on the left)
        :diffget //3 - fetches the hunk from the merge parent (on the right)
    
    Note that Vim does not automatically recalculate the diff colors after you run :diffget. You can tell Vim to do this by running :diffupdate.
    
    **Resolving a 3-way diff with :diffput**
    
    The :diffput command modifies another buffer by pushing a change from the active buffer into it. In the context of a 3-way merge conflict, we want to push changes from the target and merge versions into the working copy.
    
    The example in the video used a file called demo.js, which could be referenced using the buffspec ‘demo’. In this case, we could run the exact same command each time:
    
    :diffput demo - pushes the hunk from the active buffer into the conflicted working copy
    
    Although the command is kept constant, we have to activate the correct window before running it. Whereas using diffget, the window remained constant but we had to pass a different argument each time.
    
    In a 2-way diff, the diffget and diffput commands require no argument. Vim provides a couple of convenient shorthand mappings for these commands: do performs a diffget, and dp does diffput. These mappings don’t normally work in a 3-way diff, because the diffget and diffput commands both require an argument in this context. But in the case of the diffput command, it’s pretty easy to guess what that argument is going to be.
    
    When you do a 3-way diff between working copy, target and merge parents, fugitive assumes that if you run dp from either of the parent buffers, you want to put the change into the working copy. So even though the dp mapping normally only works in a 2-way diff, you can use it in this special case of a 3-way diff.
    
    **Keeping one parent version in its entirety**
    
    In reality, it’s often the case that one of the parent versions is to be kept wholesale, and the other version is to be discarded. In this scenario, fugitive’s :Gwrite command comes in handy. This overwrites the working tree and index copies with the contents of the currently active file.
    
    If you run :Gwrite from the target or merge version of a file, fugitive raises a warning. This is to protect you from accidentally overwriting the working copy and index files when you’ve carefully cherry picked the changes from the parent versions. If you want to stage either of the parent versions in their entirety, use :Gwrite! to show you really mean it.
    
    Useful commands
    
    <table border="2" cellspacing="0" cellpadding="6" rules="groups" frame="hsides">
    
    
    <colgroup>
    <col  class="org-left" />
    
    <col  class="org-left" />
    </colgroup>
    <tbody>
    <tr>
    <td class="org-left">command</td>
    <td class="org-left">effect</td>
    </tr>
    
    
    <tr>
    <td class="org-left">[c</td>
    <td class="org-left">jump to previous hunk</td>
    </tr>
    
    
    <tr>
    <td class="org-left">]c</td>
    <td class="org-left">jump to next hunk</td>
    </tr>
    
    
    <tr>
    <td class="org-left">dp</td>
    <td class="org-left">shorthand for `:diffput`</td>
    </tr>
    
    
    <tr>
    <td class="org-left">:only</td>
    <td class="org-left">close all windows apart from the current one</td>
    </tr>
    
    
    <tr>
    <td class="org-left">:Gwrite[!]</td>
    <td class="org-left">write the current file to the index</td>
    </tr>
    </tbody>
    </table>
    
    The dp command normally only works in a two-way diff, as does do: the shorthand for diffget.To leave vimdiff mode, you just need to close the windows that are being compared. The quickest way to do this is to run :only from the window that you want to keep open.When you call :Gwrite from vimdiff mode, it writes the current file to the index and exits vimdiff mode.
    
    ****Show base in fugitive.vim conflict diff****
    
    By default if you use fugitive.vim's :Gdiff on a file buffer which is in conflict with git, you will get a three way diff showing HEAD, the working copy (with conflict markers), and the merge.
    
    I like to have git config merge.conflictstyle diff3 set, which includes the base (most recent common ancestor of HEAD and merge in the conflict markers.
    
    Unfortunately even with diff3 as the conflictstyle in fugitive.vim you still only get 3 panes (no base).
    
    Does anyone know how to make show it in another pane? Ideally about the working copy.
    
    The quickest way I know of is this command, issued in the conflicted buffer:
    
        :Gsdiff :1 | Gvdiff
    
    You must enter these commands as a one-liner, the effect is different when you enter them as two separate commands.
    
    The result looks like this:
    
    <!-- This HTML table template is generated by emacs 27.1 -->
    <table border="1">
      <tr>
        <td colspan="3" align="left" valign="top">
          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;common&nbsp;ancestor&nbsp;(:1)&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        </td>
      </tr>
      <tr>
        <td align="left" valign="top">
          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br />
          &nbsp;HEAD&nbsp;(:2)&nbsp;<br />
          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        </td>
        <td align="left" valign="top">
          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br />
          &nbsp;working&nbsp;copy&nbsp;<br />
          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        </td>
        <td align="left" valign="top">
          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br />
          &nbsp;merge&nbsp;(:3)&nbsp;<br />
          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        </td>
      </tr>
    </table>
    
    The stuff inside the brackets are the 'revision' specifiers that fugitive.vim understands in this context. See :h fugitive-revision for more information.
    
    ---

2.  fzf

    ****How to search faster in Vim with FZF.vim****
    
    ****FZF syntax****
    
    Let's go over syntax so we can search more efficiently. Fortunately for us, there aren't many to learn.
    
    <table border="2" cellspacing="0" cellpadding="6" rules="groups" frame="hsides">
    
    
    <colgroup>
    <col  class="org-left" />
    
    <col  class="org-left" />
    </colgroup>
    <tbody>
    <tr>
    <td class="org-left">^</td>
    <td class="org-left">prefix exact match. To search for phrase starting with "welcome", we do ^welcome.</td>
    </tr>
    
    
    <tr>
    <td class="org-left">$</td>
    <td class="org-left">suffix exact match. To search for phrase ending with "my friends", we do friends$.</td>
    </tr>
    
    
    <tr>
    <td class="org-left">'</td>
    <td class="org-left">n exact match. To search for phrase "welcome my friends", we do 'welcome my friends.</td>
    </tr>
    
    
    <tr>
    <td class="org-left">(pipe)</td>
    <td class="org-left">n "or" match. To search for either "friends" or "foes", we can use friends (pipe) foes.</td>
    </tr>
    
    
    <tr>
    <td class="org-left">!</td>
    <td class="org-left">n inverse match. To search for phrase containing "welcome" and not "friends", we can use welcome !friends</td>
    </tr>
    </tbody>
    </table>
    
    We can mix and match the above. For example, ^hello | ^welcome friends$ searches for phrase starting with either "welcome" or "hello" and ending with "friends".
    
    Side note: FZF.vim :Rg option also searches for file name in addition to the phrase. If you think this is an issue, check out this comment. I added this in my .vimrc:
    
        command! -bang -nargs=* Rg call fzf#vim#grep("rg --column --line-number --no-heading --color=always --smart-case ".shellescape(<q-args>), 1, {'options': '--delimiter : --nth 4..'}, <bang>0)
    
    With the above, every time we invoke Rg, FZF + ripgrep will not consider filename as a match in Vim.
    
    ****Replacing grep with rg****
    
    Internally, Vim has two ways to search in files: :vimgrep and :grep.
    
    :vimgrep uses vim's built-in grep and :grep uses external tool which you can reassign using 'grepprg'.
    
    For example, if we want to search for "iggy" with :grep, we can run :grep "iggy" . -R
    
    You may notice that Vim's :grep syntax is similar to terminal grep command; this is because :grep by default runs grep -n $\* /dev/null on unix-based machine.
    
    The command above will search for the string "iggy" recursively (-R) from current location (.).
    
    Vim allows us to change the program used by :grep. We can tell Vim to use ripgrep instead of grep by adding this inside our vimrc:
    
        set grepprg=rg\ --vimgrep\ --smart-case\ --follow
    
    Now when we run :grep inside Vim, it will run rg &#x2013;vimgrep &#x2013;smart-case &#x2013;follow instead.
    
    For more information about what the options above mean, check out man rg.
    
    I can now run a more succinct command :grep "iggy" instead of :grep "iggy" . -R.
    
    Vim :grep command uses quickfix to display results. We can use :copen to display quickfix window and :cclose to close quickfix window. Try it!
    
    You might wonder, "Well, this is nice but I never used :grep in Vim, plus can't we just use :Rg to find string in files? When will I ever need to use :grep?"
    
    That is a very good question. The answer to "why do we need to use grep in Vim?" is that it will let us do what I'll going to cover next: search and replace in multiple files.
    
    ****Search and replace in multiple files****
    
    Modern text editors like VSCode makes it very easy to search and replace string across multiple files. If I may confess, in the beginning when I had to search/replace string in multiple files, I used VSCode because doing it in Vim, although possible, takes too long&#x2026; until now.
    
    I will show you two different tricks to easily do search and replace phrases across multiple files in Vim.
    
    The first method is to replace ALL matching phrases in our project. We will need to use :grep. Let's say you want to replace all instance of "pizza" with "donut". Here's what you do:
    
        :grep "pizza"
        :cfdo %s/pizza/donut/g | update
    
    That's it? Yup! That's it. Let me break down the steps:
    
    1.  :grep pizza uses ripgrep to succinctly search for all instances of "pizza". By the way, this would still work even if we didn't reassign ripgrep to replace default grep. The difference is, with default grep, we would have to do :grep "pizza" . -R instead of :grep "pizza".
    2.  We run :cfdo because :grep uses quickfix and :cfdo executes any command we pass (in this case, our command is %s/pizza/donut/g) on all entries in our quickfix list. To run multiple commands, we can chain it with pipe (|). The first command we are executing is pizza-donut substitution: %s/pizza/donut/g. The second command, update, saves each file after the first is finished.
    
    Let's discuss the second way.
    
    The second method is to search and replace in select multiple files instead of all files using buffers. Here we can choose which files we want to perform select and replace.
    
    1.  Clear our buffers (:Buffers) first. Our buffers list should contain only the needed files. We can clear it with %bd | e# | bd# (or restart Vim).
    2.  Run :Files.
    3.  Select all files you want to perform search and replace on. To select multiple files, use Tab / Shift+Tab. This is only possible if we have -m in FZF<sub>DEFAULT</sub><sub>OPTS</sub>.
    4.  Run :bufdo %s/pizza/donut/g | update.
    
    Our command :bufdo %s/pizza/donut/g | update looks similar to :cfdo %s/pizza/donut/g | update. That's because they are. Instead of performing substitution on all quickfix (cfdo) entries, we perform our substitution on all buffer (bufdo) entries.

