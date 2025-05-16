package com.logical;

public class ChangingKey {

	public static void main(String[] args) {
	String input="abCDaA";
	int count=0;
	char lastKey=input.toCharArray()[0];
	lastKey=Character.toLowerCase(lastKey);
	for (int i=1;i<=input.length()-1;i++)
	{
		char currentKey=input.toCharArray()[i];
		currentKey=Character.toLowerCase(currentKey);
		
		if(currentKey !=lastKey)
		{
			count=count+1;
		}
		
		lastKey=currentKey;
		
		
	}
	System.out.println("No of keys are " +count);

	}

}
