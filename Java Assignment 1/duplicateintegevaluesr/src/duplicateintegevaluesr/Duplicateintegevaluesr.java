/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duplicateintegevaluesr;

/**
 *
 * @author HP
 */
public class Duplicateintegevaluesr {

    public static void main(String[] args) {
        int[] a = {40, 32, 55, 32, 85, 70, 85, 55};
 
        for (int i = 0; i < a.length-1; i++)
        {
            for (int j = i+1; j < a.length; j++)
            {
                if ((a[i] == a[j]) && (i != j))
                {
                    System.out.println("Duplicate Element : "+a[j]);
                }
            }
        }
    }        
}
