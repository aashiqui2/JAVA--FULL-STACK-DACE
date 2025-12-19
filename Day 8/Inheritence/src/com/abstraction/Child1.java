package com.abstraction;

public class Child1 extends Parent1 {
	Child1() {
		System.out.println("no-arg constructor in child");
	}

	public static void main(String[] args) {
		Child1 c = new Child1();
		c.work();

	}

	// method overriding(runtime polymorphism)
	// do not change the visiblity of the method
	protected void work() {
		System.out.println("Working in Office");
	}

	@Override
	void study() {
		System.out.println("Studying AWS");

	}

}
