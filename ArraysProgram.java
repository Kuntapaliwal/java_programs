package java_programs;

import java.util.Scanner;

public class ArraysProgram {
    public static void main(String[] args) {
        System.out.println("Enter the size of array: ");
        Scanner ac = new Scanner(System.in);
        int size = ac.nextInt();
        System.out.println("Enter the elements of array:");

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = ac.nextInt();
        }
        int noOfPositiveNumbers = 0;
        int noOfNegativeNumbers = 0;
        int noOfOddNumbers = 0;
        int noOfEvenNumbers = 0;
        int sumOfNumbers = 0;
        int productOfNumbers = 1;
        for (int i = 0; i < size; i++) {

            if (array[i] >= 0) {
                noOfPositiveNumbers++;
            } else {
                noOfNegativeNumbers++;
            }
            if (array[i] % 2 == 0) {
                noOfEvenNumbers++;
            } else {
                noOfOddNumbers++;
            }
            sumOfNumbers += array[i];
            productOfNumbers *= array[i];
        }
        System.out.println("Positives: " + noOfPositiveNumbers + " Negative: " + noOfNegativeNumbers + " odd:"
                + noOfOddNumbers + " even: "
                + noOfEvenNumbers + " sumOfNumbers: " + sumOfNumbers + " productOfNumbers: " + productOfNumbers);
    }

}
