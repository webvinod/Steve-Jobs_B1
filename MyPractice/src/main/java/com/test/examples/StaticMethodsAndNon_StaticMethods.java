package com.test.examples;


public class StaticMethodsAndNon_StaticMethods {
	static int a=10;
	int b=20;
	
	static void add() {
		System.out.println(a);
	}
	void sub() {
		System.out.println(b);
		System.out.println(a);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  StaticMethodsAndNon_StaticMethods sm=new StaticMethodsAndNon_StaticMethods();
		  add(); sm.sub();
		 
	}

}
