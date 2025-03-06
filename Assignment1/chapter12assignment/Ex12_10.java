/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignnments.chapter12assignment;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author HP
 */
public class Ex12_10 {
    public static void main(String[] args) {
        String[] colors={"RED","GREEN","YELLOW","BLUE","GRAY","WHITE","BLACK","CYAN"};
        JFrame frame =new JFrame("ColorSelect");
        frame.setLayout(new BorderLayout());
        JComboBox <String>cb=new JComboBox<>(colors);
        JCheckBox chb1=new JCheckBox("Background");
        JCheckBox chb2=new JCheckBox("Foreground");
        JButton btn1=new JButton("ok");
        JButton btn2=new JButton("Cancel");
        JPanel panel1=new JPanel();
        JPanel panel2=new JPanel();
        panel1.add(chb1);
        panel1.add(chb2);
        panel2.add(btn1);
        panel2.add(btn2);
        
        frame.add(panel1);
        frame.add(panel2,BorderLayout.SOUTH);
        frame.add(cb,BorderLayout.NORTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(220, 140);
//        frame.pack();
        Dimension size=frame.getSize();
        System.out.println(size);
        frame.setVisible(true);
        
    }
    
}
