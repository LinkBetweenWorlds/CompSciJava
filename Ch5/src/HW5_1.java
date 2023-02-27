/*
CIST 004A1 Spring 2023
HW Week 6 Problem 13
Description: This programs find the factors of a given number.
Input: Number(Integer)
Output: Factors of number
Student: William Lawson
Known buds: None
Date: 2/26/2023
 */

import java.util.Scanner;

public class HW5_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter an integer.");
        int num = input.nextInt();
        int i = 1;

        System.out.println("Factors of " + num);
        while (i <= num){
            if (num % i == 0){
                System.out.print(i);
                System.out.print(", ");
            }
            i ++;
        }
    }
}

/*
Console Input:
120

Console Output:
Factors of 120
1, 2, 3, 4, 5, 6, 8, 10, 12, 15, 20, 24, 30, 40, 60, 120
 */