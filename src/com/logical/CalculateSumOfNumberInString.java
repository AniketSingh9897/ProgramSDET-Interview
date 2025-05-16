package com.logical;
import java.lang.NumberFormatException;

public class CalculateSumOfNumberInString {

	public static void main(String[] args) {
		 String input = "India is my country 1234";
	        String[] wordsArray = input.split(" ");
	        int sum = 0;
	        for (String word : wordsArray) {
	            try {
	                int num = Integer.parseInt(word);
	                sum += num;
	            } catch (NumberFormatException e) {
	                System.out.println("Skipping non-numeric value: " + word);
	            }
	        }
	        System.out.println("Total sum of numbers: " + sum);
	    }

}
