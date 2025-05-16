package com.logical;

import java.util.Arrays;

public class TripletMaxProduct {

	public static void main(String[] args) {
		int a[]= {7,5,3,2,-10,-20};
		int n=a.length;
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		int resultOne=a[n-1]*a[n-2]*a[n-3];
		int resultSecond=a[n-1]*a[0]*a[1];
		System.out.println(Math.max(resultOne, resultSecond));

	}

}
