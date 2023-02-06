import javax.swing.*;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

class Shop1 implements ActionListener

 {  //8

	JFrame frame= new JFrame();

	JButton b1=new JButton("ADMIN");

	JButton b2=new JButton("SHOP OWNER");

	JButton b3=new JButton("CUSTOMER");



	public Shop1()

	{

	b1.setBounds(100,50,150,50);

	b2.setBounds(100,150,150,50);

	b3.setBounds(100,250,150,50);

	b1.addActionListener(this);



b2.addActionListener(this);

	frame.setVisible(true);

	frame.setSize(400,400);

	frame.setLayout(null);

	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	frame.add(b1);

	frame.add(b2);

	frame.add(b3);

	}



	public void actionPerformed(ActionEvent e)

	{//7

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

	{ //2



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

	

 

 else if (e.getSource()==b2)

 {

 	JButton j1=new JButton("insert stocks");

 	JButton j2=new JButton("delete stocks");

	JButton j3=new JButton("update stocks");

	JFrame z1=new JFrame();

	j1.setBounds(100,100,200,50);

	j2.setBounds(100,200,200,50);

	j3.setBounds(100,300,200,50);

	z1.setVisible(true);

	z1.setSize(600,400);

	z1.setLayout(null);

	z1.add(j1);

	z1.add(j2);

	z1.add(j3);

	j1.addActionListener(this);

	j2.addActionListener(this);

	z1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	j1.addActionListener(new ActionListener()

	{

		public void actionPerformed(ActionEvent e6)

		{ 

			JButton w1=new JButton("insert");

			JFrame z2=new JFrame();

			JLabel y1,y2,y3,y4,y5;

			JTextField x1,x2,x3,x4,x5;

			if(e6.getSource()==j1)

			{

				y1=new JLabel("PID");

				y2=new JLabel("name");

				y3=new JLabel("category");

				y4=new JLabel("quantity");

				y5=new JLabel("Price");

				y1.setBounds(100,100,150,20);

				y2.setBounds(100,150,150,20);

				y3.setBounds(100,200,150,20);

				y4.setBounds(100,250,150,20);

				y5.setBounds(100,300,150,20);

				x1=new JTextField();

				x2=new JTextField();

				x3=new JTextField();

				x4=new JTextField();

				x5=new JTextField();

				x1.setBounds(200,100,150,20);

				x2.setBounds(200,150,150,20);

				x3.setBounds(200,200,150,20);

				x4.setBounds(200,250,150,20);

				x5.setBounds(200,300,150,20);

				w1.setBounds(300,350,100,20);

				z2.setVisible(true);

				z2.setSize(400,600);

				z2.setLayout(null);

				z2.add(y1);

				z2.add(y2);

				z2.add(y3);

				z2.add(y4);

				z2.add(y5);

				z2.add(x1);

				z2.add(x2);

				z2.add(x3);

				z2.add(x4);

				z2.add(x5);

				z2.add(w1);

				z2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

				

				w1.addActionListener(new ActionListener()

				{

					public void actionPerformed(ActionEvent e7)

					{

						if(e7.getSource()==w1)

						{

							

							

							//establish connection

							String pid=x1.getText();

							String name=x2.getText();

							String cat=x3.getText();

							String qua=x4.getText();

							String price=x5.getText();

							String q1="insert into stocks values('"+pid+"','"+name+"','"+cat+"','"+qua+"','"+price+"')";

							//stmt.executeUpdate(q1);

							JOptionPane.showMessageDialog(z2,"record inserted");

						}

					}

				});

			}

		}

	});

	j2.addActionListener(new ActionListener()

	{

		public void actionPerformed(ActionEvent e10)

		{ 

			 if(e10.getSource()==j2)

			{

				JFrame z3=new JFrame();

				JButton w2=new JButton("delete");

				JLabel y6=new JLabel("pid");

				JTextField x6=new JTextField();

				y6.setBounds(100,200,150,20);

				x6.setBounds(200,200,150,20);

				w2.setBounds(300,400,100,20);	

				z3.setVisible(true);

				z3.setSize(400,600);

				z3.setLayout(null);

				z3.add(y6);

				z3.add(x6);

				z3.add(w2);

				z3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

				w2.addActionListener(new ActionListener()

				{

					public void actionPerformed(ActionEvent e8)

					{

						if(e8.getSource()==w2)

						{

							

							

							//establish connection

							String pid=x6.getText();

							String q2="delete * from stocks where PID=pid";

							//stmt.executeUpdate(q2);

							JOptionPane.showMessageDialog(z3,"record deleted");

						}

					}

				});

			}

		}

	});

	j3.addActionListener(new ActionListener()

	{

		public void actionPerformed(ActionEvent e11)

		{

			if(e11.getSource()==j3)

			{

				JFrame z4=new JFrame();

				JButton w3=new JButton("update");

				JLabel y7=new JLabel("pid");

				JLabel y8=new JLabel("quantity");

				JTextField x7=new JTextField();

				JTextField x8=new JTextField();

				y7.setBounds(100,200,150,20);

				y8.setBounds(100,250,150,20);

				x7.setBounds(200,200,150,20);

				x8.setBounds(200,250,150,20);

				w3.setBounds(300,400,100,20);	

				z4.setVisible(true);

				z4.setSize(400,600);

				z4.setLayout(null);

				z4.add(y7);

				z4.add(x7);

				z4.add(y8);

				z4.add(x8);

				z4.add(w3);

				z4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

				w3.addActionListener(new ActionListener()

				{

					public void actionPerformed(ActionEvent e9)

					{

						if(e9.getSource()==w3)

						{

							

							

							//establish connection

							String pid=x7.getText();

							String qua=x8.getText();

							String q3="update stocks set QTY=qua where PID=pid";

							//stmt.executeUpdate(q3);

							JOptionPane.showMessageDialog(z4,"record updated");

						}

					}

				});

			}

		}

	});

	

}		

} //7

}  //8

 public class shop

 {

public static void main(String[] args)

{

new Shop1();

}



 }
