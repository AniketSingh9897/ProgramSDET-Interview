package com.logical;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateValueFromTheArray2 {

	public static void main(String[] args) {
	
		int a[]= {10,20,10,1,15,20,6,7,8,8,4,0,1};
		a=Arrays.stream(a).distinct().toArray();
		System.out.println(Arrays.toString(a));
		
	}

}
