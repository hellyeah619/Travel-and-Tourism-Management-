package travel.managment.system;

import javax.swing.*;
import java.awt.*;

public class CheckPackage extends JFrame{

	public static void main(String[] args) {
		new CheckPackage();
	}
	CheckPackage(){
		setBounds(450,200,900,600);
		
		String [] package1 = {"GOLD PACKAGE","6 Days and 7 Nights","Airport Assistance","Half Day City Tour","Daily Buffet","Welcome Drinks on Arrival","Full 3 Day Island Cruise","English Speaking Guide","Book Now","Summer Special","Price: 24000","package1.jpg"};
		String [] package2 = {"SILVER PACKAGE","5 Days and 4 Nights","Toll Free","First and last Day Buffet","Half Day Mountain Tour", "Welcome Drinks on Arrival","1 Day Insland Cruise","Regional Language Guide","Book Now", "Winter Special","Price: 15000","package2.jpg"};
		String [] package3 = {"BRONZE PACKAGE","3 Days and 3 Nights","Return Airfare","First Day Buffet","1 Day Night Tour", "Soft Drinks on Arrival", "1 Day Island Cruise","Guide Book", "Book Now","All time Special", "Price: 10000", "package3.jpg"};

        JTabbedPane tab = new JTabbedPane();

		JPanel p1 = createPackage(package1);
		tab.addTab("Package 1", null, p1);

		JPanel p2 = createPackage(package2);
		tab.addTab("Package 2",null, p2);

		JPanel p3 = createPackage(package3);
		tab.addTab("Package 3", null, p3);

		add(tab);

		setVisible(true);
	}
	public static JPanel createPackage(String[] Package){
		JPanel p1 = new JPanel();
		p1.setLayout(null);
		p1.setBackground(Color.decode("#0B0C10"));
		
		JLabel l1 = new JLabel(Package[0]);
		l1.setBounds(50,5,300,30);
		l1.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 30));
		l1.setForeground(new Color(255,215,0));
		p1.add(l1);

		JLabel l2 = new JLabel(Package[1]);
		l2.setBounds(50,60,300,30);
		l2.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 20));
		l2.setForeground(Color.decode("#66FCF1"));
		p1.add(l2);

		JLabel l3 = new JLabel(Package[2]);
		l3.setBounds(50,110,300,30);
		l3.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 20));
		l3.setForeground(Color.decode("#45A29E"));
		p1.add(l3);

		JLabel l4 = new JLabel(Package[3]);
		l4.setBounds(50,160,300,30);
		l4.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 20));
		l4.setForeground(Color.decode("#66FCF1"));
		p1.add(l4);

		JLabel l5 = new JLabel(Package[4]);
		l5.setBounds(50,210,300,30);
		l5.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 20));
		l5.setForeground(Color.decode("#45A29E"));
		p1.add(l5);

		JLabel l6 = new JLabel(Package[5]);
		l6.setBounds(50,260,300,30);
		l6.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 20));
		l6.setForeground(Color.decode("#66FCF1"));
		p1.add(l6);

		JLabel l7 = new JLabel(Package[6]);
		l7.setBounds(50,310,300,30);
		l7.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 20));
		l7.setForeground(Color.decode("#45A29E"));
		p1.add(l7);

		JLabel l8 = new JLabel(Package[7]);
		l8.setBounds(50,360,300,30);
		l8.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 20));
		l8.setForeground(Color.decode("#66FCF1"));
		p1.add(l8);

		JLabel l9 = new JLabel(Package[8]);
		l9.setBounds(60,430,300,30);
		l9.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 35));
		l9.setForeground(Color.decode("#C5C6C7"));
		p1.add(l9);

		JLabel l10 = new JLabel(Package[9]);
		l10.setBounds(80,480,300,30);
		l10.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 25));
		l10.setForeground(Color.decode("#C5C6C7"));
		p1.add(l10);

		JLabel l11 = new JLabel(Package[10]);
		l11.setBounds(500,480,300,30);
		l11.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 25));
		l11.setForeground(Color.decode("#C5C6C7"));
		p1.add(l11);

		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/" + Package[11]));
		Image i2 = i1.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel l12 = new JLabel(i3);
		l12.setBounds(350,20,500,300);
		p1.add(l12);
		return p1;
	}

}
 