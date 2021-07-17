* Vim for Java?

--------------------

I use vim exclusively as a professional developer working on a pretty large Java project (a few hundred thousand lines of Java in hundreds of classes in several submodules). It's overall very smooth for me, the only real thing I miss is better debugging, but I generally make do with the somewhat useless jdb and sometimes vebugger.

Going vanilla will work pretty well in combination with the commandline, but if you're working on something larger here are a few plugins I suggest for Java in particular:

1. ctrlp - fuzzy file finder, huge quality of life over going :e <path> with all the classes in separate files in separate directories (packages) you need in Java

1. syntastic - set up to do javac and checkstyle this is very nice to have in vim to get a list of warnings/errors on save

1. javacomplete2 in combination with supertab - I don't really use it much, I already type fast enough to render it mostly obsolete as a time-saving device and have little problems remembering things, but it can be helpful if you don't remember the names of that one method or to get a quick look at the method prototype of things; edited to add: oh yeah, it does generation of constructors and accessors as well, that I don't use, but what I do use regularly is the import functionality, which really works very well (e.g. <leader>jii will add an import for whatever is at the cursor, <leader>jR will remove unused imports, etc)

1. vebugger - it doesn't work consistently for me, I suspect partially because of the separation of our codebase into a few git submodules and jars and what-not, haven't really looked into it but when it works it's certainly much nicer than plain jdb

--------------------

https://spacevim.org/use-vim-as-a-java-ide/

--------------------

* Tips for using Vim as a Java IDE?

--------------------

I've been a Vim user for years. I'm starting to find myself starting up Eclipse occasionally (using the vi plugin, which, I have to say, has a variety of issues). The main reason is that Java builds take quite a while...and they are just getting slower and slower with the addition of highly componentized build-frameworks like maven. So validating your changes tends to take quite a while, which for me seems to often lead to stacking up a bunch of compile issues I have to resolve later, and filtering through the commit messages takes a while.

When I get too big of a queue of compile issues, I fire up Eclipse. It lets me make cake-work of the changes. It's slow, brutal to use, and not nearly as nice of an editor as Vim is (I've been using Vim for nearly a decade, so it's second nature to me). I find for precision editing—needing to fix a specific bug, needing to refactor some specific bit of logic, or something else...I simply can't be as efficient at editing in Eclipse as I can in Vim.

Also a tip:

:set path=**
:chdir your/project/root
This makes ^wf on a classname a very nice feature for navigating a large project.

So anyway, the skinny is, when I need to add a lot of new code, Vim seems to slow me down simply due to the time spent chasing down compilation issues and similar stuff. When I need to find and edit specific sources, though, Eclipse feels like a sledge hammer. I'm still waiting for the magical IDE for Vim. There's been three major attempts I know of. There's a pure viml IDE-type plugin which adds a lot of features but seems impossible to use. There's eclim, which I've had a lot of trouble with. And there's a plugin for Eclipse which actually embeds Vim. The last one seems the most promising for real serious Java EE work, but it doesn't seem to work very well or really integrate all of Eclipse's features with the embedded Vim.

Things like add a missing import with a keystroke, hilight code with typing issues, etc, seems to be invaluable from your IDE when working on a large Java project.

--------------------

1. How do I invoke a maven task without leaving vi?

Maven is no different than any other shell command:

:!mvn

You can :set makeprg=mvn if you already have a favourite key mapping for :make.

1. Can I get code completion?

Yes, eclim is great, a bridge between vim's editing efficiency and Eclipse's Java language-specific awareness.

<C-n> and <C-p> are not-so-great, but amazingly helpful.

1. How's the syntax highlighting?

More than good enough for a regex-based highligher.

You may want to consider tools for other vim+java purposes, like code templates (snippetEmu—default snippets suck, but customizability shines), searching for usages and going to declarations (eclim, grep, ctags), generating getters and setters (java_getset, or eclim), automatic imports (eclim). You might also need a java shell for quick experiments (the BeanShell, a.k.a. bsh).

--------------------

https://github.com/sentientmachine/erics_vim_syntax_and_color_highlighting

--------------------

https://www.techrepublic.com/article/configure-vi-for-java-application-development/

--------------------

https://github.com/artur-shaik/vim-javacomplete2

--------------------
