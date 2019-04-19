package ch1.fundamental;

/**
 * What happens when you cast a double to an int that is larger than the largest
 * possible int value? Try it out.
 */
public class Task5 {
    public static void main(String[] args) {
        double d = Integer.MAX_VALUE;
        d++;
        System.out.println(Integer.MAX_VALUE);
        System.out.println((int)(d));
        System.out.println(d);
    }
}
