/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignnments.chapter12assignment;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author HP
 */
public class Ex12_9 {
      static String num1="";

    public static void main(String[] args) {
        
        JFrame frame=new JFrame("Calculator");
        JTextField tf=new JTextField(20);
       JPanel panel=new JPanel();
//        JPanel panel2=new JPanel();
//        JPanel panel3=new JPanel();
          JButton btn1=new JButton("7"); 
          btn1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                num1+="7";
                tf.setText(num1);  
           }
              
          });
          
          JButton btn2=new JButton("8");  
          JButton btn3=new JButton("9");
          JButton btn14=new JButton("/");  

          JButton btn4=new JButton("4");  
          JButton btn5=new JButton("5");  
          JButton btn6=new JButton("6");
          JButton btn15=new JButton("*");  

          JButton btn7=new JButton("1");  
          JButton btn8=new JButton("2");  
          JButton btn9=new JButton("3");  
          JButton btn10=new JButton("-");
          JButton btn16=new JButton("0");
          
          
          
          JButton btn11=new JButton(".");  
          JButton btn12=new JButton("=");  
          JButton btn13=new JButton("+");  
        
        panel.setLayout(new GridLayout(4,4));
        panel.setBackground(Color.red);
        
        
        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        panel.add(btn14);
        panel.add(btn4);
        panel.add(btn5);
        panel.add(btn6);
        panel.add(btn15);
        panel.add(btn7);
        panel.add(btn8);
        panel.add(btn9);
        panel.add(btn10);
        panel.add(btn16);
        panel.add(btn11);
        panel.add(btn12);
        panel.add(btn13);
        panel.setPreferredSize(new Dimension(500,400));
        tf.setPreferredSize(new Dimension(20,65));
        tf.setBackground(Color.BLACK);
        tf.setForeground(Color.white);
        tf.setFont(new Font("Arial",Font.PLAIN,24));

//        frame.add(tf,BorderLayout.NORTH);
        frame.setLayout(new BorderLayout());
        frame.add(tf,BorderLayout.NORTH);
        frame.add(panel,BorderLayout.SOUTH);



        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
        
    }
    
}
