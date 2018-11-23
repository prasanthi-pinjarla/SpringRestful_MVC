package com.cg.springwithangular.staticdb;

import java.util.ArrayList;
import java.util.List;

import com.cg.springwithangular.beans.Employee;



public class EmployeeDb {
private static List<Employee> empList=new ArrayList<Employee>();
	
	static{
		
		empList.add(new Employee(1001,"Akhil Kiran",5000,"Java"));
		empList.add(new Employee(1002,"Prasanthi",6000,"Java"));
		empList.add(new Employee(1003,"Subha Sri",7000,".Net"));
		empList.add(new Employee(1004,"Ravi Kiran",9000,"Mainframe"));
		empList.add(new Employee(1005,"Chaitanya",8000,"SAP"));
	}

	public static List<Employee> getEmpList() {
		
		return empList;
	}

	public static void setCountryList(List<Employee> empList) {
		
		EmployeeDb.empList = empList;
	}
}

