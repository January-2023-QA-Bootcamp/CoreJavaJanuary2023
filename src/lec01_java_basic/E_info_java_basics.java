package lec01_java_basic;

/*
Info Java Basics: 

1) What is a Programming language?
-- Programming language is a computer language, which contains (comprises of) a set of instructions used to produce various kinds of output (code) understood by a machine. 

2) What is Java?
-- Java is an object-oriented programming language developed by James Gosling and colleagues at Sun Microsystems in the early 1990s. Java version 1.0 was first released by Sun Microsystems in 1996. Oracle bought Java in 2008 and presently Java belongs to Oracle. Open source language.

3) What is Eclipse?
-- This is an IDE. IDE stands for Integrated Development Environment. 
-- An IDE is a collection of software (software suite) that combines (consolidates) basic tools required to write and test software.

4) How to create a Project, package and Class?

-- Project: File -- New -- Java Project -- Name starts with Upper Case.
-- Package: Expand the Project name and then select src file --> right click --> New --> select package (yellow 4 box)  --> Name starts with lowercase 
-- Class: select package --> right click --> New --> Select Class (Green circular) --> Name starts with UpperCase --> Select main method

6) What is JRE? 
-- Java Runtime Environment. Function: Help Compilation of code and run Java

7) What is a Camel case feature?  
-- When the second words start with uppercase in Class, Enum, method, constructor, interface, package, project name.
-- Camel case example for a project --> October2021CoreJava
-- Camel case example for a package --> lec01JavaBasics
-- Camel case example for a class --> NamingConventions

What is an alternative to the camel case?
-- Underscore and then start with lowercase. (snake_case)
-- Alternative example of Camel case, for a project --> October_2021_core_java 
-- Alternative example of Camel case, for a package --> lec01_java_basics
-- Alternative example of Camel case, for a class --> Naming_conventions

What is an alternative to the camel case called?
Snake case (stylized as snake_case) refers to the style of writing in which each space is replaced by an 
underscore (_) character, and the first letter of each word after underscore written in lowercase. It is a commonly used naming 
convention in computing, for example for variable and subroutine names, and for filenames. One study has found
that readers can recognize snake case values more quickly than camel case. 

8) What is the Main method?
-- Entry point for Java. 
represented by - 
public static void main(String[] args) {
}
-- The method is static

9) Who are the access modifier? ***important interview question
-- public, protected, private, default
-- To learn more:
https://www.javatpoint.com/access-modifiers#:~:text=The%20access%20modifiers%20in%20Java,types%20of%20Java%20access%20modifiers%3A&text=It%20cannot%20be%20accessed%20from%20outside%20the%20class.

10) how to print sysout by shortcut when content assist is absent?
-- Syso + ctrl + space bar 

11) How to write the main method when you forgot to select and you already set up content assist?
-- main + enter

12) What is Java_comments?
-- The Java comments are the statements that are not executed by the compiler and interpreter. The comments can be used to provide information or explanation about the variable, method, class or any statement. It can also be used to hide program code.
-- 2 types -- multiple line comments and single line comment
-- In multiple line comments, It is not necessary that you must have to write multiple lines. If you put single slash + start, then star + single slash, then this format is used for multiple line comments.
 -- In single line comment, a single line is used for commenting
-- How to create a single line comment?
-- for Windows user: we use control + / 
-- for Mac user: we use command + /

13) What is the current version of Java? ****
--> 20 (update accordingly)

14) What is the most stable version of Java? ****
--> 1.8 and 1.11

15) What is the advantage of using Java 1.8 or 1.11?
--> It has compatibility with other applications.

16) What is the command to check the Java version?*****
--> command: java -version

17) What is the command to check the Git version?*****
--> command: git --version

18) Write some names of IDEs other than Eclipse. ****
-- IntelliJ IDEA, WebStorm (for Javascript), PyCharm (for python), Visual Studio Code, Atom etc.

19) How to copy a line to the next line?
  -- alt (option in Mac) + Control/Command + down/up arrow

20) How to Enable Dark Themes in Eclipse IDE? (already done on your laptop)

For Mac:
Eclipse  -- Preferences -- General -- Appearance (double click)  -- Theme -- Choose (Dark) -- Apply -- Apply and Close 

For Windows:
Window  -- Preferences -- General -- Appearance (double click)  -- Theme -- Choose (Dark) -- Apply -- Apply and Close 

21) Describe print vs println?
-- println -- do the print line by line
--print -- not print line by line, connected with the next print output. we can make it readable by putting a space at the end of the first line.

22) What is the keyword represented inside System.out.println()?
-- System is a class, out is a property, println() is a method.

23) How to rename a class or package?
-- Select the class -- right click -- refactor -- rename -- (change name) -- finish -- finish
-- Never ever try to rename project Name. Rename class/Enum/Abstract class, Interface or package

24) How to copy a class or package?
-- select the class, control/command+c, then control/command+v -- ok, rename it -- ok. it will be pasted inside the same package.

25) How to refactor/rename?
-- right click on Class/package, select refactor, then rename, change it accordingly. Please don't change the Project name.

26) How to copy a package and paste in a project?
-- 3 way
i) right click on package -- select copy -- go to src -- paste
ii) select package -- control/command+c -- go to src --- control/command+v
iii) select the package -- drag it -- drop it to the src

27) how to delete a class or package?
- right click and then select delete

28) How to copy a class and paste in a package?
-- 3 way
i) right click on class -- select copy -- go to package -- paste
ii) select class -- control/command+c -- go to package --- control/command+v
iii) select the class -- drag it -- drop it to the package

29) How to drag and drop a class from one package to another?
--select the class -- drag it -- drop it to the package

30) camel case vs alternative of camel case which is using underscore
-- both is ok, follow one style which you are comfortable with

*/

public class E_info_java_basics {

}
