/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondsmallestnumber;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Secondsmallestnumber {

    public static void main(String[] args) {
        // intialise here
        int n, min;
        
        // create object of scanner class
        Scanner scan = new Scanner(System.in);
        
        // enter total number of elements
        System.out.print("Enter  total number of elements : ");
        n = scan.nextInt();
        
        // creating array object.
        int a[] = new int[n];
        
        // enter the elements
        System.out.println("Enter  all the elements : ");
        for (int i = 0; i < n; i++) 
        {
            a[i] = scan.nextInt();
        }
        
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (a[i] > a[j]) 
                {
                    min = a[i];
                    a[i] = a[j];
                    a[j] = min;
                }
            }
        }
        System.out.println("The  Second smallest element in the array is :"+a[1]);
    }
}
