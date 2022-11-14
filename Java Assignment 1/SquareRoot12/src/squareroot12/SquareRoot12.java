/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squareroot12;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class SquareRoot12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.print("Enter an integer number: ");//12
	number = scanner.nextInt();

        //System.out.println("Cube of "+ num + " is: "+ Math.pow(num, 3));
	System.out.println("Square Root of "+ number + " is: "+ Math.sqrt(number));
    }
    
}
