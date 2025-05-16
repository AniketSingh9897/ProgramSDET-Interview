package com.logical;

import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CommonElementInTwoList2 {

	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("One");
		list1.add("two");
		list1.add("ten");
		list1.add("four");
		ArrayList<String> list2=new ArrayList<String>();
		list2.add("One");
		list2.add("two");
		list2.add("ten");
		list2.add("how");
		list1.retainAll(list2);
		
		Set<String> result=list1.stream().filter(list2::contains).collect(Collectors.toSet());
		System.out.println(result);
	
	}

}
