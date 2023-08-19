package Lab2;
import java.util.*;

public class Reverse5 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Numbers:");
		
		 int num=sc.nextInt();
		 int reverse=0;
		 
		 for(;num!=0;num=num/10)
		 {
			int reminder=num%10;
			reverse=reverse*10+reminder;
			
		 }
		 System.out.println("The Reverse Of The Given Numberis:"+reverse);
		
	
	}

}
