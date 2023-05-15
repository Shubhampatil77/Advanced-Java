package MVCJDBC;
import javax.swing.*;

public class StudView extends JFrame{
	JLabel l1,l2,l3;
	JTextField t1,t2,t3;
	JButton b1,b2,b3,b4,b5;
	JPanel p1;
	
	public StudView()
	{
		p1=new JPanel();
		l1=new JLabel("Enter Roll no:");
		l2=new JLabel("Enter Name:");
		l3=new JLabel("Enter Marks:");
		t1=new JTextField(30);
		t2=new JTextField(30);
		t3=new JTextField(30);
		b1=new JButton("Add");
		b2=new JButton("Modify");
		b3=new JButton("Delete");
		b4=new JButton("Search");
		b5=new JButton("Clear");
		b1.addActionListener(new StudController(this));
		b2.addActionListener(new StudController(this));
		b3.addActionListener(new StudController(this));
		b4.addActionListener(new StudController(this));
		b5.addActionListener(new StudController(this));
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
		p1.add(b5);
		setSize(350,350);
		setVisible(true);		
	}
	public static void main(String args[])
		{
		StudView f=new StudView();
		}

}
