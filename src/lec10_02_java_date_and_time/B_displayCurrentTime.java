package lec10_02_java_date_and_time;

import java.time.LocalTime;

public class B_displayCurrentTime {

	public static void main(String[] args) {
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);

	}

}
