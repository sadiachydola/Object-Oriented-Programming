/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addtwomatrics10;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Addtwomatrics10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i,j;
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Enter the number of rows : ");
        int rows = scan.nextInt();
        
        System.out.print("Enter the number of columns : ");
        int columns = scan.nextInt();
        
        int[][] a = new int[rows][columns];
        int[][] b = new int[rows][columns];
        int[][] s = new int[rows][columns];//sum = a+b
        
        System.out.println("Enter the First matrix : ");
        for(i = 0; i < rows; i++)
        {
            for (j = 0; j < columns; j++)
            {
                a[i][j] = scan.nextInt();
            }
        }
           
            
        System.out.println("Enter the Second matrix : ");
        for(i = 0; i < rows; i++)
        {
            for (j = 0; j < columns; j++)
            {
                b[i][j] = scan.nextInt();
            }
        }
        
            for(i = 0; i < rows; i++)
        {
            for (j = 0; j < columns; j++)
            {
                s[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("Sum of the two matrices : ");
        for(i = 0; i < rows; i++) {
           for(j = 0; j < columns; j++) {
               System.out.print(s[i][j] + "\t");
           }
           System.out.println();
       }
    }
}
