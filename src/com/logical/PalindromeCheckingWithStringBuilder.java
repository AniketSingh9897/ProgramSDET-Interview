package com.logical;

public class PalindromeCheckingWithStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=12121;
		String originalString=Integer.toString(n);
		StringBuilder s=new StringBuilder(originalString);
		String reverseString=s.reverse().toString();
		System.out.println(reverseString);
		
		if(reverseString.equals(originalString))
		{System.out.println("palindrome");
		

	}
		else {
			
		System.out.println("not a palindrome");}
		}

}
