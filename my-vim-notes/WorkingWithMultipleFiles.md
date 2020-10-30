https://vim.fandom.com/wiki/Quick_tips_for_using_tab_pages
https://vim.fandom.com/wiki/Using_tab_pages
http://vimdoc.sourceforge.net/htmldoc/tabpage.html

-------------------------------------------------------------------------------------

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
			  + tabpage.txt ~
			    ex_docmd.c ~
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

-------------------------------------------------------------------------------------

 Open question - how to move buffers from one tab to another or into split windows when wanted?
 It may not be such a great idea to work on multiple windows in a given tab, unless there is a need for it.
 Always prefer to work only on one buffer in a tab because that will give maximum visibility into the open buffer.
 If there is a need to work on another file/buffer at the same time, put it in a separate tab.
 For now, just go to the tab that you want to open split windows in and use :vsp to split it and open the file that you want to view as a split window.

-------------------------------------------------------------------------------------

How to open buffers in tabs from netrw
Open it in a window and move it into a tab using Cntrl W T

How do I move an existing window to a new tab?

Is there a way to take an existing window (split) and put it into a new tab?  Ctrl W followed by T

-------------------------------------------------------------------------------------
 
 Opening a tab with an empty buffer : 
 
 To create a new file in a new tab : tabnew
 
 This will open a new tab with an empty buffer.  
 
-------------------------------------------------------------------------------------
 
 Switching between tabs in Vim:  
 
1. Go to the next tab :gt 
1. Go to the previous tab: gT 
1. Go to a numbered tab: nnn gt 
 
-------------------------------------------------------------------------------------  

Some more tab tips :

~ :tabe <file> to edit file in a new tab
~ :tabc to close
~ :tabn, :tabp (or gt, gT to switch) 
~ probably want to map these for easier navigation (if gt, gT are too difficult)

-------------------------------------------------------------------------------------  

How do I change the current split's width and height?

There are several window commands that allow you to do this:

Ctrl+W +/-: increase/decrease height (ex. 20<C-w>+)
Ctrl+W >/<: increase/decrease width (ex. 30<C-w><)
Ctrl+W _: set height (ex. 50<C-w>_)
Ctrl+W |: set width (ex. 50<C-w>|)
Ctrl+W =: equalize width and height of all windows
See also: :help CTRL-W

-------------------------------------------------------------------------------------  

(this is the general method to update multiple java files at once)

If you want to open all files matching the pattern in subfolders - :args **/*.java

To replace four white spaces in java files with a tab use this - :bufdo exexute "%s/    /(press tab)/g" | update

1. :bufdo execute "%s/(press tab){/{/g" | update
1. :bufdo execute "global/^{/normal -gJ" | update
1. :bufdo execute "%s/){/) {/g" | update

-------------------------------------------------------------------------------------

