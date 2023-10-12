package com.test.examples.interfaceExample;

public class Main {

public static void main(String[] args) {
	Test test = new Test();
	Test2 test2 = new Test2();
	test.addition();
	System.out.println(test.substraction());
	test2.addition();
	System.out.println(test2.substraction());
	test.multipile();
	test.multipile(4);
	test.multipile(2, 4.0f);
	test.multipile(4.0f, 2);
	}	

}