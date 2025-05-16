package com.logical;

public class SeparateNoAndAlphabets {

	public static void main(String[] args) {
		String input="Abc123d";
		StringBuilder numbers=new StringBuilder();
		StringBuilder alphabets=new StringBuilder();
		
		for(char c:input.toCharArray())
		{
			
			if(Character.isDigit(c))
			{
				numbers.append(c);
				
			}
			else if (Character.isAlphabetic(c)) // this condition is optional as we checking no above
			{
				alphabets.append(c);
				
			}
			
			
		}
		System.out.println("number "+ numbers);
		System.out.println("alphabets "+ alphabets);
		
		
		
	}

}
