package ch3.interfaces;

/**
 * Write a method that takes an array of Runnable instances and returns a
 * Runnable whose run method executes them in order. Return a lambda
 * expression.
 */
public class Task13 {
    public static void main(String[] args) {

    }

    private static Runnable get(Runnable[] runnables) {
        return () -> {
            for (Runnable r : runnables) {
                r.run();
            }
        };
    }
}
