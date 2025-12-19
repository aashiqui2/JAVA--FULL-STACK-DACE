package tamilnadu.chennai;

public class BranchOffice {
	public static void main(String[] args) {
		BranchOffice off= new BranchOffice();
		off.celeberate_Local_Function();
		
		Office off1= new Office();
		off1.work();
		off1.recurit();
		off1.wfh();
		//off1.planning();
		System.out.println(off1.salary);
	}
	void celeberate_Local_Function()
	{
		System.out.println("celebrating");
	}
}
