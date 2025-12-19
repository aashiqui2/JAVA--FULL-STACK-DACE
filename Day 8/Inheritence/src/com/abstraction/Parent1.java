package com.abstraction;

public abstract  class Parent1 {
	
	Parent1()
	{
		System.out.println("No-args parent Constructor");
	}
	
	protected void work()
	{
		System.out.println("working in home");
	}
	
	void watch_Tv()
	{
		System.out.println("watching Tv");
	}
	
	abstract void study();

}
