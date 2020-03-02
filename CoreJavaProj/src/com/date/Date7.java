package com.date;
import java.time.*;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

import static java.time.temporal.TemporalAdjusters.*;

class Date7{

	public static void main(String[] args) {
		LocalDate currentLocalDate=LocalDate.of(2020, 1, 1);
		int year=currentLocalDate.getYear();
		int count=0;
		while(year==currentLocalDate.getYear()) {
		LocalDate nextSunday = currentLocalDate.with(next(DayOfWeek.SUNDAY));
		currentLocalDate=nextSunday;
		count++;
		System.out.println(nextSunday+" "+currentLocalDate);
		}
		count=count-1;
		System.out.println(count);
	}
}
