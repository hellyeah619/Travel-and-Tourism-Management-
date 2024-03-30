package travel.managment.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class UpdateCustomer extends JFrame implements ActionListener{
	JLabel labelusername, labelname;
	// JComboBox comboid;
	JTextField tfnumber, tfcountry, tfaddress, tfemail, tfPhone, tfId, tfGender;
	JRadioButton rmale, rfemals;
	JButton add, back;
	public static void main(String[] args) {
		new UpdateCustomer("");
	}
	UpdateCustomer(String username){
		setBounds(500,200,850,550);
		setLayout(null);
		getContentPane().setBackground(Color.white);
		

		JLabel text = new JLabel("UPDATE CUSTOMER DETAILS");
		text.setBounds(50,0,300,25);
		text.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 20));
		add(text);

		JLabel lblusername = new JLabel("Username");
		lblusername.setBounds(30,50,150,25);
		add(lblusername); 

		labelusername = new JLabel();
		labelusername.setBounds(220,50,150,25);
		add(labelusername);

		JLabel lblid = new JLabel("ID");
		lblid.setBounds(30,90,150,25);
		add(lblid);

		tfId = new JTextField();
		tfId.setBounds(220,90,150,25);
		add(tfId);

		JLabel lblnumber = new JLabel("Number");
		lblnumber.setBounds(30,130,150,25);
		add(lblnumber);

		tfnumber = new JTextField();
		tfnumber.setBounds(220,130,150,25);
		add(tfnumber);

		JLabel lblname = new JLabel("Name");
		lblname.setBounds(30,170,150,25);
		add(lblname);

		labelname =  new JLabel();
		labelname.setBounds(220,170,150,25);
		add(labelname); 

		JLabel lblgender =  new JLabel("Gender");
		lblgender.setBounds(30,210,150,25);
		add(lblgender);

		tfGender = new JTextField();
		tfGender.setBounds(220,210,150,25);
		add(tfGender);

		// rmale = new JRadioButton("Male");
		// rmale.setBounds(220,210,70,25);
		// rmale.setBackground(Color.white);
		// add(rmale);

		// rfemals = new JRadioButton("Female");
		// rfemals.setBounds(300,210,70,25);
		// rfemals.setBackground(Color.WHITE);
		// add(rfemals);

		// ButtonGroup bg =  new ButtonGroup();
		// bg.add(rfemals);
		// bg.add(rmale);

		JLabel lblCountry = new JLabel("Country");
		lblCountry.setBounds(30,250,150,25);
		add(lblCountry);

		tfcountry = new JTextField();
		tfcountry.setBounds(220,250,150,25);
		add(tfcountry);

		JLabel lbladdress = new JLabel("Address");
		lbladdress.setBounds(30,290,150,25);
		add(lbladdress);

		tfaddress = new JTextField();
		tfaddress.setBounds(220,290,150,25);
		add(tfaddress);

		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setBounds(30,330,150,25);
		add(lblPhone);

		tfPhone = new JTextField();
		tfPhone.setBounds(220,330,150,25);
		add(tfPhone);

		JLabel lblemail = new JLabel("Email");
		lblemail.setBounds(30,370,150,25);
		add(lblemail);

		tfemail = new JTextField();
		tfemail.setBounds(220,370,150,25);
		add(tfemail);
		
		add =  new JButton("Update");
		add.setBackground(Color.white);
		add.setForeground(Color.black);
		add.setBounds(70,430,100,25);
		add.addActionListener(this);
		add(add);
		 
		back = new JButton("Back");
		back.setForeground(Color.black);
		back.setBackground(Color.white);
		back.setBounds(220,430,100,25);
		back.addActionListener(this);
		add(back);

		ImageIcon i1 =  new ImageIcon(ClassLoader.getSystemResource("icons/update.png"));
		Image i2 =  i1.getImage().getScaledInstance(350, 300, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image =  new JLabel(i3);
		image.setBounds(400,40,400,420);
		add(image);

		try{
			Conn c = new Conn();
			ResultSet rs = c.s.executeQuery("select * from customer where username = '"+username+"'");
			while (rs.next()) {
				labelusername.setText(rs.getString("username"));
				labelname.setText(rs.getString("name"));
				tfId.setText(rs.getString("id"));
				tfnumber.setText(rs.getString("number"));
				tfGender.setText(rs.getString("gender"));
				tfcountry.setText(rs.getString("country"));
				tfaddress.setText(rs.getString("address"));
				tfPhone.setText(rs.getString("phone"));
				tfemail.setText(rs.getString("email"));
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == add){
			String username = labelusername.getText();
			String id = tfId.getText();
			String number  = tfnumber.getText();
			String name = labelname.getText();
			String gender = tfGender.getText();
			String country  = tfcountry.getText();
			String address  = tfaddress.getText();
			String phone  = tfPhone.getText();
			String emial = tfemail.getText();
			try{
				Conn c = new Conn();
				String query = "update customer set username = '"+username+"', id = '"+id+"',number = '"+number+"',name = '"+name+"',gender = '"+gender+"',country =  '"+country+"',address = '"+address+"',phone = '"+phone+"',email =  '"+emial+"'";
				c.s.executeUpdate(query);

				JOptionPane.showMessageDialog(null,"Customer Details Updated Successfully");
				setVisible(false);
			}catch(Exception e){
				e.printStackTrace();
			}
		}else{
			setVisible(false);
		}
	}

}
