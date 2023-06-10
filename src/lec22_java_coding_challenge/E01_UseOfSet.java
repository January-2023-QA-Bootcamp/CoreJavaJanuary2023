package lec22_java_coding_challenge;

import java.util.HashSet;
import java.util.Set;

public class E01_UseOfSet {
	
	// How to write an array
	// int [] age = new int [6];
	
	// This below 2 line is a very very important interview question. 
	// question: difference between Set and List
	// Set doesn't allow duplicate data, but List allows
	// Set doesn't follow indexing, but List follow indexing
	
	
	// Set is a member of Collection framework, where we deal with multiple data type
	Set <String> abc = new HashSet<String>();
	// type of variable use here, line 18 - is String
	// abc is the name of object
	// Here Set is an interface, that's why it needs the help of a concrete class (HashSet) to instantiate
	// Interface can't instantiate themselves

}
