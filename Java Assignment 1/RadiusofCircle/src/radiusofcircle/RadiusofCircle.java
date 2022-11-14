/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radiusofcircle;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class RadiusofCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        double radius, diameter, circumference, area;

        System.out.print("Radius: ");
        radius = scanner.nextDouble();

        diameter = 2 * radius;
        System.out.println("Diameter: " + diameter);

        circumference = 2 * Math.PI * radius;
        System.out.println("Circumference: " + circumference);

        area = Math.PI * radius * radius;
        System.out.println("Area: " + area);


    }
    
}
