1. Installed emacs using homebrew. The command used is brew install --cask emacs
2. Tried to launch it using the icon in "Applications"
3. Saw this error "Emacs can’t be opened because Apple cannot check it for malicious software."
4. Had to run this to get it installed with Apple's Gatekeeper disabled. "brew reinstall --cask emacs --no-quarantine"
5. Was able to launch emacs successfully
