package tamilnadu.chennai;

public class Office {
	protected int salary=30000;

	public static void main(String[] args) {
		Office off= new Office();
		off.work();
		System.out.println(off.salary);

	}
	public void work() {
		System.out.println("working");
	}
	
	protected void wfh()
	{
		System.out.println("work from home");
	}
	
	public void recurit()
	{
		System.out.println("recuriting");
	}
	
	void travel_allowance() {
		System.out.println("provided travel allowance");
	}
	
	private void do_business_plan()
	{
		System.out.println("planning..,.");
	}

}
