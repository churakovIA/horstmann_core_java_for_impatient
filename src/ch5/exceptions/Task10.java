package ch5.exceptions;

/**
 * Write a recursive factorial method in which you print all stack frames before
 * you return the value. Construct (but don’t throw) an exception object of any kind
 * and get its stack trace
 */
public class Task10 {
    public static void main(String[] args) {
        factorial(5);
    }

    private static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be greater 0");
        } else if (n <= 1) {
            return 1;
        }
        new Throwable().printStackTrace();
        return n * factorial(n - 1);
    }
}
