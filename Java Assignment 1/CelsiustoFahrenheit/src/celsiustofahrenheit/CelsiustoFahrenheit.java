/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celsiustofahrenheit;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class CelsiustoFahrenheit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter temperature in Celsius : ");
        double celsius = scanner.nextDouble();
        
        double fahrenheit = celsius * (9f / 5) + 32;
        System.out.println( celsius+ " degree Celsius is equal to " + fahrenheit +" degree Fahrenheit.");
    }
    
}
