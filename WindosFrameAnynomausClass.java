package GUIgraphicuserinterface;
import java.awt.*;
import java.awt.event.*;

public class WindosFrameAnynomausClass extends Frame
{
	public WindosFrameAnynomausClass()
	{
		addWindowListener(new WindowAdapter()
				{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
				});
		setSize(400,400);
		setVisible(true);	
	}
	public static void main(String[] args) {
		WindosFrameAnynomausClass w=new WindosFrameAnynomausClass();
	}
}
