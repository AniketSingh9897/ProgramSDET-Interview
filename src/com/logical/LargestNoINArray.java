package com.logical;

public class LargestNoINArray {

	public static void main(String[] args) {
	int a[]= {1,2,3,5,6,98};
	int largest_No=a[0];
	for (int i=0;i<a.length;i++)
	{
		if(a[i]>largest_No)
		{
			
			largest_No=a[i];
			
		}
		
		
	}
	System.out.println("largestno is" +"   " + largest_No);
	

}
}