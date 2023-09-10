package lec24_java_coding_challenge;

public class D08_SwapString1 {
	public static void main(String[] args) {
        String a = "Selenium";
        String b = "Java";
        System.out.println("Before swapping");
        System.out.println("Value of a: "+a);
        System.out.println("Value of b: "+b);

        //append a and b
        a=a+b;
        //store initial String a in the place of String b
        b=a.substring(0, a.length()-b.length());
        //store initial String b in the place of String a
        a=a.substring(b.length());

        System.out.println("After swapping");
        System.out.println("Value of a: "+a);
        System.out.println("Value of b: "+b);
    }

}
