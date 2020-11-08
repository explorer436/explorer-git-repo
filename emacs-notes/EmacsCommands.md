Page down : C-v
Page up   : M-v
Move the line under the cursor to the top, middle or bottom : C-l
                Cp
	Cb<-----|-----Cf
                Cn
Word forward and backward : M-f and M-b
Go to the beginning and ending of the line : C-a and C-e
Go to the beginning and ending of the sentence : M-a and M-e

Switching between buffers:	C-x b and C-x C-b
Using the mark and the point
to set the region:	C-SPC
Killing (cutting) and yanking (pasting):	C-w, C-k, C-y, M-y
Searching forwards and backwards:	C-s, C-r
Invoking commands by name:	M-x
Undo:	C-/
Cancelling half-entered commands:	C-g
Getting help on editing modes,keybindings and commands:	C-h m, C-h k, C-h f, C-h a(just remember C-h and read the prompt in the minibuffer)
Quitting Emacs:	C-x C-c
C-h i : The info directory
C-x k : kill buffer

M-x customize
If anything goes wrong with the customizations, delete the ".emacs" file in the home directory and start from scratch again.

Visiting (opening) files:	C-x C-f (This puts us in Emac's dired mode - directory editor)
Saving files:	 C-x C-s
Refresh the listing in dired mode : g

Hints for operating on paragraphs: C-h i -> emacs -> Text -> Paragraphs
    Select the entire paragraph : M-h
    Move to the beginning of the paragraph : M-{
    Move to the end of the paragraph : M-}

Hints for operating on sentences: C-h i -> emacs -> Text -> Sentences
    ‘M-a’ : Move back to the beginning of the sentence (‘backward-sentence’).
    ‘M-e’ : Move forward to the end of the sentence (‘forward-sentence’).
    ‘M-k’ : Kill forward to the end of the sentence (‘kill-sentence’).
    ‘C-x <DEL>’ : Kill back to the beginning of the sentence (‘backward-kill-sentence’).

What is the difference between a sentence and a line?