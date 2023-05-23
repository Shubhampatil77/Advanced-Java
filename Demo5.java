package Exception;
import java.util.*;

class Passout extends Exception
{
	Passout (String msg)
	{
	super(msg); 
	}
}
public class Demo5 {

	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Passout Year:");
	int year=sc.nextInt();
	
	try 
	{
		if(year!=2020)
			throw new Passout("Your passout year must be 2020:");
		else
			System.out.println("Your Eligible to Registor");
	}
	catch(Passout p)
	{
		System.out.println(p);
	}
	}
}
