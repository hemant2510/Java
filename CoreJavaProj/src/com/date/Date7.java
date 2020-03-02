package com.date;
import java.time.*;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

import static java.time.temporal.TemporalAdjusters.*;

class Date7{

	public static void main(String[] args) {
		LocalDate currentLocalDate=LocalDate.now();
		int year=currentLocalDate.getYear();
		currentLocalDate=LocalDate.parse(year+"-01-01");
		int count=0;
		while(year==currentLocalDate.getYear()) {
		LocalDate nextSunday = currentLocalDate.with(next(DayOfWeek.SUNDAY));
		currentLocalDate=nextSunday;
		count++;
		}
		count=count-1;
		System.out.println(count);
	}
}
