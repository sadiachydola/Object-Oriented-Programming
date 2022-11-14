/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perimeterofrectangle;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class PerimeterofRectangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
         System.out.println("Enter the length of the Rectangle : ");
         
	 double l= scanner.nextDouble();
	 
	 System.out.println("Enter the breadth of the Rectangle : ");
         
	 double b= scanner.nextDouble();
          
         double  perimeter=2*(l+b);
      
	 System.out.println("Perimeter of Rectangle is: " + perimeter); 
    }
    
}