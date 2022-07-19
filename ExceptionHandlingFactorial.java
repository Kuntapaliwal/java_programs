package java_programs;

class MathUtils {
    // -------------------------------------------------------------
    // Returns the factorial of the argument given
    // -------------------------------------------------------------
    public static int factorial(int n) throws IllegalArgumentException {
        int fac = 1;
        if (n <= 0) {
            throw new IllegalArgumentException("Number is negative or zero cant find factorial");
        }
        if (n > 31) {
            throw new IllegalArgumentException("Number is too large cant find factorial");
        }
        // try {
        // if (n <= 0) {
        // System.out.println("number is negative or zero");
        // }
        // } catch (IllegalArgumentException e) {
        // return 0;
        // }

        for (int i = n; i > 0; i--)
            fac *= i;
        return fac;
    }
}

public class ExceptionHandlingFactorial {
    public static void main(String[] args) {
        MathUtils mathUtils = new MathUtils();
        try {
            System.out.println(mathUtils.factorial(31));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(mathUtils.factorial(-80));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(mathUtils.factorial(101));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
