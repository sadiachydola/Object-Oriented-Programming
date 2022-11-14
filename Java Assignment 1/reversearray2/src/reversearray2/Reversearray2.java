/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversearray2;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Reversearray2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner scan = new Scanner (System.in);
        
        System.out.print("Enter the size of elements : ");
        int n=scan.nextInt();
        
        int a[]= new int[n];
        System.out.print("Enter the number of elements in to the array : ");
        
        for(int i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }
        
        System.out.print("Reverse elements: ");
         for(int i=a.length-1;i>=0;i--)
         {
             System.out.print(a[i]+" ");
         }
    }
    
}
