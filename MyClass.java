package MultithreadingDAY2;

public class MyClass {
	public static synchronized void display(String name,String s1)
	{
		for(int i=0;i<s1.length();i++)
		{
				System.out.println(name+s1[i]);
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
