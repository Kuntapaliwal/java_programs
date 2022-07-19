package java_programs;

import java.util.*;

public class ifElseLadder {
    public static void main(String[] args) {
        fnPrintGradesWithMultipleIf();
        fnPrintGradesWithIfElse();
    }

    // A school has the following rules for the grading system:
    // a. Below 25 - F
    // b. 25 to 45 - E
    // c. 45 to 50 - D
    // d. 50 to 60 - C
    // e. 60 to 80 - B
    // f. Above 80 - A
    // Ask the user to enter the marks and print the corresponding grade using:
    // i. multiple if-statements
    static void fnPrintGradesWithMultipleIf() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter total marks: ");
        int marks = sc.nextInt();
        if (marks > 80)
            System.out.println("Grade: A");
        if (marks > 60 && marks <= 80)
            System.out.println("Grade: B");
        if (marks > 50 && marks <= 60)
            System.out.println("Grade: C");
        if (marks > 45 && marks <= 50)
            System.out.println("Grade: D");
        if (marks > 25 && marks <= 45)
            System.out.println("Grade: E");
        if (marks <= 25)
            System.out.println("Grade: F");

    }

    // ii. if-else-if ladder
    static void fnPrintGradesWithIfElse() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter total marks: ");
        int marks = sc.nextInt();

        if (marks > 80)
            System.out.println("Grade: A");
        else if (marks > 60)
            System.out.println("Grade: B");
        else if (marks > 50)
            System.out.println("Grade: C");
        else if (marks > 45)
            System.out.println("Grade: D");
        else if (marks > 25)
            System.out.println("Grade: E");
        else
            System.out.println("Grade: F");

    }
}
