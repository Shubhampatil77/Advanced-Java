package jdbc;
import java.sql.*;

public class QureyApp9Resultset {

	public static void main(String[] args) {
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shubham","root","1234");
		Statement stat=con.createStatement();
		ResultSet rs=stat.executeQuery("select * from student");
		ResultSetMetaData rd=rs.getMetaData();
		int count=rd.getColumnCount();
		System.out.println("Total Number of Columns="+count);
		for(int i=1;i<=count;i++)
		{
			System.out.println(rd.getColumnName(i)+" "+rd.getColumnName(i));
		}
			
			con.close();
			rs.close();		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
