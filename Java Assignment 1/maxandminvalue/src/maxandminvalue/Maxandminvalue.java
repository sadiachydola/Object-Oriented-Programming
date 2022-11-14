/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxandminvalue;

/**
 *
 * @author HP
 */
public class Maxandminvalue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
		int a[] = new int[] { 23, 34, 13, 64, 72, 100, 10, 15, 4, 27 };

		int min = a[0];
		int max = a[0];

		for (int i = 1; i < a.length; i++)
		{
			if (a[i] > max) 
			{
				max = a[i];
			}
			if (a[i] < min) 
			{
				min = a[i];
			}
		}

		System.out.println("Maximum Number is : " + max);
		System.out.println("Minimum Number is : " + min);
	}
}
