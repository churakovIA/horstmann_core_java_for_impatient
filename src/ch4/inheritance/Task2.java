package ch4.inheritance;

/**
 * Define toString, equals, and hashCode methods for the classes of the
 * preceding exercise.
 */
public class Task2 {
    public static void main(String[] args) {
        Point point = new Point(1.0, 2.6);
        System.out.println(point.toString());
        System.out.println(point.hashCode());
        System.out.println(point.equals(new Point(1, 2.6)));
        LabeledPoint label = new LabeledPoint("label", 1.0, 2.6);
        System.out.println(label.toString());
        System.out.println(label.hashCode());
        System.out.println(label.equals(new LabeledPoint("label1", 1.0, 2.6)));
    }
}
