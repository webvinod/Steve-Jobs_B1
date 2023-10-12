package com.test.examples.InheritanceAndInterface.Multilevel;

public class Marks extends Student {

	float marks;
	void getMarks(float marksgain) {
		marks=marksgain;
	}
	void putMarks() {
		System.out.println("Marks obtained by Student= "+marks+"%");
	}
}
