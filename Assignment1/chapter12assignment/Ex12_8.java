/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignnments.chapter12assignment;
import javax.swing.Box;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Ex12_8 {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Align");
        JPanel panel=new JPanel();
        JPanel panel2=new JPanel();
        JPanel panel3=new JPanel();
        
        
        
        JLabel label1=new JLabel("X:");
        JLabel label2=new JLabel("Y:");
        JTextField tf1=new JTextField(1);
        JTextField tf2=new JTextField(1);
        panel3.setLayout(new GridLayout(2,1,10,10));
        panel3.setBounds(200,40,50,50);
        panel3.setBackground(Color.LIGHT_GRAY);
        panel3.add(label1);
        panel3.add(tf1);
        panel3.add(label2);
        panel3.add(tf2);
       
        
        JCheckBox box1=new JCheckBox("snap to Grid");
        JCheckBox box2=new JCheckBox("Show Grid");
        box1.setFocusable(false);
        box2.setFocusable(false);
        box1.setOpaque(false);
        box2.setOpaque(false);
        
        
        JButton btn1=new JButton("ok");
//        btn1.setBackground(Color.LIGHT_GRAY);
//        btn1.setBorder(BorderFactory.createLineBorder(Color.BLACK,5));
        JButton btn2=new JButton("cancel");
        JButton btn3=new JButton("Help");
        btn1.setFocusable(false);
        btn2.setFocusable(false);
        btn3.setFocusable(false);
        btn1.setOpaque(false);
        btn2.setOpaque(false);
        btn3.setOpaque(false);
        panel2.setLayout(new GridLayout(3,1,10,10));
        panel2.setBounds(275,40,80,100);
        panel2.setBackground(Color.LIGHT_GRAY);
        panel2.add(btn1);
        panel2.add(btn2);
        panel2.add(btn3);
        
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);
        panel.setBounds(40,40,100,100);
        panel.setSize(100,250);
        panel.setBackground(null);
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        panel.add(box1);
        panel.add(Box.createRigidArea(new Dimension(0,10)));
        
        panel.add(box2);
        

        
        
        
        
        frame.add(panel);
        frame.add(panel2);
        frame.add(panel3);

        
       
        
        
        
        
        
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 250);
        frame.setVisible(true);
        
    }
    
}
