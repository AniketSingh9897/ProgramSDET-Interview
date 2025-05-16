package com.logical;

public class ReverseOnlyLetters{

	public static void main(String[] args) {
		String input = "a123b56t";
		int left = 0;
		int right = input.length() - 1;
		char inputArray[] = input.toCharArray();

		while (left < right) {
			if (!Character.isDigit(input.charAt(left))) {
				left++;

			} else if (!Character.isDigit(input.charAt(right))) {
				right--;

			}
			
			else
			{	char temp;
				temp=inputArray[left];
				inputArray[left]=inputArray[right];
				inputArray[right]=temp;
				left++;
				right--;
			}

		}
		System.out.println(input);
		System.out.println(inputArray);
		
	}

}
