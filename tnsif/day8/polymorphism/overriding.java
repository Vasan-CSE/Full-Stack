package com.tnsif.day8.polymorphism;

public class overriding {		
	String name;
	int age;
	String dept;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	@Override
	public String toString() {
		return "OopsConceptDemo [Name=" + name + ", age=" + age + ", dept=" + dept + "]";
		
	}
	
	public static void main(String[] args) {
		overriding obj = new overriding();
		obj.setName("BALAJI");
		obj.setAge(22);
		obj.setDept("AI&DS");
		System.out.println(obj);
	}	
	
}

