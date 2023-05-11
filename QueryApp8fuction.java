package jdbc;
import java.sql.*;
import java.util.Scanner;

public class QueryApp8fuction {

	public static void main(String[] args) {
		try
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Fist Number");
		int n1=sc.nextInt();
		System.out.println("Enter Second Number");
		int n2=sc.nextInt();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shubham","root","1234");
		CallableStatement stat=con.prepareCall("{?=call addfun(?,?)}");
		stat.registerOutParameter(1, Types.INTEGER);
		stat.setInt(2, n1);
		stat.setInt(3, n2);
		stat.execute();
		
		System.out.println("Addtion="+stat.getInt(1));
		con.close();
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
