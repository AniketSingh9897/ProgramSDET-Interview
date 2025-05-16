package com.logical;

import java.util.HashMap;
import java.util.Map;

public class ReverseAMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> orginalMap=new HashMap<String, Integer>();
		orginalMap.put("A",1);
		orginalMap.put("B",2);
		orginalMap.put("C",3);
		Map<Integer,String> reverseMap=new HashMap<Integer,String>();
		
		for(Map.Entry<String,Integer> data:orginalMap.entrySet())
		{
			
			reverseMap.put(data.getValue(),data.getKey());
			
		}
				
		System.out.println(orginalMap);
		System.out.println(reverseMap);

		}
	

}
