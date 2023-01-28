package lec10_02_java_date_and_time;

import java.time.LocalDate;

public class A_displayCurrentDate {

	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);

	}

}
