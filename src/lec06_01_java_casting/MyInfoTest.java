package lec06_01_java_casting;

public class MyInfoTest {
	public static void main(String[] args) {
		// default Constructor in initialized
		MyInfo myInfo1 = new MyInfo(); 
		// parameterized Constructor Initialized
		// you will not use it for coding, just extra information
		// In Constructor, the system can't recognize byte and short type, so we need to do casting for that
		MyInfo myInfo2 = new MyInfo("Alex P", (byte)28, (short)32445, 3268723, 76472638746322l, 1.567f, 3.6779, 'M', true);
	}

}
