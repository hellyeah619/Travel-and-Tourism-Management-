package travel.managment.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
public class BookPackage extends JFrame implements ActionListener{
    String username;
    Choice cpackage;
    JTextField tfperson;
    JLabel labelphone,labelnumber, labelID,labelusername,labelprice;
    JButton checkprice, bookpackage,back;
    public static void main(String[] args) {
        new BookPackage("");
    }
    BookPackage(String username){
        this.username = username;
        setBounds(350,200,1100,500);
        setLayout(null);
        getContentPane().setBackground(Color.white);

        JLabel text =  new JLabel("BOOK PACKAGE");
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

        JLabel lblpackage =  new JLabel("Select Package");
        lblpackage.setBounds(40,110,100,20);
        lblpackage.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,16));
        add(lblpackage);

        cpackage = new Choice();
        cpackage.add("GOLD PACKAGE");
        cpackage.add("SILVER PACKAGE");
        cpackage.add("BRONZE PACKAGE");
        cpackage.setBounds(250,110,130,50);
        add(cpackage);

        JLabel lblpersons =  new JLabel("Total Persons");
        lblpersons.setBounds(40,150,150,20);
        lblpersons.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,16));
        add(lblpersons);

        tfperson = new JTextField("1");
        tfperson.setBounds(250,150,200,25);
        add(tfperson);

        JLabel lblid = new JLabel("ID");
        lblid.setBounds(40,190,150,20);
        lblid.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
        add(lblid);

        labelID = new JLabel();
        labelID.setBounds(250,190,150,25);
        labelID.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
        add(labelID);

        JLabel lblnumbers = new JLabel("Number");
        lblnumbers.setBounds(40,230,150,25);
        lblnumbers.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
        add(lblnumbers);

        labelnumber = new JLabel();
        labelnumber.setBounds(250,230,150,25);
        labelnumber.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
        add(labelnumber);

        JLabel lblphone = new JLabel("Phone");
        lblphone.setBounds(40,270,150,20);
        lblphone.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
        add(lblphone);

        labelphone = new JLabel();
        labelphone.setBounds(250,270,150,25);
        labelphone.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
        add(labelphone);

        JLabel lblprice = new JLabel("Total Price");
        lblprice.setBounds(40,310,150,25);
        lblprice.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
        add(lblprice);

        labelprice = new JLabel();
        labelprice.setBounds(250,310,150,25);
        labelprice.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
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
        checkprice.setBounds(60,380,120,25);
        checkprice.addActionListener(this);
        add(checkprice);

        bookpackage = new JButton("Book Package");
        bookpackage.setBackground(Color.black);
        bookpackage.setForeground(Color.white);
        bookpackage.setBounds(200,380,120,25);
        bookpackage.addActionListener(this);
        add(bookpackage);

        back = new JButton("Back");
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.setBounds(340,380,120,25);
        back.addActionListener(this);
        add(back);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bookpackage.jpg"));
		Image i2 = i1.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel l12 = new JLabel(i3);
		l12.setBounds(550,20,500,300);
        add(l12);

        setVisible(true);

        
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == checkprice){
            String pack = cpackage.getSelectedItem();
            int cost = 0;
            if(pack.equals("GOLD PACKAGE")){
                cost+= 24000;
            }else if(pack.equals("SILVER PACKAGE")){
                cost+= 15000;
            }else{
                cost+= 10000;
            }
            int persons = Integer.parseInt(tfperson.getText());
            cost *= persons;
            labelprice.setText("Rs" + cost);
        }else if(ae.getSource() == bookpackage){
            try{
                Conn c = new Conn();
                c.s.executeUpdate("insert into bookpackage values ('"+labelusername.getText()+"','"+cpackage.getSelectedItem()+"','"+tfperson.getText()+"','"+labelID.getText()+"','"+labelnumber.getText()+"','"+labelphone.getText()+"','"+labelprice.getText()+"')");
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
