package com.logical;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWordsFromTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Hello this is India Hello this is China";
		Set<String> set = new LinkedHashSet<String>();
		String inputWordArray[] = input.split(" ");
		StringBuilder sc = new StringBuilder();

		for (String words : inputWordArray) {
			if (set.add(words)) {
				sc.append(words).append(" ");
			}

		}
		System.out.println(sc);

	}
}
