package travel.managment.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Paytm extends JFrame implements ActionListener{
    public static void main(String[] args) {
        new Paytm();
    }
    Paytm(){
        setBounds(500,200,800,600);
        JEditorPane pane = new JEditorPane();
        pane.setEditable(false);

        try{
            pane.setPage("https://paytm.com");
        }catch (Exception e){
            pane.setText("text/html");
            pane.setText("<html>Could Not Lode, Error  404 </html>");
        }

        JScrollPane sp =  new JScrollPane(pane);
        getContentPane().add(sp);

        JButton back = new JButton("Back");
        back.setBounds(610,20,80,40);
        back.addActionListener(this);
        pane.add(back);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent arg0) {
        setVisible(false);
        new Payments();
    }
}
