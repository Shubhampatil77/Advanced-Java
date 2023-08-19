package Lab2;
import java.util.*;

public class Fcatorial3 {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Value:");
		int num=sc.nextInt();
		int fact=1,i=1;
		for( i=1;i<=num;i++)
		{
			fact=fact*i;
		}
	/*	while(i<=num)
		{
			fact=fact*i;
			i++;
		}*/
		System.out.println("The Factoril of "+num+ " is ="+fact);

	}

}
