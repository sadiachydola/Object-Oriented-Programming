/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allarithmeticoperations3;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class AllArithmeticOperations3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        
        int a,b;
        
        Scanner scanner= new Scanner(System.in);
        
        System.out.println("Enter a : ");
        a= scanner.nextInt();
        
        System.out.println("Enter b : ");
        b= scanner.nextInt();
        
        int addition = a+b;
        System.out.println("Addition= "+addition);
        
        int subtraction = a-b;
        System.out.println("Substraction= "+subtraction);
        
        int multiplication = a*b;
        System.out.println("Multiplication= "+multiplication);
        
        int division = a/b;
        System.out.println("Division= "+division);
        
        int modulo =a%b;
        System.out.println("Modulo= "+modulo);
        
        
    }
    
}
