package com.test.examples;


public class RegistrationMethod {

	void basicDetails() {
		RegistrationVariables registrationVariables= new RegistrationVariables();
		
		registrationVariables.setFirstName("KUNCHAKURI");
		registrationVariables.setLastName("VINOD KUMAR");
		registrationVariables.setMobileNumber(9110799448l);
		registrationVariables.setGender('M');
		registrationVariables.setAge((byte) 23);
		registrationVariables.setEmail("vinod@gmail.com");
			
		  
		  System.out.println("Name of the user: "+registrationVariables.getFirstName()+" "+registrationVariables.getLastName());
		  System.out.println("Email of the user: "+registrationVariables.getEmail());
		  //System.out.println("Last Name of the user: "+registrationVariables.getLastName()); 
		  System.out.println("Mobile Number of the user:+91 "+registrationVariables.getMobileNumber()); 
		  System.out.println("Gender of the user: "+registrationVariables.getGender());
		  System.out.println("Age of the user: "+registrationVariables.getAge());
		 
	}
	void address(){
		AddressInfo addressInfo= new AddressInfo();
		addressInfo.setPlotNumber("8");
		addressInfo.setRoadNumber("11A");
		addressInfo.setArea("Hitech City");
		addressInfo.setCity("Hyderabad");
		addressInfo.setCountry("INDIA");
		addressInfo.setZipcode("500018");
		System.out.println("Adress of the User: "+"PlotNumber"+addressInfo.getPlotNumber()+","+" "+"RoadNumber"+addressInfo.getRoadNumber()+",");
		System.out.println(addressInfo.getArea()+",");
		System.out.println(addressInfo.getCity()+",");
		System.out.println(addressInfo.getCountry()+",");
		System.out.println(addressInfo.getZipcode()+".");
	}
	StudentInfo student(){
		StudentInfo studentInfo=new StudentInfo();
		studentInfo.setStudentId("28937589234750");
		studentInfo.setCourseBatch("FirstBatch");
		studentInfo.setCourseDuration("Four Months");
		studentInfo.setCourseName("Full Stacks");
		studentInfo.setJoiningDate("23/06/05");
		System.out.println("Student Id: "+studentInfo.getStudentId());
		System.out.println(studentInfo.getCourseName());
		System.out.println(studentInfo.getCourseBatch());
		System.out.println(studentInfo.getCourseDuration());
		System.out.println(studentInfo.getJoiningDate());
		return studentInfo;
		
	}
	
}
