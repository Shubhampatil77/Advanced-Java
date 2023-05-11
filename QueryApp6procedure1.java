package jdbc;
import java.sql.*;
public class QueryApp6procedure1 {

	public static void main(String[] args) {
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shubham","root","1234");
			CallableStatement stat=con.prepareCall("{Call procstd(?,?,?)}");
			
			stat.setInt(1,3);
			stat.setString(2,"Raj");
			stat.setInt(3,25);
			stat.execute();
			System.out.println("Procedure Excuted");
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}		
	}

}
