------------------------------------------

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

------------------------------------------
