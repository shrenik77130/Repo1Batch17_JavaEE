package com.shrenik;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class MainApp {

	public static void main(String[] args) {
		LocalDateTime currentTime = LocalDateTime.now();
		System.out.println("Current Date and Time = " + currentTime);
		
		
		LocalDate dt = currentTime.toLocalDate();
		System.out.println("Date = " + dt);
		
		// getMonth()
		System.out.println("Month = " + currentTime.getMonth());
		
		// getDayOfMonth()
		System.out.println("Day = " + currentTime.getDayOfMonth());
		
		//getSecond()
		System.out.println("Seconds = " + currentTime.getSecond());
		
		
		//with() methods
		LocalDateTime dateObject = currentTime.withDayOfMonth(7).withYear(2020);
		System.out.println("Another Date = "+ dateObject);
		
		//of() methods
		LocalDate customDate = LocalDate.of(2020, Month.JULY, 21);
		System.out.println("Custom Date = " + customDate);
		
		String dob = "2003-12-01";
		LocalDate dobObj = LocalDate.parse(dob);
		System.out.println("String dob = " + dob + "\t dobObj = " + dobObj);
		
		String t = "20:19:45";
		LocalTime timeObj = LocalTime.parse(t);
		System.out.println("Local Time Object = " + timeObj);
		
		
		ZonedDateTime zdt = ZonedDateTime.parse("2020-07-28T18:15:30+05:30[Asia/Calcutta]");
		
		System.out.println("Zoned Date = " + zdt);

		//of() method for Europe/Paris  -> ZoneId.of("Europe/Paris");  
		
		ZoneId idForEurope = ZoneId.of("Europe/Paris");
		System.out.println(" idForEurope = " + idForEurope);
		
		ZoneId currentZone = ZoneId.systemDefault();
		System.out.println("Default Time Zone = " + currentZone);
		
	}

}
