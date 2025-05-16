package com.logical;

public class SecondLargestElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,6,7};
		int largestNo=Integer.MIN_VALUE;
		int secondLargestNo=Integer.MIN_VALUE;
		
		for(int no:a)
		{
			if (no>largestNo)
			{
				secondLargestNo=largestNo;
				largestNo=no;
				
			}
			else if(no>secondLargestNo && no!=largestNo)
			{
				secondLargestNo=no;
				
				
			}
			
			
			
		}
		System.out.println(secondLargestNo);
	}

}
