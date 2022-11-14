/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lengthincentimeter7;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class LengthinCentimeter7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         //Constants for meter and kilometer in 1 centimeter.

        final double METER      = 0.01;
        final double KILOMETER  = 0.00001;
 
        Scanner scanner = new Scanner(System.in);
        
        // Read centimeter input from user
        System.out.print("Enter length in centimeters : ");
        double cm = scanner.nextDouble();
        

        // Convert cm into m and km 
        double m    = cm * METER;
        double km   = cm * KILOMETER;
        
        
        // Print result on console
        System.out.println(cm + " cm is equal to " + m    + " meters.");
        System.out.println(cm + " cm is equal to " + km    +" kilometers.");
    }
    }