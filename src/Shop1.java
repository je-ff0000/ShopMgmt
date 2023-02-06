import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
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
		b4=new JButton("Insert New Shop Owner");
			
			
		if(e1.getSource()==login)
		{
		if(s1.trim().equals("Admin") && s2.trim().equals("password")) 
		{
		f2=new JFrame();
		//l3=new JLabel();
		
		
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
		
		}
			
		}
	
		
	b4.addActionListener(new ActionListener() {   //3
		
		public void actionPerformed(ActionEvent e2)
		{	//2
			
			JFrame f4=new JFrame();
			JLabel l3,l4;
			JTextField t3,t4;
			if(e2.getSource()==b4)
			{//1
				l3=new JLabel("Shop Name:");
				l4=new JLabel("Shop Owner Name:");
				l3.setBounds(100,100,150,20);
				l4.setBounds(100,150,150,20);
				
				t3=new JTextField();
				t4=new JTextField();
				t3.setBounds(200,150,100,20);
				t4.setBounds(200,150,100,20);
				
				
				
				
				f4.setVisible(true);
				f4.setSize(400,600);
				f4.setLayout(null);
				f4.add(l3);
				f4.add(l4);
				f4.add(t3);
				f4.add(t4);
				f4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						
			}//1
		}//2
	});//3
	
	
		

    
 }//4
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

