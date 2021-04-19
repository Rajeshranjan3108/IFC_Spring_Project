package com.rajesh.ICF.project.DAO;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rajesh.ICF.project.entity.Employee;
@Repository
public class EmployeeDAOImplementation implements EmployeeDAO {

	//creation for hibernate
	
	private EntityManager entityManager;
	@Autowired
	public EmployeeDAOImplementation(EntityManager entityManager) {
		this.entityManager = entityManager;
	}	

	@Override
	public List<Employee> getEmployees() {
		Session curr=entityManager.unwrap(Session.class);
		Query<Employee> theQuery=curr.createQuery("from Employee", Employee.class);
		List<Employee> li=theQuery.getResultList();
		return li;
	}


	@Override
	public void saveEmployee(Employee theEmployee) {
		Session curr=entityManager.unwrap(Session.class);
		curr.saveOrUpdate(theEmployee);

	}

	@Override
	public Employee getEmployee(int theId) {
		Session curr=entityManager.unwrap(Session.class);
		Employee emp=curr.get(Employee.class, theId);
		return emp;
	}

	@Override
	public void deleteEmployee(int theId) {
		Session curr=entityManager.unwrap(Session.class);
		Employee emp=curr.get(Employee.class, theId);
		curr.delete(emp);
		
		
	}

}
