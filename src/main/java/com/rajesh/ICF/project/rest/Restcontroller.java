package com.rajesh.ICF.project.rest;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rajesh.ICF.project.entity.Employee;
import com.rajesh.ICF.project.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class Restcontroller {
 
	private EmployeeService employeeService;

	@Autowired
	public Restcontroller(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	@GetMapping("/employees")
	public List<Employee> getEmployee(){
		return employeeService.getEmployees();
	}

	@GetMapping("/employees/{employeeId}")
	public Employee getEmployeeById(@PathVariable int employeeId) {
		Employee emp=employeeService.getEmployee(employeeId);
		if(emp==null) {
			throw new RuntimeException("Entered wrong Employee Id: "+employeeId);
		}
		return emp;
	}
	@PostMapping("employees")
	public Employee saveEmployee(@Valid @RequestBody Employee theEmp) {
//		theEmp.setId(0);
		employeeService.saveEmployee(theEmp);
		return theEmp;
	}
	
	@PutMapping("employees")
	public Employee updateEmployee(@RequestBody Employee theEmp) {
		employeeService.saveEmployee(theEmp);
		return theEmp;
	}
	
	@DeleteMapping("employees/{employeeId}")
	public String delete(@PathVariable int employeeId) {
		Employee emp=employeeService.getEmployee(employeeId);
		if(emp==null) {
			throw new RuntimeException("Entered wrong Employee Id: "+employeeId);
		}
		employeeService.deleteEmployee(employeeId);
		return "Deleted employee with id= "+employeeId;
	}
}
