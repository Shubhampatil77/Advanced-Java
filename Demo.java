package jdbc;
import java.sql.*;
import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		try
		{
			Scanner sc=new Scanner(System.in);
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shubham","root","1234");
			System.out.println("Enter Roll no;");
			int rn=sc.nextInt();
			
			CallableStatement stat=con.prepareCall("{call shu(?,?)}");
			
			stat.setInt(1,rn);
			stat.registerOutParameter(2,Types.INTEGER);
			stat.execute();
			System.out.println("Marks="+stat.getInt(2));
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
