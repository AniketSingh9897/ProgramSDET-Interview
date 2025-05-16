package com.logical;

public class CountNoOfLoweCaseUppercaseInString {

	public static void main(String[] args) {
		String input="Hello India";
		char inputARRAY[]=input.toCharArray();
		int countLowerCase=0;
		int countUpperCase=0;
		for(int i=0;i<inputARRAY.length;i++)
		{
			
			if(Character.isLowerCase(inputARRAY[i]))
			{
				countLowerCase++;
			}
			else if(Character.isUpperCase(inputARRAY[i]))
			{
				countUpperCase++;
				
			}
			
		
			
		}
		System.out.println("lowerCase "+ countLowerCase);
		System.out.println("upperCase "+ countUpperCase);
	}

}
