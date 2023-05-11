package jdbc;
import java.sql.*;
import java.util.Scanner;
public class QueryApp7procedure2 {

	public static void main(String[] args) {
		try
		{
			Scanner sc=new Scanner(System.in);
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shubham","root","1234");
			System.out.println("Enter Roll no;");
			int rn=sc.nextInt();
			
			CallableStatement stat=con.prepareCall("{call stdproc(?,?)}");
			
			stat.setInt(1, rn);
			stat.registerOutParameter(2,Types.VARCHAR);
			stat.execute();
			System.out.println("Name="+stat.getString(2));
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
