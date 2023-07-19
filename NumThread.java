package Multithreading;

public class NumThread extends Thread
{
	public NumThread()
	{
		this.start();
	}
	public void run()
	{
		for(int n=2;n<=10;n+=2)
		{
			System.out.println(n);
			try
			{
				Thread.sleep(100);
			} 
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
