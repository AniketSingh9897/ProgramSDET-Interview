package com.logical;

public class ReverseOnlyVowels{

	public static void main(String[] args) {
		String input = "Hello";
		String vowels = "aeiouAEIOU";
		int left = 0;
		int right = input.length() - 1;
		char inputArray[] = input.toCharArray();

		while (left < right) {
			if (vowels.indexOf(input.charAt(left)) == -1) {
				left++;

			} else if (vowels.indexOf(input.charAt(right)) == -1) {
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
