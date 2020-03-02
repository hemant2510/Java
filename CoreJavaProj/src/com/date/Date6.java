package com.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.*;

public class Date6 {

	public static void main(String[] args) {
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss");
		LocalDate date2=LocalDate.of(2020, 3, 10);
		LocalTime time=LocalTime.of(10, 15, 25);
		LocalDateTime date1=LocalDateTime.of(date2, time);
		String  formattedDate1= date1.format(dtf);
		System.out.println(formattedDate1);
	}

}
