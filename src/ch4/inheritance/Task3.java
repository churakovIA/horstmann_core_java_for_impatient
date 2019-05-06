package ch4.inheritance;

/**
 * Make the instance variables x and y of the Point class in Exercise 1
 * protected. Show that the LabeledPoint class can access these variables only
 * in LabeledPoint instances.
 */
public class Task3 {
    public static void main(String[] args) {
        Point point = new Point(1.0, 2.6);
        double x = point.x; // can access directly because it's protected
    }
}
