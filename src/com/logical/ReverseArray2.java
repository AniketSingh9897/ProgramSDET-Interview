package com.logical;

public class ReverseArray2 {

	public static void main(String[] args) {

		int input[] = { 1, 2, 3, 4, 5, 6 };
		int start = 0;
		int end = input.length - 1;
		int temp;
		for (int num : input) {
			System.out.print(num + "     ");

		}

		System.out.println();

		while (end > start) {
			temp = input[start];
			input[start] = input[end];
			input[end] = temp;
			start++;
			end--;
		}
		for (int num : input) {

			System.out.print(num + "     ");

		}

	}

}
