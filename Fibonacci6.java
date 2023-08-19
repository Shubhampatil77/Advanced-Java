package Lab2;

import java.util.Scanner;

public class Fibonacci6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how mant fibonacci number you want:");
				int n=sc.nextInt();
		int n1=0,n2=1,n3,i,count=n;
		System.out.print(n1+" "+n2);
		
		for(i=2;i<count;++i)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
	}

}
