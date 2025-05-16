package com.logical;

public class LeaderNumbers {

	public static void main(String[] args) {
		int a[]= {16,17,4,3,5,2};
		int length=a.length-1;
		int maxRight=a[length];
		System.out.println(maxRight);
		
		
		for(int i=a.length-2;i>=0;i--)
		{
			if(a[i]>maxRight)
			{
				maxRight=a[i];
				System.out.println(maxRight);
			}
			
			
		}

	}

}
