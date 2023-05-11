package jdbc;
import java.sql.*;
import java.util.*;

public class QueryApp11RollBack {

	public static void main(String[] args) {
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/shubham","root","1234");
			con.setAutoCommit(false);
			Scanner sc=new Scanner(System.in);
			PreparedStatement stat=con.prepareStatement("insert into student values(?,?,?)");
			
			System.out.println("Enter Roll NO:");
			int rn=sc.nextInt();
			System.out.println("Enter The Name:");
			String nm=sc.next();
			System.out.println("Enter The Marks:");
			int m=sc.nextInt();
			
			stat.setInt(1, rn);
			stat.setString(2,nm);
			stat.setInt(3, m);
			stat.executeUpdate();
			System.out.println("Do YOu Want To Save Record YES/NO");
			
			String ch=sc.next();
				if(ch.equals("yes"))
				con.commit();
				
				else
					con.rollback();
					con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
