package com.logical;

public class CalculateSumOfNumberFromString {

	public static void main(String[] args) {
		String input="Hello 091234";
		char inputArray[]=input.toCharArray();
		int sum=0;
		for(char c:inputArray)
		{
			
			if(Character.isDigit(c))
			{
				sum=sum+(c-'0');			
				
			}
			
			
		}
		System.out.println(sum);

	}

}
