package jdbc;
import java.sql.*;
public class SQL {
	public static void main(String[] args) 
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shubham","root","1234");
			
			Statement stat=con.createStatement();
			ResultSet rs=stat.executeQuery("select * from student");
			
			while(rs.next())
				{
				System.out.println(rs.getInt(1)+"    "+rs.getString(2)+"  "+rs.getInt(3));
				}
			rs.close();
			con.close();
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
	}
}