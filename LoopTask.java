package java_programs;

import java.util.*;

import javax.lang.model.util.ElementScanner14;

public class LoopTask {
    public static void main(String[] args) {
        // WAP to take integer inputs from the user till the user presses 'q'. When the
        // user presses 'q', print the count of the number of inputs provided by the
        // user.

        Scanner sc = new Scanner(System.in);
        // int n;
        // int c = 0;
        // Scanner sc = new Scanner(System.in);
        // n = sc.nextInt();
        // char a = (char) n;
        // while (a != 'q') {
        // c++;
        // }
        // System.out.println(c);
        // do {
        // c++;
        // // System.out.println(c);

        // n = sc.next().charAt(0);
        // } while (n != 'q');
        // System.out.println(c);

        // System.out.println("enter a numeric value: ");
        // int a = sc.nextInt();
        // for (int i = 1; i <= a; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // System.out.println("enter a numeric value: ");
        // int b = sc.nextInt();
        // for (int i = 1; i <= b; i++) {
        // for (int j = i; j < b; j++) {
        // System.out.print(" ");
        // }
        // for (int k = 0; k < i; k++)
        // System.out.print("*");q
        // System.out.println();
        // }

        // System.out.println("enter a numeric value: ");
        // int b = sc.nextInt();
        // for (int i = 1; i <= b; i++) {
        // for (int j = i; j < b; j++) {
        // System.out.print(" ");
        // }
        // for (int k = 0; k < i; k++)
        // System.out.print("*");
        // System.out.println();
        // }

        // System.out.println("enter a numeric value: ");
        // int b = sc.nextInt();
        // for (int i = 1; i <= b; i++) {
        // for (int j = 1; j <= b * 2 - 1; j++) {
        // if (j <= i || j >= (b * 2 - i)) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }

        // }
        // System.out.println();

        // }

        // System.out.println("enter a numeric value: ");
        // // int no = sc.nextInt();
        // for (int i = 1; i <= b; i++) {
        // for (int j = 1; j <= b * 2 - 1; j++) {
        // if (j <= i || j >= (b * 2 - i)) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }

        // }
        // System.out.println();

        // }

        System.out.println("enter a numeric value: ");

        int no = sc.nextInt();
        int c = 0;
        for (int i = 2; i <= Math.sqrt(no); i++) {
            if (no % 2 == 0 || no % i == 0)
                break;
        }
        if (i == (no / 2 + 1))
            System.out.println("its prime");
        else
            System.out.println("its not prime");
    }

}
