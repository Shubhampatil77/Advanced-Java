package GUIgraphicuserinterface;
import java.awt.*;
import java.awt.Event;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class MouseFrameL extends JFrame{
	int x,y;
	public MouseFrameL()
	{
		addMouseListener(new MouseAdapter()
		{
		public void mouseClicked(MouseEvent e)
		{
		x=e.getX();
		y=e.getY();
		repaint();
		}
		});
		setSize(400,400);
		setVisible(true);
	}
	public void paint(Graphics g)
	{
		String s1="X="+x+" Y"+y;
		g.drawString(s1,x,y);
	}
	public static void main(String[] args) {
		MouseFrameL m=new MouseFrameL();
		
	}

}
