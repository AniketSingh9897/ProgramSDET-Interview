package com.logical;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateValueFromTheArray {

	public static void main(String[] args) {
	
		int a[]= {10,20,10,1,15,20,6,7,8,8,4,0,1};
		Set<Integer> dataSet=new LinkedHashSet<Integer>();
		for(int value:a)
		{
			
			dataSet.add(value);
		}
		System.out.println(dataSet);
		//it's a set we have to print array so we will use streams
		
		int result[]=dataSet.stream().mapToInt(Integer::intValue).toArray();
		System.out.println(Arrays.toString(result));
		
	}

}
