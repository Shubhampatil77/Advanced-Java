package GUIgraphicuserinterface;
import javax.swing.*;

public class Login extends JFrame {
	JLabel l1,l2;
	JTextField t1;
	JPasswordField t2;
	JButton b1,b2;
	JPanel p1;
	
	public Login()
	{
		super("Login Frame");
		p1=new JPanel();
		l1=new JLabel("Enter UserID:");
		l2=new JLabel("Enter UserName:");
		t1=new JTextField(30);
		t2=new JPasswordField(30);
		b1=new JButton("Login");
		b2=new JButton("Cancel");
		
		getContentPane().add(p1);
		p1.add(l1);
		p1.add(t1);
		p1.add(l2);
		p1.add(t2);
		p1.add(t2);
		p1.add(b1);
		p1.add(b2);	
		setSize(400,600);
		setVisible(true);
	}	
	public static void main(String[] args) {
		Login l=new Login();
	}
}
