package tamilnadu.delhi;

import tamilnadu.chennai.Office;

public class B_BranchOffice {

	public static void main(String[] args) {
		B_BranchOffice off= new B_BranchOffice();
		off.woking_Time();
		
		Office off1= new Office();
		off1.work();
		//off1.recurit();
		//off1.wfh();
		//System.out.println(off1.salary);
	}
	
	void woking_Time()
	{
		System.out.println("working time 12 hours");
	}

}
