package com.test.examples.abstractExamples;

public class Test2 extends Test {

	public static void main(String[] args) {
		add();	
	Test2 test2 =new Test2();
	test2.sub();
	multi();
	test2.div();
	}
	 int sub() {
		System.out.println(inputOne-inputTwo);
		return 1;
	}
	static void add(){
		System.out.println("hello i am not add ");
		
		 
	 }
	int div() {
		System.out.println("hey i am division your answer is::: "+ inputOne/inputTwo);
		return 2;
	}
}
 