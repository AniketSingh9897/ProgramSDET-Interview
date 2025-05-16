package com.logical;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		//System.out.println("45");
		String s1 = "sILENT";
		String s2 = "Listen";

		if (s1.length() == s2.length()) {
			s1 = s1.toLowerCase();

			s2 = s2.toLowerCase();

			char s1Array[] = s1.toCharArray();
			char s2Array[] = s2.toCharArray();
			Arrays.sort(s1Array);
			Arrays.sort(s2Array);

			if (Arrays.equals(s1Array, s2Array)) {
				System.out.println("Strings are Anagrams");
			}

			else {
				System.out.println("Not Anagrams");
			}
		}

		else {
			System.out.println("Not a Anagrams");
		}

	}

}
