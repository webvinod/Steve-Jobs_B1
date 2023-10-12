package com.test.examples.operators;

import java.util.Scanner;

public class ArithmeticOperators {
	Scanner sc = new Scanner(System.in);

	void add() {
		System.out.print("Enter Input One: ");
		int inputOne = sc.nextInt();
		System.out.print("Enter Input Two: ");
		int inputTwo = sc.nextInt();
		System.out.println("Addition of InputOne and InputTwo is: " + (inputOne + inputTwo));
	}

	void subtract() {
		System.out.print("Enter Input One: ");
		int inputOne = sc.nextInt();
		System.out.print("Enter Input Two: ");
		int inputTwo = sc.nextInt();
		System.out.println("Substraction of InputOne and InputTwo is: " + (inputOne - inputTwo));
	}

	void multiplication() {
		System.out.print("Enter Input One: ");
		int inputOne = sc.nextInt();
		System.out.print("Enter Input Two: ");
		int inputTwo = sc.nextInt();
		System.out.println("Mulitiplication of InputOne and InputTwo is: " + (inputOne * inputTwo));
	}

	void division() {
		System.out.print("Enter Input One: ");
		int inputOne = sc.nextInt();
		System.out.print("Enter Input Two: ");
		int inputTwo = sc.nextInt();
		System.out.println("Division of InputOne and InputTwo is: " + (inputOne / inputTwo));
	}

	void modulus() {
		System.out.print("Enter Input One: ");
		int inputOne = sc.nextInt();
		System.out.print("Enter Input Two: ");
		int inputTwo = sc.nextInt();
		System.out.println("Modulus of InputOne and InputTwo is: " + (inputOne % inputTwo));
	}

	void main() {
		while (true) {
			System.out.println();
			System.out.println("Enter '1' for Addition (OR) Enter '2' for Subtract (OR) "
					+ "Enter '3' for Mulitiplication (OR) Enter '4' for Division (OR) "
					+ "Enter '5' for Modulus (OR) Enter '0' to Exit.");
			System.out.print("Please enter a Number: ");
			int choose = sc.nextInt();
			if (choose == 0) {
				System.out.println();
				System.out.println("Thanks You See You Soon !!!");
				break;
			} else if (choose == 1) {
				System.out.println();
				add();

			} else if (choose == 2) {
				System.out.println();
				subtract();
			} else if (choose == 3) {
				System.out.println();
				multiplication();
			} else if (choose == 4) {
				System.out.println();
				division();
			} else if (choose == 5) {
				System.out.println();
				modulus();
			} else {
				System.out.println();
				System.out.println("Please Enter from the below numbers only.");
			}
		}

	}
}
