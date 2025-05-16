package com.logical;

import java.util.Arrays;

public class NameShortner {

	public static void main(String[] args) {
		String input="Aniket Singh Jadon";
		String inputArray[]=input.split(" ");
		StringBuilder sb=new StringBuilder();
		
		if(inputArray.length<2)
		{
			System.out.println(input);
			
		}
		else
		{
			
			for(int index=0; index<inputArray.length-1;index++)
			{
				sb.append(inputArray[index].charAt(0));
				sb.append(" ");
				
			}
			sb.append(inputArray[inputArray.length-1]);
			
			
		}
		System.out.println(sb);
		
		
	}

}
