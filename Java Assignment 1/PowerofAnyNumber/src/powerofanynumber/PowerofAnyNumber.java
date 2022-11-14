/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package powerofanynumber;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class PowerofAnyNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int base,exponent,result;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the Base Number :");
        base = scanner.nextInt();
        
        System.out.println("Enter the exponent number :");
        exponent = scanner.nextInt();

        result = (int)  Math.pow(base,exponent );
      System.out.println("Result of "+base+" ^ "+exponent+" = "+result);//System.out.println("Square of "+ num + " is: "+ Math.pow(num, 2));
    }
    
}
