package Collection;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Student
{
	int rollno,mks;
	String name;
	public Student(int rollno,int mks,String name)
	{
		super();
		this.rollno=rollno;
		this.mks=mks;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", mks=" + mks + ", name=" + name + "]";
	}	
}
public class MenuDriven {
	public static void main(String[] args) {
		List<Student>list=new ArrayList<Student>();
		Scanner sc=new Scanner(System.in);
		int ch;
		do
		{
			System.out.println("1]Add Record\n2]Update Record\n3]Delete Record\n4]Display Record\n5]Search Rrcord\n6]Exit");
			System.out.println("Enter Your Choice:");
			ch=sc.nextInt();
			switch(ch)
			{			
			case 1:
			System.out.println("Enter Rollno:");
			int rn=sc.nextInt();
			System.out.println("Enter Name:");
			String nm=sc.next();
			System.out.print("Enter Marks:");
			int m=sc.nextInt();
			list.add(new Student(rn,m,nm));
			break;			
			case 2:
				System.out.println("Enter Rollno:");
				int rn1=sc.nextInt();
				System.out.println("Enter Name:");
				String nm1=sc.next();
				System.out.print("Enter Marks:");
				int m1=sc.nextInt();
				System.out.println("Enter Postion to Update:");
				int pos=sc.nextInt();
				list.add(pos, new Student(rn1,m1,nm1));
				break;			
			case 3:
				System.out.println("Enter Postion To Delete:");
				pos=sc.nextInt();
				list.remove(pos);
				break;				
			case 4:
				Iterator<Student>itr=list.iterator();
				while(itr.hasNext());
				{
					System.out.print(itr.next());
				}
				break ;
			case 5:
				System.out.println("Enter Postion to Search :");
				pos=sc.nextInt();
				Student s1=(Student)list.get(pos);
				System.out.println(s1);
				break;
			}
		}
		while(ch!=6);		
	}
}
