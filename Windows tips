
Hi all, the C drive in one of my VDE slices seems to be running out of memory. 
It came with 50 GB initially and now it has just about 100MB memory available in it. 
I freed up some space by uninstalling some of the programs I was not using all that often and that freed up about 1 GB of space in the C drive but all that free space quickly got filled up by some processes running in the background. 
I submitted a request for 'clean up C drive' but that seems to have failed - twice. 
I cannot do anything with that slice because of the lack of available memory. 
I requested a new slice but I am trying to understand what it is that went wrong with it. 
Did any of you see this happen in the past?


Download WizTree on your slice, it'll tell you where all of your space is being used up.

By using this tool, after determining that 'C:\Windows\ccmcache' is the folder taking up all the space,

The ccmcache folder is used by System Center Configuration Manager (SCCM) client. This is where files downloaded by SCCM are stored. SCCM is an enterprise software management system used in many Windows environment, and provides operating system and software deployment services, remote management, reporting services, etc. You will typically only find this folder on systems in a managed enterprise environment.
SCCM caches files used for software deployment in the ccmcache folder. This may include software packages which are automatically installed on your machine, some types of software updates, etc. Files are not automatically removed from the ccmcache folder after they are used, but they are marked as being eligible for deletion. You should not manually delete files in this folder as you may accidentally delete something which has not been used yet. You should definitely not remove the folder altogether, as this would break SCCM and you would cease to automatically receive software packages from your network administrator.
You should be able to reduce the size of this folder using the ConfigMgr Control Panel. This will require local administrator privileges. To do this:
Open "Configuration Manager Properties" in the control panel. You may need to change the control panel to "icon view" instead of "category view".
Go to the "cache" tab
Click "Configure Settings" and acknowledge the UAC Prompt if prompted
The "Delete Files" button should become available. Click this button to clear files. It will automatically keep any files which should not be deleted.

=================================================================================

Mouse Issues in Windows : 
If you want to change it to a larger one :
Control Panel -> Large icons -> Mouse -> Pointers -> Normal Select -> Browse -> aero_arrow.cur (or any other one that you like)
Control Panel -> Large icons -> Mouse -> Pointers -> Text Select -> Browse -> aero_arrow.cur (or any other one that you like)
