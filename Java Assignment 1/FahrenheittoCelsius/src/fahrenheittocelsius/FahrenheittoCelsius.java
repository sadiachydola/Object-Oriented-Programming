/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fahrenheittocelsius;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class FahrenheittoCelsius {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter temperature in Farenheit : ");
        double fahrenheit = scanner.nextDouble();
        
        double celsius = (fahrenheit-32) * (9f / 5);
        System.out.println( fahrenheit+ " degree Fahrenheit is equal to " + celsius +" degree Celsius.");
    }
    
}
