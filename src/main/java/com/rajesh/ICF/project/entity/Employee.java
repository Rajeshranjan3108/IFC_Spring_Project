package com.rajesh.ICF.project.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="employee")
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@NotNull(message="required")
	@Column(name="first_name")
	private String firstName;
	
	@NotNull(message="required")
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="emp_id")
	private String empId;

	
	@NotNull(message="required")
	@Column(name="start_date")
	private Date startDate;
	
	@NotNull(message="required")
	@Column(name="designation")
	private String Designation;
	
	@NotNull(message="required")
	@Column(name="department")
	private String Department;
	
	@NotNull(message="required")
	@Column(name="end_date")
	private Date endDate;
	
	@NotNull(message="required")
	@Column(name="status")
	private String status;
	
	@NotNull(message="required")
	@Column(name="dob")
	private Date DOB;
	
	@NotNull(message="required")
	@Column(name="reporting_manager")
	private String reportingManager;
	
	@NotNull(message="required")
	@Column(name="gender")
	private String gender;
	
	@NotNull(message="required")
	@Column(name="blood_group")
	private String bloodGroup;
	
	@NotNull(message="required")
	@Column(name="address")
	private String address;
	
	public Employee() {
	}

	public Employee(String firstName, String lastName, Date startDate, String designation,
			String department, Date endDate, String status,Date dOB, String reportingManager, String gender,
			String bloodGroup, String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.startDate = startDate;
		Designation = designation;
		Department = department;
		this.endDate = endDate;
		this.status = status;
		DOB = dOB;
		this.reportingManager = reportingManager;
		this.gender = gender;
		this.bloodGroup = bloodGroup;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmpId() {
		return "EMP"+getId();
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date dOB) {
		DOB = dOB;
	}

	public String getReportingManager() {
		return reportingManager;
	}

	public void setReportingManager(String reportingManager) {
		this.reportingManager = reportingManager;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", empId=" + empId
				+ ", startDate=" + startDate + ", Designation=" + Designation + ", Department=" + Department
				+ ", endDate=" + endDate + ", status=" + status + ", DOB=" + DOB + ", reportingManager="
				+ reportingManager + ", gender=" + gender + ", bloodGroup=" + bloodGroup + ", address=" + address + "]";
	}

	
	
}
