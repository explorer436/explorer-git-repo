How to : always show line numbers in netrw:
Always show netrw : even when a file is opened in a new tab

--------------------------------------------

The file explorer is just another Vim buffer, so you can navigate up and down with k and j keys, or jump to the bottom with G, etc. If it is a large file listing, you may be quicker finding your target by searching for it.

There are a handful of useful commands for opening the file explorer - either in the current window or a split, focusing on the project root, or the directory of the most recent file edited. This table summarizes:
lazy 	mnemonic 	open file explorer
:e. 	:edit . 	at current working directory
:sp. 	:split . 	in split at current working directory
:vs. 	:vsplit . 	in vertical split at current working directory
:E 	:Explore 	at directory of current file
:Se 	:Sexplore 	in split at directory of current file
:Vex 	:Vexplore 	in vertical split at directory of current file

Manipulating the filesystem

The file explorer includes commands for creating new files and directories, as well as renaming or deleting existing ones. This table summarizes these:
command 	action
% 	create a new file
d 	create a new directory
R 	rename the file/directory under the cursor
D 	Delete the file/directory under the cursor
Further Reading

    :help netrw
    :help :edit
    :help :Explore
    :help netrw-% - create new file
    :help netrw-d - create new directory
    :help netrw-R - renaming files or directories
    :help netrw-D - deleting files or directories


--------------------------------------------

netrw:
Vim documentation: pi_netrw
http://vimdoc.sourceforge.net/htmldoc/pi_netrw.html#netrw

--------------------------------------------

Invoking netrw can be achieved in three ways
    :Explore (:E) - opens netrw in the current window
    :Sexplore (:Sex) - opens netrw in a horizontal split
    :Vexplore (:Vex) - opens netrw in a vertical split
    :Texplore (:Tex) - opens netrw in a new tab (use Cntrl PgUp, Cntrl PgDn to switch between tabs)
    
--------------------------------------------

Changing the directory view in netrw
With the directory browser open hit i to cycle through the view types. There are four different view types: thin, long, wide and tree. A preferred view type can be made permanent by setting it in a .vimrc file.

let g:netrw_liststyle = 3

--------------------------------------------

Removing the banner
The directory banner is mostly useless. To remove it temporarily press I. To remove it permanently add the following to your .vimrc.

let g:netrw_banner = 0

--------------------------------------------

Changing how files are opened
By default files will be opened in the same window as the netrw directory browser. To change this behaviour the netrw_browse_split option may be set. The options are as follows
    1 - open files in a new horizontal split
    2 - open files in a new vertical split
    3 - open files in a new tab
    4 - open in previous window
To make the selection permanent add the following to your .vimrc.

let g:netrw_browse_split = 1

--------------------------------------------

Set the width of the directory explorer
The width of the directory explorer can be fixed with the netrw_browse_split option. The following sets the width to 25% of the page.

let g:netrw_winsize = 25

--------------------------------------------

NERDtree like setup
If NERDtree is your thing netrw can give you a similar experience with the following settings

let g:netrw_banner = 0
let g:netrw_liststyle = 3
let g:netrw_browse_split = 4
let g:netrw_altv = 1
let g:netrw_winsize = 25
augroup ProjectDrawer
  autocmd!
  autocmd VimEnter * :Vexplore
augroup END

--------------------------------------------

Vim also supports arbitrary commands to be run following !. For a quick directory listing the following works...  :! ls -lF
For a more complex command other commands like ack, grep or find can be used.

--------------------------------------------

There are a number of ways to open files in vim and if that is what you use netrw for. 

Using find within vim can open files and supports tab completion.
:find path/to/file.txt

To open a file in a vertical split use the following. This also supports tab completion.
:vs path/to/file.txt

To open a file in a horizontal split use the following. This also supports tab completion.
:sp path/to/file.txt

To open a file in a new tab use the following. This also supports tab completion.
:tabnew path/to/file.txt

--------------------------------------------

How do I configure .vimrc so that line numbers display in netrw in Vim?

I'm using netrw to read directory listings in Vim, and I would like to display line numbers in my netrw tabs (so I can use :24 to navigate through directory listings faster). I'm using "set number" in my vimrc to enable line numbers when editing files, but this does not display line numbers in netrw.

When in netrw, if I type the command ":set number", the line numbers display, but as soon as I change directories the line numbers go away.

Is there a configuration option I can put in .vimrc that will make line numbers show up in netrw windows?


From autoload/netrw.vim in the runtime:

call s:NetrwInit("g:netrw_bufsettings" , "noma nomod nonu nobl nowrap ro")

s:NetrwInit overrides a variable only if it is not defined.

Therefore put let g:netrw_bufsettings = 'noma nomod nu nobl nowrap ro' in your vimrc and it should work. 

--------------------------------------------
