/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commonelementsofinteger;

/**
 *
 * @author HP
 */
public class Commonelementsofinteger {

    public static void main(String[] args) {
        int[] a1 = {22,44,33,77,99};
        int[] a2 = {33,22,12,99,40,32,44};
        for(int i = 0; i < a1.length; i++)
        {
            for(int j = 0; j < a2.length; j++)
            {
                if(a1[i] == a2[j])
                {
                    System.out.println(a1[i]);
                }
            }
        }
    }
    
}
