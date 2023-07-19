package Multithreading;

public class NumThread1 implements Runnable {
	Thread th;
	public NumThread1()
	{
		th=new Thread(this);
		th.start();
	}
	public void run()
	{
		for(int i=2;i<=100;i+=2)
		{
			System.out.println(i);
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
