package GUIgraphicuserinterface;
import java.awt.*;
import javax.swing.*;

public class D extends JFrame
/*{
	JPanel p1;
	JButton b1,b2,b3,b4;
	
	public D()
	{
		p1=new JPanel();
		//p2=new JPanel();
		b1=new JButton();
		b2=new JButton();
		b3=new JButton();
		b4=new JButton();
		
		getContentPane().add(p1);
		p1.add(b1);
		p1.add(b2);
		//getContentPane().add(p2);
		p1.add(b3);
		p1.add(b4);
		
		setSize(400,400);
		setVisible(true);
	}*/
{
	JPanel p1;
	JButton b1,b2,b3,b4;
	BorderLayout f;	
	public D()
	{
		f=new BorderLayout();
		setLayout(f);
		p1=new JPanel();
		//p2=new JPanel();
		b1=new JButton();
		b2=new JButton();
		b3=new JButton();
		b4=new JButton();
		
		getContentPane().add(p1);
		p1.add(b1);
		p1.add(b2);
	
		setSize(400,400);
		setVisible(true);
	}
	


	public static void main(String[] args) {
		D d=new D();

	}

}
