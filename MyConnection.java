package MVCJDBC;
import java.sql.*;
public class MyConnection {
	Connection con;
	public MyConnection()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shubham","root","1234");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
