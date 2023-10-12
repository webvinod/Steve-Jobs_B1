package com.test.examples;

public class IfConditions {
	int a =44;
	
	public static void main(String[]args) {
		IfConditions ifConditions= new IfConditions();	
		ifConditions.single();
		ifConditions.getdata();
		ifConditions.getdataTwo();
	}
	void single() {
		if (a<=20) {
			System.out.println("The variable is "+ a);
						}
	}


void getdata() {
if (a>=3) {
	System.out.println("A is greather than 3");
		}else{
		System.out.println("A is lessthan 3");	
		}	
}
void getdataTwo() {
	if(a<=3) {
		System.out.println("A is greather than 3 from if elseif ");
	}else if(a==3){
		System.out.println("A is lessthan 3 from if elseif ");
	}else {
		System.out.println("It is a default value");
	}
}
}
