/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignnments.chapter8assignment;

/**
 *
 * @author HP
 */
public class TestDate {
    public static void main(String[] args) {
        Date obj=new Date(1,1,2023);
        for(int i=1;i<=365;i++){
            obj.nextDay();
        }
        
    }
}
