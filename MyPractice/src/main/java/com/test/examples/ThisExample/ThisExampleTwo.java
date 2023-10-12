package com.test.examples.ThisExample;

public class ThisExampleTwo extends ThisExampleOne {
	int variableOne= 40;
	
	int current(int variableOne) {
		System.out.println("Parameter ::"+variableOne);
	//here we use the this key word so the output is 40 because this key word refers to
	//the current class 
		System.out.println("this ::"+this.variableOne);
		System.out.println("with class name"+ThisExampleOne.variableOne);
		return variableOne;
	}
}
