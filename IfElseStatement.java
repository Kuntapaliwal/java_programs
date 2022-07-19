package java_programs;

import java.util.*;

public class IfElseStatement {
    public static void main(String[] args) {
        fnCheckIsSquare();
        fnPrintGreatestValue();
        fnTotalCost();
        fnPrintBonus();
        fnAbsoluteValue();
        fnCheckAlphaValueCases();
        fnPrintAllowedToSitInExam();
        fnIsMedicalCause();
    }

    // 1. Take values of the length and breadth of a rectangle from the user and
    // check if it is square or not.

    static void fnCheckIsSquare() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length : ");
        double l = sc.nextDouble();
        System.out.println("\nenter breadth: ");
        double b = sc.nextDouble();

        if (l == b)
            System.out.println("It is a square");
        else
            System.out.println("It is not a square");
        // sc.close();

    }

    // 2. Take two int values from the user and print the greatest among them.
    static void fnPrintGreatestValue() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first value: ");
        double a = sc.nextDouble();
        System.out.println("\nenter second value: ");
        double b = sc.nextDouble();

        if (a > b)
            System.out.println(a + " is greater than " + b);
        else if (a < b)
            System.out.println(b + " is greater than " + a);
        else
            System.out.println("Both are equal value");
        // sc.close();

    }

    // 3. A shop will give a discount of 10% if the cost of the purchased quantity
    // is more than 1000.
    // Ask the user for the quantity.
    // Suppose, one unit will cost 100.
    // Judge and print the total cost for the user.
    static void fnTotalCost() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the toatl quntity: ");
        int a = sc.nextInt();
        int totalCost = a * 100;
        int discount = 0;
        if (totalCost > 1000) {
            discount = (totalCost * 10) / 100;
            System.out.println("total payable amount:" + (totalCost - discount));
        } else
            System.out.println("total payable amount:" + totalCost);
        // sc.close();

    }

    // 4. A company decided to give a bonus of 5% to the employee if his/her year of
    // service is more than 5 years.
    // Ask the user for their salary and year of service and print the net bonus
    // amount.
    static void fnPrintBonus() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter salary for the year: ");
        double salary = sc.nextDouble();
        System.out.println("\nenter year of service: ");
        double year = sc.nextDouble();
        double bonous = 0;

        if (year > 5) {
            bonous = (salary * 5) / 100;
            System.out.println("Bonous: " + bonous);
        } else
            System.out.println("sorry! Your working service is lesser than 5 year");

        // sc.close();

    }

    // 5. Write a program to print the absolute value of a number entered by the
    // user.
    // E.g.-
    // INPUT: 1 OUTPUT: 1
    // INPUT: -1 OUTPUT: 1
    static void fnAbsoluteValue() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value for which you want absolute value: ");
        double value = sc.nextDouble();
        if (value >= 0)
            System.out.println("Absolute Value of number " + value + " is " + value);
        else
            System.out.println("Absolute Value of number " + value + " is " + (-value));
        // sc.close();

    }

    // 6. Write a program to check whether an entered character is lowercase ( a to
    // z ) or uppercase ( A to Z ). (Hint - You can use the ASCII value of the
    // character)
    static void fnCheckAlphaValueCases() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any alpha charcter: ");
        char alphaValue = sc.next().charAt(0);
        if (alphaValue >= 'a' && alphaValue <= 'z') {
            System.out.println(alphaValue + " Character is lowercase");
        }
        if (alphaValue >= 'A' && alphaValue <= 'Z') {
            System.out.println(alphaValue + " Character is uppercase");
        }

        // sc.close();

    }

    // 7. A student will not be allowed to sit in an exam if his/her attendance is
    // less than 75%.
    // Take the following input from the user

    // Number of classes held
    // Number of classes attended.
    // And print,
    // Percentage of classes attended
    // Is the student allowed to sit in the exam or not.

    static void fnPrintAllowedToSitInExam() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of classes held: ");
        int noOfClassesHeld = sc.nextInt();
        System.out.println("\nenter number of classes attanded: ");
        double noOfClassesAttanded = sc.nextDouble();

        double PercentageOfClassAttanded = (noOfClassesAttanded * 100) / noOfClassesHeld;
        if (PercentageOfClassAttanded >= 75) {
            System.out.println("Student is allowed to sit in the exam as attandance is greater than or equal to 75%");
        } else
            System.out.println("Student is not allowed to sit in the exam as attandance is lesser than 75%");

        // sc.close();

    }

    // Modify the above question to allow the student to sit if he/she has a medical
    // cause. Ask the user if he/she has a medical cause or not ( 'Y' or 'N' ) and
    // print accordingly.

    static void fnIsMedicalCause() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of classes held: ");
        int noOfClassesHeld = sc.nextInt();
        System.out.println("\nenter number of classes attanded: ");
        double noOfClassesAttanded = sc.nextDouble();
        System.out.println("enter 'Y' if Medical cause otherwise enter 'N' if no Medical cause: ");
        char isMedicalCause = sc.next().charAt(0);
        double PercentageOfClassAttanded = (noOfClassesAttanded * 100) / noOfClassesHeld;
        if (PercentageOfClassAttanded >= 75 || isMedicalCause == 'Y' || isMedicalCause == 'y') {
            System.out.println("Student is allowed to sit in the exam");
        } else
            System.out.println("Student is not allowed to sit in the exam");

        // sc.close();

    }

}
