package com.corejava.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainOne 
{
	public static void main(String[] args) 
	{
		Integer[] a={1,2,3,5,2,2,2,3,4,5,10};  
        List<Integer> l=new ArrayList<>(Arrays.asList(a));
        
        removeDuplicates(l);
        //secondLargest(l);
        //rotateList(l,2);
        //missingNumbers(l,10);
        //printList(l);
	}
	
	 static void removeDuplicates(List<Integer> l)
	   {
	       List<Integer> l1=new ArrayList<>();
	       for(int i=0;i<l.size();i++)
	       {
	           for(int j=i+1;j<l.size();j++)
	           {
	               if(l.get(i)>l.get(j))
	               {
	                    l.set(i,l.get(i)+l.get(j));
	                    l.set(j,l.get(i)-l.get(j));
	                    l.set(i,l.get(i)-l.get(j));
	               }
	           }
	       }

	       for(int i=0;i<l.size();)
	       {
	           int n=0;
	           l1.add(l.get(i));
	           for(int j=i;j<l.size();j++)
	           {
	               if(l.get(i)==l.get(j)) n++;
	           }
	           i+=n; 
	       }
	       System.out.println(l1);
	   }
	 
	   static void secondLargest(List<Integer> l)
	   {
	       for(int i=0;i<l.size();i++)
	       {
	           for(int j=i+1;j<l.size();j++)
	           {
	               if(l.get(i)>l.get(j))
	               {
	                    l.set(i,l.get(i)+l.get(j));
	                    l.set(j,l.get(i)-l.get(j));
	                    l.set(i,l.get(i)-l.get(j));
	               }
	           }
	       }
	       System.out.println(l.get(l.size()-2));
	   }
	   
	   static void rotateList(List<Integer> l,int n)
	   {
	        int j=0;
	        while(j!=n)
	        {
	            l.add(l.get(0));
	            l.remove(0);
	            j++;
	        }
	        System.out.println(l);
	   }
	   
	   static void missingNumbers(List<Integer> l,int n)
	   {
	       List<Integer> l1=new ArrayList<>();
	       for(int i=1;i<=10;i++)
	       {
	           if(l.remove(Integer.valueOf(i))){}
	           else l1.add(i);
	       }
	       System.out.println(l1);
	   }
	   
	   static void printList(List<Integer> l)
	   {
		   String s="";
	        for(int i=0;i<l.size();i++) 
	        s+=l.get(i)+",";
	        s=s.substring(0,s.length()-1);
	        System.out.println(s);
	        
	   }	   
}
