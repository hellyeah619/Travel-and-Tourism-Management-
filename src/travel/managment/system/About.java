package travel.managment.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class About extends JFrame implements ActionListener{
    public static void main(String[] args) {
        new About();
    }
    About(){
        setBounds(600,200,500,550);
        setLayout(null);
        getContentPane().setBackground(Color.white);

        String s = "This Project is made by Chetan Namdeo.";

        JLabel l1 =  new JLabel("ABOUT");
        l1.setBounds(200,10,100,40);
        l1.setForeground(Color.red);
        l1.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 20));
        add(l1);

        TextArea area =  new TextArea(s,10,40,Scrollbar.VERTICAL);
        area.setEditable(false);
        area.setBounds(20,100,450,300);
        add(area);

        JButton back = new JButton("BACK");
        back.setBounds(200,420,100,25);
        back.addActionListener(this);
        add(back);

        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent arg0) {
        setVisible(false);
    }
}
