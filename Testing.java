package MultithreadingDAY2;
public class Testing {
	public static void main(String[] args) {
		final Customer c=new Customer();		
		Thread th1=new Thread() {
			public void run()
			{
				c.withdraw(1499);
			}
		};
		th1.start();{
			Thread th2=new Thread() {
				public void run()
				{
					c.deposit(1500);
				}
			};
		}
	}
}