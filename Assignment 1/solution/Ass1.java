// This is my way of doing it and there is many ways.

/*
Name: 
ID : 
Email: 
course number: CPCS 202
section number: 
assignment title: 1st assignment
date: 28/9/2018
 */

import java.util.Scanner;

public class Ass1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int AcNumEmpHR = 30;
        final int CostHR = 150;
        // ^ Number of Employees in Human Resource department & the cost of working overtime in it.
        final int AcNumEmpPA = 50;
        final int CostPA = 120;
        // ^ Number of Employees in Public Administration department & the cost of working overtime in it.
        final int AcNumEmpFD = 10;
        final int CostFD = 170;
        // ^ Number of Employees in Finance department & the cost of working overtime in it.
        System.out.println("\nTHIS PROGRAM CALCULATES THE OVERTIME PAYMENT OF A COMPANY WITH THREE DIFFERENT DEPARTMENTS.");
        System.out.println("\nPlease enter the information for HR department:");
        System.out.print("\tNumber of employees who have worked overtime       :");
        int NumEmpHR = input.nextInt();
        System.out.print("\tTotal number of worked overtime hours per employee :");
        int OtHrsHR = input.nextInt();
        
        System.out.println("\nPlease enter the information for PA department:");
        System.out.print("\tNumber of employees who have worked overtime       :");
        int NumEmpPA = input.nextInt();
        System.out.print("\tTotal number of worked overtime hours per employee :");
        int OtHrsPA = input.nextInt();
        
        System.out.println("\nPlease enter the information for FD department:");
        System.out.print("\tNumber of employees who have worked overtime       :");
        int NumEmpFD = input.nextInt();
        System.out.print("\tTotal number of worked overtime hours per employee :");
        int OtHrsFD = input.nextInt();
    
        double TPHR = (OtHrsHR*NumEmpHR*CostHR);
        double TPPA = (OtHrsPA*NumEmpPA*CostPA);
        double TPFD = (OtHrsFD*NumEmpFD*CostFD);
        // ^ Payments for each Dept.  
        double HRPER = (100.00*NumEmpHR/AcNumEmpHR);
        double PAPER = (100.00*NumEmpPA/AcNumEmpPA);
        double FDPER = (100.00*NumEmpFD/AcNumEmpFD);
        // ^ Percentage for each Dept.
        
        System.out.println("\nDetailed Report of the Overtime Payment System for all three Department");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("Dept. #of Emp. Rate/hour #of working Emp. Total overtime hours Total Payment Percentage");
        System.out.println("****************************************************************************************");        
        System.out.printf("HR\t%d\t%d\t\t%d\t\t%d\t\t%.2f\t%.2f%%\n", AcNumEmpHR,CostHR,NumEmpHR,OtHrsHR,TPHR,HRPER);
        System.out.printf("PA\t%d\t%d\t\t%d\t\t%d\t\t%.2f\t%.2f%%\n", AcNumEmpPA,CostPA,NumEmpPA,OtHrsPA,TPPA,PAPER);
        System.out.printf("FD\t%d\t%d\t\t%d\t\t%d\t\t%.2f\t\t%.2f%%\n", AcNumEmpFD,CostFD,NumEmpFD,OtHrsFD,TPFD,FDPER);
        System.out.println("****************************************************************************************");
        double TotalCost = (TPHR+TPPA+TPFD);
        System.out.printf("Total Overtime Payment of the company = %.2f Riyals.\n" , TotalCost);    
    }    
}
