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

------------------------------------------
Issue with copying/pasting to/from system clipboard?

Be aware that copying/pasting from the system clipboard will not work if :echo has('clipboard') returns 0. In this case, vim is not compiled with the +clipboard feature and you'll have to install a different version or recompile it. Some linux distros supply a minimal vim installation by default, but generally if you install the vim-gtk or vim-gtk3 package you can get the extra features.

------------------------------------------
"Hello" is in the "a" register
"world" is in the "b" register

How can I quickly type "Hello world"?