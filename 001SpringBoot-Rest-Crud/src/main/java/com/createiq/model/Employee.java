package com.createiq.model;

public class Employee {

	private Integer eId;
	private String eName;
	private Double eSalary;
	
	public Employee() {
		super();
	}

	public Employee(Integer eId, String eName, Double eSalary) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eSalary = eSalary;
	}

	public Integer geteId() {
		return eId;
	}

	public void seteId(Integer eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public Double geteSalary() {
		return eSalary;
	}

	public void seteSalary(Double eSalary) {
		this.eSalary = eSalary;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eSalary=" + eSalary + "]";
	}
	
	
	
}
