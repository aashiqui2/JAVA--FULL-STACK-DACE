package com.interfaces;

public interface OfficeRules {
	public final int salary = 25000;
	public final int no_of_leaves = 10;

	abstract void work_8_hours();

	abstract void wear_formals();

	default void work() {
		System.out.println("working in ZOHO");
	}
	
	default void canteen() {
		System.out.println("food is good in canteen");
	}

	public static void main(String[] args) {
		System.out.println("Office Interface");
	}
	
	static void Company_name()
	{
		System.out.println("ZOHO");
	}

}
