/*
CIST 004A1 Spring 2023
HW Week 2 Problem 9
Description: This program generates a random card.
Input: None
Output: Card
Student: William Lawson
Known buds: None
Date: 2/10/2023
 */

public class HW3_3 {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 52);

        int suite = n / 13;
        int rank = n % 13;

        String house = switch (suite) {
            case 0 -> "Clubs";
            case 1 -> "Diamonds";
            case 2 -> "Hearts";
            case 3 -> "Spades";
            default -> "";
        };

        String num = switch (rank) {
            case 0 -> "Ace";
            case 10 -> "Jack";
            case 11 -> "Queen";
            case 12 -> "King";
            default -> Integer.toString(rank + 1);
        };

        System.out.println("The card you picked is " + num + " of " + house + ".");
    }
}

/*
Console Output:
The card you picked is 5 of Hearts.
 */