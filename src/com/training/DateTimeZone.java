package com.training;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.Temporal;
import java.util.Set;
import java.util.TreeSet;

public class DateTimeZone {
	public static void main(String...arg) {
		try {
		LocalDate dt = LocalDate.now();
		LocalTime tm=LocalTime.now();
		@SuppressWarnings("unused")
		Instant j=Instant.now();
		Temporal i= Instant.now();
		LocalDateTime ldt=LocalDateTime.now(ZoneId.from(i));
		System.out.println("Date : "+dt);
		System.out.println("\nTime : "+tm);
		System.out.println("\nInstant : "+i);
		System.out.println("\nDate & Time : "+ldt+"\n\n\n");
		Set <String>st=ZoneId.getAvailableZoneIds();
		Set<String> tsZoneId=new TreeSet<>(st);
		tsZoneId.forEach(System.out::println);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
