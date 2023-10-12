package com.test.examples;

public class IfCondition {
static int z =1;
static String mobile ="iphone";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//getdata();
		switch1();

	}
	static void getdata() {
		 int a =10,b=4,c=15,d=90;
		if(a>b && b<c){
			if(b<=c) {
				if(c>=d) {
					System.out.println("var d is not-greater :"+d);
				}else {
					System.out.println("var d is greater than: "+c);
					if(d>=a) {
						System.out.println("It is condition in else statement");
					}
				}
				
			}else {
				System.out.println("var c value is :" +c);
			}
		}else{
			System.out.println("The variable b is greather than a and c");
		}
	}
	static void switch1() {
	
		switch(z) {
		case 1: System.out.println("😇");
		break;
		case 2: System.out.println("hai 🥸");
		break;
		}
		switch(mobile) {
		case "samsung": System.out.println("We compare with other mobiles 📲");
		break;
		case "iphone": System.out.println("🍏 👽 We only campare with our self's 📱");
		break;
		case "motarola": System.out.println("we are an INDIAN brand");
		break;
		}
		
	}

}
