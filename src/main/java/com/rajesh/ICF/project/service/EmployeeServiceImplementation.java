package com.rajesh.ICF.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rajesh.ICF.project.DAO.EmployeeDAO;
import com.rajesh.ICF.project.entity.Employee;
@Service
public class EmployeeServiceImplementation implements EmployeeService {

	
	private EmployeeDAO employeeDAO;
	
	@Autowired
	public EmployeeServiceImplementation(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}
	
	@Override
	@Transactional
	public List<Employee> getEmployees() {
		
		return employeeDAO.getEmployees();
	}


	@Override
	@Transactional
	public void saveEmployee(Employee theEmployee) {
		employeeDAO.saveEmployee(theEmployee);

	}

	@Override
	@Transactional
	public Employee getEmployee(int theId) {
		
		return employeeDAO.getEmployee(theId);
	}

	@Override
	@Transactional
	public void deleteEmployee(int theId) {
		employeeDAO.deleteEmployee(theId);

	}

}
