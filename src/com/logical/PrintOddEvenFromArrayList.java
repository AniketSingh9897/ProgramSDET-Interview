package com.logical;

import java.util.ArrayList;

public class PrintOddEvenFromArrayList {

	public static void main(String[] args) {
		
		 ArrayList al=new ArrayList();
		 al.add(1);
		 al.add("java");
		 al.add("test");
		 al.add(22);
		 al.add(88);
		 
		 for(Object o:al)
		 {
			 if( o instanceof Integer)
			 {
				 int x= ((Integer) o).intValue();
				 if(x%2==0)
				 {
					 
					 System.out.println("even no"+x);
					 
				 }
				 else
				 {
					 System.out.println("odd no"+x);
					 
					 
				 }
				 
			 }
			 
			 
		 }
		
		
		
		
	}

}
