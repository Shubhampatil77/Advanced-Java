package MultithreadingDAY2;

public class MainThread {

	public static void main(String[] args) {
		Thread th=Thread.currentThread();
		th.setPriority(Thread.MAX_PRIORITY);
		
		CounterThread th1=new CounterThread(Thread.NORM_PRIORITY+2);
		CounterThread th2=new CounterThread(Thread.NORM_PRIORITY-2);
		 
		try {
			th.sleep(15);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		th1.stop();
		th2.stop();
		
		System.out.println("Thread 1 Counter="+th1.count);
		System.out.println("Thread 2 Counter="+th2.count);
	}

}
