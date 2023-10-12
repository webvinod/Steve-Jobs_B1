package com.test.examples.loops;

public class MyFirstLoop {
	public static void main(String[] args) {
		// A normal loop which prints for four times.
		for(int i=5;i>=2;i--) {
			System.out.println("I am a loop and i run for four times.");
			 
		}
		//Increments tested here.
	  /* int a=10;
		 int b= a++;
		 int c =a;
		 System.out.println("This is the value of a:: "+a);
		 System.out.println("This is the value of b:: "+b);
		 System.out.println("This is the value of c:: "+c);*/
		
		// for loop with if used below.
		// we used array length here array length starts from 1 and array index starts from zero(0).
		int[]d= {10,20,22,30,40,50};
		for(int j=0;j<d.length;j++) {
			if(j<=4) {
				// here we used another if condition in the if here we skip the 22 value because we use continue.
				if(j==2)
					continue;
				System.out.print(d[j]+", ");
			}else
				System.out.print(d[j]);
		}
		
	}

}


