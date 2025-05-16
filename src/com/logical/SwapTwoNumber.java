package com.logical;

public class SwapTwoNumber {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		/*int c;
		
		c=a;
		a=b;
		b=c;
		System.out.println("value of a is"+a);
		System.out.println("value of b is"+b);
		*/
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
		
		
	}

}
