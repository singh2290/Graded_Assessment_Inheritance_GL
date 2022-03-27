/**
 * @author Prateek Singh
 * @date 26th March 2022
 *  
 * @implNote this is Super Department class which will be extended by Admin,
 *           HumanResource and Technical class
 *
 */

package com.gl.opps_assessment.model;

public class SuperDepartment {
	public String departmentName() {
		return "Super Department";
	}
    public String getTodaysWork() {
    	return "No Work as of now";
    	
    }
    public String getWorkDeadline() {
    	return "Nil";
    	
    }
    public String isTodayAHoliday() {
    	return "Today is not a Holiday";
    }
    
}

