package com.test.examples.InheritanceAndInterface.Multilevel;

public class Sports extends Marks{
	float score;
	void getScore(float scored) {
		score=scored;
	}
	void putScore() {
		System.out.println("Score Scored by the Student= "+score);
	}
}
