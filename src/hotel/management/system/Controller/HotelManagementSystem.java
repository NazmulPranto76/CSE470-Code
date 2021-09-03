/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.management.system.Controller;

import hotel.management.system.View.Login;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class HotelManagementSystem extends JFrame implements ActionListener{

        JLabel l1;
        JButton b1;
        
        public HotelManagementSystem() {
		
                setSize(1366,430);          // setContentPane(300,300,1366,390);   frame size
                setLayout(null);
                setLocation(300,300);

		l1 = new JLabel("");
                b1 = new JButton("Next");
                b1.setFocusPainted(false);
                b1.setFont(new Font("Arial", Font.PLAIN, 30));
                b1.setBorder(BorderFactory.createBevelBorder(0));
                b1.setBackground(Color.white);
                b1.setForeground(Color.black);
		b1.setOpaque(false);
                b1.setContentAreaFilled(true);
                b1.setBorderPainted(true);		
                
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/first.png"));
                Image i3 = i1.getImage().getScaledInstance(1366, 720,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                l1 = new JLabel(i2);
                
                ImageIcon bu  = new ImageIcon(ClassLoader.getSystemResource("icons/bracu_logo.png"));
                Image b2u = bu.getImage().getScaledInstance(128,128,Image.SCALE_DEFAULT);
                ImageIcon b3u = new ImageIcon(b2u); 
                JLabel NewLabel = new JLabel(b3u);
                NewLabel.setBounds(0, 0, 200, 200); 
                add(NewLabel);
                
                JLabel lid=new JLabel("HOTEL MANAGEMENT SYSTEM");
                lid.setBounds(30,300,1500,100);
                lid.setFont(new Font("serif",Font.PLAIN,50));
                lid.setForeground(Color.black);
                l1.add(lid);
                
                b1.setBounds(1170,325,150,50);
		l1.setBounds(0, 0, 1366, 390);
                
                l1.add(b1);
		add(l1);
 
                b1.addActionListener(this);
                setVisible(true);
                
                while(true){
                        lid.setVisible(false); // lid =  j label
                    try{
                        Thread.sleep(500); //1000 = 1 second
                    }catch(Exception e){} 
                        lid.setVisible(true);
                    try{
                        Thread.sleep(500);
                    }catch(Exception e){}
                }
	}
        
        public void actionPerformed(ActionEvent ae){
                new Login().setVisible(true);
                this.setVisible(false);
                
        }
        
        public static void main(String[] args) {
                HotelManagementSystem window = new HotelManagementSystem();
                window.setVisible(true);			
	}
}
