class A {
    void checkNumber(int n) {
        if (n % 2 != 0) {
            throw new ArithmeticException("odd");
        }
    }

    public void check(int n) {
        try {
            checkNumber(n);
            System.out.println("even");

        } catch (ArithmeticException e) {
            System.out.println("number not matched");
            checkNumber(n);
        }
    }
}

public class Even_Odd_Exception {
    public static void main(String[] args) {
        A obj = new A();
        int n = 11;
        obj.check(n);
    }
}