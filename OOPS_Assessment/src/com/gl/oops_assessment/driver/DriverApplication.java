package com.gl.oops_assessment.driver;
import com.gl.opps_assessment.model.AdminDepartment;
import com.gl.opps_assessment.model.HRDepartment;
import com.gl.opps_assessment.model.TechDepartment;

/**
 * @author Prateek Singh
 * @Date 26th March 2022
 *  
 * @category Hierarchical inheritance , Method Overriding(run-time Polymorphism)
 * 
 * @Notes This is Driver/Main class which will have objects of Admin, HR and
 *           Tech
 * @result Details of all department will be displayed
 */
public class DriverApplication {

	public static void main(String[] args) {
		AdminDepartment Admin = new AdminDepartment();
		HRDepartment HR = new HRDepartment();
		TechDepartment TD = new TechDepartment();	
		
		System.out.println(Admin.departmentName());
		System.out.println(Admin.getTodaysWork());
		System.out.println(Admin.getWorkDeadline());
		System.out.println(Admin.isTodayAHoliday() + "\n");
		
		System.out.println(HR.departmentName());
		System.out.println(HR.doActivity());
		System.out.println(HR.getTodaysWork());
		System.out.println(HR.getWorkDeadline());
		System.out.println(HR.isTodayAHoliday() + "\n");
		
        System.out.println(TD.departmentName());
        System.out.println(TD.getTopdaysWork());
        System.out.println(TD.getWorkDeadline());
        System.out.println(TD.getTechStackInformation());
        System.out.println(TD.isTodayAHoliday() + "\n");
	}

}
