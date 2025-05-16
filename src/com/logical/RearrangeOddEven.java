package com.logical;

import java.util.Arrays;

public class RearrangeOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 2, 3, 5, 0, 1, 4, 0 };
		
		int left = 0;
		int right = a.length - 1;
		while (left < right) {

			while (left < right && a[left] % 2 == 0) {
				left++;

			}
			while (left < right && a[right] % 2 != 0) {
				right--;

			}
			if (left < right) {

				int temp = a[left];
				a[left] = a[right];
				a[right] = temp;
				left++;
				right--;

			}

		}
		int evenEnd = 0;

		while (evenEnd < a.length && a[evenEnd] % 2 == 0) {
			evenEnd++;
		}
		
		Arrays.sort(a, 0, evenEnd);
	
		Arrays.sort(a, evenEnd, a.length);
		System.out.println(Arrays.toString(a));

	}

}
