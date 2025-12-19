package com.interfaces;

public class SoftwareEngineer extends Parent implements OfficeRules,TrafficeRules{
	public static void main(String[] args) {
		SoftwareEngineer se= new SoftwareEngineer();
		se.go_left();
		se.wear_formals();
		se.watching_Tv();
		se.canteen();
		OfficeRules.Company_name();
		
		//dynamic binding
		OfficeRules off= new SoftwareEngineer();
		//off.wear_helmet();
		off.canteen();
	}
	
	void take_break()
	{
		System.out.println("taking break");
	}
	
	void using_Mobile()
	{
		System.out.println("watching YT");
	}

	@Override
	public void work() {
		System.out.println("working as solution architect");
		
	}

	@Override
	public void go_left() {
		System.out.println("going left side...");
	}

	@Override
	public void wear_helmet() {
		System.out.println("weared helmet");	
	}

	@Override
	public void work_8_hours() {
		System.out.println("i'll work 8 hours");	
	}

	@Override
	public void wear_formals() {
		System.out.println("wear formals");	
	}

}
