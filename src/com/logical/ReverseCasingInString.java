package com.logical;

public class ReverseCasingInString {

	public static void main(String[] args) {
		String input="Hello World";
		char inputArray[]=input.toCharArray();
		
		StringBuilder sb=new StringBuilder();
		for(char data:inputArray)
		{
			if(Character.isLowerCase(data))
			{
			sb.append(Character.toUpperCase(data));
				
			}
			else if(Character.isUpperCase(data))
			{
			sb.append(Character.toLowerCase(data));
				
			}
			else
			{		
			sb.append(data);
			}
			
			
		}
		System.out.println(input);
		System.out.println(sb);
		
		

	}

}
