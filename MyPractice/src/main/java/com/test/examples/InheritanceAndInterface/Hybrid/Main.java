package com.test.examples.InheritanceAndInterface.Hybrid;

public class Main {
	
	public static void main(String []args) {
		College college = new College();
		Artificial_Intelligence artificial_Intelligence = new Artificial_Intelligence();
		Data_Engineering data_Engineering = new Data_Engineering();
		
		college.computerScienceMethod();
		artificial_Intelligence.computerScienceMethod();
		data_Engineering.computerScienceMethod();
	}

}
