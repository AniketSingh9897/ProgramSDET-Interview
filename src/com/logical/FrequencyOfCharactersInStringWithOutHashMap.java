package com.logical;

public class FrequencyOfCharactersInStringWithOutHashMap {

	public static void main(String[] args) {
	
		
		String input="aabccaadbc";
		int[] frequency=new int[256];
		char inputArray[]=input.toCharArray();
		for(char currentChar:inputArray)
		{
			
			frequency[currentChar]++;
		}
		for (int i=0;i<frequency .length;i++)
		{
			if(frequency[i]>0)
			{System.out.println((char)i+"  "+ frequency[i]);}
		}
	}

}
