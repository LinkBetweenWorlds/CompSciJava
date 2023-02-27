/*
CIST 004A1 Spring 2023
HW Week 6 Problem 15
Description: This program generates a calendar from the inputted year.
Input: Year, Start Day
Output: Calendar
Student: William Lawson
Known buds: None
Date: 2/26/2023
 */

import java.util.Scanner;

public class HW5_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        System.out.print("Enter the first day of the year: ");
        int startDay = input.nextInt(); // that of January
        int numberOfDaysInMonth = 0;

        for (int month = 1; month <= 12; month++) {
            //System.out.print("          ");
            switch (month) {
                case 1 -> {
                    System.out.println("January " + year);
                    numberOfDaysInMonth = 31;
                }
                case 2 -> {
                    System.out.println("Feburary " + year);
                    if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
                        numberOfDaysInMonth = 29;
                    else
                        numberOfDaysInMonth = 28;
                }
                case 3 -> {
                    System.out.println("March " + year);
                    numberOfDaysInMonth = 31;
                }
                case 4 -> {
                    System.out.println("April " + year);
                    numberOfDaysInMonth = 30;
                }
                case 5 -> {
                    System.out.println("May " + year);
                    numberOfDaysInMonth = 31;
                }
                case 6 -> {
                    System.out.println("June " + year);
                    numberOfDaysInMonth = 30;
                }
                case 7 -> {
                    System.out.println("July " + year);
                    numberOfDaysInMonth = 31;
                }
                case 8 -> {
                    System.out.println("August " + year);
                    numberOfDaysInMonth = 31;
                }
                case 9 -> {
                    System.out.println("September " + year);
                    numberOfDaysInMonth = 30;
                }
                case 10 -> {
                    System.out.println("October " + year);
                    numberOfDaysInMonth = 31;
                }
                case 11 -> {
                    System.out.println("November " + year);
                    numberOfDaysInMonth = 30;
                }
                case 12 -> {
                    System.out.println("December " + year);
                    numberOfDaysInMonth = 31;
                }
            }

            System.out.println("-----------------------------");
            System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
            // Pad space before the first day of the month
            int i = 0;
            for (i = 0; i < startDay; i++)
                System.out.print("    ");
            for (i = 1; i <= numberOfDaysInMonth; i++) {
                System.out.printf("%4d", i);
                if ((startDay + i) % 7 == 0) {
                    System.out.print("\n");
                }
            }
            System.out.print("\n\n");
            startDay = (startDay + numberOfDaysInMonth) % 7;
        }
    }
}

/*
Console Input:
2023
0

Console Output:
January 2023
-----------------------------
 Sun Mon Tue Wed Thu Fri Sat
   1   2   3   4   5   6   7
   8   9  10  11  12  13  14
  15  16  17  18  19  20  21
  22  23  24  25  26  27  28
  29  30  31

Feburary 2023
-----------------------------
 Sun Mon Tue Wed Thu Fri Sat
               1   2   3   4
   5   6   7   8   9  10  11
  12  13  14  15  16  17  18
  19  20  21  22  23  24  25
  26  27  28

March 2023
-----------------------------
 Sun Mon Tue Wed Thu Fri Sat
               1   2   3   4
   5   6   7   8   9  10  11
  12  13  14  15  16  17  18
  19  20  21  22  23  24  25
  26  27  28  29  30  31

April 2023
-----------------------------
 Sun Mon Tue Wed Thu Fri Sat
                           1
   2   3   4   5   6   7   8
   9  10  11  12  13  14  15
  16  17  18  19  20  21  22
  23  24  25  26  27  28  29
  30

May 2023
-----------------------------
 Sun Mon Tue Wed Thu Fri Sat
       1   2   3   4   5   6
   7   8   9  10  11  12  13
  14  15  16  17  18  19  20
  21  22  23  24  25  26  27
  28  29  30  31

June 2023
-----------------------------
 Sun Mon Tue Wed Thu Fri Sat
                   1   2   3
   4   5   6   7   8   9  10
  11  12  13  14  15  16  17
  18  19  20  21  22  23  24
  25  26  27  28  29  30

July 2023
-----------------------------
 Sun Mon Tue Wed Thu Fri Sat
                           1
   2   3   4   5   6   7   8
   9  10  11  12  13  14  15
  16  17  18  19  20  21  22
  23  24  25  26  27  28  29
  30  31

August 2023
-----------------------------
 Sun Mon Tue Wed Thu Fri Sat
           1   2   3   4   5
   6   7   8   9  10  11  12
  13  14  15  16  17  18  19
  20  21  22  23  24  25  26
  27  28  29  30  31

September 2023
-----------------------------
 Sun Mon Tue Wed Thu Fri Sat
                       1   2
   3   4   5   6   7   8   9
  10  11  12  13  14  15  16
  17  18  19  20  21  22  23
  24  25  26  27  28  29  30


October 2023
-----------------------------
 Sun Mon Tue Wed Thu Fri Sat
   1   2   3   4   5   6   7
   8   9  10  11  12  13  14
  15  16  17  18  19  20  21
  22  23  24  25  26  27  28
  29  30  31

November 2023
-----------------------------
 Sun Mon Tue Wed Thu Fri Sat
               1   2   3   4
   5   6   7   8   9  10  11
  12  13  14  15  16  17  18
  19  20  21  22  23  24  25
  26  27  28  29  30

December 2023
-----------------------------
 Sun Mon Tue Wed Thu Fri Sat
                       1   2
   3   4   5   6   7   8   9
  10  11  12  13  14  15  16
  17  18  19  20  21  22  23
  24  25  26  27  28  29  30
  31
 */