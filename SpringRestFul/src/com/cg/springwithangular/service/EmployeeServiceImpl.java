package com.cg.springwithangular.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.springwithangular.beans.Employee;
import com.cg.springwithangular.dao.IEmployeeDao;
@Service("empservive")
public class EmployeeServiceImpl implements IEmployeeService {
    
	@Autowired
	IEmployeeDao empdao;
	
	@Override
	public List<Employee> getAllEmployee() {
		
		return empdao.getAllEmployee();
	}

	@Override
	public void addEmployee(Employee emp) {
		empdao.addEmployee(emp);
		
	}

	@Override
	public void deleteEmployee(int id) {
		empdao.deleteEmployee(id);
		
	}

	@Override
	public Employee searchEmployee(int id) {
		
		return empdao.searchEmployee(id)
				;
	}

	@Override
	public void updateEmployee(Employee emp) {
		empdao.updateEmployee(emp);
		
	}

}
