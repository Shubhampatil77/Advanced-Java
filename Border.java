package GUIgraphicuserinterface;
import javax.swing.*;
import java.awt.*;

public class Border extends JFrame
{
	JPanel p1;
	JTextField t1,t2;
	BorderLayout f;

	
	
	public Border() {
		super("Kay Frame Banvali Rav");
		f=new BorderLayout(20,20);
		p1=new JPanel();
		p1.setLayout(f);

		t1=new JTextField(30);
		t2=new JTextField(30);
		
		getContentPane().add("West",p1);
		p1.add(p1);
		
		p1.add(t2);
		setSize(400,400);
		setVisible(true);
	}
	public static void main(String[] args) {
		Border b=new Border();
	}
}
