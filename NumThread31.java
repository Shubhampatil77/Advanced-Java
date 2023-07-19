package Multithreading;

public class NumThread31 extends Thread {
	public NumThread31()
	{
		this.start();
	}
	public void run()
	{
		for(int n=1;n<=200;n+=2)
		{
			System.out.println(n);
		}
		try
		{
			this.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
