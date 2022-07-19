package java_programs;

import java.util.*;

import javax.lang.model.util.ElementScanner14;

public class ControlFlowStatement {
    public static void main(String[] args) {

        fnCalculateTicketPrice();
        fnCalculateTicketPrice();
        fnCalculateTicketPrice();
        fnCalculateTicketPriceAdvanced();
        fnCalculateTicketPriceAdvanced();
        fnCalculateTicketPriceAdvanced();

    }

    // In the first version of the program, there is one ticket price of $30.00.
    // Senior citizens (age ≥ 65) are given a
    // 50% discount. Write this program as follows. Import your Scanner. Declare the
    // needed variables (the person’s
    // age, the base price of a ticket ($30) and the price you will charge). Input
    // the user’s age, compute the price of
    // the ticket and output the result in a formatted way (that is, using a $). You
    // do not need to use DecimalFormat
    // for this part of the program but you will as you enhance it so you might want
    // to set this up now. Save, compile
    // and run your program a few times, asking the user for different ages such as
    // 10, 50, 65, 80 and 0.
    public static void fnCalculateTicketPrice() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the age of person: ");
        int age = sc.nextInt();
        int basePrice = 30;
        int finalPrice;

        if (age >= 65) {
            finalPrice = basePrice - basePrice / 2;

        } else {
            finalPrice = basePrice;
        }
        System.out.println("Price of the ticket is: $" + finalPrice);
        sc.close();
    }

    public static void fnCalculateTicketPriceAdvanced() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the age of person: ");
        int age = sc.nextInt();

        System.out.println("enter the country of person: ");
        String country = sc.next();
        int basePriceNormal = 40;
        int specialBasePrice = 30;
        double finalPrice;
        if (age > 0) {
            if (age >= 65) {
                if (country.equalsIgnoreCase("Warren")) {
                    finalPrice = specialBasePrice - specialBasePrice / 2;

                } else {
                    finalPrice = basePriceNormal - basePriceNormal / 2;

                    if (country.equalsIgnoreCase("Campbell")) {
                        finalPrice = finalPrice - (finalPrice * 7.5 / 100);
                    }
                }

            }

            else if (age < 5) {
                finalPrice = 0;
            } else if (age < 14) {
                if (country.equalsIgnoreCase("Clermont")) {
                    finalPrice = basePriceNormal - (basePriceNormal * 18) / 100;
                } else {
                    finalPrice = basePriceNormal - basePriceNormal / 2;
                }
            } else {
                if (country.equalsIgnoreCase("Warren")) {
                    finalPrice = specialBasePrice;

                } else {
                    finalPrice = basePriceNormal;
                }
            }

            System.out.println("Price of the ticket is: $" + finalPrice);
        }

        else {
            System.out.println("Age can't be negative or zero");
        }
        sc.close();
    }

}
