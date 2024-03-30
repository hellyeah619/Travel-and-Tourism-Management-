package travel.managment.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Dashboard extends JFrame implements ActionListener{
    JButton addPersonalDetails,viewBookedHotels, viewPersonalDetails,viewHotels,viewPackages, updatePersonalDetails, checkPackages,bookPackages;
    JButton Destinations,BookHotels,payments,Calculator,Notepad,about;
    String username;
	public static void main(String[] args) {
        new Dashboard("Broken");
    }
    Dashboard(String username){
        this.username = username;
        // setBounds(0,0,1600,1000);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);

        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0,0,102));
        p1.setBounds(0,0,1950,65);
        add(p1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2 = i1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel icon =  new JLabel(i3);
        icon.setBounds(5,0,70,70);
        p1.add(icon);

        JLabel heading =  new JLabel("Dashboard");
        heading.setBounds(80,10,300,40);
        heading.setForeground(Color.white);
        heading.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 30));
        p1.add(heading);

        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0,0,102));
        p2.setBounds(0,65,300,1080);
        add(p2);

        addPersonalDetails = new JButton("Add Personal Details ");
        addPersonalDetails.setBounds(0,0,300,50);
        addPersonalDetails.setBackground(new Color(0,0,102));
        addPersonalDetails.setForeground(Color.white);
        addPersonalDetails.setFont(new Font("TIMES NEW ROMAN", Font.PLAIN,20 ));
        addPersonalDetails.setMargin(new Insets(0,0,0,60));
        addPersonalDetails.addActionListener(this);
        p2.add(addPersonalDetails);

        updatePersonalDetails = new JButton("Update Personal Details ");
        updatePersonalDetails.setBounds(0,50,300,50);
        updatePersonalDetails.setBackground(new Color(0,0,102));
        updatePersonalDetails.setForeground(Color.white);
        updatePersonalDetails.setFont(new Font("TIMES NEW ROMAN", Font.PLAIN,20 ));
        updatePersonalDetails.setMargin(new Insets(0,0,0,60));
        updatePersonalDetails.addActionListener(this);
        p2.add(updatePersonalDetails);

        viewPersonalDetails = new JButton("View Personal Details ");
        viewPersonalDetails.setBounds(0,100,300,50);
        viewPersonalDetails.setBackground(new Color(0,0,102));
        viewPersonalDetails.setForeground(Color.white);
        viewPersonalDetails.setFont(new Font("TIMES NEW ROMAN", Font.PLAIN,20 ));
        viewPersonalDetails.setMargin(new Insets(0,0,0,50));
        viewPersonalDetails.addActionListener(this);
        p2.add(viewPersonalDetails);

        JButton deletePersonalDetails = new JButton("Delete Personal Details ");
        deletePersonalDetails.setBounds(0,150,300,50);
        deletePersonalDetails.setBackground(new Color(0,0,102));
        deletePersonalDetails.setForeground(Color.white);
        deletePersonalDetails.setFont(new Font("TIMES NEW ROMAN", Font.PLAIN,20 ));
        deletePersonalDetails.setMargin(new Insets(0,0,0,40));
        p2.add(deletePersonalDetails);

        checkPackages = new JButton("Check Package");
        checkPackages.setBounds(0,200,300,50);
        checkPackages.setBackground(new Color(0,0,102));
        checkPackages.setForeground(Color.white);
        checkPackages.setFont(new Font("TIMES NEW ROMAN", Font.PLAIN,20 ));
        checkPackages.setMargin(new Insets(0,0,0,110));
        checkPackages.addActionListener(this);
        p2.add(checkPackages);

        bookPackages = new JButton("Book Package");
        bookPackages.setBounds(0,250,300,50);
        bookPackages.setBackground(new Color(0,0,102));
        bookPackages.setForeground(Color.white);
        bookPackages.setFont(new Font("TIMES NEW ROMAN", Font.PLAIN,20 ));
        bookPackages.setMargin(new Insets(0,0,0,120));
        bookPackages.addActionListener(this);
        p2.add(bookPackages);

        viewPackages = new JButton("View Package");
        viewPackages.setBounds(0,300,300,50);
        viewPackages.setBackground(new Color(0,0,102));
        viewPackages.setForeground(Color.white);
        viewPackages.setFont(new Font("TIMES NEW ROMAN", Font.PLAIN,20 ));
        viewPackages.setMargin(new Insets(0,0,0,120));
        viewPackages.addActionListener(this);
        p2.add(viewPackages);

        viewHotels = new JButton("View Hotels");
        viewHotels.setBounds(0,350,300,50);
        viewHotels.setBackground(new Color(0,0,102));
        viewHotels.setForeground(Color.white);
        viewHotels.setFont(new Font("TIMES NEW ROMAN", Font.PLAIN,20 ));
        viewHotels.setMargin(new Insets(0,0,0,130));
        viewHotels.addActionListener(this);
        p2.add(viewHotels);

        BookHotels = new JButton("Book Hotels");
        BookHotels.setBounds(0,400,300,50);
        BookHotels.setBackground(new Color(0,0,102));
        BookHotels.setForeground(Color.white);
        BookHotels.setFont(new Font("TIMES NEW ROMAN", Font.PLAIN,20 ));
        BookHotels.setMargin(new Insets(0,0,0,130));
        BookHotels.addActionListener(this);
        p2.add(BookHotels);

        viewBookedHotels = new JButton("View Booked Hotels");
        viewBookedHotels.setBounds(0,450,300,50);
        viewBookedHotels.setBackground(new Color(0,0,102));
        viewBookedHotels.setForeground(Color.white);
        viewBookedHotels.setFont(new Font("TIMES NEW ROMAN", Font.PLAIN,20 ));
        viewBookedHotels.setMargin(new Insets(0,0,0,70));
        viewBookedHotels.addActionListener(this);
        p2.add(viewBookedHotels);

        Destinations = new JButton("Destinations");
        Destinations.setBounds(0,500,300,50);
        Destinations.setBackground(new Color(0,0,102));
        Destinations.setForeground(Color.white);
        Destinations.setFont(new Font("TIMES NEW ROMAN", Font.PLAIN,20 ));
        Destinations.setMargin(new Insets(0,0,0,125));
        Destinations.addActionListener(this);
        p2.add(Destinations);

        payments = new JButton("Payments");
        payments.setBounds(0,550,300,50);
        payments.setBackground(new Color(0,0,102));
        payments.setForeground(Color.white);
        payments.setFont(new Font("TIMES NEW ROMAN", Font.PLAIN,20 ));
        payments.setMargin(new Insets(0,0,0,155));
        payments.addActionListener(this);
        p2.add(payments);

        Calculator = new JButton("Calculator");
        Calculator.setBounds(0,600,300,50);
        Calculator.setBackground(new Color(0,0,102));
        Calculator.setForeground(Color.white);
        Calculator.setFont(new Font("TIMES NEW ROMAN", Font.PLAIN,20 ));
        Calculator.setMargin(new Insets(0,0,0,145));
        Calculator.addActionListener(this);
        p2.add(Calculator);

        Notepad = new JButton("Notepad");
        Notepad.setBounds(0,650,300,50);
        Notepad.setBackground(new Color(0,0,102));
        Notepad.setForeground(Color.white);
        Notepad.setFont(new Font("TIMES NEW ROMAN", Font.PLAIN,20 ));
        Notepad.setMargin(new Insets(0,0,0,155));
        Notepad.addActionListener(this);
        p2.add(Notepad);

        about = new JButton("About");
        about.setBounds(0,700,300,50);
        about.setBackground(new Color(0,0,102));
        about.setForeground(Color.white);
        about.setFont(new Font("TIMES NEW ROMAN", Font.PLAIN,20 ));
        about.setMargin(new Insets(0,0,0,175));
        about.addActionListener(this);
        p2.add(about);


        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1650, 1000, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image = new JLabel(i6);
        image.setBounds(0,0,2200,1080);
        add(image);
        
        JLabel text =  new JLabel("Travel and Tourism Managment System");
        text.setBounds(400, 70, 1200, 70);
        text.setForeground(Color.white);
        text.setFont(new Font("TIMES NEW ROMAN", Font.PLAIN, 55));
        image.add(text);

        
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == addPersonalDetails){
            new AddCustomer(username);
        }else if(ae.getSource() == viewPersonalDetails){
            new ViewCustomer(username);
        }else if(ae.getSource() == updatePersonalDetails){
            new UpdateCustomer(username);
        }else if(ae.getSource() == checkPackages){
            new CheckPackage();
        }else if(ae.getSource() == bookPackages){
            new BookPackage(username);
        }else if(ae.getSource() == viewPackages){
            new ViewPackage(username);
        }else if(ae.getSource() == viewHotels){
            new CheckHotels();
        }else if(ae.getSource() == Destinations){
            new Destination();
        }else if(ae.getSource() == BookHotels){
            new BookHotel(username);
        }else if(ae.getSource() == viewBookedHotels){
            new ViewBookedHotel(username);
        }else if(ae.getSource() == payments ){
            new Payments();
        }else if(ae.getSource() == Calculator){
            try{
                Runtime.getRuntime().exec("calc.exe");
            }catch(Exception e){
                e.printStackTrace();
            }
        }else if(ae.getSource() == Notepad){
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }catch(Exception e){
                e.printStackTrace();
            }
        }else if(ae.getSource() == about){
            new About();
        }
    }
}
