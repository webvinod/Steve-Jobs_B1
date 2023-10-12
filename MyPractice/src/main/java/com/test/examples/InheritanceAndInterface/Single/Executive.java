package com.test.examples.InheritanceAndInterface.Single;

public class Executive extends Employee {

	float bill() {
		float bonus = 45000f*1;
		System.out.println("Bonus for the Employee: "+bonus+" Ruppess Only");
		System.out.println("Salary of the Employee: "+salary+" Ruppess Only");
		return bonus;
	}
	
}
