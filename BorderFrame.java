package GUIgraphicuserinterface;
import javax.swing.*;
import java.awt.*;

public class BorderFrame extends JFrame {
	
	JButton b1,b2,b3,b4;
	BorderLayout f;
	JTextArea ta;
	JPanel p1;
	public BorderFrame()
	{
		f=new BorderLayout(20,20);
		b1=new JButton("Button1");
		b2=new JButton("Button2");
		b3=new JButton("Button3");
		b4=new JButton("Button4");
		ta=new JTextArea(8,9);
		p1=new JPanel();
		p1.setLayout(f);
		getContentPane().add(p1);
						p1.add(b1,"East");
						p1.add(b2,"North");
						p1.add(b3,"South");
						p1.add(b4,"West");
						p1.add(ta,"Center");
	
		setSize(400,500);
		setVisible(true);
	}
	public static void main(String[] args) {
		BorderFrame b=new BorderFrame();
	}
}