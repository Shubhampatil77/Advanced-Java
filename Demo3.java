package Exception;

public class Demo3 {

	public static void main(String[] args) 
	{
	int a[]={10,20,30,40,50};
	try
	{
		System.out.println(a[2]);
		try
			{
			int x=a[2]/2;
			}
		catch(Exception e)
			{
			System.out.println("Division by zero is not possible:");
			}
		}
	catch(ArrayIndexOutOfBoundsException ae)
		{
		System.out.println("Out Of Size:");
		System.out.println("Element Does Not Exists:");
		}
	}
}
