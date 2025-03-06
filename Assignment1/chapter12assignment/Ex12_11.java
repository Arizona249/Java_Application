/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignnments.chapter12assignment;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Ex12_11 {
    public static void main(String[] args) {
        String[] options={"High","Medium","Low"};
        JFrame frame =new JFrame("ColorSelect");
        JPanel panel3=new JPanel();
        JPanel panel4=new JPanel();
        JTextField tf1=new JTextField(20);
        JTextField tf2=new JTextField(12);
        JTextField tf3=new JTextField(12);
    
        
        JRadioButton rb1=new JRadioButton("Selection");
        JRadioButton rb2=new JRadioButton("All");
        JRadioButton rb3=new JRadioButton("Applet");
        ButtonGroup bg=new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);
        panel3.setLayout(new BoxLayout(panel3,BoxLayout.Y_AXIS));
//        panel3.setBackground(Color.red);
        panel3.setBounds(250,50,85,100);
        panel3.add(rb1);
        panel3.add(rb2);
        panel3.add(rb3);
        
        panel4.setBounds(330,50,50,100);
//        panel4.setBackground(Color.BLACK);
        tf1.setPreferredSize(new Dimension(70,70));
        tf1.setBackground(Color.white);
        panel4.add(tf1);
        

//        frame.setLayout(new BorderLayout());
        frame.setLayout(null);
        JComboBox <String>cb=new JComboBox<>(options);
        cb.setBackground(Color.LIGHT_GRAY);
        JLabel label1=new JLabel("Print Quality: ");
        JCheckBox chb1=new JCheckBox("Image");
        JCheckBox chb2=new JCheckBox("Text");
        JCheckBox chb3=new JCheckBox("Code");
        JCheckBox chb4=new JCheckBox("Print to File");
        JButton btn1=new JButton("ok");
        btn1.setBounds(0,0,50,0);
        JButton btn2=new JButton("Cancel");
        JButton btn3=new JButton("Setup");
        JButton btn4=new JButton("Help");
        JPanel panel1=new JPanel();
        panel1.setLayout(new BoxLayout(panel1,BoxLayout.Y_AXIS));
//        panel1.setBackground(Color.red);
        panel1.setBounds(400,10,75,150);
        
        panel1.add(btn1);
        panel1.add(Box.createRigidArea(new Dimension(0,10)));

        panel1.add(btn2);
        panel1.add(Box.createRigidArea(new Dimension(0,10)));

        panel1.add(btn3);
        panel1.add(Box.createRigidArea(new Dimension(0,10)));
        panel1.add(btn4);
        panel1.add(Box.createRigidArea(new Dimension(0,10)));
    
        JPanel panel2=new JPanel();
        panel2.setLayout(new BorderLayout());
        panel2.add(label1,BorderLayout.WEST);
        panel2.add(cb,BorderLayout.EAST);
//        panel2.setBackground(Color.red);
        panel2.setBounds(40,120,250,30);

        
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.add(panel4);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 200);
//        frame.pack();
        frame.setVisible(true);
        
    }
    
}
