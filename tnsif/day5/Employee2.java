package com.tnsif.day5;

import java.util.Date;

public class Employee2 extends Person {
	private String dept;
	private float salary;
	
public Employee2(float salary, String dept) {
		this.salary = salary;
		this.dept = dept;
	}
public Employee2(String name, long conatctNo, Date dateOfBirth,float salary, String dept) {
	super(name,conatctNo,dateOfBirth);
	this.salary = salary;
	this.dept = dept;
}
/**
 * @return the dept
 */
public String getDept() {
	return dept;
}
/**
 * @param dept the dept to set
 */
public void setDept(String dept) {
	this.dept = dept;
}
/**
 * @return the salary
 */
public float getSalary() {
	return salary;
}
/**
 * @param salary the salary to set
 */
public void setSalary(float salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee2 [dept=" + dept + ", salary=" + salary + ", getName()=" + getName() + ", getConatctNo()="
			+ getConatctNo() + ", getDateOfBirth()=" + getDateOfBirth() + ", toString()=" + super.toString()
			+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
}

}
