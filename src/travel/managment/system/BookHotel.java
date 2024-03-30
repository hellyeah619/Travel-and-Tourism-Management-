package travel.managment.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
public class BookHotel extends JFrame implements ActionListener{
    String username;
    Choice chotel, cac, cfood;
    JTextField tfperson, tfdays;
    JLabel labelphone,labelnumber, labelID,labelusername,labelprice;
    JButton checkprice, bookpackage,back;
    public static void main(String[] args) {
        new BookHotel("");
    }
    BookHotel(String username){
        this.username = username;
        setBounds(350,200,1100,600);
        setLayout(null);
        getContentPane().setBackground(Color.white);

        JLabel text =  new JLabel("BOOK HOTEL");
        text.setBounds(100,10,200,30);
        text.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,20));
        add(text);

        JLabel lblusername =  new JLabel("Username");
        lblusername.setBounds(40,70,100,20);
        lblusername.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,16));
        add(lblusername);

        labelusername =  new JLabel();
        labelusername.setBounds(250,70,130,20);
        labelusername.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,16));
        add(labelusername);

        JLabel lblpackage =  new JLabel("Select Hotel");
        lblpackage.setBounds(40,110,100,20);
        lblpackage.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,16));
        add(lblpackage);

        chotel = new Choice();
        chotel.setBounds(250,110,150,50);
        add(chotel);

		try{
			Conn c = new Conn();
			ResultSet rs = c.s.executeQuery("select * from hotel");
			while (rs.next()) {
				chotel.add(rs.getString("name"));
			}

		}catch(Exception e){
			e.printStackTrace();
		}

        JLabel lblpersons =  new JLabel("Total Persons");
        lblpersons.setBounds(40,150,150,20);
        lblpersons.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,16));
        add(lblpersons);

        tfperson = new JTextField("1");
        tfperson.setBounds(250,150,200,25);
        add(tfperson);

		JLabel lbldays =  new JLabel("Number of days");
        lbldays.setBounds(40,190,150,20);
        lbldays.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,16));
        add(lbldays);

        tfdays = new JTextField("1");
        tfdays.setBounds(250,190,200,25);
        add(tfdays);

        JLabel lblac = new JLabel("AC/ Non-AC");
        lblac.setBounds(40,230,150,20);
        lblac.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,16));
        add(lblac);

		cac = new Choice();
		cac.add("AC");
		cac.add("Non-AC");
		cac.setBounds(250,230,150,20);
		add(cac);

		JLabel lblfood = new JLabel("Food Included");
		lblfood.setBounds(40,270,150,20);
		lblfood.setFont(new Font("TIMES NEW ROMAN", Font.PLAIN, 16));
		add(lblfood);

		cfood = new Choice();
		cfood.add("YES");
		cfood.add("NO");
		cfood.setBounds(250,270,150,20);
		add(cfood);

		JLabel lblid = new JLabel("ID");
        lblid.setBounds(40,310,150,20);
        lblid.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,16));
        add(lblid);

        labelID = new JLabel();
        labelID.setBounds(250,310,150,25);
        labelID.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,16));
        add(labelID);

        JLabel lblnumbers = new JLabel("Number");
        lblnumbers.setBounds(40,350,150,25);
        lblnumbers.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,16));
        add(lblnumbers);

        labelnumber = new JLabel();
        labelnumber.setBounds(250,350,150,25);
        labelnumber.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,16));
        add(labelnumber);

        JLabel lblphone = new JLabel("Phone");
        lblphone.setBounds(40,390,150,20);
        lblphone.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,16));
        add(lblphone);

        labelphone = new JLabel();
        labelphone.setBounds(250,390,150,25);
        labelphone.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,16));
        add(labelphone);

        JLabel lblprice = new JLabel("Total Price");
        lblprice.setBounds(40,430,150,25);
        lblprice.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,16));
        add(lblprice);

        labelprice = new JLabel();
        labelprice.setBounds(250,430,150,25);
        labelprice.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,16));
        add(labelprice);

        try{
			Conn c = new Conn();
			String query =  "select * from customer where username = '"+username+"'";
			ResultSet rs = c.s.executeQuery(query);
			while(rs.next()){
				labelusername.setText(rs.getString("username"));
				labelID.setText(rs.getString("id"));
				labelnumber.setText(rs.getString("number"));
				labelphone.setText((rs.getString("phone")));
			}
		}catch(Exception e){
			e.printStackTrace();
		}
        checkprice = new JButton("Check Price");
        checkprice.setBackground(Color.black);
        checkprice.setForeground(Color.white);
        checkprice.setBounds(60,500,120,25);
        checkprice.addActionListener(this);
        add(checkprice);

        bookpackage = new JButton("Book Hotel");
        bookpackage.setBackground(Color.black);
        bookpackage.setForeground(Color.white);
        bookpackage.setBounds(200,500,120,25);
        bookpackage.addActionListener(this);
        add(bookpackage);

        back = new JButton("Back");
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.setBounds(340,500,120,25);
        back.addActionListener(this);
        add(back);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/book.jpg"));
		Image i2 = i1.getImage().getScaledInstance(600, 300, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel l12 = new JLabel(i3);
		l12.setBounds(500,20,600,300);
        add(l12);

        setVisible(true);

        
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == checkprice){
           try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from hotel where name = '"+chotel.getSelectedItem()+"'");
            while (rs.next()) {
                int cost = Integer.parseInt(rs.getString("costperperson"));
                int food = Integer.parseInt(rs.getString("foodincluded"));
                int ac = Integer.parseInt(rs.getString("acroom"));
                int persons = Integer.parseInt(tfperson.getText());
                int days = Integer.parseInt(tfdays.getText());

                String acselected = cac.getSelectedItem();
                String foodselected = cfood.getSelectedItem();
                
                if(persons *days > 0){
                    int Total = 0;
                    Total += acselected.equals("AC") ? ac:0;
                    Total += foodselected.equals("YES") ? food : 0;
                    Total +=  cost;
                    Total = Total*persons*days;
                    labelprice.setText("Rs " + Total);
                }else{
                    JOptionPane.showMessageDialog(null, "Please Enter a Valid Number");
                }
            }
           }catch(Exception e ){
                e.printStackTrace();
           }
        }else if(ae.getSource() == bookpackage){
            try{
                Conn c = new Conn();
                c.s.executeUpdate("insert into bookhotel values ('"+labelusername.getText()+"','"+chotel.getSelectedItem()+"','"+tfperson.getText()+"','"+tfdays.getText()+"','"+cac.getSelectedItem()+"','"+cfood.getSelectedItem()+"','"+labelID.getText()+"','"+labelnumber.getText()+"','"+labelphone.getText()+"','"+labelprice.getText()+"')");
                JOptionPane.showMessageDialog(null,"Package Booked Successfully");
                setVisible(false);
            }catch(Exception e){
                e.printStackTrace();
            }
        }else{
            setVisible(false);
        }
    }
}
