/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package removeduplicateelement07;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Removeduplicateelement07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n[] = new int[5];
        
        for(int i = 0; i < 5; i++)
        {
          n[i] = Integer.parseInt(JOptionPane.showInputDialog("Input the Integer :"));
          
        }
        System.out.println("Input an Array : ");
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Number["+i+"] = "+n[i]);
        }
        System.out.println(" =========================== ");
        
         for(int i = 0; i < 5; i++)
         {
              for(int j = i + 1; j < 5; j++)
              {
                  if(n[i] == n[j])
                  {
                      n[j] = -1;
                  }
              }
         }
     System.out.println("After removing duplicates : ");
     for(int i = 0; i < 5; i++)
     {
         System.out.println("Number["+i+"] = "+n[i]);
     }
    }
    
}
