package java_programs;

class MyIllegalException extends IllegalArgumentException {
    MyIllegalException() {

    }

    MyIllegalException(String msg) {
        super(msg);
    }
}

class MathUtilsCustom {
    // -------------------------------------------------------------
    // Returns the factorial of the argument given
    // -------------------------------------------------------------
    public static int factorial(int n) throws IllegalArgumentException {
        int fac = 1;
        if (n <= 0) {
            throw new MyIllegalException("Number is negative or zero cant find factorial");
        }
        if (n > 31) {
            throw new MyIllegalException("Number is too large cant find factorial");
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

public class CustomException {
    public static void main(String[] args) {

        MathUtilsCustom MathUtilsCustom = new MathUtilsCustom();
        try {
            System.out.println(MathUtilsCustom.factorial(31));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(MathUtilsCustom.factorial(-80));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(MathUtilsCustom.factorial(101));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
