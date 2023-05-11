package jdbc;
import java.sql.*;
import java.util.*;
public class QueryApp3Insert {

	public static void main(String[] args) {
		try
		{
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shubham","root","1234");
		System.out.println("Enter Roll no:");
		int rn=sc.nextInt();
		System.out.println("Enter Name:");
		String nm=sc.next();
		System.out.println("Enter The Marks:");
		int m=sc.nextInt();
		
		PreparedStatement stat=con.prepareStatement("Insert into student values(?,?,?)");
		stat.setInt(1, rn);
		stat.setString(2, nm);
		stat.setInt(3, m);
		stat.executeUpdate();
		System.out.println("Record Inserted:");
		con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
