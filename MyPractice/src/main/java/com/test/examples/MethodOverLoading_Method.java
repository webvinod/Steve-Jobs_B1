package com.test.examples;

public class MethodOverLoading_Method {
void add(int inputOne ,int inputTwo) {
	System.out.println("Addition of two Inputs: "+(inputOne+inputTwo));
}
void add(int inputOne, int inputTwo, int inputThree) {
	System.out.println("Addition of three Inputs: "+(inputOne+inputTwo+inputThree));
}
void add(int inputOne,float inputTwo, int inputThree) {
	System.out.println("Three parameters with two different data types");
	System.out.println("Addition of three Inputs: "+ (inputOne+inputTwo+inputThree));
	}
void add(float inputOne, int inputTwo, int inputThree) {
	System.out.println("The order of the parameters are different");
}

}
