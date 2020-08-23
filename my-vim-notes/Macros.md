Recording a macro is a great way to perform a one-time task, or to get things done quickly when you don't want to mess with Vim script or mappings, or if you do not yet know how to do it more elegantly. 

Recording a macro

	Each register is identified by a letter a to z. To enter a macro, type: q<letter><commands>q
	
	To execute the macro <number> times (once by default), type: <number>@<letter>
	
	So, the complete process looks like:
	* qd 	start recording to register d
	* ... 	your complex series of commands
	* q 	stop recording
	* @d 	execute your macro
	* @@ 	execute your macro again 

----------------------------

In Vim, how do we apply a macro to a set of lines?

Use the normal command in Ex mode to execute the macro on multiple/all lines:

Execute the macro stored in register a on lines 5 through 10.
:5,10norm! @a

Execute the macro stored in register a on lines 5 through the end of the file.
:5,$norm! @a

Execute the macro stored in register a on all lines.
:%norm! @a

Execute the macro store in register a on all lines matching pattern.
Use global to run the macro 'a' on all lines that contain 'pattern'
:g/pattern/norm! @a (:g/pattern/normal! @a)

To execute the macro on visually selected lines, press V and the j or k until the desired region is selected. Then type :norm! @a and observe the that following input line is shown.
:'<,'>norm! @a
Enter :help normal in vim to read more.
For help, check: :help global.
