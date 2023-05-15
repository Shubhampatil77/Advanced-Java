package MVCJDBC;
import java.sql.*;

public class StudModel {
	public void addrec(Student s1)
	{
		try
		{
			MyConnection mycon=new MyConnection();
			PreparedStatement stat=mycon.con.prepareStatement("insert into student values(?,?,?)");
			stat.setInt(1, s1.getRollno());
			stat.setString(2,s1.getName());
			stat.setInt(3, s1.getMarks());
			stat.executeUpdate();
			System.out.println("Record Inserted!!!!!!!!!!!");
			mycon.con.close();			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void modify(Student s1)
	{
		try
		{
			MyConnection mycon=new MyConnection();
			PreparedStatement stat=mycon.con.prepareStatement("update student set name=?,marks=? where rollno=?");
			stat.setInt(3,s1.getRollno());
			stat.setString(1,s1.getName());
			stat.setInt(2,s1.getMarks());
			stat.executeUpdate();
			System.out.println("Record Updated!!!!!!!!!!!!!!");
			mycon.con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void delrec(Student s1)
	{
		try
		{
			MyConnection mycon=new MyConnection();
			PreparedStatement stat=mycon.con.prepareStatement("delete from student where rollno=?");
			stat.setInt(1,s1.getRollno());
			stat.executeUpdate();
			System.out.println("Record Deleted!!!!!!!!!!!!!");
			mycon.con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void searchrec(Student s1)
	{
		try
		{
			MyConnection mycon=new MyConnection();
			PreparedStatement stat=mycon.con.prepareStatement("select * from student where rollno=?");
			stat.setInt(1, s1.getRollno());
			ResultSet rs=stat.executeQuery();
			if(rs.next())
			{
				s1.setName(rs.getString(2));
				s1.setMarks(rs.getInt(3));
			}
			else
				System.out.println("Record Inserted!!!!!!!!!!!!!!!");
				mycon.con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return ;
	}
}
