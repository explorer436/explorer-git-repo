In Linux, the system vimrc file is in /etc (if we want to change vim settings, it is a good idea to not mess with the system vimrc)
(Do all the customizations to user vimrc which is located at /home/user/.vimrc)
If it is not already available, create it manually.
The plugins also go into the ".vim" directory located here : /home/user/.vim

For a clean start : 
To remove the .vim directory, open terminal and run this : rm -rf ~/.vim
To remove the .vimrc file, open terminal and run this : rm ~/.vimrc

To create and edit our .vimrc, open terminal and run this : vim ~/.vimrc

After making changes to the .vimrc file, if we want to make them effective immediately (called sourcing them), :source % (from within vim)
After making changes to the list of plugins in the .vimrc file, if we want to make them effective immediately, :PlugInstall (from within vim)

Look at the githut repo for the plugin manager "plug" for details about installing it : https://github.com/junegunn/vim-plug 


(we can copy paste everything starting from the line below.)

"------------------------------

" custom settings for the netrw file/directory menu...

	let g:netrw_liststyle = 3            " what does this do?
	
	let g:netrw_browse_split = 3            " what does this do?
	
	let g:netrw_banner = 0            " what does this do?
	
	let g:netrw_winsize = 25            " what does this do?
	
	let g:netrw_bufsettings = 'noma nomod nu nobl nowrap ro'            " what does this do?
	
"------------------------------	

	syntax on              " color syntax on wherever it is applicable

	set nocompatible        " Use Vim defaults (much better!)
	
	set bs=indent,eol,start         " allow backspacing over everything in insert mode
	
	"set ai                 " always set autoindenting on
	
	"set backup             " keep a backup file
	
	set viminfo='20,\"50    " read/write a .viminfo file, don't store more than 50 lines of registers
	
	set history=50          " keep 50 lines of command line history
	
	set ruler               " show the cursor position all the time

	"set guicursor=           " what does this do?
	
	"set noshowmatch          " what does this do?
	
	set relativenumber        " shows relative line numbers
	
	"set number               " shows line numbers - we are not going to use this because we are going to use relative line numbers.
	
	set hlsearch            " what does this do?
	
	set nohlsearch            " what does this do?
	
	"set hidden            " what does this do?
	
	"set noerrorbells            " what does this do?
	
	set tabstop=4 softtabstop=4            " what does this do?
	
	set shiftwidth=4            " every time we hit tab, it shifts the characters by 4 spaces instead of 8.
	
	"set expandtab            " what does this do?
	
	set smartindent            " what does this do?
	
	"set nowrap            " what does this do?
	
	set ignorecase            " what does this do?
	
	"set smartcase            " what does this do?
	
	"set noswapfile            " what does this do?
	
	"set nobackup            " what does this do?
	
	"set undodir=~/.vim/undodir            " what does this do?
	
	"set undofile            " what does this do?
	
	set incsearch            " turns on incremental search
	
	"set termguicolors            " what does this do?
	
	"set scrolloff=8            " what does this do?

	"set cmdheight=2            " Give more space for displaying messages. 
	
	"set updatetime=50            " Having longer updatetime (default is 4000 ms = 4 s) leads to noticeable delays and poor user experience.
	
	"set shortmess+=c            " Don't pass messages to |ins-completion-menu|.

	set colorcolumn=80            " shows a line at the 80 column of the page
	
	highlight ColorColumn ctermbg=0 guibg=lightgrey            " the color that needs to be used for the 80 column line


"------------------------------

	"set spell               " to turn spell checking on
	
	"set spelllang=en_us  " to use US English  for spell checking

"------------------------------

set tags=./tags;/         " This will look in the current directory for "tags", and work up the tree towards root until one is found. In other words, you can be anywhere in your source tree instead of just the root of it.
