package Project.Programs;

public class ThreadsClass extends Thread
{

	public static void main(String[] args)
	{
		ThreadsClass tc = new ThreadsClass();
		
		tc.start();	
		
		System.out.println("This code is outside of the thread");
		
	}
	
	public void run()
	{
		System.out.println("This code is running in the thread");
	}
	

}


