package com.corejava.collections;

import java.util.ArrayList;
import java.util.List;

public class ListDemo 
{

	public static void main(String[] args) 
	{
		List<Integer> arr=new ArrayList<>(); 
		arr.add(10);
		arr.add(8);
		arr.add( 13);
		//System.out.println(arr);
		 
		List<String> arr1=new ArrayList<>();
		arr1.add("tarak");
		//System.out.println(arr1);
		List<ListArray> alist=new ArrayList<>();
		ListArray listArray=new ListArray();
		listArray.setC(10);
		listArray.setD(23);
		alist.add(listArray);
		//System.out.println(listArray);
		List<Boolean> arr2=new ArrayList<>();
		arr2.add( true);
		//System.out.println(arr2);
		List<Long> arr3=new ArrayList<>();
		arr3.add(13L);
		//System.out.println(arr3);
		List<Short> arr4=new ArrayList<>();
		arr4.add((short) 134);
		//System.out.println(arr4);
		List<Object> l=new ArrayList<>();
		l.add(arr1);
		l.add(arr2);
		l.add(arr3);
		l.add(arr4);
		l.add(alist);
		for(int i=0; i<l.size(); i++) {
			for(int j=0; j<((List<?>)l.get(i)).size(); j++) {
				System.out.println(((List<?>)l.get(i)).get(j));
			}
		}
		
		
	}

}
