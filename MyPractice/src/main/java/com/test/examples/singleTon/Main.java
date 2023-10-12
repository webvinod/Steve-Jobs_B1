package com.test.examples.singleTon;

public class Main {
	public static void main(String[] args) {
		Test1 test1 = Test1.getInstance();
		System.out.println(test1.inputOne);
		Test1 test2= Test1.getInstance();
		System.out.println(test2.inputOne);
		
	}
}
