package com.logical;

public class CountVowelInString {

	public static void main(String[] args) {
		String input="Hello World";
		String vowels="aeiouAEIOU";
		int count=0;
		for(int i=0;i<input.length();i++)
		{
			if(vowels.indexOf(input.charAt(i))!=-1)
			{
				count=count+1;
				
			}
			
			
			
			
		}
		System.out.println("No of vowels are  "+ count);
		
	}

}
