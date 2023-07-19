package Multithreading;

public class CharThread31 extends Thread{
	public CharThread31()
	{
		this.start();
	}
	public void run()
	{
		for(int n=65;n<=90;n+=2)
		{
			System.out.println((char)n);
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
