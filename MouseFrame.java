package GUIgraphicuserinterface; 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MouseFrame extends JFrame implements MouseMotionListener 
{
	int x,y;
	public MouseFrame()
	{
		addMouseMotionListener(this);
		setSize(400,400);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		MouseFrame m=new MouseFrame();		
	}
	@Override
	public void mouseDragged(MouseEvent e) 
	{
		x=e.getX();
		y=e.getY();
		repaint();	//call the paint method 
	}
	public void paint(Graphics g)//paint is predefined method
	{
	String s1="X="+x+"Y+"+y;
	g.drawString(s1,x,y);
	}
	@Override
	public void mouseMoved(MouseEvent e) 
	{
	}
}
