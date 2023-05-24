package GUIgraphicuserinterface;
import javax.swing.*;
import java.awt.*;

public class GridFrame extends JFrame {
	
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
	GridLayout f;
	public GridFrame()
	{
		f=new GridLayout(4,4);
		setLayout(f);
		b1=new JButton("0");
		b2=new JButton("1");
		b3=new JButton("2");
		b4=new JButton("3");
		b5=new JButton("4");
		b6=new JButton("5");
		b7=new JButton("6");
		b8=new JButton("7");
		b9=new JButton("8");
		b10=new JButton("9");
		b11=new JButton("-");
		b12=new JButton("=");
		b13=new JButton("+");
		b14=new JButton("-");
		b15=new JButton("*");
		b16=new JButton("/");
	
		getContentPane().add(b1);
		getContentPane().add(b2);
		getContentPane().add(b3);
		getContentPane().add(b4);
		getContentPane().add(b5);
		getContentPane().add(b6);
		getContentPane().add(b7);
		getContentPane().add(b8);
		getContentPane().add(b9);
		getContentPane().add(b10);
		getContentPane().add(b11);
		getContentPane().add(b12);
		getContentPane().add(b13);
		getContentPane().add(b14);
		getContentPane().add(b15);
		getContentPane().add(b16);
		
		setSize(900,700);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		GridFrame gf=new GridFrame();	

	}
}
