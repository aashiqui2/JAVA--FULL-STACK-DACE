package com.method;

public class MethodDemo4 {
	
	int a;int b;
	int c;

	// static block
	static {
		System.out.println("hello");
	}
	// non static block
	{
		System.out.println("Hi");
	}

	MethodDemo4() {
		System.out.println("no -args construtor");
	}
	//Constructor Overloading
	MethodDemo4(int a,int b) {
		this.a=a;
		this.b=b;
	}
	
	MethodDemo4(int a,int b,int c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}

	public static void main(String[] args) {
		MethodDemo4 m = new MethodDemo4(2,3);// constructor
//		m.a=2;
//		m.b=3;

	}
}
