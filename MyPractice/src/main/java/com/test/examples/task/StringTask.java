package com.test.examples.task;
import java.util.Scanner;

public class StringTask {

	void findingWord() {
		String str ="A journey of a thousand miles begins with a single step miles.";
		String str1="miles";
		//System.out.println("Finding the starting index of the word::: "+str.indexOf(str1,0)); 
		System.out.println("The starting index of the given word "+str1+" is::: "+str.indexOf(str1)); 
		//System.out.println("Finding the character in the String by index value::: "+str.charAt(24));
		
		}
	void noOfCharsInWord() {
		String str="VinodKumar";
		System.out.println("Number of charecters in a given string "+str+" is::: "+str.length());
	}
	void wordSearch() {
		String str ="A journey of a thousand miles begins with a single step miles.";
		String str1= "single";
		if(str.contains(str1)){
			System.out.println("Matching Word found");
		}else {
			System.out.println("Matching Word not found");
		}
		
	}
	void numberOfWordsInPeragraph() {
		String str="During the just reign of Ibrahim Kootb Shah, Tulingana, like Egypt, "
			+ "became the mart of the whole world. Merchants from Toorkistan, Arabia, and "
			+ "Persia resorted to it; and they met with such encouragement that they found "
			+ "in it inducements to return frequently. The greatest luxuries from foreign "
			+ "parts daily abounded at the king's hospitable board.";
		String []str2=str.split(" ");
		System.out.println("Number of word in a peragraph is ::: "+str2.length);
	}
	int findBigNumberInArray(int[] arr){
		if(arr.length==0) {
			System.out.println("Array cannot be empty");
		}
		int maxNumber = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>maxNumber) {
				maxNumber= arr[i];
			}
			
		}
		return maxNumber;	
	}
	
	
	void main() {
		Scanner sc =new Scanner(System.in);
		while(true) {
			System.out.println("Give '0' to Exit (OR) Give '1' for Finding Word (OR) Give '2' for Number of Cahrs in a word "
					+ "(OR) Give '3' for Word Search (OR) Give '4' for Number of word in a peragraph (OR) '5' for Finding "
					+ "the max number in an Array");
			System.out.print("Please enter a Number: ");
			int choose=sc.nextInt();
			if(choose==0) {
				System.out.println("Thanks for your Inputs! See You Soon");
				break;
			}
			else if(choose==1) {
				findingWord();
			}
			else if(choose==2) {
				noOfCharsInWord();
			}
			else if(choose==3) {
				wordSearch();
			}
			else if(choose==4) {
				numberOfWordsInPeragraph();
			}
			else if(choose==5) {
				System.out.println("Please enter the six array values: ");
				int [] numbers= {sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()};
				int maxNumber=findBigNumberInArray(numbers);
				 System.out.println("The maximum number is: " + maxNumber);
			}
			else {
				System.out.println("Pleas choose from the below options only");
			}
		}
		
	}

	
}
