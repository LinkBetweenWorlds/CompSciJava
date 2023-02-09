/*
CIST 004A1 Spring 2023
HW Week 1 Problem 4
Description: This program converts Celsius into Fahrenheit.
Input: Celsius
Output: Fahrenheit.
Student: William Lawson
Known buds: None
Date: 2/4/2023
 */

import java.util.Scanner;

public class HW2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Celsius to Fahrenheit Converter!");
        System.out.println("Please enter a degree in celsius...");
        double celsius = input.nextDouble();

        double fahrenheit = (9.0 / 5.0) * celsius + 32;

        System.out.println(celsius + "\u00B0C is " + fahrenheit + "\u00B0F");

    }
}

/*
Console Input
20.4

Console Output
20.4°C is 68.72°F
 */