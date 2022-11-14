/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fivesubject16;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class FiveSubject16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int M1, M2, M3, M4, M5;
        float Average, Percentage,Total;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter Mark of Subject 1 : ");//95
        M1 = scanner.nextInt();
        System.out.println("Enter Mark of Subject 2 : ");//85
        M2 = scanner.nextInt();
        System.out.println("Enter Mark of Subject 3 : ");//75
        M3 = scanner.nextInt();
        System.out.println("Enter Mark of Subject 4 : ");//85
        M4 = scanner.nextInt();
        System.out.println("Enter Mark of Subject 5 : ");//95
        M5 = scanner.nextInt();
        
        Total = M1 + M2 + M3 + M4 + M5;
        Average = Total / 5;
        Percentage = (Total * 100) / 500;
        
        System.out.println("Total of Five Subject is : " + Total);
        System.out.println("Average of Five Subject is : " + Average);
        System.out.println("Percentage is : " + Percentage + " %");
    }
}