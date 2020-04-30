https://vim.fandom.com/wiki/Quick_tips_for_using_tab_pages
https://vim.fandom.com/wiki/Using_tab_pages

-------------------------------------------------------------------------------------
(this is the general method to update multiple java files at once)

If you want to open all files matching the pattern in subfolders - :args **/*.java

To replace four white spaces in java files with a tab use this - :bufdo exexute "%s/    /(press tab)/g" | update

1. :bufdo execute "%s/(press tab){/{/g" | update
1. :bufdo execute "global/^{/normal -gJ" | update
1. :bufdo execute "%s/){/) {/g" | update

-------------------------------------------------------------------------------------
How do I move an existing window to a new tab?

Is there a way to take an existing window (split) and put it into a new tab?

Ctrl W followed by T

-------------------------------------------------------------------------------------
 Opening a tab 
 
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
