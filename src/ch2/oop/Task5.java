package ch2.oop;

/**
 * Implement an immutable class PointMutate that describes a point in the plane. Provide a
 * constructor to set it to a specific point, a no-arg constructor to set it to the origin, and
 * methods getX, getY, translate, and scale. The translate method moves
 * the point by a given amount in x- and y-direction. The scale method scales both
 * coordinates by a given factor. Implement these methods so that they return new
 * points with the results. For example,
 * Click here to view code image
 * PointMutate p = new PointMutate(3, 4).translate(1, 3).scale(0.5);
 * should set p to a point with coordinates (2, 3.5).
 */
public class Task5 {
    public static void main(String[] args) {
        Point p = new Point(3, 4).translate(1, 3).scale(0.5);
        System.out.printf("[x=%s;y=%s]", p.getX(), p.getY());
    }

    private static class Point {
        private final double x;
        private final double y;

        public Point() {
            this.x = 0;
            this.y = 0;
        }

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }

        public Point translate(double dx, double dy) {
            return new Point(getX() + dx, getY() + dy);
        }

        public Point scale(double factor) {
            return new Point(getX() * factor, getY() * factor);
        }

    }
}

