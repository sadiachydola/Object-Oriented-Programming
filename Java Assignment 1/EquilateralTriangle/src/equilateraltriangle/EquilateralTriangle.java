/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equilateraltriangle;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class EquilateralTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a,area;
        Scanner scanner = new Scanner(System.in);
        
          System.out.println("Enter the side of the Triangle : ");//5,6
          a= scanner.nextDouble();
          
          area=(Math.sqrt(3)/4)*(a*a);
          System.out.println("Area of Triangle is : " + area);
    }
    
}
