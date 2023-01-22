package Project.Programs;

public class Methods2 extends Thread
{

	public static void main(String[] args)
	{
		System.out.println("hi");
		
		Methods2 m2 = new Methods2();
		m2.start();
		
			
	}
	
	void addNum()
	{
		System.out.println("add numbers");
	}
	

}
