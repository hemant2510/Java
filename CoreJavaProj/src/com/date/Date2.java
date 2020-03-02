package com.date;

import java.time.*;

public class Date2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duration duration= Duration.between(LocalTime.now(), LocalTime.NOON);
		if(duration.toHours()<24) {
			duration=duration.plusHours(24);
		}
		System.out.println(duration);
	}

}
