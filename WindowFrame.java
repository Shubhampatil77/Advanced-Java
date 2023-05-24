package GUIgraphicuserinterface;
import java.awt.*;
import java.awt.event.*;

public class WindowFrame extends Frame 
{
	public WindowFrame()
	{
		addWindowListener(new TestClass());
		setSize(400,400);
		setVisible(true);
	}
	class TestClass extends WindowAdapter
	{
		public void windowClosing(WindowEvent e)
		{
			System.exit(0);
		}
	}
	public static void main(String[] args) {
		WindowFrame w=new WindowFrame();
	}
}
