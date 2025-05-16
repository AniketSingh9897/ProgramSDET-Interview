package com.logical;

import java.util.HashMap;

public class RomanToInteger {

	public static void main(String[] args) {
		String input = "IX";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('I',1);
		map.put('X',10);
		map.put('V',5);
		
		
		int result = 0;
		int previousValue = 0;
		for (int i = input.length()-1; i >= 0; i--) {
			char currentChar = input.charAt(i);
			int currentValue = map.get(currentChar);

			if (currentValue >= previousValue) {

				result = result + currentValue;
			} else {
				result = result - currentValue;

			}

			previousValue = currentValue;

		}
		System.out.println("The value of input " +input+ " is  " +result );

	}

}
