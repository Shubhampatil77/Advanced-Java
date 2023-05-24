package GUIgraphicuserinterface;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ActionListenerDemo extends JFrame implements ActionListener
{
	JButton b1,b2,b3;

	public ActionListenerDemo()
	{
		setLayout(new FlowLayout());
		b1=new JButton("Red");
		b2=new JButton("Green");
		b3=new JButton("Black");
							
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		getContentPane().add(b1);
		getContentPane().add(b2);
		getContentPane().add(b3);
				
		setSize(400,400);
		setVisible(true);
	}		
		public void actionPerformed(ActionEvent evt)
		{
			Object obj=evt.getSource();
			
			if(obj==b1)
				getContentPane().setBackground(Color.red);
				
			else if(obj==b2)
				getContentPane().setBackground(Color.GREEN);
			
			else if (obj==b3)
				getContentPane().setBackground(Color.BLACK);			
		}
	public static void main(String[] args) {
		ActionListenerDemo al=new ActionListenerDemo();		
	}
}
