package tamilnadu.bengalur;

import tamilnadu.chennai.Office;

public class B_Branch_Office extends Office{

	public static void main(String[] args) {
		B_Branch_Office off= new B_Branch_Office();
		off.work();
		off.wfh();
		off.recurit();
		//off.travel_allowance() not visible because no modifier
		off.food_provided();

	}
	
	public void food_provided()
	{
		System.out.println("food provided...");
	}

}
