package lec17_02_string_manipulation;

// Not important, better if you know the methods

public class UseOfStringBuffer {

	public static void main(String[] args) {
		System.out.println(" ------------------------------------------------------------------------");
		String e = new String("Good Evening"); // or
		String s = "Good Morning"; // String also doesn't need to be instantiated
		System.out.println(s);
		System.out.println(s.toUpperCase());
		System.out.println(s); // because String Immutable
		
		System.out.println("\n ------------------------------------------------------------------------\n");
		StringBuffer sb1 = new StringBuffer("Hello"); // It creates a String Buffer with the specified string.
		System.out.println(sb1);
		System.out.println(sb1.append(" World!")); // The append() method concatenates the given argument with this String at the end
		System.out.println(sb1); // because StringBuffer Mutable
		
		// The insert() method inserts the given String with this string at the given position.	
		System.out.println("\n ------------------------------------------------------------------------\n");
		StringBuffer sb2 = new StringBuffer("Wee to Java");
		System.out.println(sb2);
		sb2.insert(2, "lcom");
		System.out.println(sb2);

		// The replace() method replaces the given String from the specified beginIndex and endIndex-1.
		// Replace() also present in String
		System.out.println("\n ------------------------------------------------------------------------\n");
		StringBuffer sb3 = new StringBuffer("Welcomi oo Javascript");
		System.out.println(sb3);
		sb3.replace(6, 10, "e to");
		System.out.println(sb3);
		
		// The delete() method of the StringBuffer class deletes the String from the
		// specified beginIndex to endIndex, but excluded
		System.out.println("\n ------------------------------------------------------------------------\n");
		sb1.delete(0, 6); // sb = Hello World!
		System.out.println(sb1); // outcome: World!
		
		// The reverse() method of the StringBuilder class reverses the current String.
		System.out.println("\n ------------------------------------------------------------------------\n");
		sb1.reverse(); // now sb = World!
		System.out.println(sb1);// prints !dlroW
		
		// The capacity() method of the StringBuffer class returns the current capacity of the buffer. The default capacity of the buffer is 16.
		// interview question: by default the capacity is 16, for next formula: (16*2)+2=34 i.e (old capacity*2)+2
		System.out.println("\n ------------------------------------------------------------------------\n");
		StringBuffer sb4 = new StringBuffer();
		System.out.println(sb4.capacity()); // by default the capacity is 16
		sb4.append("Hello! ");
		System.out.println(sb4.capacity()); // by default the capacity 16 fit here
		sb4.append("Java is a popular language");
		System.out.println(sb4.capacity()); // formula: (16*2)+2=34 i.e (old capacity*2)+2
		
		// The ensureCapacity() method of StringBuilder class ensures that the given
		// capacity is the minimum to the current capacity.	
		sb4.ensureCapacity(10); // if we fix a value the capacity is generally that, like demand 10
		System.out.println(sb4.capacity()); // in this case, sb4 already holding 34, although the ensure capacity is 10, but it will not work
		sb4.ensureCapacity(50); // like demand 50, then the system evaluate how many capacity is present
		System.out.println(sb4.capacity());// i.e (old capacity*2)+2 = 70
		
		/*
		 Ensures that the capacity is at least equal to the specified minimum.If the current capacity is less than the argument, then a new internal array is allocated with greater capacity. The new capacity is the larger of: 
		The minimumCapacity argument. 
		Twice the old capacity, plus 2. 
		If the minimumCapacity argument is non positive, this method takes no action and simply returns.Note that subsequent operations on this object can reduce the actual capacity below that requested here.	 
		 */	
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
