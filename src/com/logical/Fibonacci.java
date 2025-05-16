package com.logical;

public class Fibonacci {

	public static void main(String[] args) {
		int n=1;
		int first=0;
		int second=1;
		int next;
		if(n==1)
		{
			
			System.out.println(first);
			System.exit(0);
		}
		for(int i=2;i<n;i++)
		{
			
			next=second+first;
			System.out.print(next +"   ");
			first=second;
			second=next;
			
			
		}
		
		
	}

}
