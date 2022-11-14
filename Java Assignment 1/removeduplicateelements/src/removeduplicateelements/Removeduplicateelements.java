/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package removeduplicateelements;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Removeduplicateelements {

    public static void main(String[] args) {
               int[] e = new int[20];  //array elements=e

		int j,k;//initial element = j,next element = k;
		int i;
		
		      Scanner scan = new Scanner(System.in);
		

		System.out.print("Enter array size: ");
		int size = scan.nextInt();//array size
		
		System.out.println("Read Array Elements From User :");

		for(i=0;i<size;++i)
		{
			System.out.print("Enter array elements of index " +i +": ");
			e[i] = scan.nextInt();
		}

		System.out.println("Before removing duplicate element array are :");

		for(i=0;i<size;++i)
		{
			System.out.println(e[i]);
		}

		System.out.println("After removing duplicate element array are :");
		for(j=0;j<size;++j)
		{
			for(k=j+1;k<size;){

				if(e[j] == e[k]){
					for(int temp = k; temp<size; ++temp){
						e[temp] = e[temp+1];
					}
					size = size-1;		
				}		
				else
					k++;		
			}
		}
		
		for(i=0;i<size;++i)
			System.out.println(e[i]);
	}
}
