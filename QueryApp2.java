package jdbc;
import java.sql.*;
import java.util.*;
public class QueryApp2 {

	public static void main(String[] args) {
		try
		{
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shubham","root","1234");
		System.out.println("Enter Name To Search");
		String nm=sc.next();
		PreparedStatement stat=con.prepareStatement("select * from student where name=?");
		stat.setString(1, nm);
		ResultSet rs=stat.executeQuery();
		
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