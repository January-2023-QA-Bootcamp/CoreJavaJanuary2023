package lec10_02_java_date_and_time;

import java.time.LocalDateTime;

public class C_displayCurrentDateAndTime {

	public static void main(String[] args) {
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);

	}

}
