package Lab2;
import java.util.*;

public class Leap2 {
	public static void main(String args []) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter The Year:");
		int year=sc.nextInt();
		
		if((year % 400 == 0 ))
		{

			System.out.println("This is Leap Year:");
		}else
		{

			System.out.println("This is Not Leap Year:");
		}
			

		
	}

}
