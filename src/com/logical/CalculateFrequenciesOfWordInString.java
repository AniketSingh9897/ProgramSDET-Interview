package com.logical;

import java.util.HashMap;
import java.util.Map;

public class CalculateFrequenciesOfWordInString {

	public static void main(String[] args) {
		String input="This is India and India is my country";
		String words[]=input.split(" ");
		HashMap<String, Integer> result=new HashMap<String, Integer>();
		for (String s:words)
		{
			result.put(s,result.getOrDefault(s,0)+1);
			
		}
		
		for(Map.Entry<String,Integer> entry:result.entrySet())
		{
			
			System.out.println(entry.getKey()+"   "+entry.getValue());
		}
		
	}

}
