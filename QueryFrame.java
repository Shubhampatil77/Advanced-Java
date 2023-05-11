package jdbc;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;


public class QueryFrame extends JFrame implements ActionListener 
{
	JLabel l1,l2,l3;
	JTextField t1,t2,t3;
	JButton b1,b2,b3,b4;
	JPanel p1;
	Connection con;
	ResultSet rs;
	
	public QueryFrame()
	{
		p1=new JPanel();
		l1=new JLabel("Roll No:");
		l2=new JLabel("Name:");
		l3=new JLabel("Marks:");
		t1=new JTextField(30);
		t2=new JTextField(30);
		t3=new JTextField(30);
		b1=new JButton("First");
		b2=new JButton("Pervious");
		b3=new JButton("Next");
		b4=new JButton("Last");
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		getContentPane().add(p1);
		p1.add(l1);
		p1.add(t1);
		p1.add(l2);
		p1.add(t2);
		p1.add(l3);
		p1.add(t3);
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p1.add(b4);
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost/shubham","root","1234");
			Statement stat=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			rs=stat.executeQuery("select * from student");
			if(rs.next())
				display();
			}
		catch(Exception e)
		{
			System.out.println(e);
		}
		setSize(400,400);
		setVisible(true);
	}
	public void display()
	{
	    try
	    {
	        if (rs != null) {
	            t1.setText(""+rs.getInt(1));
	            t2.setText(""+rs.getString(2));
	            t3.setText(""+rs.getInt(3));
	        }
	    }
	    catch(Exception e)
	    {
	        System.out.println(e);
	    }
	}

	public void actionPerformed(ActionEvent evt)
	{
	    try
	    {
	        if (rs != null) {
	            if(evt.getSource()==b1)
	            {
	                if(!rs.isFirst())
	                {
	                    rs.first();
	                    display();
	                }
	            }
	            else if(evt.getSource()==b2)
	            {
	                if(!rs.isFirst())
	                {
	                    rs.previous();
	                    display();
	                }
	            }
	            else if (evt.getSource()==b3)
	            {
	                if(!rs.isLast())
	                {
	                    rs.next();
	                    display();         
	                }
	            }
	            else if(evt.getSource()==b4)
	            {
	                if(!rs.isLast())
	                {
	                    rs.last();
	                    display();
	                }
	            }
	        }
	    }
	    catch(Exception e)
	    {
	        System.out.println(e);
	    }
	}

	public static void main(String[] args) {
		QueryFrame fr=new QueryFrame();
	}

}
