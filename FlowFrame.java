package GUIgraphicuserinterface;
import javax.swing.*;
import java.awt.*;

public class FlowFrame extends JFrame {

	JButton b1,b2,b3;
	FlowLayout f;
	public FlowFrame()
	{
		f=new FlowLayout(FlowLayout.LEFT);
		getLayout();
		b1=new JButton("Button1");
		b2=new JButton("Button2");
		b3=new JButton("Button3");
	
		
		getContentPane().add(b1);
		getContentPane().add(b2);
		getContentPane().add(b3);
		b1.setBounds(50,100,40, 100);
		setSize(400,500);
		setVisible(true);
	}
	



	public static void main(String[] args) 
	{
		FlowFrame ff=new FlowFrame();
	}

}
