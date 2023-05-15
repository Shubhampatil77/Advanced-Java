package MVCJDBC;
import java.awt.event.*;
public class StudController implements ActionListener{
	StudView fr;
	Student s1;
	StudModel dm;
	
	public StudController(StudView fr)
	{
		this.fr=fr;
		dm=new StudModel();
	}
	public void actionPerformed(ActionEvent evt)
	{
		if(evt.getSource()==fr.b1)
		{
			s1=new Student();
			s1.setRollno(Integer.parseInt(fr.t1.getText()));
			s1.setName(fr.t2.getText());
			s1.setMarks(Integer.parseInt(fr.t3.getText()));
			dm.addrec(s1);
		}
		else if(evt.getSource()==fr.b2)
		{
			s1=new Student();
			s1.setRollno(Integer.parseInt(fr.t1.getText()));
			s1.setName(fr.t2.getText());
			s1.setMarks(Integer.parseInt(fr.t3.getText()));
			dm.modify(s1);
		}
		else if(evt.getSource()==fr.b3)
		{
			s1=new Student();
			s1.setRollno(Integer.parseInt(fr.t1.getText()));
			dm.delrec(s1);
		}
		else if(evt.getSource()==fr.b4)
		{
			s1=new Student();
			s1.setRollno(Integer.parseInt(fr.t1.getText()));
			dm.searchrec(s1);
			fr.t2.setText(s1.getName());
			fr.t3.setText(""+s1.getMarks());		
		}
		else if(evt.getSource()==fr.b5)
		{
			fr.t1.setText("");
			fr.t2.setText("");
			fr.t3.setText("");
		}
	}
}
