package com.test.examples.Factorial;

import java.util.Scanner;

public class Factorial {
	void factorialcalculation() {
		Scanner sc = new Scanner(System.in);
		int factorial = 1;
		int outputFactorial;
		System.out.print("Enter a nuber to find it's Factorial");
		int inputFactorial = sc.nextInt();
		
		if (inputFactorial<0) {
			System.out.println("Number should be non-negative.");
		}
		else {
		for(outputFactorial=1; outputFactorial<=inputFactorial; outputFactorial++) {
			factorial = factorial*outputFactorial;
			}
			System.out.println("Factorial of "+inputFactorial+" is = "+factorial);

		}
	}
}
