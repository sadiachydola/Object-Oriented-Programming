/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duplicatestringvalues;

/**
 *
 * @author HP
 */
public class Duplicatestringvalues {

    public static void main(String[] args) {
        String[] a = {"abc", "cde", "fgh", "abc", "ijk", "fgh"};
 
        for (int i = 0; i < a.length-1; i++)
        {
            for (int j = i+1; j < a.length; j++)
            {
                if ((a[i].equals(a[j])) && (i != j))
                {
                    System.out.println("Duplicate Element : "+a[j]);
                }
            }
        }

    }
    
}
