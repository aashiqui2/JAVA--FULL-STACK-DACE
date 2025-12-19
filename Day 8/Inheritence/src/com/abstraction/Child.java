package com.abstraction;

public class Child extends Parent{
	Child()
	{
		System.out.println("Child Constructor");
	}
	
	public static void main(String[] args) {
		Child c= new Child();
		c.study();
		//c.pocket_money=1000; cannot change the final variable
		System.out.println(c.pocket_money);
		//static variable can be accessed by class name
		System.out.println(Parent.cash);
	}
	//Cannot override the final method from Parent
	/*void work()
	{
		System.out.println("working in IT");
	}*/

	@Override
	void study() {
		System.out.println("Studying Java");
		
	}
}
