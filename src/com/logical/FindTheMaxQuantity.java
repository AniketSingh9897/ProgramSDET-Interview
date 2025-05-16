package com.logical;

import java.util.HashMap;
import java.util.Map;

public class FindTheMaxQuantity {

	public static void main(String[] args) {
		String input[] = { "abc 12", "xyz 21", "xyz 9", "pqr 11" };
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		for (String s : input) {

			String inputArray[] = s.split(" ");
			String name = inputArray[0];
			int quantity = Integer.parseInt(inputArray[1]);
			hmap.put(name, hmap.getOrDefault(name, 0) + quantity);

		}
		
		String product="";
		int maxQuantity=0;
		for(Map.Entry<String,Integer> entrySet:hmap.entrySet())
		{
			if(entrySet.getValue()>maxQuantity)
			{
				product=entrySet.getKey();
				maxQuantity=entrySet.getValue();
				
			}
			
		}
		System.out.println("product: "+product+" "+maxQuantity);
		
	}

}
