package jdbc;
import java.sql.*;
public class QueryApp11TrasionManagement {

	public static void main(String[] args) {
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shubham","root","1234");
		con.setAutoCommit(true);
		Statement stat=con.createStatement();
		stat.executeUpdate("insert into student values(5,'jay',56)");
		System.out.println("Record Inserted");
		//con.commit();
		con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
