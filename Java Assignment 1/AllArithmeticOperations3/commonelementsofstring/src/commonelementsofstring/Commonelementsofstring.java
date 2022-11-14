/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commonelementsofstring;

/**
 *
 * @author HP
 */
public class Commonelementsofstring {

    public static void main(String[] args) {
        String[] array1 = {"abc", "cde", "efg", "ijk"};
        String[] array2 = {"jki", "abc", "dfg", "efg", "ijk", "dfg"};

        for(int i = 0; i < array1.length; i++)
        {
            for(int j = 0; j < array2.length; j++)
            {
                if(array1[i].equals(array2[j]))
                {
                    System.out.println(array1[i]);
                }
            }
        }

    }
    }
    