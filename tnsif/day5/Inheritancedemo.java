package com.tnsif.day5;

public class Inheritancedemo {
	
	public static void main(String[] args) {
		puppy p=new puppy();//obj for single
		p.bark();
		p.sleep();
		
		car c=new car();
		c.start();
		c.drive();
		bike b=new bike();//obj for multi level
		b.ride();
		b.start();
		b.drive();
		
		rose r=new rose();
		r.bloom();
		r.blooming();
		tulip t=new tulip();
		t.bud();
		t.bloom();
	}
}


	
		//single inheritance
		//parent class
		class Dog{
			void bark() {
				System.out.println("the dog is barking");
			}
		}
		//child class
		class puppy extends Dog{
			void sleep() {
				System.out.println("the puppy will sleep");
				
			}
		}
		
	
		//multiline inheritance
		//parent class
		class vehicel
		{
			void start() 
			{
				System.out.println("the vehicel is started");
			}
	
         } 
		//child class 1
		class car extends vehicel{
			void drive() {
				System.out.println("the car is driven by the driver");
			}
		}
		//child class 2
		class bike extends car{
			void ride(){
				System.out.println("the bike is ride by rider");
			}
		}
		
		
		
		
		
		//Hierarchical inheritance
		//parent class
		class flower {
			void bloom() {
				System.out.println("the flower is about to bloom");
			}
		}
		//child 1
		class rose  extends flower {
			void blooming(){
				System.out.println("the rose is blooming");
			}
		}
		//child 2
		class tulip extends flower {
			void bud() {
				System.out.println("the tupil is in bud shape");
				
			}
			
		}
		
		
