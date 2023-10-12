package com.test.examples;

public class RegistrationMain {


	public static void main(String[] args) {
		RegistrationMethod registrationMethod = new RegistrationMethod();
		registrationMethod.basicDetails();
		registrationMethod.address();
		registrationMethod.student();
		//System.out.println(registrationMethod.student().getCourseBatch());
	}	

	
}
