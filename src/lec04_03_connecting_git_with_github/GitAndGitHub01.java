package lec04_03_connecting_git_with_github;

/*
Git and Github:

For Windows User: 
1) Download git bash https://git-scm.com/downloads (already done, go to line 28)
2) Follow next to every step and install the git in your local device.
3) Open git bash and put the command: git --version
4) If you see the version, download is complete. 



For Mac User: (already done, go to line 28)
1) Go to homebrew: https://brew.sh and copy the link (see below image). Paste it in terminal.
2) After downloading homebrew, give the below command to the terminal.
3) brew install git
4) Then put the command: git --version
5) If you see the version, download is complete. 

How to create Repository in Github:

Sign in to github, 
create a repository by clicking +sign, 
keep it public, 
submit. 
A remote https://xxxxxxxxxx will be created.
Go to Terminal (for Mac), GitBash (for Windows) or Command Prompt (for Windows)
Follow the steps below

Linux and git command used to connect your local repository to the github and publish your code to github: 

Configuration of your git bash (for windows user) or terminal (for mac user). If you don't do it here, the system will ask you for them at the end.

7) Configure User Name: git config --global user.name "Your user Name"
8) Configure User Email: git config --global user.email "Your email"
9) Check User Name: git config user.name (use command of line 32 to get both info together)
10) Check User Email: git config user.email (use command of line 32 to get both info together)
11) To see both: git config --list


Necessary command to create a repository

12) Present working directory: pwd
13) List: ls, (for command prompt: dir)
14) Changing directory to the eclipse-workspace: cd eclipse-workspace 
(don't work for command prompt) You don't need to write the complete command. 
Type ec, then press tab button, then type -wo, then press tab button.
16) List (to see the content of eclipse-workspace): ls, (for command prompt: dir)
17) Choose which project you want to publish in Github. 
-- (don't work for command prompt) Type Ho, then press tab button: cd HomeWorkCoreJavaJune2021
18) Git Initialization in local repository: git init
19) Check the status (Should be Untracked condition)
20) git status
21) To add all of the content of selected project (To commit all/ To staged all) : git add .
22) Check the status (Should be in Staged condition): git status
23) To commit: git commit -m "07052021 8:31pm"
24) Check the status (Should be Tracked condition): git status
25) To check remote repository: git remote -v
26) To move the local repository to the remote origin: git remote add origin "htttps://xxxxxxxxxxxxxxxxxxxxxx"
27: To push the local repository to the remote origin: git push -u origin master


For windows people. Mac doesnot have this problem.
If you see below errors follow the url for solution --

error: src refspec master does not match any.
error: failed to push some refs to 'http://stash.company.com/scm/PROJECT/REPO.git'
https://confluence.atlassian.com/bitbucketserverkb/src-refspec-master-does-not-match-any-error-when-pushing-to-repository-788727186.html

Create the first commit inside of the repository and then it can be pushed. For example, the following with create an initial commit and push it to the server.

touch initial

git add initial

git commit -m "initial commit"

git push -u origin master


The commands used after first set up (If you open the terminal/git bash from the beginning). Bring changes in code for a new push.

28) Changing directory to the eclipse-workspace: cd eclipse-workspace
29) Choose which project you want to publish in Github: cd HomeWorkCoreJavaJune2021
30) To add all of the content of selected project: git add .
31) To commit: git commit -m "07052021 8:31pm"
32) To push the local repository to the remote origin: git push origin master



The commands used after first set up (If you are still in the terminal/git bash and in HomeWorkCoreJavaJune2021). Bring changes in code for a new push.

33) To add all of the content of selected project: git add .
34) To commit: git commit -m "07052021 8:31pm"
35) To push the local repository to the remote origin: git push origin master


*/
public class GitAndGitHub01 {

}
