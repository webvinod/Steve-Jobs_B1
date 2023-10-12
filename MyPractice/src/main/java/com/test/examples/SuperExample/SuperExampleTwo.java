package com.test.examples.SuperExample;

public class SuperExampleTwo extends SuperExampleOne{

	int variableOne = 30;
	int superMethod(int variable) {
		// Here variable refers to the local parameter.
		System.out.println("Local parameter ::: "+variable);
		// Here this variable refers to the current class variable.
		System.out.println("Current class parameter ::: "+this.variableOne);
		// Here super refers to the parent class variable.
		System.out.println("Parent class parameter ::: "+super.variableOne);
		return variable;
	}
}
