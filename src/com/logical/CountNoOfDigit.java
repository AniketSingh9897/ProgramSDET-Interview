package com.logical;

public class CountNoOfDigit {

	public static void main(String[] args) {
		int n=12345;
		//first approach
		String numberToString=Integer.toString(n);
		System.out.println(numberToString.length());
		//2nd approach
		int lastDigit;
		int count=0;
		while(n>0)
		{
			lastDigit=n%10;
			count++;
			n=n/10;
			
			
			
			
		}
		System.out.println(count);
	}

}
