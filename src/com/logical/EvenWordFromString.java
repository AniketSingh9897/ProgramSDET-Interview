package com.logical;

public class EvenWordFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Sky is blue and Vast";
		String inputArray[] = input.split(" ");
		for (String word : inputArray) {
			if (word.length() % 2 == 0) {

				System.out.println(word);

			}

		}

	}

}
