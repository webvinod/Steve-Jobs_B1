package com.test.examples.loops;

public class ConstructorOne {
	int inputOne;
	int inputTwo;
	int inputThree;
	public ConstructorOne() {
		
	}
	public ConstructorOne(int inputOne,int inputTwo,int inputThree) {
		super();
		this.inputOne=inputOne;
		this.inputTwo=inputTwo;
		this.inputThree=inputThree;
	}
	
	void add(){
		System.out.println("THis is a print function from an add method");
	}

}
