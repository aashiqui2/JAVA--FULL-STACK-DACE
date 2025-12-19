package tamilnadu.chennai;

public class Office {
	
	int salary=25000;
	
	public static void main(String[] args) {
		Office off= new Office();
		off.work();
		off.recurit();
		off.travel_allowance();
		off.wfh();
		System.out.println(off.salary);
	}
	
	public void work()
	{
		System.out.println("Working");
	}
	
	protected void recurit()
	{
		System.out.println("recurting");
	}
	
	public void travel_allowance()
	{
		System.out.println("allowance provided");
	}
	
	void wfh()//package-private (no modifier)
	{
		System.out.println("Working from home");
	}
	
	private void planning() {
		System.out.println("Planning....");
	}
}
