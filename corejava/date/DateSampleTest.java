package com.corejava.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateSampleTest {

	public static void main(String[] args) {
	
		Date date=new Date();
		System.out.println(date);
		LocalDate localdate=LocalDate.now();
		System.out.println(localdate.getDayOfYear());
		System.out.println(localdate);
		LocalTime localtime=LocalTime.now();
		System.out.println(localtime);
		LocalDateTime locDandT=LocalDateTime.now();
		System.out.println(locDandT);
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		System.out.println(dtf.format(locDandT));
		DateTimeFormatter dtf1=DateTimeFormatter.BASIC_ISO_DATE;
		System.out.println(dtf1.format(locDandT));
		DateTimeFormatter dtf2=DateTimeFormatter.ISO_LOCAL_TIME;
		System.out.println(dtf2.format(localtime));
	}
}