package com.logical;

public class ReplaceVowelWithX {

	public static void main(String[] args) {
		String input="aeiout";
		input=input.toLowerCase();
		char inputArray[]=input.toCharArray();
		StringBuilder sb=new StringBuilder();
		for(char currentChar:inputArray)
		{
			if(currentChar=='a' || currentChar=='e' ||currentChar=='i' || currentChar=='o' || currentChar=='u')
			{
				sb.append("x");
				
			}
			else {
				
				
				
				sb.append(currentChar);
			}
			
			
			
			
		}
		System.out.println("updated String " + sb);
		

	}

}
