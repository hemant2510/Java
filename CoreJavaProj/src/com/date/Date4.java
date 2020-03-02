package com.date;

import java.time.LocalTime;
import java.time.ZoneId;

public class Date4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ZoneId zone1=ZoneId.of("Europe/Rome");
		System.out.println("Time in Rome - "+LocalTime.now(zone1));
		ZoneId zone2=ZoneId.of("Africa/Cairo");
		System.out.println("Time in Cairo - "+LocalTime.now(zone2));
		
	}

}
