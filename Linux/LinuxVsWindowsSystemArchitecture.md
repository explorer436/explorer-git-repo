Is Linux really better than Windows in terms of system architecture?

Chris Johnson · Updated June 1, 2019 Around 20 years experience with Windows (since 3.1), OS X, Linux and BSD

This is one of those fundamental questions every deveolper, technician and IT specialists will always stumble across.

So, where to begin…

I think, the really most important point here is the detail of your question, asking for a comparison, which is better.

What we need to take into account is the fact, that we simply can't measure something like “better” objectively. It's the same, as we can't measure objectively something like “customer satisfaction" or which meal “tastes better”. This is always subjective.

On the contrary, measuring which car is faster, which house is taller or which number is greater, is (nearly) always perfectly objective, as it is measurable.

So we could try to extract some details and focus on them, to evaluate the technical comparison. And therefore, it is maybe ok to say, in a perspective focusing on some special technical details, an OS is “better" than another.

Some points, where Linux is superior to Windows, due to it's system architecture:

Kernel architecture overall

The Linux kernel is a strongly modularized monolithic kernel, which means, all necessary components are compiled into the kernel, but every component can also be separated into it’s own module. This makes Linux one of the most flexible operating systems, as it is portable onto a really wide range of hardware (by removing or adding modules as needed).

Also, due to it’s GPLv2 license, everyone is able to work on the kernel, modify and improve it. Thus, a wide variety of people from all over the world are contributing to the kernel, making it better and pushing changes really fast.

The Windows NT kernel is a hybrid kernel with a closed source.

Device drivers

Linux device drivers are compiled into the kernel or loaded dynamically into the kernel as modules. Linux follows the Unix philosophy, as everything is a file. Therefore, the communication between devices and the kernel drivers is realized with files or, to be much more precise, with byte streams.

Windows device drivers are handled separately through Windows Driver Models. The driver communication runs through some IO manager between the different layers.

Graphical desktop managers

Due to it’s architecture, Linux enables the possibility to run any graphical desktop manager on top of the kernel, like GNOME, KDE (Plasma), Xfce, Wayland, Unity, MATE, Cinnamon, and so on…. That’s one of the reasons why there are so many different Linux distributions with completely different graphical desktop environments.

Windows sticks to its own proprietary Window Desktop Manager which can’t be changed.

File system hierarchy

Linux uses the FHS (Filesystem Hierarchy Standard) of Unix like operating systems. Thus, every Linux system has the same file system layout which is heavily utilized by all processes on Linux. This standard means, there is a defined place for every tool, software, file, package, etc. You’ll find all files, where they should be.

E.g. all binary files with the system’s basic commands are located in /bin. All binary files you install by yourself should be located in /usr/local/bin, if you or the installer of your software package follows the standards. /dev holds all the device files. etc…

This improves overall structure and maintainability, as files/applications/packages in specific locations are never touched by a systems update/upgrade process.

On Windows, there is a basic system structure found in \Windows, where Windows itself is installed, subdivided into \System, \System32, and so on. Then, we have \Program Files, where applications are installed into.

And a few other generic folders.

The problem on Windows is that it follows no standard and therefore it is very normal that software installations tend to spread over the complete file system structure after some time of usage. A lot of software packages install their own structures under e.g. c:\own-software-package-folder\… (supposing, c: is the most common device path). When running installations, doing updates, or changing some files in some folders, you have to use system administration privileges, because those paths are protected by the Windows execution policy.

Also (as I have seen uncountable times in my life), users tend to create their own structures in places, where they shouldn’t. Like personal folders under c:\, etc.

On Linux, your personal stuff is in /home. Period.

Updates/Upgrades

Linux uses its own, distributions related, software repositories. Those hold whole system updates (for all core packages) and every other proven software package. Thus, packages in the official distro repositories are mostly tested and proven by the communities and developers for each distribution (which doesn’t mean those packages never break something).

Also, every Linux distro has its package management software, like RPM, dpkg, Pacman, …. and also different frontends for those, like DNF, Yum, YaST, APT, etc.

This combination is a rock solid system for installing, updating, and removing software packages from every repository. It is fast, secure, and transparent to every user and stable. You can revert every change, inspect every package, and much more. Also, system updates can and will be pushed in short intervals.

Windows uses its enclosed updating system, where all updates are pushed from some central Windows update servers. It is absolutely nontransparent, slow, and faulty. You have to rely on Microsoft in every aspect.

Any other software not related to the Windows system itself, comes with its own installer which isn’t tested by a wide community which is always a potential risk. Also, those installers often ship malware or absolutely unwanted software like scamware (toolbars, etc.).

This is a very short overview of topics related to the system architecture of Linux and Windows. There are really much more things to be written down here (especially in much more technical details) as I just scratched the surface of this topic, but I think this would make my post explode and I, by myself, don’t like those never-ending postings.

I have to admit that I am a Linux/Unix person and therefore, I am biased in my opinion and points of view. Therefore, my statements seem very pro Linux, which they actually are. But regarding your question, I think this is something which is OK in this context here, as you asked for what makes Linux better.

Please consider that it remains a very subjective topic in terms of discussions, as we humans do judge. In just technical terms, something like “What makes Linux a completely different OS than Windows, in terms of system architecture” would be a much more precise question.

—

EDIT:

I would like to add one thing to my answer, as I believe this is important in relation to your questions origin.

In terms of a good system architecture, it is an absolutely good sign if the system is actually used in production!

In the end, this is what matters.

And this is the point here. When really a lot of smart and intelligent people evaluated the operation of an OS for very challenging systems, partly focused on high security features, then there is a good chance that the amount of subjective evaluations sums up to a kind of common objective evaluation.

In other words: If 1 out of 1 persons states, the meal tastes terrible, then this is a non significant objective evaluation. If 99 out of 100 persons state that the meal tastes terrible, then there is an absolutely significant high chance that those subjective evaluations sum up to something considered an objective evaluation.

Going back to Linux and Windows, it is a very good sign of the systems architecture quality if a system is chosen to run for important tasks, important missions, etc. And here, it is Linux which is chosen over and over again. Linux runs on highly mission/task critical systems like on NASA computers/servers, on Mainframes, on supercomputer clusters, on aircraft systems, on banking servers, and so on.

Windows, excluded from Microsoft’s own technical infrastructure, is nearly never chosen for any critical systems. Windows runs mostly on systems which serve a “normal” purpose. Those are systems like bus or train station information displays, banking terminals, some pay machines, inventory machines, etc.

But to be fair:

Even Linux is often outpaced by operating systems, which are much more stable, robust, fault tolerant and maintainable (even if Linux does count in those characteristics). Those are sometimes partly built upon the Linux kernel but mostly those are real Unix or BSD derivates or completely individual developments like VxWorks, Rodos, z/OS (in general RTOS - Real Time Operating Systems).

