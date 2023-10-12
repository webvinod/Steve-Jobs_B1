package com.test.examples.calculator;

import java.util.Scanner;

public class Calculator {

	Scanner sc =new Scanner(System.in);
	
	void calculate() {
		
		System.out.print("Please Enter a Number: ");
		int inputOne = sc.nextInt();
		
		System.out.println("Please Enter from this Operators only + - * / %");
		
		System.out.print("Please choose an Operator: ");
		String input = sc.next();
		
		System.out.print("Please Enter a Number: ");
		int inputTwo = sc.nextInt();
		
		switch(input) {
		case"+":
			System.out.println(("Addition of two numbers is: ")+ (inputOne + inputTwo));
			break;
		case "-":
			System.out.println(("Substraction of two numbersis : ")+ (inputOne - inputTwo));
			break;
		case"*":
			System.out.println(("Mulitiplication of two numbersis : ")+ (inputOne * inputTwo));
			break;
		case"/":
			System.out.println(("Division of two numbersis : ")+ (inputOne / inputTwo));
			break;
		case"%":
			System.out.println(("Modules of two numbersis : ")+ (inputOne % inputTwo));
			break;
			default:
				System.out.println("Please Enter a valid Operator");
				break;
				
		}
	
	}
	
}
