package GUIgraphicuserinterface;
import javax.swing.*;

public class MyThread2 extends JFrame {
	JButton b1,b2,b3;
	JPanel p1;
	public MyThread2()
	{
	super("My Frame");
	p1=new JPanel();
	b1=new JButton("Button1");
	b2=new JButton("Button2");
	b3=new JButton("Button3");
	
	getContentPane().add(p1);
	p1.add(b1);
	p1.add(b2);
	p1.add(b3);
	setSize(400,600);
	setVisible(true);
	}
	public static void main(String[] args) {
		MyThread2 my=new MyThread2();
	}
}