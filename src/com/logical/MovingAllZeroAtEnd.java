package com.logical;

public class MovingAllZeroAtEnd {

	public static void main(String[] args) {
	 int a[]= {1,0,2,0,3,0};
	 int temp;
	 int putNonZeroValue=0;
	 for(int current=0;current<a.length;current++)
	 {
		 if(a[current]!=0)
		 {
			 temp=a[putNonZeroValue];
			 a[putNonZeroValue]=a[current];
			 a[current]=temp;
			 putNonZeroValue++;
			 
		 }}
		for(int zeroAtEnd:a)
		{
			
			
			System.out.print(zeroAtEnd+ "   ");
		}
		 
		 
	 }

	}


