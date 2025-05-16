package com.logical;

public class LinearSearch {

	public static void main(String[] args) {
		int a[]= {1,2,3,5,6,98};
		int key=6;
		int position=-1;//taking -1 because we are assuming value is not present.
		boolean isPresent=false;
		for(int x:a)
		{
			if(x==key)
			{
				isPresent=true;
				break;
				
			}
			
			
			
		}
		if(isPresent)
		{
			
			System.out.println("No is present in the array     "+key);
			
		}
		else {
			
			System.out.println("no is not present");
		}
		
		
		
	}

}
