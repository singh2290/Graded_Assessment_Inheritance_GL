package com.gl.opps_assessment.model;

/**
 * @author Prateek Singh
 * @date 26th March 2022
 *  
 * @Notes Child class extending parent class Super Department. This class
 *           will inherit isTodayHoliday method from parent class. Method
 *           override is used to achieve runtime Polymorphism.
 */


public class HRDepartment extends SuperDepartment{
	public String departmentName() {
		return "Welcome to HR Department";
	}
    public String getTodaysWork() {
    	return "Fill today's timesheet and mark your attendance";
    }
    public String getWorkDeadline() {
    	return "Complete by EOD";
    }
    public String doActivity() {
    	return "Team Lunch";
    	    }
    public String isTodayAHoliday() {
    	return super.isTodayAHoliday();
    }
}
