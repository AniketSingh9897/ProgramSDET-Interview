package com.logical;

import java.util.LinkedHashSet;

public class UniqueSubString {

	public static void main(String[] args) {
		String input = "abcdabbbcccddbbaa";
		LinkedHashSet<Character> linkedSet = new LinkedHashSet<Character>();
		StringBuilder sb = new StringBuilder();
		char inputArray[] = input.toCharArray();
		for (char c : inputArray) {
			linkedSet.add(c);

		}
		for (char c : linkedSet) {

			sb.append(c);
		}
		System.out.println(sb);
	}

}
