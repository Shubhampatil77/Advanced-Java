package Multithreading;

public class Number extends Thread
{
	public static void main(String args[]) {
		
	Number Thread
	=new Number();
	for(int n=1;n<=10;n++)
	{
		System.out.println(n);
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
			{
			System.out.println(e);
			}
		
		}
	}
}
