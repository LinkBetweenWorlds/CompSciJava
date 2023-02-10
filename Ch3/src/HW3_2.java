/*
CIST 004A1 Spring 2023
HW Week 2 Problem 8
Description: This program calculates the shipping cost depending on the weight.
Input: Weight
Output: Shipping cost
Student: William Lawson
Known buds: None
Date: 2/10/2023
 */

import java.util.Scanner;

public class HW3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the weight of your package:");
        double weight = input.nextDouble();

        if (weight > 0) {
            if (weight <= 1) {
                System.out.println("Shipping Cost: $" + 3.5);
            } else if (weight <= 3) {
                System.out.println("Shipping Cost: $" + 5.5);
            } else if (weight <= 10) {
                System.out.println("Shipping Cost: $" + 8.5);
            } else if (weight <= 20) {
                System.out.println("Shipping Cost: $" + 10.5);
            } else {
                System.out.println("Package is too heavy too ship.");
            }
        } else {
            System.out.println("Please enter a weight greater than 0.");
        }
    }
}

/*
Console Input:
15

Console Output:
Shipping Cost: $10.5
 */