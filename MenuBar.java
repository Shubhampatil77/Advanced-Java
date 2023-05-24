package GUIgraphicuserinterface;
import javax.swing.*;

public class MenuBar extends JFrame 
	{
		JMenuBar mb;
		JMenu e1,f1;
		JMenuItem n1,o1,s1,cu,co,p1;
		public MenuBar()
		{
			mb=new JMenuBar();
			setJMenuBar(mb);
			f1=new JMenu("File");
			e1=new JMenu("Edit");
			mb.add(f1);
			mb.add(e1);
			n1=new JMenuItem("New");
			o1=new JMenuItem("Open");
			s1=new JMenuItem("Save");
			cu=new JMenuItem("Cut");
			co=new JMenuItem("Copy");
			p1=new JMenuItem("Paste");
			f1.add(n1);
			f1.add(o1);
			f1.add(s1);
			e1.add(cu);
			e1.add(co);
			e1.add(p1);
			
			setSize(400,500);
			setVisible(true);
			
		}	
	public static void main(String[] args) {
		MenuBar mb=new MenuBar();
	}
}
