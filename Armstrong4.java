package Lab2;
import java.util.*;

public class Armstrong4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number:");
	int	num=sc.nextInt();
	int orgnum,reminder,result=0;
	orgnum=num;
	
	while(orgnum!=0)
	{
		reminder=orgnum % 10;
		result +=  Math.pow(reminder,3);
		orgnum/=10;
		}
	if(result == num)
		System.out.println(+num+" Is an Armstrong Number");
	else
		System.out.println(+num+" Not an Armstrong Number");
	}

}
