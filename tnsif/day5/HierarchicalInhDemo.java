package com.tnsif.day5;

public class HierarchicalInhDemo {
	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println("----------------- Person Details ---------------------");
		System.out.println(p1);

		Person1 p;
		p = new Person1("Dhruv", "Mumbai");
	
			System.out.println("Person Details "+p);
		
		p = new Employee("Nikhil", "Mumbai", 101, 67000, "Sales");
		if (p instanceof Employee)
		System.out.println("Employee Details "+p);
		

		p = new Student1("Pankaj", "Pune", "FE", 88);
		
			System.out.println("Student Details "+p);

	}

	}

