package jdbc;
import java.sql.*;
import java.util.*;

public class QueryApp1 {

	public static void main(String[] args) {

		try
		{
			Scanner sc=new Scanner(System.in);
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shubham","root","1234");
			Statement stat=con.createStatement();
			System.out.println("Enter Roll No To Search:");
			int rn=sc.nextInt();
			ResultSet rs=stat.executeQuery("select * from student where rollno="+rn);
			if(rs.next())
				System.out.println("Roll no="+rs.getInt(1)+"Name="+rs.getString(2)+"Marks="+rs.getInt(3));
				
			else
				System.out.println("Record Not Found");
		
				rs.close();
				con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
