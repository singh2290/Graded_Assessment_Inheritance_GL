package com.gl.opps_assessment.model;

/**
 * @author Prateek Singh
 * @date 26th March 2022
 *  
 * @Notes Child class extending parent class Super Department. This class
 *           will inherit isTodayHoliday method from parent class. Method
 *           override is used to achieve runtime Polymorphism.
 */
public class AdminDepartment extends SuperDepartment{
	public String departmentName() {
		return "Welcome to Admin Department";
	}
    public String getTodaysWork() {
    	return "Complete your documents Submission";
    	    }
    public String getWorkDeadline() {
    	return "Complete by EOD";
    	}
    public String isTodayAHoliday() {
    	return super.isTodayAHoliday();
    	
    }
	//public AdminDepartment() {
		//super();
		// TODO Auto-generated constructor stub
	}
 
