package Project.Programs;

import java.io.IOException;

public class ThreadEx 
{

	public static void main(String[] args) throws IOException 
	{
			
		Thread t = Thread.currentThread();
		
		System.out.println(t);
		System.out.println(t.getName());
		
		ThreadPrintNumbers tpn = new ThreadPrintNumbers();
		Thread t_tpn = new Thread(tpn);
		t_tpn.start();
		
		System.in.read();
		tpn.stop=true;

	}

}

class ThreadPrintNumbers extends Thread
{
	boolean stop=false;
	
	public void run()
	{
		for(int i=0;i<1000000;i++)
		{
			System.out.println(i);
			if(stop)
			{
				return;
			}
			
		}
	}
}
