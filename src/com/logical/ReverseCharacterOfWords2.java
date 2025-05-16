package com.logical;

public class ReverseCharacterOfWords2 {

	public static void main(String[] args) {
		String input = "This is fun";
		String words[] = input.split(" ");
		StringBuilder result = new StringBuilder();
		for (String word : words) {
			StringBuilder reverseWord = new StringBuilder(word);
			result.append(reverseWord.reverse().append(" "));

		}
		System.out.println(result);

	}

}
