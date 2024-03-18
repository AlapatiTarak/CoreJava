package com.corejava.date;

import java.text.SimpleDateFormat;

import java.util.Date;
 

public class DateOne 
{

	public static void main(String[] args) {
		SimpleDateFormat formatt=new SimpleDateFormat("dd/MMM/yyyy HH:mm:ss");
		Date date=new Date();
		System.out.println(formatt.format(date));
		SimpleDateFormat format2=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.sss");
		System.out.println(format2.format(date));
		SimpleDateFormat format3=new SimpleDateFormat("yyyy-MMMM-dd HH:mm:ss");
		System.out.println(format3.format(date));

}

}
