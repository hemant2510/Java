package com.date;

import java.time.LocalDate;
import java.time.Period;

public class Date3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Period period= Period.between(LocalDate.now(), LocalDate.of(2020, 2, 29));
		System.out.println(period);
	}

}
