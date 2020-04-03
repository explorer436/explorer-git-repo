------------------------------------------------------------
WORD MANIPULATION:

Quickly change word or line : To quickly change a word you can use cw,caw (change a word) or ciw (change in word). Use c$ or just C to quickly change from the cursor to the end of a line, cc to change an entire line, or cis (change in sentense) for a sentence

To append something to a word (at the end of the word) - ea

To delete a word along with the whitespace after the word - dw (vw to select in visual mode)
To delete a word but not the the whitespace after the word - de (ve to select in visual mode)

------------------------------------------------------------
TEXT SELECTION :

If you want to do the same thing to a collection of lines, like cut, copy, sort, or format, you first need to select the text. Get out of insert mode, hit one of the options below, and then move up or down a few lines. You should see the selected text highlighted.

V       - selects entire lines 
v       - selects range of text
ctrl-v  - selects columns
gv      - reselect block

After selecting the text, try d to cut/delete, or y to copy, or :s/match/replace/, or :center, or !sort, or...
Move to cursor where you would like to paste.
Press P to paste before the cursor, or p to paste after.

------------------------------------------------------------
TEXT NAVIGATION :

first and last non blank characters in a line : ^ and g_
first and last characters in a line : 0 and $

-----------------------------------------
SEARCH AND REPLACE :

How do I convert all occurrences of ABC to XYZ in a file using the vi/vim editor?  :1,$s/ABC/XYZ/g   and then press [Enter]. This vi command replaces every occurrence of ABC with XYZ on every line, and even when there are multiple occurrences on a line.  Note that in this example, the "g" character at the end of the command means "global". If you don't use this "g" the tab character will only be replaced the first time it is seen on a line, but if you add the "g" at the end of the command every tab character in each line will be replaced.

/ : Search
*/# : Search forward/back for word under cursor

:%s/search_for_this/replace_with_this/    - search whole file and replace
:%s/search_for_this/replace_with_this/c   - confirm each replace
To convert each tab in the file to four spaces : 1,$s/\t/    /g
How to replace all tabs with spaces :%s/\t/    /g

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
*               - search for word currently under cursor
g*              - search for partial word under cursor (repeat with n)
ctrl-o, ctrl-i  - go through jump locations
[I              - show lines with matching word under cursor

-----------------------------------------------------------
:g/<pattern>/j to join lines within a pattern
To join the subsequent line with a line containing a certain text: :g/.*__text.*/j

-----------------------------------------------------------
Join two lines with a pattern ending on one line and a pattern beginning on the subsequent line - 
%s/{\_s.*__text/{__text/g
This looks for lines ending with "{" and a next line starting with the text (a wildcard) "__text" and joins them into a single line.

-----------------------------------------------------------
Replace each "' }," in the current file by a new line - :%s/' ,/',\r/g 

-----------------------------------------------------------
This searches for lines ending with "{" and a subsequent line starting with "__prefix" - {\_$\_s*__prefix
This searches for lines ending with "'," and a subsequent line starting with "__text" - ',\_$\_s*__text
This searches for lines ending with "'," and a subsequent line starting with "__text" and joins the two lines together - %s/',\_$\_s*__text/',__text/g
This searches for lines ending with "{" and a subsequent line starting with "__prefix" and joins the two lines together - %s/{\_$\_s*__prefix/{__prefix\g
Record a macro in register a and play it on a pattern match - :g/.*__prefix.*__text.* },\_$/normal! @a

-----------------------------------------------------------
How to mix global command and replace command : :g/pattern_to_match/ s/text_to_search/text_to_replace/gc
Using the above command or variants of it, we can search for patterns in the entire file and do replace operations on those specific lines.
