package GUIgraphicuserinterface;
import java.awt.*;
import java.awt.event.*;


public class WindowsEvent extends Frame implements WindowListener 
{
	public WindowsEvent()
	{
		addWindowListener(this);
		setSize(400,400);
		setVisible(true);
		}
	
	@Override
	public void windowOpened(WindowEvent e) {
		
	}
	@Override
	public void windowClosing(WindowEvent e) 
	{
		System.exit(0);
	}
	@Override
	public void windowClosed(WindowEvent e)
	{
	}	@Override
	public void windowIconified(WindowEvent e)
	{
	}	@Override
	public void windowDeiconified(WindowEvent e)
	{
	}	@Override
	public void windowActivated(WindowEvent e) 
	{
	}	@Override
	public void windowDeactivated(WindowEvent e) 
	{
	}	
	public static void main(String[] args) {
		WindowsEvent we=new WindowsEvent();
	}
}
