package Lab2;
import java.util.*;

public class Person1 {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Age");
		int age=sc.nextInt();
		
		if(age>18) {
			System.out.println("Your Eligible for voting:");
		}else
		{
			System.out.println("Your Not Eligible for voting:");
		}	
		
	}

}
