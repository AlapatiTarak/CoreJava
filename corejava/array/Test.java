package com.corejava.array;

public class Test 
{
	public static void main(String[] args) 
	{
		int[]a= {7,8,9,5};
		for(int i=a.length-1;i>=0;i--) 
		{ 
			 System.out.println(a[i]);     
		}
		
		byte []b=new byte[3];
		for(int i=0;i<b.length;i++) 
		{ 
			 System.out.println(b[i]);     
		}
		short []c= {3,6,6,8};
		for(int i=0;i<c.length;i++) 
		{ 
			 System.out.println(c[i]);     
		}
		long []d= new long[2];
		for(int i=0;i<d.length;i++) 
		{ 
			 System.out.println(d[i]);     
		}
		float []e= {1.2f,2.2f,5.5f};
		for(int i=0;i<e.length;i++) 
		{ 
			 System.out.println(e[i]);     
		}
		boolean []f= new boolean[4];
		for(int i=0;i<f.length;i++) 
		{ 
			 System.out.println(f[i]);     
		}
		char []g= new char[2];
		for(int i=0;i<g.length;i++) 
		{ 
			 System.out.println(g[i]);     
		}
		double []h= new double[4];
		for(int i=0;i<h.length;i++) 
		{ 
			 System.out.println(h[i]);     
		}
		String []j= new String[3];
		for(int i=0;i<j.length;i++) 
		{ 
		 System.out.println(j[i]);     
		}
		
	}
}