package com.logical;

import java.util.Arrays;

public class test123 {



		    public static void main(String[] args) {
		        int a1[] = {1, 3, 6};
		        int a2[] = {2, 4, 5};
		        int a3[] = new int[a1.length + a2.length]; // Corrected initialization
		        int p1 = 0, p2 = 0, p3 = 0;

		        // Merge the two arrays
		        while (p1 < a1.length && p2 < a2.length) {
		            if (a1[p1] <= a2[p2]) {
		                a3[p3++] = a1[p1++];
		            } else {
		                a3[p3++] = a2[p2++];
		            }
		        }

		        // Copy remaining elements from a1, if any
		        while (p1 < a1.length) {
		            a3[p3++] = a1[p1++];
		        }

		        // Copy remaining elements from a2, if any
		        while (p2 < a2.length) {
		            a3[p3++] = a2[p2++];
		        }

		        // Print the merged array
		        System.out.println(Arrays.toString(a3));
		    }
		

	}

