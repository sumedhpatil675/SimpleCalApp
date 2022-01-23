package com.complex;

import java.util.Scanner;

public class Main {

	public static void main(String args[])
	{
		String s1 = getInput("Enter a numeric value: ");
		String s2 = getInput("Enter a numeric value: ");
		String op = getInput("Choose an operation (+ - * /): ");
		
		
		
		double result = 0;
		
		try
		{
			switch(op)
			{
			case "+":
				result = addValues(s1,s2);
				break;
			case "-":
				result = subtractValues(s1,s2);
				break;
			case "*":
				result = multiplyValues(s1,s2);
				break;
			case "/":
				result = divideValues(s1,s2);
				break;
			default:
				System.out.println("Unrecognised Operation");
				return;
			}
			
			System.out.println("The answer is : "+result);
		}
		catch(Exception e)
		{
			
		}
	}
	
	private static double addValues(String s1,String s2)
	{
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		return d1+d2;
	}
	private static double subtractValues(String s1,String s2)
	{
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		return d1-d2;
	}
	private static double multiplyValues(String s1,String s2)
	{
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		return d1*d2;
	}
	private static double divideValues(String s1,String s2)
	{
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		return d1/d2;
	
	}	
	private static String getInput(String prompt)
	{
		System.out.println(prompt);
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
		
	}
	
	
	
}
