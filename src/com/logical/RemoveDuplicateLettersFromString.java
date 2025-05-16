package com.logical;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateLettersFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="Java";
		Set<Character> set=new LinkedHashSet<Character>();
		char inputCharArray[]=input.toCharArray();
		StringBuilder sc=new StringBuilder();
		for (char c : inputCharArray) {
			
			if(set.add(c))
			{
				
				sc.append(c);
				
				
			}
		}
		System.out.println(sc);
			
		}
	
		
		
		
		
	
	
	}
