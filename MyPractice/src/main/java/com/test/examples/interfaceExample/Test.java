package com.test.examples.interfaceExample;

public class Test implements Base {
	
	public void addition(){
	
		System.out.println(a+b);
	}
	@Override
	public int substraction() {
		int c=a-b;
		return c;
	}
	@Override
	public void multipile() {
		int e =2;
		int d=4;
		System.out.println("Method with zero Parameter::: "+d*e);
	}
	@Override
	public void multipile(int d) {
		int e=2;
			System.out.println("Method with one Parameter::: "+d*e);
	}
	@Override
	public void multipile(int d, float e) {
		System.out.println("Method with float as second Parameter::: "+d*e);
		
	}
	@Override
	public void multipile(float e, int d) {
		System.out.println("Method with float as First Parameter::: "+e*d);
	}
}
class Test2 extends Test{
	public void addition() {

		//super.addition();
		System.out.println(a);
		//super.addition();
	}
	public int substraction(){
		int c= b;
		return c;
	}
	
}