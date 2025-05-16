package com.logical;

import java.util.HashMap;

public class FrequencyOfCharactersInString {

	public static void main(String[] args) {
		String input="madam";
		
		HashMap<Character, Integer> frequencyMap=new HashMap<Character, Integer>() ;
		
		char[] intputArray=input.toCharArray();
		for (char character:intputArray)
		{
			
			frequencyMap.put(character, frequencyMap.getOrDefault(character,0)+1);
			
		}
		
		for(char c:frequencyMap.keySet())
		{
			
			System.out.println(c+"  "+frequencyMap.get(c));
			
			
		}
		

	}
}