/*
CIST 004A1 Spring 2023
HW Week 2 Problem 7
Description: This program takes 3 numbers and returns the quadratic equation.
Input: a, b, c
Output: Quadratic equation.
Student: William Lawson
Known buds: None
Date: 2/9/2023
 */

import java.util.Scanner;

public class HW3_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a, b, c:");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double pow = Math.pow(b, 2) - (4 * a * c);
        if (pow > 0) {
            double r1 = (-b + Math.pow(pow, 0.5)) / (2 * a);
            double r2 = (-b - Math.pow(pow, 0.5)) / (2 * a);
            System.out.println("The equation has two roots:");
            System.out.println(r1);
            System.out.println(r2);
        }
        else if (pow == 0){
            double r1 = (-b + Math.pow(pow, 0.5)) / (2 * a);
            System.out.println("The equation has one root:");
            System.out.println(r1);
        }
        else{
            System.out.println("The equation has no real roots.");
        }
    }
}

/*
Console input:
1 3 1

Console Output:
The equation has two roots:
-0.3819660112501051
-2.618033988749895
 */