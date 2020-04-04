
Let Vim do the typing
---------------------

by George Brocklehurst (@georgebrock)

I work for thoughtbot

Presented at Vim London, 17th March 2015 and The New York Vim Meetup, 9th April 2015

Even if you're good at it, typing is still slower and more error-prone than not typing. This presentation will explore a few ways to avoid typing by getting Vim to do the typing for you.

Vi, or Emacs?
-------------

As modal editors, Vi and Vim tend to avoid modifier keys in favour of modes. The behaviour of a key stoke is dictated by the editor's mode. This is different from Emacs-like editors, where behaviour is modified by pressing modifier keys instead of changing mode.

Everything in this presentation uses modifier keys in insert mode: the commands might feel more like Emacs commands than Vim commands, but they are useful, and have their place in the Vim editing philosophy.

Vim users like to be efficient, and part of that efficiency is making changes as atomic edits. An atomic edit can be repeated (using .) or undone (using u). A single insert updates the . register, making the inserted text readily available. Sometimes, when we're inserting text that includes something Vim's already seen – either because it's in one of our files, a symbol in our program, or something from one of our registers – it's more efficient not to change mode, and to reach for a modifier key instead.

A few of my favourite things
----------------------------

**Insert text from a register**

`ctrl+r`
  
**Last inserted text**

`ctrl+a`

There are three common cases where we want to insert something Vim's already seen as part of a larger insert:

1. Insert from a register, using ctrl+rregister.
1. Insert the same text as the previous insert, using ctrl+a. This is similar to ctrl+r..
1. Complete a partially-typed word or phrase, which will be the focus of this presentation.

Completion
----------

**Simple word completion**

`ctrl+p`

or

`ctrl+n`

* `ctrl+p` finds the previous matching completion for the partially typed word.

* `ctrl+n` finds the next matching completion for the partially typed word.

* `ctrl+p` is usually more useful, because you're more likely to be looking for a word you just used than a word you're about to use.

* Where Vim looks for completions is controlled by the complete setting. The default is .,w,b,u,t,i, which means Vim will look in:
        
		1. The current buffer.
		2. Buffers in other windows.
		3. Other loaded buffers.
		4. Unloaded buffers.
		5. Tags.
		6. Included files.

  I also like to add kspell to the end of the list:

		7. The active spell checking dictionary, when spell checking is enabled.

**Tag completion**


`ctrl+xctrl+]`

Sometimes, you know that the word you want to complete isn't just any old word that appears in your file or files; you know you're trying to complete a symbol from your program.

If you're using ctags(1) then you can complete a word in your tags file using `ctrl+xctrl+]`.

The initial `ctrl+x` puts Vim into a completion mode, which is a sub-mode of insert mode. We'll see this prefix again.

When the completion menu appears, you can use `ctrl+p` and `ctrl+n` to navigate through the options.

**Filename completion**

`ctrl+xctrl+f`

Filename completion will complete paths relative to the current working directory, similar to tab completion in Unix shells.

**Context-aware word completion**

`ctrl+xctrl+p`

or

`ctrl+xctrl+n`

Repeat the command to continue adding matches, e.g. in a document that contained the string Hello world, you could type `Helctrl+xctrl+p` to complete `Hello`, and then immediately repeating `ctrl+xctrl+p` would add world.

At any point, if there are multiple possible matches, you can use `ctrl+p` and `ctrl+n` to navigate through the options.

Context-aware line completion
-------------------------------

`ctrl+xctrl+l`

As with word completion, you can repeat the command to continue adding matches.

Language-aware completion
-------------------------

`ctrl+xctrl+o`

If you have Vim's filetype plugins enables, you will have access to omnicomplete for some languages. This completion style will complete language keywords and built in classes or functions.

For example, in a Ruby file, typing "Hello world".capctrl+xctrl+o would complete to "Hello world".capitalize or "Hello world".capitalize!.

**Any questions?**

Ask now, or later: @georgebrock on Twitter or email george@thoughtbot.com

I work for thoughtbot

These slides: georgebrock.github.io/talks/vim-completion
