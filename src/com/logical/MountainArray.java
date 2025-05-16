package com.logical;

public class MountainArray {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 6, 5, 4, 3, 2, 1 };
		System.out.println(mountainArrayCheck(a));

	}

	private static boolean mountainArrayCheck(int[] a) {
		if (a.length < 3) {
			return false;

		}
		int i = 0;
		while (i + 1 < a.length && a[i + 1] > a[i]) {
			i++;
		}
		while (i + 1 < a.length && a[i] > a[i + 1]) {
			i++;
		}
		if (a.length - 1 == i) {
			return true;
		}

		return false;

	}

}
