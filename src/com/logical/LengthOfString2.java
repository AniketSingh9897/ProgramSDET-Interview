package com.logical;

public class LengthOfString2 {

	public static void main(String[] args) {
		String input = "Hello this is India";
		System.out.println(input.length());

		int count = 0;
		while (true) {

			try {
				input.charAt(count);
				count++;

			} catch (StringIndexOutOfBoundsException e) {
				System.out.println(count);
				break;
				// TODO: handle exception
			}

		}

	}
}
