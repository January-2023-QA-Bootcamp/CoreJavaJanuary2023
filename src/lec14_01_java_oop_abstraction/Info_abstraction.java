package lec14_01_java_oop_abstraction;

/*

1) What is Java?
-- Java is an object-oriented programming(OOP) language.

2) Write down the OOP features.
-- Abstraction, Inheritance, Encapsulation and Polymorphism are the features of Java OOP.

3) What is Interface?
-- Interface is a Blueprint of Class. 
-- Interface cannot be instantiated (cannot create object)
-- An interface is a collection of methods that are defined but not implemented. 
-- Contains only abstract methods.
-- Abstract method can not be implemented, can be defined  (declared) only
-- *Contains default and static method only which are non abstract(exception)

4) What is Abstract class?
-- An abstract class is a super class that cannot be instantiated (can't create objects).
-- Contains both abstract and non abstract methods.
-- Abstract method can not be implemented, can be defined only
-- Non abstract methods can be implemented, but can not be defined.

5) What is a class in Java?
-- Class is a blueprint from which individual objects are created.
-- Contains only non abstract methods, doesn't contain abstract methods.
-- Methods only implemented but can't be declared.
-- implements and extends keyword is used for inheritance

6) Which keyword is used by a regular class to inherit a regular class or abstract class?
-- extends keyword

7) Which keyword is used by an abstract class to inherit a regular class or abstract class?
-- extends keyword

8) How many regular classes or abstract classes are inherited by a regular or abstract class by extends keyword?
-- Only one

9) How many interfaces are inherited by a regular or abstract class by extends keyword?
-- Zero

10) How many methods are declared inside a regular class?
-- Zero

11) Can methods be implemented in Interface? What type of methods are implemented inside Interface?
-- Yes, default and static type.

12) Which keyword is used by an Interface to inherit a regular class or abstract class?
-- an Interface cannot inherit a regular class or abstract class

13) How many regular or abstract classes are inherited by interface by extends keywords?
-- Zero

14) How many Interfaces are inherited by an interface by extends keywords?
-- More than one

15) From which version JAVA implemented static and default type methods in interface?
-- 1.8

16) default and static methods used in interface are abstract or non-abstract?
-- non-abstract

17) Is it mandatory to use the 'abstract' keyword in the abstract method of Interface?
-- No.

18) Is it mandatory to use the 'abstract' keyword in the abstract method of Abstract class?
-- Yes.

19)  Are all the declared methods in Interface abstract in nature?
-- Yes.

20) Method can be either implemented or declared in an abstract class?
-- False

21)  Are all the declared methods in Abstract class abstract in nature?
-- Yes.

22) Can we use implements keyword for inheritance in Interface?
-- No

23) Can we use implements keyword in abstract class?
-- Yes

24) Why do we use the implements keyword in abstract class?
--  to inherit Interface

25) How many interfaces can be inherited in an abstract class by implements keyword?
-- More than one

26) Can an abstract class inherit a regular class or an abstract class by implements keyword?
-- No, we use the extends keyword for them.

27) Can we use the implements keyword in a regular class?
-- Yes

28) Why do we use the implements keyword in a regular class?
--  to inherit Interface

29) How many interfaces can be inherited in a regular class by implements keyword?
-- More than one

30) Can a regular class inherit a regular or abstract class by implements keyword?
-- No, we use the extends keyword for them.

31) When can we get @Override annotation?
-- When a regular class extends an abstract class or implements an interface, then the methods which are abstract, are implemented in the regular class by @Override annotation.

32) Is it better to remove @Override annotation as no use of it?
-- No, please don't remove @Override, because a programmer understands that this method comes from somewhere else, not a method of this class.

33) What is the other name of the Abstract method?
-- unimplemented method

34) What is the other name of the Implemented method?
-- non-abstract method

35) Is it mandatory to use extends keyword when we use implements keyword in abstract class and regular class to inherit interface?
-- No, we can use implements keyword without using extends keyword.

36) What is a concrete class?
-- when A regular class extends one regular class or abstract class and implements multiple interfaces, that regular class is called concrete class.

37) An abstract can be a concrete class?
-- No and never

38) Can an object initialize (or call) a static method?
-- No

39) Who can call a static method?
-- Directly by Class/Interface/Abstract class without creating objects. Static methods don't need an object to call.

40) Can an Interface or Abstract class be instantiated?
-- No

41) How can an Interface or an Abstract class be instantiated?
-- By the help of a concrete class.

42) Can an Abstract class contain a static method?
-- Yes

43) Can an Abstract class contain variables?
-- Yes

44) Can an Abstract class contain a parameterized method or constructor?
-- Yes

45) Default methods are only allowed in Interface?
-- True

46) A regular class extends Abstract class implements Interface. can a regular class directly (without creating an object) call a static method from Them?
-- Not from Interface, but from Abstract class.

 * */

public class Info_abstraction {

}
