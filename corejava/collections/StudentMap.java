package com.corejava.collections;

import java.util.ArrayList;
import java.util.List;

public class StudentMap {

	public static void main(String[] args) {
		 List<Student> data=new ArrayList<>();
		 Student studentdata=new Student();
		 studentdata.setName("Tarak");
		 studentdata.setId(24);
		 studentdata.setMno(9640621619l);
		 studentdata.setGender("M");
		 data.add(studentdata);

	}

}
