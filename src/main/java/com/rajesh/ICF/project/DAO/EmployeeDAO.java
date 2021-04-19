package com.rajesh.ICF.project.DAO;

import java.util.List;

import com.rajesh.ICF.project.entity.Employee;

public interface EmployeeDAO {

	public List<Employee> getEmployees();

	public void saveEmployee(Employee theEmployee);

	public Employee getEmployee(int theId);

	public void deleteEmployee(int theId);
}
