package GUIgraphicuserinterface;
import java.awt.Event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class CalculaterFrame extends JFrame implements ActionListener
{
	JLabel l1,l2,l3;
	JTextField t1,t2,t3;
	JButton b1,b2,b3,b4;
	JPanel p1;
	
	public CalculaterFrame()
	{
		l1=new JLabel("Enter First Number:");
		l2=new JLabel("Enter Second Number:");
		l3=new JLabel("Answer:");
		t1=new JTextField(20);
		t2=new JTextField(20);
		t3=new JTextField(29);
		p1=new JPanel();
		b1=new JButton("+");
		b2=new JButton("-");
		b3=new JButton("*");
		b4=new JButton("/");
		
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
		
		setSize(400,400);
		setVisible(true);		
	}
	public static void main(String[] args) {
		CalculaterFrame cf=new CalculaterFrame();		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj=e.getSource();
		int n1=Integer.parseInt(t1.getText());
		int n2=Integer.parseInt(t2.getText());
		int ans=0;
		if(obj==b1)
			ans=n1+n2;
		else if(obj==b1)
			ans=n1-n2;
		else if(obj==b3)
			ans=n1*n2;
		else if (obj==b4)
			ans=n1/n2;
		t3.setText(""+ans);
	}
}
