/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertdaysintoyears.weeksanddays;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class ConvertdaysintoyearsWeeksanddays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int days, years, weeks;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter Days: ");
        days = scanner.nextInt();
        
        years = (days / 365);  //Ignoring leap year
        weeks = (days % 365)/7;
        days = days - ((years * 365) + (weeks * 7));  //days  = (days % 365) % 7;
        
    System.out.println("YEARS: "+years);
    System.out.println("WEEKS: "+weeks);
    System.out.println("DAYS:  "+days);
    }
    
}
