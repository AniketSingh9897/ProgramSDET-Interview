package com.logical;

public class LinearSearch2 {

	public static void main(String[] args) {
		int a[]= {1,2,3,5,6,98};
		int key=2;
		int position=-1;//taking -1 because we are assuming value is not present.
		boolean isPresent=false;
		for(int i=1;i<a.length;i++)
			
		{
	if(a[i]==key)
	{
		isPresent=true;
		position=i;
		break;
	}
	
		}
		if(isPresent)
		{
			
			System.out.println("No is present in the array at position at :" + position);
			
		}
		else {
			
			System.out.println("no is not present");
		}
		
		
		
	}

}
