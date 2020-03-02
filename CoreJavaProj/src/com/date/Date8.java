package com.date;

import static java.time.temporal.TemporalAdjusters.next;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Date8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate currentLocalDate=LocalDate.of(2019, 1, 1);
		int year=currentLocalDate.getYear();
		int month=currentLocalDate.getMonthValue(),month_new=month;
		int count=-1,count_new=0;
		while(year==currentLocalDate.getYear()) {
			while(month_new==month) {
				//System.out.println(month_new);
				LocalDate nextSunday = currentLocalDate.with(next(DayOfWeek.SUNDAY));
				currentLocalDate=nextSunday;
				count++;
				month_new=currentLocalDate.getMonthValue();	
				//System.out.println(nextSunday+" "+currentLocalDate);
				}
			//System.out.println(count);
			if(count>=5) {
				System.out.println(currentLocalDate.getMonth());
				count_new++;
			}
			count=0;
			month=month_new;
		}
		System.out.println("Month Count - "+count_new);
	}

}
