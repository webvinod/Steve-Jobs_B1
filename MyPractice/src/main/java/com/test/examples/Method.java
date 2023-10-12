package com.test.examples;

public class Method {
	 Varables varables= new Varables();
	 Varables getdata() {
		 if(varables.varOne==varables.varTwo) {
			 System.out.println("varOne is not equal");
		 }else {
				 System.out.println("i am else");
			 }
		 return varables;
		 
	 }
	 Varables getdataOne() {
		 if (varables.varOne>varables.varTwo)
			 System.out.println("varOne is greatherthan varTwo"+ (varables.varOne>varables.varTwo));
		 else {
			 System.out.println("varOne is lessthan varTwo: "+ (varables.varOne<varables.varTwo));
		 }
		 
		 if (varables.varOne>varables.varTwo) {
			 System.out.println("Value of varOne is: "+ varables.varOne  );
		 }else if(varables.varOne>=varables.varTwo){
			 System.out.println("Value of varOne is: "+ varables.varTwo);
		 }
		 else if(varables.varOne==varables.varFour) {
			 System.out.println("Value of varOne is equal to varFour");
			 }
		 else {
			 System.out.println("None of the conditions are correct");
		 }
		 return varables;
	 }
		

	}
	

