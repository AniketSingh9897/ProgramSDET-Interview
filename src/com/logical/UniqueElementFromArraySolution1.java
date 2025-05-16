package com.logical;

import java.util.HashSet;

public class UniqueElementFromArraySolution1 {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 3, 2 };
		HashSet<Integer> seen = new HashSet<Integer>();
		HashSet<Integer> duplicate = new HashSet<Integer>();
		for (int no : a) {
			if (!seen.add(no)) {
				duplicate.add(no);

			}

		}
		System.out.println("unique element" + seen);
		System.out.println("duplicate element" + duplicate);

	}

}
