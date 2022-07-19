package java_programs;

import java.util.*;

public class SwitchCase1 {
    public static void main(String[] args) {
        fnPrintDayOfWeek();
        fnPrintGrades();
        fnPrintUpperLower();
        fnPrintOddEven();
        fnPrintRootsOfQuadratic();
    }

    // Write a Java program to print the day of the week's name using a switch case.
    public static void fnPrintDayOfWeek() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number for the day of the week:");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Number is not in range of 1 to 7");
                break;
        }

    }

    // Using the switch statement, write a program to input marks of five subjects
    // Physics, Chemistry, Biology, Mathematics, and Computer. Calculate percentage
    // and grade according to the following:
    // Percentage >= 90% : Grade A
    // Percentage >= 80% : Grade B
    // Percentage >= 70% : Grade C
    // Percentage >= 60% : Grade D
    // Percentage >= 40% : Grade E
    // Percentage < 40% : Grade F

    public static void fnPrintGrades() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter marks of Physics from 100:");
        int pNo = sc.nextInt();
        System.out.println("enter marks of Chemistry from 100::");
        int cNo = sc.nextInt();
        System.out.println("enter marks of Biology from 100::");
        int bNo = sc.nextInt();
        System.out.println("enter marks of Maths from 100::");
        int mNo = sc.nextInt();
        System.out.println("enter marks of computer from 100::");
        int coNo = sc.nextInt();
        int percentage = ((pNo + cNo + bNo + coNo + mNo) * 100) / 500;

        switch (percentage / 10) {
            case 9, 10:
                System.out.println("Grade: A");
                break;
            case 8:
                System.out.println("Grade: B");
                break;
            case 7:
                System.out.println("Grade: C");
                break;
            case 6:
                System.out.println("Grade: D");
                break;
            case 4, 5:
                System.out.println("Grade: E");
                break;
            default:
                System.out.println("Grade: F");
                break;
        }

    }

    // WAP to check whether a character is an uppercase or lowercase alphabet. Using
    // the switch statement.
    public static void fnPrintUpperLower() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter alpha Character:");
        char c = sc.next().charAt(0);
        int val = c - 65;
        switch (val / 10) {
            case 0, 1, 2:
                System.out.println("Uppercase Character");
                break;
            case 3, 4, 5:
                System.out.println("lowercase Character");
                break;
            default:
                System.out.println("Not a alpha character");
                break;
        }

    }

    // WAP to check whether a number is even or odd using a switch case.
    public static void fnPrintOddEven() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Numeric Value:");
        int a = sc.nextInt();
        int data = a % 2;
        switch (data) {
            case 0:
                System.out.println("Even Number ");
                break;
            case 1:
                System.out.println("odd Number ");
                break;
            default:
                System.out.println("Not a Numeric Value");
                break;
        }

    }

    // WAP to find roots of a quadratic equation using switch case.
    public static void fnPrintRootsOfQuadratic() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ente value of a:");
        int a = sc.nextInt();
        System.out.println("ente value of b:");
        int b = sc.nextInt();
        System.out.println("ente value of c:");
        int c = sc.nextInt();
        int data = b * b - 4 * a * c;
        double root1 = 0;
        double root2 = 0;
        int noOfRoots = data > 0 ? 1 : data < 0 ? 2 : 0;
        switch (noOfRoots) {
            case 0:
                root1 = (-b) / (2 * a);
                root2 = (-b) / (2 * a);
                System.out.println("root1:" + root1 + " root2:" + root2);
                break;
            case 1:
                root1 = (-b + Math.sqrt(data)) / (2 * a);
                root2 = (-b - Math.sqrt(data)) / (2 * a);
                System.out.println("root1:" + root1 + " root2:" + root2);
                break;
            case 2:
                root1 = (-b) / (2 * a);
                root2 = Math.sqrt(-data) / (2 * a);
                System.out.println("root1:" + root1 + " root2:" + root2);
                break;
        }

    }

}
