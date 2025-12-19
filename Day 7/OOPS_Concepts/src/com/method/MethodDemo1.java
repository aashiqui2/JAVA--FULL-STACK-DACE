package com.method;

import java.util.Arrays;
import java.util.Scanner;

public class MethodDemo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		MethodDemo1 m = new MethodDemo1();
		m.add(a, b);
		
		sub(a,b);
		
		int arr[]= {1,2,3,4,5};
		int res[]=m.findOdd(arr);
		System.out.println(Arrays.toString(res));
		
		
	}

	void add(int n1, int n2) {
		System.out.println(n1+n2);
	}
	
	static int sub(int n1,int n2)
	{
		return n1-n2;	
	}
	
	int[] findOdd(int[] a)
	{
		int res[]=new int[a.length];
		int index=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				res[index]=a[i];
				index++;
			}
		}
		return res;
	}
}
