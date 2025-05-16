package com.logical;

public class ArmstrongNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=153;
		int n2=n;
		int lastDigit;
		int number=0;
		while(n>0)
		{ lastDigit=n%10;
			number=number+lastDigit*lastDigit*lastDigit;
			n=n/10;

	}
		if(number==n2) {
		
	System.out.println(number +"is a Armstrong Number");
	
	}
		else {
			
			System.out.println("no is not armstrong");
		}
	

}}
