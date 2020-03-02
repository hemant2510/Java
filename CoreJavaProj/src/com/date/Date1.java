package com.date;

import java.time.*;

public class Date1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate localDate= LocalDate.now();
		LocalDate dayAfter15Days = localDate.plusDays(15);
		System.out.println(dayAfter15Days);
	}

}
