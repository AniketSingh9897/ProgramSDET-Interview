package com.logical;

public class CountCharacterThatDonotHaveWhiteSpaceAround {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "HIE";
		char inputArray[] = input.toCharArray();
		int count = 0;
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] == ' ') {
				continue;
			}

			boolean whiteSpaceAfterTheChar = inputArray[i + 1] == ' ' && i < inputArray.length - 1;
			boolean whiteSpaceBeforeTheChar = inputArray[i - 1] == ' ' && i > 0;

			if (!whiteSpaceAfterTheChar && !whiteSpaceBeforeTheChar) {

				count++;
			}

		}
		System.out.println(count);

	}

}
