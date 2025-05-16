package com.logical;

import java.util.Stack;

public class Paranthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="()";
		System.out.println(checkParanthesis(input));
	}

	private static boolean checkParanthesis(String input) {
		char inputArray[]=input.toCharArray();
		Stack<Character> stack=new Stack<Character>();
		for (char currentChar:inputArray )
		{
			if(currentChar=='(')
			{
				stack.push(currentChar);
			}
			else 
			{
				if(currentChar==')')
				{
				if(stack.isEmpty())
				{
					
					return false;
				}
				else
				{
					char topChar=stack.pop();
					if(topChar !='(')
					{
						return false;
					}
					
				}
				
				}
				
				
			}
			
			
			
		}
		return stack.isEmpty();
	}

}
