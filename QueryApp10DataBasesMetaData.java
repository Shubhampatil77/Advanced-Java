package jdbc;
import java.sql.*;

public class QueryApp10DataBasesMetaData {

	public static void main(String[] args) {
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/shubham","root","1234");
			DatabaseMetaData dm=con.getMetaData();
			System.out.println("Driver Name="+dm.getDriverName());
			System.out.println("Driver Version="+dm.getDriverVersion());
			System.out.println("Driver UserName="+dm.getUserName());
			System.out.println("Database Product Name="+dm.getDatabaseProductName());
			System.out.println("Database Product Version Name="+dm.getDatabaseProductVersion());
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
