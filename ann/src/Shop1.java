import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import java.sql.*;
 
	class Shop implements ActionListener
 {  //9
		JFrame frame= new JFrame();
		JButton b1=new JButton("ADMIN");
		JButton b2=new JButton("SHOP OWNER");
		JButton b3=new JButton("CUSTOMER");
	 
	public Shop()
	{
		b1.setBounds(100,50,150,50);
		b2.setBounds(100,150,150,50);
		b3.setBounds(100,250,150,50);
		b1.addActionListener(this);
		
		
		frame.setVisible(true);
		frame.setSize(400,400);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		JFrame f1;
		JLabel l1,l2;
		JTextField t,p;
		JButton login;
		l1=new JLabel("Username:");
		l2=new JLabel("Password:");
		login=new JButton("Login");
		
		if(e.getSource()==b1)
		{  //6
			
			l1.setBounds(100,50,150,20);
			l2.setBounds(100,100,150,20);
			
			
			t=new JTextField();
			p=new JPasswordField();
			
			
			t.setBounds(200,50,150,20);
			p.setBounds(200,100,150,20);
			login.setBounds(200,200,100,25);
			
			
			
			
			f1=new JFrame();
			f1.setSize(500,500);
			f1.setVisible(true);
			f1.add(l1);
			f1.add(l2);
			f1.add(t);
			f1.add(p);
			f1.add(login);
			f1.setLayout(null);
			f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			
		login.addActionListener(new ActionListener() { //5
	
	public void actionPerformed(ActionEvent e1)
	{  //4
		String s1=t.getText();
		String s2=p.getText();
		JFrame f2;
		//JLabel l3;
		JButton b4,b5,b6;
		
			
			
		if(e1.getSource()==login)
		{
		if(s1.trim().equals("Admin") && s2.trim().equals("password")) 
		{
		f2=new JFrame();
		//l3=new JLabel();
		
		b4=new JButton("Insert New Shop Owner");
		b5=new JButton("Delete existing Shop Owner");
		b6=new JButton("View existing Shop Owners");
		
		
		b4.setBounds(100,100,200,50);
		b5.setBounds(100,200,200,50);
		b6.setBounds(100,300,200,50);
		
		
		//l3.setText("ShopList");  //temporary output to replace Shop Buttons
		//l3.setBounds(100,100,100,25);
		
		
		f2.setVisible(true);
		f2.setSize(600,400);
		f2.setLayout(null);
		//f2.add(l3);
		f2.add(b4);
		f2.add(b5);
		f2.add(b6);
		
		f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		b4.addActionListener(new ActionListener() {   //3
		
		public void actionPerformed(ActionEvent e2)
		{	//2
			
			JFrame f4=new JFrame();
			JLabel l3,l4,l5;
			JTextField t3,t4,t5; 
			JButton enter;
			if(e2.getSource()==b4)
			{//1
				l5=new JLabel("Shop ID:");
				l3=new JLabel("Shop Name:");
				l4=new JLabel("Shop Owner Name:");
				l3.setBounds(100,100,150,20);
				l4.setBounds(100,150,150,20);
				l5.setBounds(100,50,150,20);
				
				t3=new JTextField();
				t4=new JTextField();
				t5=new JTextField();
				t3.setBounds(200,100,100,20);
				t4.setBounds(250,150,100,20);
				t5.setBounds(200,50,100,20);
				
				
				enter=new JButton("Enter");
				enter.setBounds(100,250,50,50);
				
				
				
				f4.setVisible(true);
				f4.setSize(400,600);
				f4.setLayout(null);
				f4.add(l3);
				f4.add(l4);
				f4.add(l5);
				f4.add(t3);
				f4.add(t4);
				f4.add(t5);
				f4.add(enter);
				f4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				enter.addActionListener(new ActionListener() {
					
				public void actionPerformed(ActionEvent e11)	
				{
					if(e11.getSource()==enter)
					{	
						
						try
						{
							 String url = "jdbc:mysql://localhost:3306/jeff";
							 String uname = "root";
							 String pass = "jeff@123";
							
							    
							Class.forName("com.mysql.cj.jdbc.Driver");
							Connection con=DriverManager.getConnection(url,uname,pass);
							Statement st=con.createStatement();
							
							
							
							String sid=t5.getText();
							String sname=t3.getText();
							String soname=t4.getText();
							
							 String query="insert into admin values ('"+ sid + "','" + sname + "','" + soname +"')";
							 
							 st.executeUpdate(query);
							 
							 st.close();
							 con.close();
							 
						}
						
						catch(Exception e)
						{
							System.out.println(e);
						}
					}
				}
					
				});
						
			}//1
		}//2
	});//3
		
		b5.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e12)
			{
				if(e12.getSource()==b5)
				{	JFrame f5=new JFrame();
					JLabel l6=new JLabel("Select Shop ID of shop to be deleted:");
					l6.setBounds(50,100,300,20);
					
					JTextField t6=new JTextField();
					t6.setBounds(100,150,50,20);
					
					JButton del=new JButton("Delete");
					del.setBounds(100,300,150,20);
					
					f5.setVisible(true);
					f5.setLayout(null);
					f5.setSize(400,600);
					f5.add(l6);
					f5.add(t6);
					f5.add(del);
					
					
					f5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					
					del.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e13)
						{
							if(e13.getSource()==del)
							{
								try
								{
									 String url = "jdbc:mysql://localhost:3306/jeff";
									 String uname = "root";
									 String pass = "jeff@123";
									
									    
									Class.forName("com.mysql.cj.jdbc.Driver");
									Connection con=DriverManager.getConnection(url,uname,pass);
									Statement st=con.createStatement();
									
									
									
									String did=t6.getText();
								
									
									 String query="delete from admin where shopid="+did;
									 
									 st.executeUpdate(query);
									 
									 st.close();
									 con.close();
									 
								}
								
								catch(Exception e)
								{
									System.out.println(e);
								}
							}
						}
					});
					
					
					
					
				}
			}
		});
		
		b6.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent e14)
		{
			if(e14.getSource()==b6)
			{
			JFrame f7=new JFrame();
			JTextField t7=new JTextField();
			
			t7.setBounds(50,50,500,500);
			
			f7.setVisible(true);
			f7.setSize(700,700);
			f7.setLayout(null);
			f7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
			}
			
			
			
		}
	
	});
	
		
		
	}
	}

    
 } //4
 });  //5
 } //6
} //7
}  //8 
 public class Shop1
 {
		public static void main(String[] args)
		{
			new Shop();
		}
		
 }

