package com.simple;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a numeric value: ");
		String input1 = sc.nextLine();
		double d1 = Double.parseDouble(input1);
		
		
		System.out.print("Enter a numeric value: ");
		String input2 = sc.nextLine();
		double d2 = Double.parseDouble(input2);
		
		double result = d1+d2;
		
		System.out.println("The answer is :"+result);
		

	}

}
