package com.logical;

import java.util.HashMap;

public class IntegerToRoman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		String symbol[]= {"L","X","V","I"};
		int values[]= {50,10,5,1};
		StringBuilder sb=new StringBuilder();
		for(int i=0; i<values.length; i++)
		{
			while(n>=values[i])
			{
				n=n-values[i];
				sb.append(symbol[i]);
				
				
			}
		}
	System.out.println(sb.toString());
	
	
	}

}
