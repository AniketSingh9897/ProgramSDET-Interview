package com.logical;

public class ReverseArray {

	public static void main(String[] args) {

		int input[] = { 1, 2, 3, 4, 5, 6 };
		int reverse[] = new int[6];
		int reverse_Index = 0;
		for (int i = input.length - 1; i >= 0; i--) {

			reverse[reverse_Index] = input[i];
			reverse_Index++;

		}
		input=reverse;
		for(int num:input)
		{
			System.out.print(num+"  ");
			
			
		}

	
	}

}
