
package com.sanele.salesicetask;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SalesIceTask {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.###"); // To allow a three decimal number
        
        int salesCount = 3;
        
        //Allowing user input
        System.out.print("Enter the employee name: ");
        String name = scan.next();
        
        System.out.print("Enter the employee surname: ");
        String surname = scan.next();
        
        System.out.print("Enter the sale 1 amount: ");
        double firstSale = scan.nextInt();
        
       System.out.print("Enter the sale 2 amount: ");
       double secondSale = scan.nextInt();
        
       System.out.print("Enter the sale 3 amount: ");
       double thirdSale = scan.nextInt();
        
       System.out.print("Enter the sale 4 amount: ");
       double lastSale = scan.nextInt();
        
       // adding total sales for the employee
       double totalSales = firstSale + secondSale + thirdSale + lastSale;
       
       //Calculating average
       double averageSales = totalSales / salesCount;
       
       //Printing the entire employee report
        System.out.println("\nEMPLOYEE SALES REPORT");
        System.out.println("----------------------------");
        System.out.println("\nEMPLOYEE NAME: " + name + " " + surname);
        System.out.println("TOTAL SOLD: R" + totalSales);
        
        System.out.println("----------------------------");
        System.out.println("\nSALES COUNT: " + salesCount);
        System.out.println("AVERAGE SALES: R" + df.format(averageSales));
        
        
        
    }
}
