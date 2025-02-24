/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignnments.chapter8assignment;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class TestRectangle {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        RectangleClass rC=new RectangleClass();
        System.out.print("Enter width: ");
        String width=scan.nextLine();
         rC.setWidth(width);

        
        
        System.out.print("Enter Length: ");
        String length=scan.nextLine();
        rC.setLength(length);

        rC.calculateArea();
        rC.calculatePerimeter();
        
    }
    
}
