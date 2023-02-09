/*
CIST 004A1 Spring 2023
HW Week 1 Problem 5
Description: This program calculates the distance between two points..
Input: x1, y1, x2, y2
Output: Distance.
Student: William Lawson
Known buds: None
Date: 2/4/2023
 */

import java.util.Scanner;

public class HW2_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Distance Calculator.");
        System.out.println("Please enter x1, y1:");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.println("Please enter x2, y2:");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double a = Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2);
        double distance = Math.pow(a, 0.5);

        System.out.println("Distance: " + distance);
    }
}

/*
Console Input
1.5 -3.4
4 5

Console Output
Distance: 8.764131445842194
 */