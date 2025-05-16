package com.logical;

public class ReverseFirstWordOfString {

	public static void main(String[] args) {
		String input = "Hello this is India";

		if (input == null || input.isEmpty()) {

			System.out.println("cannot reverse the string");
		} 
		else {
			String words[] = input.split(" ", 2);
			char charArray[] = words[0].toCharArray();
			int left = 0;
			int right = charArray.length - 1;

			while (left < right) {
				char temp = charArray[left];
				charArray[left] = charArray[right];
				charArray[right] = temp;
				left++;
				right--;

			}
		System.out.println(charArray);
		String reversedFirstWord=new String(charArray);
		String updatedString=reversedFirstWord+" "+words[1];
		System.out.println(updatedString);
			
		}

	}

}
