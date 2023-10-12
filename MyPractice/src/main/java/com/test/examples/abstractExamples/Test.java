package com.test.examples.abstractExamples;

public abstract class Test {
	static int inputOne=10;
	static int inputTwo=2;
	static void add() {
		System.out.println("Addition :::"+(inputOne+inputTwo));
	}
	static int multi() {
		System.out.println(inputOne*inputTwo);
		return 2;
	}
  abstract int sub();
  abstract int div();
}
