package com.logical;

public class PangramStringCheck {

	public static void main(String[] args) {
		String input="The quick brown fox jumps over the lazy dog";
		String inputText=input.toLowerCase();
		boolean result=CheckPangram(inputText);
		if(result)
		{
			
			System.out.println("pangram string");
		}		
		else {
			
			
			System.out.println("not a pangram string");
			
		}
	}

	private static Boolean CheckPangram(String inputText) {
		if(inputText.length()< 26)
		{
			
			return false;
		}
		// TODO Auto-generated method stub
		for(char i='a'; i<='z'; i++)
		{
			if(inputText.indexOf(i)<0) {
			return false;
			}
		}
		return true;
		
	}

}
