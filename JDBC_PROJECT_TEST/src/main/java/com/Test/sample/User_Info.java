package com.Test.sample;

import java.util.Date;

public class User_Info {
	
	int  ID ;
	String FIRST_NAME;
	String LAST_NAME;
	String GENDER;
	String COURSE;
	String STATUS_OF_STUDENT;
	Date CREATED_DATE;
	String CREATED_USER;
	Date UPDATED_DATE;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getFIRST_NAME() {
		return FIRST_NAME;
	}
	public void setFIRST_NAME(String fIRST_NAME) {
		FIRST_NAME = fIRST_NAME;
	}
	public String getLAST_NAME() {
		return LAST_NAME;
	}
	public void setLAST_NAME(String lAST_NAME) {
		LAST_NAME = lAST_NAME;
	}
	public String getGENDER() {
		return GENDER;
	}
	public void setGENDER(String gENDER) {
		GENDER = gENDER;
	}
	public String getCOURSE() {
		return COURSE;
	}
	public void setCOURSE(String cOURSE) {
		COURSE = cOURSE;
	}
	public String getSTATUS_OF_STUDENT() {
		return STATUS_OF_STUDENT;
	}
	public void setSTATUS_OF_STUDENT(String sTATUS_OF_STUDENT) {
		STATUS_OF_STUDENT = sTATUS_OF_STUDENT;
	}
	public Date getCREATED_DATE() {
		return CREATED_DATE;
	}
	public void setCREATED_DATE(Date cREATED_DATE) {
		CREATED_DATE = cREATED_DATE;
	}
	public String getCREATED_USER() {
		return CREATED_USER;
	}
	public void setCREATED_USER(String cREATED_USER) {
		CREATED_USER = cREATED_USER;
	}
	public Date getUPDATED_DATE() {
		return UPDATED_DATE;
	}
	public void setUPDATED_DATE(Date uPDATED_DATE) {
		UPDATED_DATE = uPDATED_DATE;
	}
	@Override
	public String toString() {
		return "User_Info [ID=" + ID + ", FIRST_NAME=" + FIRST_NAME + ", LAST_NAME=" + LAST_NAME + ", GENDER=" + GENDER
				+ ", COURSE=" + COURSE + ", STATUS_OF_STUDENT=" + STATUS_OF_STUDENT + ", CREATED_DATE=" + CREATED_DATE
				+ ", CREATED_USER=" + CREATED_USER + ", UPDATED_DATE=" + UPDATED_DATE + "]";
	}
	
	
	}
