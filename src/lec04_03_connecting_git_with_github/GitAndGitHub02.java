package lec04_03_connecting_git_with_github;

/*
Git and Github:

What are Git and GitHub?**
Git is known as a "distributed" version control system because you can run it locally while disconnecting from the Internet, and then "push" your changes to a remote system whenever you like. 
GitHub is a web-based service for version control using Git. Basically, it is a social networking site for developers.

Write the command to check if java exists and its version in your machine.
 java -version

What version of java are we using currently?
1.8

Write down the command to change to a directory?
cd
         
Write down the command to go back to the previous steps/directory?
cd ..

Write down the command to make a directory.
mkdir

Write down the command to see a list of items in a directory in Windows and Unix OS. 
ls

What is git merge and how do you merge?

-- Merging is Git's way of putting a forked history back together again. The git merge command lets you take the independent lines of development created by git branch and integrate them into a single branch. 

How to remove remote origins that already exist?

-- You can type git remote -v to see the List of all currently configured remote repositories. Then type git remote rm origin to remove origin that already exists.

What is the Unix command to copy a file?
-- cp

What is the Unix command to change the permission of a file?
-- chmod

Write a few basic git commands you used? ****** 
git --version          // to see the version.
git config --global user.name " "                  // to input user name.
git config --global user.email " "             // to input user email.
git config --list              // to see the user info.
pwd                  // present working directory
ls                        // list
cd                   // changing directory
git init                // to initial or create a repository.
git status             // to see the status.
git add .                  // to add all the required file.
cd ..                     //going back to previous directory
cd ../                  //going back double to previous directory

git add filename                               //Moves changes from the working directory to the staging area. This gives you the opportunity to prepare a snapshot before committing it to the official history.
git Commit -m "message"                 //  Takes the staged snapshot and commits it to the project history. Combined with git add, this defines the basic workflow for all Git users.
git clone give the link                     //Creates a copy of an existing Git repository. Cloning is the most common way for developers to obtain a working copy of a central repository.
git commit -m "Commit message"         //Commit changes to head (but not yet to the remote repository). repaeted
git commit -a                                     //Commit any files you've added with git add, and also commit any files you've changed since then.

git remote add origin "the link here"
git remote rm origin                             // to remove origin repositpry
git push origin master                          //Send changes to the master branch of your remote repository.
git remote -v                                        //List all currently configured remote repositories.
git branch                                            //This command is your general-purpose branch administration tool. It lets you create isolated development environments within a single repository.
git checkout shafi                                   //In addition to checking out old commits and old file revisions, git checkout is also the means to navigate existing branches. Combined with the basic Git commands, it�s a way to work on a particular line of development.

git checkout -b shafi                              //Create a new branch name shafi and switch to it.
git branch -d shafi                                  //to delete branch named shafi
git fetch                                              //The git fetch command downloads commits, files, and refs from a remote repository into your local repo. Fetching is what you do when you want to see what everybody else has been working on. ... When downloading content from a remote repo, git pull and git fetch commands are available to accomplish the task.     
git stash                                             //The "git stash" command can help you to (temporarily but safely) store your uncommitted local changes - and leave you with a clean working copy.
git merge -- merge a branch with master or main
git clean -f

clear/quit/exit





*/

public class GitAndGitHub02 {

}
