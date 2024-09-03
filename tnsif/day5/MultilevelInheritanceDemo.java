package com.tnsif.day5;
import java.text.SimpleDateFormat;
import java.util.Date;


public class MultilevelInheritanceDemo {
	public static void main(String[] args) {

		Person p1 = new Person("Atharv", 7878767676l, new Date(2000, 12, 2));
		System.out.println(p1);

		p1 = new Employee2("Pranav", 8080807070l, new Date(1995, 05, 07),40000, "Sales");
		System.out.println(p1);

		p1 = new LevelOneEmployee("Madhur", 9880807227l, new Date(1988, 15, 02), 85000,"Account", 200 ,"Signing Authority");
		System.out.println(p1);
	}}


