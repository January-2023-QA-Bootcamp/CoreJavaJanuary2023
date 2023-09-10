package lec24_java_coding_challenge;

public class D09_SwapString {
	public static void main(String[] args) {
        String x = "Framework";
        String y = "Automation";
        System.out.println("Before swapping");
        System.out.println("Value of x: "+x);
        System.out.println("Value of y: "+y);

        //append x and y
        //x=x+y;
        //store initial String x in the place of String y
        //y=x.substring(0, x.length()-y.length());
        //store initial String y in the place of String x
        //x=x.substring(y.length());
        x.substring(0,5);
        System.out.println("After swapping");
        System.out.println("Value of x: "+x);
        System.out.println("Value of y: "+y);
    }

}
