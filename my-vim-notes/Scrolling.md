------------------------------------------------

Moving the cursor gracefully :

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

------------------------------------------------

SCROLLING : 

How to scroll up and down through a page gracefully?


Vim full page up, full page down, half page up and half page down keystrokes:
[Control][b] - Move back one full screen
[Control][f] - Move forward one full screen
Half-page navigations
[Control][u] - Move up (back ) 1/2 screen
[Control][d] - Move down (forward) 1/2 screen
One-line movements:
[Control][E] - move the page up by one line
[Control][Y] - move the page down by one line
I lose visual context every time for the former two, so I have developed the bad habit of hitting the latter (Ctrl-Y and Ctrl-E) repetitively. 

    Ctrl-y Moves screen up one line
    Ctrl-e Moves screen down one line
    Ctrl-u Moves cursor & screen up ½ page
    Ctrl-d Moves cursor & screen down ½ page
    Ctrl-b Moves screen up one page, cursor to last line
    Ctrl-f Moves screen down one page, cursor to first line

Ctrl-y and Ctrl-e only change the cursor position if it would be moved off screen.

To leave the cursor in the same column when you use Ctrl+D, Ctrl+F, Ctrl+B, Ctrl+U, G, H, M, L, gg
you should define the following option:
:set nostartofline

-----------------------------------------------------------

Move the page using these commands:

    zt - move current line to the top of the screen
    zz - move current line to the middle of the screen (Careful with zz, if you happen to have Caps Lock on accidentally, you will save and exit vim!)
    zb - move current line to the bottom of the screen
-----------------------------------------------------------

:N : Go to line N
N% : Go to the line N percent through the file
N| : Go to column N

-----------------------------------------------------------
