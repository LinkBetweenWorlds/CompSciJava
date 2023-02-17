/*
CIST 004A1 Spring 2023
HW Week 3 Problem 11
Description: This program check if a SSN is valid.
Input: SSN
Output: True/False
Student: William Lawson
Known buds: None
Date: 2/17/2023
 */
import java.util.Scanner;

public class HW4_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a SSN(DDD-DD-DDDD)");
        String SSN = input.nextLine();
        SSN = SSN.trim();

        if (SSN.length() == 11) {
            if(SSN.charAt(3) == '-' && SSN.charAt(6) == '-')
            {
                System.out.println(SSN + " is a valid SSN.");
            }
            else{
                System.out.println(SSN + " is a invalid SSN.");
            }
        } else {
            System.out.println(SSN + " is a invalid SSN.");
        }
    }
}

/*
Console Input:
111-11-1111

Console Output:
111-11-1111 is a valid SSN.
 */