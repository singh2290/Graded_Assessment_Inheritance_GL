package com.gl.opps_assessment.model;

/**
 * @author Prateek Singh
 * @date 26th March 2022
 *  
 * @Notes Child class extending parent class Super Department. This class
 *           will inherit isTodayHoliday method from parent class. Method
 *           override is used to achieve runtime Polymorphism.
 */

public class TechDepartment extends SuperDepartment {
	public String departmentName() {
		return "Welcome to Tech Department";
	}
     public String getTopdaysWork() {
    	 return "Complete coding of Module 1";
     }
    public String getWorkDeadline() {
    	return "Complete by EOD";
    	}
	public String getTechStackInformation() {
		return "core java";
	}
	
	public String isTodayAHoliday() {
		return super.isTodayAHoliday();
	}
}
