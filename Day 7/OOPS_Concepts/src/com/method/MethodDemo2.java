package com.method;

import java.util.Arrays;
import java.util.Scanner;

public class MethodDemo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] a = new int[size];

		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		MethodDemo2 m = new MethodDemo2();
		int res[] = m.sortArrayByParity(a);
		System.out.println(Arrays.toString(res));

	}

	int[] sortArrayByParity(int[] nums) {
		
		int st=0,end=nums.length-1;		
		while(st<end)
		{
			if(nums[st]%2==0)
			{
				st++;
			}
			if(nums[end]%2!=0)
			{
				end--;
			}
			else {
				int t=nums[st];
				nums[st]=nums[end];
				nums[end]=t;
				st++;
				end--;
			}
		}
		return nums;

	}
}
