package com.logical;

import java.util.HashSet;

public class UniqueElementFromArraySolution2 {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 3, 2 };
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[i] == a[j]) {

					count++;
				}

			}
			if (count == 1) {

				System.out.println("unique element" +a[i]);

			}
		
			

		}

	}

}
