package com.test.examples.Atm;

import java.util.Scanner;

public class Atm {
	Scanner sc = new Scanner(System.in);
	String userid = "admin";
	String password = "admin";
	int numberOf500RuppesAvaliable = 20;
	int numberof2000RupeesAvaliable = 10;

	void usercheck() {
		System.out.print("Enter the userId: ");
		String inputOne = sc.next();
		System.out.print("Enter your Password: ");
		String inputTwo = sc.next();
		if (userid.equals(inputOne) && password.equals(inputTwo)) {
			process();
		} else {
			System.out.println("Please Enter a valid userId and password");
		}
	}

	void process() {
		System.out.println("Enter the amount which is multiples of 500");
		int inputThree = sc.nextInt();
		if (2000 * numberof2000RupeesAvaliable >= inputThree) {
			int outputTwo=inputThree-2000;
			System.out.println("Dispensing "+outputTwo);
			System.out.println("Dispensing 1500");
			System.out.println("Dispensing 500");
			
//			if (inputThree % 2000 == 0) {
//				int outputOne = (inputThree - 2000) / 2000;
//				System.out.println("Dispensing " + outputOne + " * 2000/-");
//			}
//			else {
//				System.out.println("please enter the amount multiples of 2000 only");
//			}
		} else if (500 * numberOf500RuppesAvaliable >= inputThree) {
			if (inputThree % 500 == 0) {
				int output = (inputThree - 500) / 500;
				System.out.println("Dispensing " + output + " * 500/-");
				System.out.println("Dispensing 5 * 100/-");
			} else {
				System.out.println("please enter the amount mulitiples of 500 only");
			}
		} 
		else {
			System.out.println("Unable to Dispensing the amount");
		}
	}

}
