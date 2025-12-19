package com.method;

public class MethodDemo3 {
	public static void main(String[] args) {
		MethodDemo3 m = new MethodDemo3();
		int c=m.add(2,3);
		System.out.println(c);
		
		int d=m.add(2, 3,4);
		System.out.println(d);
		
		float f= m.add(12.f,3.17f);
		System.out.println(f);
			
	}	
	//method overloading -same method name but different argument
	//(compile time polymorphism)
	int add(int a,int b)
	{
		return a+b;
	}
	
	int add(int a,int b,int c)
	{
		return a+b+c;
	}
	
	float add(float a,float b)
	{
		return a+b;
	}
}
