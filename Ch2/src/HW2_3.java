/*
CIST 004A1 Spring 2023
HW Week 1 Problem 4
Description: This program adds up the digits of an integer.
Input: Integer between 0 and 1000.
Output: Sum of digits.
Student: William Lawson
Known buds: None
Date: 2/4/2023
 */

import java.util.Scanner;

public class HW2_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Sum of Digits Calculator.");
        System.out.println("Enter a number between 0 and 1000:");
        int num = input.nextInt();
        int sum = 0;

        sum += num % 10;
        num = num / 10;

        sum += num % 10;
        num = num / 10;

        sum += num % 10;
        num = num / 10;

        sum += num % 10;


        System.out.println("Sum of digits: " + sum);
    }
}

/*
Console Input
805

Console Output
Sum of digits: 13
 */