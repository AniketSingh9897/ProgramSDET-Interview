package com.logical;

import java.util.ArrayList;

public class ArrayList1313 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> as=new ArrayList<String>();
		as.add("apple");
		as.add("banana");
		as.add("cherry");
		as.add("mango");
		as.add("apple");
		System.out.println(as);
		as.remove("apple");
		System.out.println(as);
		System.out.println("Orange is present "+as.contains("orange"));
		System.out.println(as.size());
		for(String s:as)
		{
			
			System.out.print(s +" ");
			
		}
		for (int i=0;i<as.size();i++)
		{
			
			System.out.println("element at " +i+"is" + as.get(i));
			
		}

	}

}
