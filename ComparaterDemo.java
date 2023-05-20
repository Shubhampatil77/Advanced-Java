package Collection;
import java.util.*;
import java.util.Collections.*;

class Employee
{
	int empid,salary;
	String name;
	public Employee(int empid,int salary,String name)
	{
	super();
	this.empid=empid;
	this.salary=salary;
	this.name=name;	
}
@Override
	public String toString() {
		return "Employee [empid=" + empid + ", salary=" + salary + ", name=" + name + "]";
	}

class salaryComparater implements Comparator<Employee>
{
	@Override
	public int compare(Employee o1, Employee o2) 
		{
			if(o1.salary==o2.salary)
				return 0;
			else if (o1.salary>o2.salary)
				return 1;
			else
				return -1;
		}
}
class nameComparater implements Comparator<Employee>
{
	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.name.compareTo(o2.name);
	}
}
public class ComparaterDemo {

	public static void main(String[] args) {
		ArrayList<Employee>list=new ArrayList<Employee>();
		list.add(new Employee(1,45000,"Ram Patil"));
		list.add(new Employee(2,45000,"Raj Patil"));
		list.add(new Employee(3,40000,"Shubham Patil"));
		list.add(new Employee(4,55000,"Rahul Patil"));
		
		Collections.sort(list,new nameComparater());
		System.out.println("Sorting As Per Name:");
		for(Employee e:list)
		{
			System.out.println(e);
		}
		Collections.sort(list,new salaryComparater());
		System.out.println("Sorting As Per Salary:");
		
			for(Employee e:list)
			{
				System.out.print(e);
			}
	}

}
}
