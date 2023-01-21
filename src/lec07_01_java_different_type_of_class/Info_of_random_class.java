package lec07_01_java_different_type_of_class;

/*
What is Java Random Class?
-- Random class is part of java.util package.
-- An instance of the Java Random class is used to generate random numbers. 
-- This class provides several methods to generate random numbers of type int, double, long, float etc. (no need to read below)
-- Random number generation algorithm works on the seed value. If not provided, seed value is created from system nano time.
-- If two Random instances have the same seed value, then they will generate the same sequence of random numbers.
-- Java Random class is thread-safe, however in a multi-threaded environment it's advised to use java.util.concurrent.ThreadLocalRandom class.
-- Random class instances are not suitable for security sensitive applications, better to use java.security.SecureRandom in those cases.

 */

public class Info_of_random_class {

}
