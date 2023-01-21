package lec07_01_java_different_type_of_class;

/*

1) Who are members of the Wrapper class?
-- Byte, Short, Integer, Long, Float, Double, Character, Boolean --- They are class, not variable type -- Called Wrapper class
-- String is not a Wrapper class, simply because there is no parallel primitive type that it wraps. 
-- A string is a representation of a char sequence but not necessarily a 'wrapper'.

2) What does the Wrapper class do?
-- Byte, Short, Integer, Long, Float, Double are subclasses (child) of the abstract class 'Number'. 
-- The object of the wrapper class contains or wraps its respective primitive data type. 
-- (this line, no need) Converting primitive data types into objects is called boxing, and this is taken care of by the compiler.
-- String, Character, Boolean are subclasses (child) of the class 'Object'. We don't need to import java.lang.Object

3) What is the formula to convert - a String type variable to int type variable?
-- Integer.parseInt(name)

4) What is the below outcome under the main method?
System.out.println(20 + 25 + "100" + " " + 20 + 10 + (10 + 10) + 5 + 6);
-- 45100 20102056

5) Why do 20+25 become 45 but not 20+10 become 30, after "100"?
-- Java compiler first recognize 2 int and consider them for Java Arithmetic addition, 
-- but when the String type "100" comes for addition, int and String can't do addition.
-- so, 20 and 10 can't be added after the String type.

6) Can we convert a String type variable to an int type variable when a non-pure number (example: "100W") is present ?
-- No. Shows NumberFormatException 

7) What is the formula to convert - a String type variable to double type variable or a String type variable to float type variable?
-- Double.parseDouble(name)
-- Float.parseFloat(name)

8) What does the Character.toLowerCase('M') do?
-- Convert an uppercase Character to a lower case.

9) What does the Character.toUpperCase('w') do?
-- Convert a lowercase Character to an upper case.

10) What is the below outcome under the main method?
System.out.println(2.5 + 2.5 + "3.15" + "  " + (1.25 + 1.25) + 0.5 + 1.0 + (2.0 + 3.0)); 
-- 5.03.15 2.50.51.05.0

11) What is the formula to convert - a String type variable to a boolean type variable?
-- Boolean.parseBoolean(usCitizen) (is it correct?)

12) If you convert an Empty String to a boolean type, what would be the outcome as boolean?
-- false

13) What is the formula to convert - a int type variable to a String type variable?
-- String.valueOf(int i)

14) What is the formula to convert - a float/double type variable (age) to a String type variable?
-- String.valueOf(float f)
-- String.valueOf(double d)

15) What is the below outcome under the main method?
System.out.println(10 + 20 + "30" + "  " + 280); 
-- 3030 280
 */
public class Info_of_wrapper_class {

}
