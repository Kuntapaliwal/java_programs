package java_programs;

interface myInteface {
    void display(int p);

}

class TestClass implements myInteface {

    private static boolean isPrime(int n) {
        if (n < 2)
            return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }

        }
        return true;
    }

    @Override
    public void display(int k) {
        // TODO Auto-generated method stub
        int count = 0;
        for (int i = 2; i <= k; i++) {
            if (isPrime(i))
                count++;
        }
        System.out.println(count);
    }

}

public class Interfaces {
    public static void main(String[] args) {
        TestClass test = new TestClass();
        test.display(13);
        test.display(19);
    }

}
