package com.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Date5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DateTimeFormatter format1=DateTimeFormatter.ofPattern("d. MMMM yyyy", Locale.FRENCH);
		LocalDate date=LocalDate.of(2020,9,13);
		String formattedDate=date.format(format1);
		System.out.println(formattedDate);
	}

}
