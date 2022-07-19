package java_programs;

import java.io.*;
import java.util.*;

public class HelloWorld {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello World....");
        System.out.printf(
                "Monday\\wednesday\\friday: even no. vehicles \nTuesday\\thursday\\saturday: odd No. vehicles");

        fnSumMethod();
        fnRectangleArea();
        fnUserData();
        fnSquareArea();
        fnPrintMethod();
    }

    // Write a program to take two integers as input from the user. First, print
    // their sum and then print their product.

    static void fnSumMethod() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nenter first integer : ");
        int x = sc.nextInt();
        System.out.println("enter second integer");
        int y = sc.nextInt();
        int sum = x + y;
        System.out.println("sum: " + sum);

    }

    // Take the length and breadth of a rectangle as double inputs from the user,
    // and print the area of the rectangle.
    static void fnRectangleArea() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length : ");
        double l = sc.nextDouble();
        System.out.println("\nenter breadth");
        double b = sc.nextDouble();
        double area = l * b;
        System.out.println("\n area: " + area);

    }

    // Take name, roll number and field of interest from the user and print in the
    // format below :
    // "Hey, my name is xyz and my roll number is xyz. My field of interest are
    // xyz."

    static void fnUserData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name : ");
        String name = sc.nextLine();
        System.out.println("\nenter Roll Number");
        int rollNumber = Integer.parseInt(sc.nextLine());
        System.out.println("\nenter Hobby");
        String hobby = sc.nextLine();
        System.out.println(
                "Hey, my name is" + name + " and my roll number is" + rollNumber + " my field of interest are" + hobby);

    }

    // Take the side of a square from the user and print the area and perimeter of
    // it.
    static void fnSquareArea() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter square side : ");
        int side = sc.nextInt();
        int area = side * side;
        System.out.println("area of square: " + area);
    }
    // Take two different string inputs and print them in the same line.

    // INPUT:
    // Core
    // Java

    // OUTPUT:
    // Core Java
    static void fnPrintMethod() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter first strng : ");
        String first = br.readLine();
        System.out.println("enter second strng : ");
        String second = br.readLine();
        System.out.println(first + second);
        br.close();
    }

}