package tamilnadu.madurai;

import tamilnadu.chennai.Office;

public class BranchOffice extends Office{
	//int salary=20000;

	public static void main(String[] args) {
//		Office off= new Office();
//		off.work();
		
		BranchOffice off= new BranchOffice();
		off.work();
		off.wfh();
		off.recurit();
		off.celebrate_local_function();
		System.out.println(off.salary);
		
	}
	
	void celebrate_local_function()
	{
		System.out.println("Celebrating...");
	}
	
	protected void Hallowin_Party() {
		System.out.println("celebrating hallowin");
	}
	
}
