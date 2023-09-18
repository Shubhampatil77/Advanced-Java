package MultithreadingDAY2;

public class CounterThread extends Thread{
	long count;
	public CounterThread(int p)
	{
		count=0;
		this.setPriority(p);
		this.start();
	}
	public void run()
	{
		while(true)
			count++;
	}

}
