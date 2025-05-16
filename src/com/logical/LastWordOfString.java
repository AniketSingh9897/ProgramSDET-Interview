package com.logical;

public class LastWordOfString {

	public static void main(String[] args) {
		String s = "     Aniket    Singh     ";
		System.out.println(s);
	//s = s.trim();
		System.out.println(s);
		char inputArray[] = s.toCharArray();
		int count = 0;
		for (int i = inputArray.length - 1; i >= 0; i--) {
			if (inputArray[i] != ' ') {

				count = count + 1;
			}

			else {
				if (count > 0) {

					System.out.println("last word length is " + count);
					break;
				}

			}
		}

	}

}
