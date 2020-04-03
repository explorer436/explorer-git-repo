https://andrew.stwrt.ca/posts/vim-ctags/

---------------------------------------------------------------------------------------------------
CTAGS : 

To install ctags in centos:
1) Find the package you want to install
    $ yum list *ctags*
2) Install package
    $ yum install <packagename>

How to generate tags and use them for navigation in a big java project?
Go to the root folder of the project and execute this command : ctags -R

The next step is to get the full path of this tags file - in Linux, use the readlink utility to get the full path.
[n0281526@VDDP14P-4UCXMSH renters-api-sb2]$ readlink -f tags
/home/n0281526/Downloads/GitRepositories/renters-api-sb2/tags

open a file in the root folder of the project and run this command from within vim (use semi-colon and then type it)
set tags=./tags;/
(It starts with a tags file in the current directory and goes up to the root directory.)

---------------------------------------------------------------------------------------------------
One line that always goes in my .vimrc:
set tags=./tags;/
This will look in the current directory for "tags", and work up the tree towards root until one is found. IOW, you can be anywhere in your source tree instead of just the root of it.

---------------------------------------------------------------------------------------------------
Ctrl+] - go to definition
Ctrl+T - Jump back from the definition.
Ctrl+W Ctrl+] - Open the definition in a horizontal split

Add these lines in vimrc
map <C-\> :tab split<CR>:exec("tag ".expand("<cword>"))<CR>
map <A-]> :vsp <CR>:exec("tag ".expand("<cword>"))<CR>

Ctrl+\ - Open the definition in a new tab
Alt+] - Open the definition in a vertical split

After the tags are generated. You can use the following keys to tag into and tag out of functions:

Ctrl+Left MouseClick - Go to definition
Ctrl+Right MouseClick - Jump back from definition

---------------------------------------------------------------------------------------------------
