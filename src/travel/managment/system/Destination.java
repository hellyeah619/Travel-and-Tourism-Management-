package travel.managment.system;

import java.awt.*;
import javax.swing.*;

public class Destination extends JFrame implements Runnable{
	Thread t1;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
	JLabel [] label = {l1,l2,l3,l4,l5,l6,l7,l8,l9,l10};
	public static void main(String[] args) {
		new Destination();
	}

	Destination(){
		setBounds(500,200,800,600);
		setLayout(null);
		// caption = new JLabel();
		// caption.setBounds(50,500,1000,70);
		// caption.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 20));
		// caption.setForeground(Color.white);
		// add(caption);

		ImageIcon i1 = null,i2 = null,i3 = null,i4 = null,i5 = null,i6 = null,i7 = null,i8 = null,i9 = null,i10 = null;
		ImageIcon [] image = {i1,i2,i3,i4,i5,i6,i7,i8,i9,i10};

		Image j1 = null,j2 = null,j3 = null,j4 = null,j5 = null,j6 = null,j7 = null,j8 = null,j9 = null,j10 = null;
		Image [] jimage = {j1,j2,j3,j4,j5,j6,j7,j8,j9,j10};

		ImageIcon k1 = null,k2 = null,k3 = null,k4 = null,k5 = null,k6 = null,k7 = null,k8 = null,k9 = null,k10 = null;
		ImageIcon [] kimage = {k1,k2,k3,k4,k5,k6,k7,k8,k9,k10};


		for (int i = 0; i < 8; i++) {
			image[i] = new ImageIcon(ClassLoader.getSystemResource("icons/dest"+(i+1)+".jpg"));
			jimage[i] = image[i].getImage().getScaledInstance(800,600,Image.SCALE_DEFAULT);
			kimage[i] = new ImageIcon(jimage[i]);
			label[i] = new JLabel(kimage[i]);
			label[i].setBounds(0,0,800,600);
			add(label[i]);
		}
		
		t1 = new Thread(this);
		t1.start();

		setVisible(true);
	}

	@Override
	public void run() {
		String [] text = {"JW MARRIOT HOTEL","MADARIN ORIENTAL HOTEL", "RADDISON BLUE HOTEL", "FOUR SEASONS HOTEL", "CLASSIO HOTEL", "SSG HOTEL","THE BAY CLUB HOTEL", "Brezzer Hotel","The taj HOtel","Burj Khalifa"};
		try{
			for (int i = 0; i < 8; i++) {
				label[i].setVisible(true);
				Thread.sleep(2500);
				label[i].setVisible(false);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
