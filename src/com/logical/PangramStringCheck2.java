package com.logical;

import java.util.HashSet;

public class PangramStringCheck2 {

	public static void main(String[] args) {
		String input="The quick brown fox jumps over the lazy dog";
		
		boolean result=CheckPangram(input);
		if(result)
		{
			
			System.out.println("pangram string");
		}		
		else {
			
			
			System.out.println("not a pangram string");
			
		}
	}

	private static Boolean CheckPangram(String input) {
		
		HashSet<Character> characterSet=new HashSet<Character>();
		char inputChar[]=input.toLowerCase().toCharArray();
		
		
		for (char c:inputChar)
		{	if(Character.isLetter(c)) {
			
			characterSet.add(c);
			
		}}
		if(characterSet.size()==26)
		{
			return true;
		}

		return false;
			
		
		}
	
	
}
