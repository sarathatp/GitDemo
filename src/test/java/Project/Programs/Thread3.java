package Project.Programs;

public class Thread3 
{

	public static void main(String[] args) 
	{
		
		Show sh1 = new Show("ticket");
		Show sh2 = new Show("Seat");
		
		Thread th1 = new Thread(sh1);
		Thread th2 = new Thread(sh2);
		
		th1.start();
		th2.start();
		
	}

}



class Show extends Thread implements Runnable
{
	
	String str;
	
	Show(String str)
	{
		this.str=str;
		
	}
	
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(str+" "+i);
			
			try {
					Thread.sleep(2000);
				} 
			catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
		}
	}
	
	
}