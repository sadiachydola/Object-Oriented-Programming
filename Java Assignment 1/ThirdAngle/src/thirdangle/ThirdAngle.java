/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thirdangle;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class ThirdAngle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float a,b,c;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("First Angle :");//50
        a = scanner.nextFloat();
        
        System.out.print("Second Angle :");//20
        b = scanner.nextFloat();
        
        c =180-(a+b);
        System.out.println("Third Angle = " +c);//110
    }
    
}
