package com.test.examples.FinalExample;

public class FinalExampleTwo extends FinalExampleOne {
	
	 void finalMethod() {
	// Here it is possible because only the variableOne in FinalExampleOne is in default
		 variableOne=6;
		 System.out.println(variableOne);
	// If i change the variableOne to final it gives an compiler error 
	//saying The final field FinalExampleOne.variableOne cannot be assigned
	// And it is same for methods and class also.
	}
	 
	 /*If you try to over ride a final method.
	  * Cannot override the final method from FinalExampleOne
	 - overrides 
	 com.test.examples.FinalExample.FinalExampleOne.finalMethod*/
//   int finalMethod(int variableOne){
//		 
//	 }

	
}
