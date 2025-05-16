package com.logical;

public class RverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=567;
		int rev=0;
		while(n>0)
		{
			rev=n%10+rev*10;
			n=n/10;
			
			
			
		}
		System.out.println("reverse of no is"+"   "+    rev);
	}

}
