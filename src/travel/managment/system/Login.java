package travel.managment.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.*;
import javax.swing.border.*;

public class Login extends JFrame implements ActionListener{
	JButton login,ForgotPassword, Singup;
	JTextField tfusername, tfpassword;
	public static void main(String[] args) {
		new Login();
	}
	//Class constructor 
	Login(){
		setSize(900,400);
		setLocation(350,200);
		setLayout(null);

		getContentPane().setBackground(Color.white);
		
		//Left panel 
		JPanel p1 = new JPanel();
		p1.setBackground(new Color(131,193,233));
		p1.setBounds(0,0,400,400);
		p1.setLayout(null);
		add(p1);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
		Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(100,120,200,200);
		p1.add(image);
		
		//Right panel
		JPanel p2 = new JPanel();
		p2.setLayout(null);
		p2.setBounds(400, 30, 450, 300);
		add(p2);
		
		//Username
		JLabel lblusername = new JLabel("Username");
		lblusername.setBounds(60,20,100,25);
		lblusername.setFont(new Font("TIMES NEW ROMAN", Font.PLAIN,20));
		p2.add(lblusername);

		tfusername = new JTextField();
		tfusername.setBounds(60,60,300,30);
		tfusername.setBorder(BorderFactory.createEmptyBorder());
		p2.add(tfusername);
		
		//Password
		JLabel lblpassword = new JLabel("Password");
		lblpassword.setBounds(60,110,100,25);
		lblpassword.setFont(new Font("TIMES NEW ROMAN", Font.PLAIN,20));
		p2.add(lblpassword);

		tfpassword = new JTextField();
		tfpassword.setBounds(60,150,300,30);
		tfpassword.setBorder(BorderFactory.createEmptyBorder());
		p2.add(tfpassword);
		
		//Login Button
		login =  new JButton("Login");
		login.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 15));
		login.setBounds(60,200,130,30);
		login.setBackground(new Color(133,193,233));
		login.setForeground(Color.WHITE);
		login.setBorder(new LineBorder(new Color(133,193,233)));
		login.addActionListener(this);
		p2.add(login);
		
		//Signup Button
		Singup =  new JButton("Singup");
		Singup.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 15));
		Singup.setBounds(230,200,130,30);
		Singup.setBackground(new Color(133,193,233));
		Singup.setForeground(Color.WHITE);
		Singup.setBorder(new LineBorder(new Color(133,193,233)));
		Singup.addActionListener(this);
		p2.add(Singup);
		
		//Forgot Password button 
		ForgotPassword =  new JButton("Forgot Password");
		ForgotPassword.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 15));
		ForgotPassword.setBounds(150,250,130,30);
		ForgotPassword.setBackground(new Color(133,193,233));
		ForgotPassword.setForeground(Color.WHITE);
		ForgotPassword.setBorder(new LineBorder(new Color(133,193,233)));
		ForgotPassword.addActionListener(this);
		p2.add(ForgotPassword);
		
		//Trouble Login butoon 
		JLabel text = new JLabel("Trouble in login...");
		text.setBounds(300,260,150,20);
		text.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 12));
		text.setForeground(Color.red);
		p2.add(text);
		
		setVisible(true);

	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == login){
			try{
				String username = tfusername.getText();
				String password = tfpassword.getText();
				
				String query = "select * from accounts where username = '"+username+"' and password = '"+password+"'";
				Conn c = new Conn();
				ResultSet rs = c.s.executeQuery(query);
				if(rs.next()){
					setVisible(false);
					new Loading(username);
				}else{
					JOptionPane.showMessageDialog(null,"Incorrect username or password");
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		}else if(ae.getSource() == Singup){
			setVisible(false);
			new Signup();
		}else{
			setVisible(false);
			new ForgotPassword();
		}
	}
}