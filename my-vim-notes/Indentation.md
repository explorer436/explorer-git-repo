INDENTATION :     
```
    Example line
        This is part of the parsed line
        Thats goes one
    End of line
```

How to remove all spaces in front of these lines? The final text should be:
Example line
This is part of the parsed line
Thats goes one
End of line

Answer : To format a line to the left I use :left. Use this format an entire file :%le

--------------------------------------------


How to insert white spaces before a line?
Here's one way to move selected text over a few spaces:

 - select a chunk of code using capital V and the arrow keys (or j, k)
 - type colon
 - then type s/^/   /
 - hit return

What you've done is replace the beginning of each selected line (the ^ symbol means "the beginning of the line") with spaces. 

--------------------------------------------
