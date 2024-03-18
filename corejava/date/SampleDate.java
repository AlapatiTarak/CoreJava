package com.corejava.date;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class SampleDate {

	public static void main(String[] args) {
		
		Date date = new Date();
		SimpleDateFormat d=new SimpleDateFormat("h:mm a");
		Calendar c = Calendar.getInstance();  
        c.set(Calendar.MONTH, 3); 
        c.set(Calendar.DATE, 24  );
        c.set(Calendar.YEAR, 2024);
		Date dt1 = c.getTime();
		date.setTime(1703733687L);
	    System.out.println(dt1);
		System.out.println(d.format(date));
    	System.out.println(dt1.before(date));
		System.out.println(date.getTime());
	}

}
