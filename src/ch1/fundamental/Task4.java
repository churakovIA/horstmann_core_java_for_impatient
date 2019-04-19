package ch1.fundamental;

/**
 * Write a program that prints the smallest and largest positive double value. Hint:
 * Look up Math.nextUp in the Java API.
 */
public class Task4 {
    public static void main(String[] args) {
        double v = Math.nextUp(Double.MAX_VALUE);
        System.out.println(v);
        System.out.println("MAX_VALUE: " + Double.MAX_VALUE);
        System.out.println("MAX_VALUE neg: " + -Double.MAX_VALUE);
        System.out.println("MIN_VALUE: " + Double.MIN_VALUE);
        System.out.println(Math.nextUp(0.0));
        System.out.println(Math.nextUp(-1.0));
    }
}
