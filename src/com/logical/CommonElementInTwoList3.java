package com.logical;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CommonElementInTwoList3 {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("One");
		list1.add("two");
		list1.add("ten");
		list1.add("four");
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("One");
		list2.add("two");
		list2.add("ten");
		list2.add("how");

		Set<String> result = new HashSet<String>();
		for (int i = 0; i < list1.size(); i++) {
			for (int j = 0; j < list2.size(); j++) {
				
				if(list1.get(i).equalsIgnoreCase(list2.get(j)))
				{
					
					result.add(list1.get(i));
					
				}
			}
			
		

		}
		System.out.println(result);

	}
}
