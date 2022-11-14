/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trianglearea14;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class TriangleArea14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double base,height,area;
        Scanner scanner = new Scanner(System.in);
                
        System.out.print("Enter the base of Triangle : ");//6
        base = scanner.nextDouble();
        
        System.out.print("Enter the height of Triangle : ");//12
        height = scanner.nextDouble();
        
        area =(base* height)/2;
        System.out.println("Area of Triangle = " +area);//36
    }
    
}
