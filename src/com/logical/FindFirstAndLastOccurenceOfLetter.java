package com.logical;

public class FindFirstAndLastOccurenceOfLetter {

	public static void main(String[] args) {
		String input = "Hello World";
		int firstPostion = -1;
		int lastPosition = -1;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == 'o') {
				firstPostion = i;
				break;
			}
		}
		for (int i = input.length() - 1; i >= 0; i--) {
			if (input.charAt(i) == 'o') {
				lastPosition = i;
				break;
			}
		}
		if (firstPostion < 0) {
			System.out.println("o not present in string");

		} else {
			System.out.println(firstPostion + " and " + lastPosition);

		}

	}

}
