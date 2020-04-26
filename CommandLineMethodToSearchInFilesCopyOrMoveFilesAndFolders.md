Command to do file search for a string in a folder (including its sub folders) in Windows :

`C:\Users\user\Desktop\FolderName>findstr /S /I /M /C:"search text" *.*`

-----------------------------------

Find files on windows modified/created after a given date using the command line

You can use PowerShell to do this :

`Get-ChildItem -Recurse | Where-Object { $_.LastWriteTime -ge "12/27/2016" }`

This also works with time: 
`{ $_.LastWriteTime -ge "12/27/2016 20:00:00" }`

-----------------------------------

Be careful before using this command. If there are files or folders in the destination folder before using this command, they will all be erased. Make sure this command is used to copy files into a new  folder only.

command to copy everything from one folder to another folder :

`ROBOCOPY sourceFolder   destinationFolder /MIR /R:0 /W:0`

`ROBOCOPY C:\Users\n123456\Desktop   C:\Users\n123456\Downloads\NewFolder /MIR /R:0 /W:0`

-----------------------------------

In Mac OSX:

A few commands that help in copying files in Mac OSX :

`cp -R "/Volumes/SIGNATURE/folder1" "/Users/explorer436/Google Drive"`

`cp -R "/Volumes/SIGNATURE/folder2" "/Users/explorer436/Google Drive"`

`cp -R "/Volumes/SIGNATURE/folder3/folder4/folder5" "/Volumes/SIGNATURE"`

To list the files and folders in a directory and to list their sizes:

`du` – displaying disk usage for a specific file, folder, directory, or whatever, is made easier to interpret with -h

`du -sh */`



While you are using cp command to copy huge folders, to find out how much data is copied, go to Applications -> Utilities -> Activity Monitor -> Disk view

And look at the process name `cp`



To copy only missing files from one folder to another, use rsync :

`rsync -av /Users/harshavardhanedupuganti/Google\ Drive/harsha_personal_stuff/  /Volumes/SIGNATURE/Google\ Drive/harsha_personal_stuff/`



`rsync -av /source-path/source-dir /destination-path`

rsync will copy only new and changed files to the new location.

It is important to understand how a trailing slash on the source argument functions. If there is a trailing slash then the contents of /source-path/source-dir will be copied to destination-path. If there is no trailing slash then source-dir itself will be copied to the destination and its contents will be another level down in the destination hierarchy.

So if you want to replicate one path to another include the trailing slash as follows:

`rsync -av /sourcepath/sourcedir/ /duplicatpath/sourcedir/`

---------------------------------------------------------------------

How to create nonexistent directories and subdirectories recursively using Bash?
mkdir -p folder/subfolder
The -p flag causes any parent directories to be created if necessary.

Is there a way to create multiple directories at once with mkdir?
mkdir takes multiple arguments, simply run
mkdir dir_1 dir_2

---------------------------------------------------------------------
