/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignnments.chapter8assignment;

/**
 *
 * @author HP
 */
public class RectangleClass {
//    P = 2(l + w)
//    A = l × w
    private double length;
    private double width;
    
    public RectangleClass(){
        length=1;
        width=1;
    }
    public void calculateArea(){
        double area=length*width;
        System.out.println("Area="+area);
        
    }
    public void calculatePerimeter(){
        double perimeter=2*(length+width);
        System.out.println("Perimeter="+perimeter);
    }
    public double getLength(){
        return length;
    }    
    public double getWidth(){
        return width;
    }
    public void setLength(String value){
        try {
            double length=Double.parseDouble(value);
            if(length>0.0&&length<20.00){
                this.length=length;
            }
            else{
                System.out.println("The length must be between 1.00 and 19.99");
            }
        } 
        catch (Exception e) {
            System.out.println("Please enter a decimal Value");
        }
    }
    public void setWidth(String value){
        try{
            double width=Double.parseDouble(value);
            if(width>0.0&&width<20.0){
                this.width=width;
            }
            else{
                System.out.println("The width must be between 1 and 19.99");
            }
        }
        catch(Exception e){
            System.out.println("Please enter a decimal number");
            
        }
        
    }

  }
