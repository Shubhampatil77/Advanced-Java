package project;
/* =========================================================
 * Class	: addcmp
 * Purpose  : To add the new Company
 * ======================================================== */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.sql.*;

class addcmp extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l11,l12,l13,img1,dt;
	JTextField t1,t2,t3,t4,t5,t6,t7,txtdt;
	JTextArea t8;
	JButton b1,b2,b3;
	Font f1=new Font("Bell MT",Font.BOLD+Font.ITALIC,30);
	Container c1=getContentPane();
	Connection conn;
	
	ResultSet rs;
	addcmp()
	{
		super("COMPANY ENTRY");
		setLayout(null);
		l11=new JLabel("COMPANY ENTRY");
		l11.setBounds(120,20,300,60);
		c1.add(l11);
		l11.setFont(f1);		
		img1 = new JLabel(new ImageIcon("sss.jpg "));
      	img1.setBounds(0,0,100,73);
      	add(img1);	
		l12 = new JLabel("_______________________________________________________"+					            "___________________________________________________");
		l13 = new JLabel("________________________________________________________"+
						            "___________________________________________________");	
		l12.setForeground(Color.BLUE);	
		l13.setForeground(Color.BLUE);	
		l12.setBounds(0,60,700,20);
		c1.add(l12);
		l13.setBounds(0,355,700,20);
		c1.add(l13);
		
		l6=new JLabel("Company No:");
		l6.setBounds(30,90,130,30);
		c1.add(l6);
		
		dt=new JLabel("Date:");
		dt.setBounds(300,90,130,30);
		c1.add(dt);
		
		l1=new JLabel("Name:");
		l1.setBounds(30,160,130,30);
		c1.add(l1);
		
		l2=new JLabel("Address:");
		l2.setBounds(300,220,270,30);
		c1.add(l2);
		
		l3=new JLabel("Phone No.:");
		l3.setBounds(30,220,130,30);
		c1.add(l3);
		
		l4=new JLabel("Email:");
		l4.setBounds(30,270,130,30);
		c1.add(l4);
		
		l5=new JLabel("City:");
		l5.setBounds(30,320,130,30);
		c1.add(l5);
		
		t5=new JTextField();
		t5.setBounds(110,100,130,20);
		c1.add(t5);
		
		String month; int dt; int ye;
		
		String months[] = {
		"01", "02", "03", "04",
		"05", "06", "07", "08",
		"09", "10", "11", "12"};
	 	Calendar calendar = Calendar.getInstance();	
    	 month = months[calendar.get(Calendar.MONTH)];
		dt = calendar.get(Calendar.DATE);
		ye = calendar.get(Calendar.YEAR);
		
		//tdt.setText(dt+"/"+month+"/"+ye);
		txtdt=new JTextField();
		txtdt.setBounds(370,100,130,20);
		txtdt.setEditable(false);
		txtdt.setText(dt+"/"+month+"/"+ye);
		c1.add(txtdt);
		
		t1=new JTextField();
		t1.setBounds(110,160,300,20);
		c1.add(t1);
		
			t1.addKeyListener(new KeyAdapter() 
		{
        	public void keyPressed(KeyEvent EVT) 
        	{
                                
        		String value = t1.getText();
                int l = value.length();
                if (EVT.getKeyChar() >= 'a' && EVT.getKeyChar() <= 'z' ||EVT.getKeyChar() >= 'A' && EVT.getKeyChar() <= 'Z'|| EVT.getKeyChar()=='\b'|| EVT.getKeyChar()==' '|| EVT.isShiftDown()==true)               
                {
                	t1.setEditable(true);
                    //System.out.println("Error");
                }
                else 
                {
                    t1.setEditable(true);
                    JOptionPane.showMessageDialog((Component)null,"Enter Only Characters","Agro Services",JOptionPane.INFORMATION_MESSAGE);
             
             	}
             }
          });
		
		t2=new JTextField();
		t2.setBounds(110,230,130,20);
		c1.add(t2);
		
		t2.addKeyListener(new KeyAdapter() 
			{
        		public void keyPressed(KeyEvent EVT) 
        		{     
	        		String value = t2.getText();
	                int l = value.length();
	                if(l<12)
	                {            	
	                if (EVT.getKeyChar() >= '0' && EVT.getKeyChar() <= '9' ||EVT.getKeyChar()=='\b')               
	                {
	                	t2.setEditable(true);
	                }
	                else 
	                {
	                    t2.setEditable(true);
	                    JOptionPane.showMessageDialog((Component)null,"Enter Only Numbers","Agro Services",JOptionPane.INFORMATION_MESSAGE);
	             	}
	          		}
	             	else
	             		JOptionPane.showMessageDialog((Component)null,"Enter Only 12 Numbers","Agro Services",JOptionPane.INFORMATION_MESSAGE);
         		}

         	});
		
		t3=new JTextField();
		t3.setBounds(110,280,130,20);
		c1.add(t3);
		
		t4=new JTextField();
		t4.setBounds(110,330,130,20);
		c1.add(t4);
		t4.addKeyListener(new KeyAdapter() 
		{
        	public void keyPressed(KeyEvent EVT) 
        	{
                                
        		String value = t4.getText();
                int l = value.length();
                if (EVT.getKeyChar() >= 'a' && EVT.getKeyChar() <= 'z' ||EVT.getKeyChar() >= 'A' && EVT.getKeyChar() <= 'Z'|| EVT.getKeyChar()=='\b'|| EVT.getKeyChar()==' '|| EVT.isShiftDown()==true)               
                {
                	t4.setEditable(true);
                    //System.out.println("Error");
                }
                else 
                {
                    t4.setEditable(true);
                    JOptionPane.showMessageDialog((Component)null,"Enter Only Characters","Agro Services",JOptionPane.INFORMATION_MESSAGE);
             
             	}
             }
          });
			
			
		t8=new JTextArea();
        t8.setBounds(380,220,200,60);
        c1.add(t8);
        t8.setBorder(BorderFactory.createLineBorder(Color.black,1));
     
     	b1=new JButton("Submit");
        b1.setBounds(30,400,100,30);
        c1.add(b1);
        
        b2=new JButton("Clear");
        b2.setBounds(150,400,100,30);
        c1.add(b2);
        
        b3=new JButton("Cancel");
        b3.setBounds(270,400,100,30);
        c1.add(b3);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        try {
            if (conn != null)
                conn.close(); 
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "1234");
            
            String qry = "SELECT company.*,company.comp_id"+
                " FROM company WHERE (((company.comp_id)="+
                "(SELECT Max(company.comp_id) AS Expr1 FROM company;)));";
                
            PreparedStatement Record = conn.prepareStatement(qry);
            ResultSet rs = Record.executeQuery(); // execute query
            rs.next(); int i = rs.getRow();
            
            t5.setText(""+ (rs.getInt("comp_id") + 1));
            t5.setEditable(false);
            
            conn.close();
        } catch(SQLException sqle) {
            System.out.println("SQL Error"+sqle);
        }

		
	  	
		setSize(630,500);
		setVisible(true);	 
        
       }
        
   public void actionPerformed(ActionEvent ae)
    {
    	if(ae.getSource()==b1)
    	 {
    	 	String cn = t1.getText().trim(); // Company Name
    	 	String cph= t2.getText().trim(); // Company phone
    	 	String cem= t3.getText().trim(); // Company email
    	 	String cpl= t4.getText().trim(); // Company city
    	 	String cadd=t8.getText().trim(); // Company addr
    	 	String dt=txtdt.getText().trim(); // Company Date
    	 	
			 try {
				if(conn != null) conn.close();
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "1234");
				if(cn.equals("") || cadd.equals("") || cph.equals("") || cem.equals("") || cpl.equals("")) {
					String msg = "Please fill all Necessory Data";
					JOptionPane.showMessageDialog(null, msg, "Agro Servises", JOptionPane.INFORMATION_MESSAGE);
				} else { 	
					// Query for Inserting record
					String qry = "INSERT INTO company(comp_name, comp_addr, comp_phone, comp_email, comp_city, entry_Date) " +
								 "VALUES (?, ?, ?, ?, ?, ?)";
					PreparedStatement insertRecord = conn.prepareStatement(qry);
					insertRecord.setString(1, cn);
					insertRecord.setString(2, cadd);
					insertRecord.setString(3, cph);
					insertRecord.setString(4, cem);
					insertRecord.setString(5, cpl);
					insertRecord.setString(6, dt);
				
					insertRecord.execute(); // execute query
					String msg = "Record Saved Successfully!";
					JOptionPane.showMessageDialog((Component)null, msg, "Agro Servises", JOptionPane.INFORMATION_MESSAGE);
					
					t1.setText(""); t2.setText(""); t3.setText("");
					t4.setText(""); t8.setText(""); t1.requestFocus();		
					conn.close();
				}
			} catch(SQLException sqle) {
				System.out.println("SQL Error: " + sqle.getMessage());
			}	
    	 }
       	if(ae.getSource()==b2)
    	 {
    	    t1.setText("");t2.setText("");t3.setText("");
    	    t4.setText("");t5.setText("");t6.setText("");
    	    t8.setText("");t1.requestFocus();
    	 }
   
    	if(ae.getSource()==b3)
    	 {
    	    dispose();
    	    
    	 }
      }    
  }         
 class addCompany
{
	public static void main(String args[])
	{
		addcmp ac=new addcmp();
	}
}		