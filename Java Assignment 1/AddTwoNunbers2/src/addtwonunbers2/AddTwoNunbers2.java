/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addtwonunbers2;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class AddTwoNunbers2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number1, number2, result;
                
        
        Scanner scanner= new Scanner(System.in);
        
        System.out.println("Enter number 1 : ");
        number1= scanner.nextInt();
        
        System.out.println("Enter number 2 : ");
        number2= scanner.nextInt();
        result= number1+number2;
        System.out.println("The result= "+result);
    }
    
}
