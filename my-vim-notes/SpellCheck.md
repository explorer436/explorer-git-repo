To turn  it off `:set nospell`

Using Spellchecking:

To move to a misspelled word, use `]s` (the next misspelled word) and `[s` (the previous misspelled word).

Once the cursor is on the word, use z=, and Vim will suggest a list of alternatives that it thinks may be correct. If the list does not contain the word we are looking for, dismiss it with `Esc`

What if Vim is wrong, and the word is correct? 
zg - Add the current word to Vim's spell file. 
zw - Remove the current word from Vim's spell file.
zug - Revert zg or zw command for the current word.

Usually, this is where the spell file will be :
~/.vim/spell/en.utf-8.add

How to use it from insert modes?
Ctrl x - Ctrl s
Vim scans backward from the cursor position, stopping when it finds a mis-spelt word. It then builds a word list from suggested corrections and presents them in an autocomplete pop-up menu.
