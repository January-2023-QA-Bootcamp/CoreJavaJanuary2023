package lec17_02_string_manipulation;

public class UseOfStringBuilder {

	public static void main(String[] args) {
		// The StringBuilder append() method concatenates the given argument with this String.
		System.out.println(" ------------------------------------------------------------------------\n");
		StringBuilder sb = new StringBuilder("Hello ");
		// The append() method concatenates the given argument with this String at the end
		sb.append(" World!");
		System.out.println(sb);
		
		// The StringBuilder insert() method inserts the given string with this string at the given position.	
		System.out.println("\n ------------------------------------------------------------------------\n");
		StringBuilder sb2 = new StringBuilder("Wee to Java");
		sb2.insert(2, "lcom");
		System.out.println(sb2);

		// The StringBuilder replace() method replaces the given string from the
		// specified beginIndex and endIndex.
		System.out.println("\n------------------------------------------------------------------------\n");
		StringBuilder sb3 = new StringBuilder("Welcomi oo Javascript");
		sb3.replace(6, 10, "e to"); // replace start from 6, the upper boundary is 10 and excluded
		System.out.println(sb3);

		// The delete() method of StringBuilder class deletes the string from the
		// specified beginIndex to endIndex.
		System.out.println("\n------------------------------------------------------------------------\n");
		sb.delete(0, 6); // sb = Hello World!
		System.out.println(sb); // outcome: World!

		// The reverse() method of StringBuilder class reverses the current string.
		System.out.println("\n------------------------------------------------------------------------\n");
		sb.reverse(); // now sb = World!
		System.out.println(sb);// prints !dlroW

		// The capacity() method of StringBuilder class returns the current capacity of
		// the Builder. The default capacity of the Builder is 16.
		System.out.println("\n------------------------------------------------------------------------\n");
		StringBuilder sb4 = new StringBuilder();
		System.out.println(sb4.capacity());// default 16
		sb4.append("Hello");
		System.out.println(sb4.capacity());// now 16
		sb4.append("Java is my favourite language");
		System.out.println(sb4.capacity());// now (16*2)+2=34 i.e (oldcapacity*2)+2

		// The ensureCapacity() method of StringBuilder class ensures that the given
		// capacity is the minimum to the current capacity.	
		System.out.println("\n------------------------------------------------------------------------\n");
		sb4.ensureCapacity(10);// now no change
		System.out.println(sb4.capacity());// now 34
		sb4.ensureCapacity(50);
		System.out.println(sb4.capacity()); // now (34*2)+2

	}

}
