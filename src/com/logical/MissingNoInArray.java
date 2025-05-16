package com.logical;

public class MissingNoInArray {

	public static void main(String[] args) {
	int a[]= {1,2,3,5,6};
	//int total_NuMBERS=6
	int total_Numbers=a.length +1;
	System.out.println(total_Numbers);
	int totalNumber_Sum=(total_Numbers)*(total_Numbers+1)/2;
	System.out.println(totalNumber_Sum);
	int sum=0;
	for (int i=0; i <a.length ; i++)
	{
		
	sum=sum+a[i];
	
	}
	System.out.println(sum);
	int missing_no=totalNumber_Sum-sum;
	System.out.println(missing_no);
	}

}
