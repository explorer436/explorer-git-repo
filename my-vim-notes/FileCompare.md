Comparing two files in Vim

Open the side by side view:
Ctrl+w v

Change between them:
Ctrl+w h or l

Checkout the vimdiff command, part of the vim package, if you want a diff-like view:
(from terminal)
vimdiff file1.txt file2.txt

------------------------------

Or just open the first file in VIM, then 
:vert diffsplit ./file2 (if file2 is in the same folder as file1)
(or)
:vert diffsplit file2

:vert makes it split the screen vertically.
diffsplit does a diff, and splits the files and scrolls locks them.
