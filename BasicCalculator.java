package java_programs;

import java.util.Scanner;

import javax.security.auth.callback.ChoiceCallback;

class Calculator {
    public int addition(int a, int b) {
        return a + b;

    }

    public int subtraction(int a, int b) {
        return a - b;
    }

    public int multiplication(int a, int b) {
        return a * b;

    }

    public int division(int a, int b) {
        if (b != 0)
            return a / b;
        return 0;

    }

    public void quit() {
        System.out.println("Thank you for using the Calculator");

    }

}

public class BasicCalculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Welcome Make your calculation Easy................................");
        char choice;
        Scanner sc = new Scanner(System.in);
        menu: do {
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5.Quit");
            System.out.println("Enter your choice of calculation functions");
            int index = sc.nextInt();
            System.out.println("Enter choice of 2 number");

            // int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            switch (index) {
                case 1:
                    System.out.println(calculator.addition(a, b));
                    break;
                case 2:
                    System.out.println(calculator.subtraction(a, b));
                    break;
                case 3:
                    System.out.println(calculator.multiplication(a, b));
                    break;
                case 4:
                    System.out.println(calculator.division(a, b));
                    break;
                default:
                    System.out.println("please enter valid choice");
                    break;

            }
            System.out.println("If want to Continue press Y  to exit enter N");
            choice = sc.next().charAt(0);
        } while (choice == 'Y' || choice == 'y');

        calculator.quit();

    }
}
