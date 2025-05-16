package com.logical;

import java.math.BigInteger;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no=5;
		BigInteger result=BigInteger.ONE;
		
		for (int i=1; i<=no; i++)
		{
			result=result.multiply(BigInteger.valueOf(i));
			
			
		}
		System.out.println(result);
	}

}
