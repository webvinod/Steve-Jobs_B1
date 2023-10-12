package com.test.examples.operators;

import java.util.Scanner;
public class RelationalOperators {

	Scanner sc = new Scanner(System.in);
	
	void equalstoequlsto() {
		System.out.print("Enter Input One: ");
		int inputOne=sc.nextInt();
		System.out.print("Enter Input Two: ");
		int inputTwo=sc.nextInt();
		System.out.print("Guess the Output: ");
		int inputThree=sc.nextInt();
		if(inputThree==(inputOne*inputTwo)) {
			System.out.println("The Output you guessed and the Output are equal");
		}
		else {
			System.out.println("The Output you guessed and the Output are not equal Sorry Try Again");
		}
	}
	void notEquals() {
		//System.out.println("Check if ");
		System.out.print("Enter Word One: ");
		String inputOne=sc.next();
		System.out.print("Enter word Two: ");
		String inputTwo=sc.next();
		if(inputOne.length() !=inputTwo.length()) {
			System.out.println("The length of the both inputs are not equal");
		}else {
			System.out.println("The length of the both inputs are equal");
		}
	}
	void greaterThan() {
		System.out.print("Enter Input One: ");
		int varableOne = sc.nextInt();
		System.out.print("Enter Input Two: ");
		int varableTwo = sc.nextInt();
		if(varableOne>varableTwo) {
			System.out.println(""
					+ "Varable One is greater than varable Two");
		}else {
			System.out.println("Varable One is not greater than varable Two");
		}
	}
	
	void main() {
		while(true) {
			System.out.println();
			System.out.println("Enter '1' for EqualstoEqualsto (OR) Enter '2' for Not Equals (OR) "
					+ "Enter '3' for Greater Than (OR) Enter '4' for Division (OR) "
					+ "Enter '5' for Modulus (OR) Enter '0' to Exit.");
			System.out.print("Please enter a Number: ");
			int choose = sc.nextInt();
			if(choose==0) {
				System.out.println();
				System.out.println("Thanks You See You Soon !!!");
				break;
			}
			else if(choose==1) {
				System.out.println();
				equalstoequlsto();
			}
			else if(choose==2) {
				System.out.println();
				notEquals();
			}
			else if(choose==3) {
				System.out.println();
				greaterThan();
			}
			else {
				System.out.println();
			System.out.println("Please Enter from the below numbers only.");	
			}
		}
	}
}
