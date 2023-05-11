package jdbc;
import java.sql.*;
import java.util.*;
public class QueryApp5Delete {
	public static void main(String[] args) {
		try
		{
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shubham","root","1234");
		System.out.println("Enter Roll no:");
		int rn=sc.nextInt();
		/*System.out.println("Enter Name :");
		String nm=sc.next();
		System.out.println("Enter Marks:");
		int m=sc.nextInt();
		*/
		PreparedStatement stat=con.prepareStatement("delete from student where rollno=?");
		stat.setInt(1, rn);
		//stat.setString(1, nm);
	//	stat.setInt(2, m);
		stat.executeUpdate();
		System.out.println("Record deleted:");
		con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
