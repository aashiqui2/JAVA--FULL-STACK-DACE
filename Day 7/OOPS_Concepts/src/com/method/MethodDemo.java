package com.method;

import java.util.Scanner;

public class MethodDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		printClgName(name);

		MethodDemo m = new MethodDemo();
		m.printClgName1(name);

	}

	static void printClgName(String n) {
		// block of code
		System.out.println(n + " DACE");
	}

	void printClgName1(String n) {
		System.out.println(n + " Dace");
	}

}
