/*
CIST 004A1 Spring 2023
HW Week 3 Problem 10
Description: This program changes a decimal into a hex.
Input: Decimal (0 - 15)
Output: Hex value
Student: William Lawson
Known buds: None
Date: 2/10/2023
 */

import java.util.Scanner;

public class HW4_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a decimal value between 0 and 15:");
        int decimal = input.nextInt();
        if (decimal < 0 || decimal > 15) {
            System.out.println(decimal + " is an invalid input.");
        } else {
            String hex = switch (decimal) {
                case 10 -> "A";
                case 11 -> "B";
                case 12 -> "C";
                case 13 -> "D";
                case 14 -> "E";
                case 15 -> "F";
                default -> Integer.toString(decimal);
            };
            System.out.println("The hex value: " + hex);
        }
    }
}

/*
Console Input:
11

Console Output:
The hex value: B
*/