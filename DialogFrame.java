package GUIgraphicuserinterface;
import javax.swing.*;
import java.awt.event.*;

public class DialogFrame extends JFrame{
	JButton b1,b2;
	JPanel p1;
	JFrame f;
	String s1;
	public DialogFrame()
	{
		b1=new JButton("Message");
		b2=new JButton("Input");
		p1=new JPanel();
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				s1=JOptionPane.showInputDialog(f,"Enter Name");
			}
		});		
		b1.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(f,"Hello"+s1);
			}
				});
		getContentPane().add(p1);
		p1.add(b1);
		p1.add(b2);
		setSize(400,400);
		setVisible(true);		
	}
	public static void main(String[] args) {
		DialogFrame n=new DialogFrame();
	}

}
