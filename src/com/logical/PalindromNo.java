package com.logical;

public class PalindromNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 121;
		int x = n;
		int num = 0;
		while (n > 0) {
			int last_Digit = n % 10;
			num = num * 10 + last_Digit;
			n = n / 10;

		}
		if (x == num) {
			System.out.println("no is palindrom");

		} else {

			System.out.println("not a palindrom no");
		}

	}

}
