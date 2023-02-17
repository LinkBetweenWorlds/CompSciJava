/*
CIST 004A1 Spring 2023
HW Week 3 Problem 12
Description: This program calculates the pay and tax of employees.
Input: Name, hours, pay rate, fed tax, state tax
Output: Gross pay, deductions, net pay.
Student: William Lawson
Known buds: None
Date: 2/17/2023
 */
import java.util.Scanner;

public class HW4_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter employee's name:");
        String name = input.nextLine();
        System.out.println("Ender number of hours worked:");
        double hours = input.nextDouble();
        System.out.println("Enter hourly pay rate:");
        double payRate = input.nextDouble();
        System.out.println("Enter federal tax withholding rate:");
        double fedTax = input.nextDouble();
        System.out.println("Enter state tax withholding rate:");
        double stateTax = input.nextDouble();

        double grossPay = payRate * hours;
        double fedWith = grossPay * fedTax;
        double stateWith = grossPay * stateTax;
        double totalDeduct = stateWith + fedWith;
        double netPay = grossPay - totalDeduct;

        System.out.println("Employee's Name: " + name);
        System.out.printf("Hours Worked: %.2f hrs\n", hours);
        System.out.printf("Pay Rate: $%.2f\\hr\n", payRate);
        System.out.printf("Gross Pay: $%.2f\n", grossPay);
        System.out.println("Deductions:");
        System.out.printf(" Federal Withholding: $%.2f\n", fedWith);
        System.out.printf(" State Withholding: $%.2f\n", stateWith);
        System.out.printf(" Total Deductions: $%.2f\n", totalDeduct);
        System.out.printf("Net Pay: $%.2f\n", netPay);
    }
}

/*
Console Input:
William
38
20
0.2
0.09

Console Output:
Employee's Name: William
Hours Worked: 38.00 hrs
Pay Rate: $20.00\hr
Gross Pay: $760.00
Deductions:
 Federal Withholding: $152.00
 State Withholding: $68.40
 Total Deductions: $220.40
Net Pay: $539.60
 */
