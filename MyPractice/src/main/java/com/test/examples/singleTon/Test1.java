package com.test.examples.singleTon;

public class Test1 {
	 int inputOne=12;
	static Test1 inputTwo=null;
	private Test1() {
		
	}
	public static Test1 getInstance(){
		if(inputTwo==null){
			System.out.println("Obj null ::");
			return inputTwo= new Test1();		
			}
		System.out.println("Outer ::: ");
		return inputTwo;
	}
}
