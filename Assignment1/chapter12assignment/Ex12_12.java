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

public class Ex12_12 {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Temperature Coverter");
        JTextField tf=new JTextField(2);
        tf.setBackground(new Color(12,2,200));
        tf.setForeground(Color.BLACK);
        tf.setSize(100,100);
        JPanel panel=new JPanel();
        panel.setSize(100,100);
        panel.setBackground(Color.red);
        panel.add(tf);
        
        
        
        
        
        
        frame.add(panel,BorderLayout.NORTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
        
    }
    
}
