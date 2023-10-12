package com.test.examples.starpatterns;

import java.util.Scanner;

public class Star {

	void normal(int input) {
		if(input==0) {
			System.out.println("Please Enter a number which is non-zero");
		}
		for(int i=1;i<=input;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	void normal_reverse(int input) {
		if(input==0) {
			System.out.println("Please Enter a number which is non-zero");
		}
		for(int i=0;i<input;i++) {
			for(int j=input;j>i;j--) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	void normal_mirror(int input) {
		if(input==0) {
			System.out.println("Please Enter a number which is non-zero");
		}
		for(int i=1;i<=input;i++) {
			for(int j=1;j<=input-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	void normal_reverse_mirror(int input) {
		if(input==0) {
			System.out.println("Please Enter a number which is non-zero");
		}
		for(int i=0;i<input;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=input;k>i;k--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	void main() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Give '0' to Exit (OR) Give '1' for Normal (OR) Give '2' for Normal-Riverse "
					+ "(OR) Give '3' for Mirror-Normal (OR) Give '4' for Mirror-Normal-Riverse");
			System.out.print("Please enter a Number: ");
			int choice=sc.nextInt();
			if(choice==0) {
				System.out.println("Thanks for your Inputs! See You Soon");
				break;
			}
			else if(choice==1) {
				System.out.print("Please enter a Number for stars: ");
				int input=sc.nextInt();
				normal(input);	
				System.out.println("Give 0 to Continue(OR) Give 1 to Exit");
				int choice2=sc.nextInt();
				if(choice2==1) {
					System.out.println("Thanks for giving inputs");
					break;
				}
						}
			else if (choice==2) {
				System.out.print("Please enter a Number for stars: ");
				int input=sc.nextInt();
				normal_reverse(input);
				System.out.println("Give 0 to Continue(OR) Give 1 to Exit");
				int choice2=sc.nextInt();
				if(choice2==1) {
					System.out.println("Thanks for giving inputs");
					break;
				}
			}
			else if (choice==3) {
				System.out.print("Please enter a Number for stars: ");
				int input=sc.nextInt();
				normal_mirror(input);
				System.out.println("Give 0 to Continue(OR) Give 1 to Exit");
				int choice2=sc.nextInt();
				if(choice2==1) {
					System.out.println("Thanks for giving inputs");
					break;
				}
			}
			else if(choice==4) {
				System.out.print("Please enter a Number for stars: ");
				int input=sc.nextInt();
				normal_reverse_mirror(input);
				System.out.println("Give 0 to Continue(OR) Give 1 to Exit");
				int choice2=sc.nextInt();
				if(choice2==1) {
					System.out.println("Thanks for giving inputs");
					break;
				}
			}
			else {
				System.out.println("Pleas choose from the below options only");
			}
			
		}
	}
}
