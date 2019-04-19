package ch2.oop;

/**
 * Repeat the preceding exercise, but now make translate and scale into
 * mutators.
 */
public class Task6 {
    public static void main(String[] args) {
        PointMutate p = new PointMutate(3, 4);
        p.translate(1, 3);
        p.scale(0.5);
        System.out.printf("[x=%s;y=%s]", p.getX(), p.getY());
    }

    private static class PointMutate {
        private double x;
        private double y;

        public PointMutate() {
            this.x = 0;
            this.y = 0;
        }

        public PointMutate(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }

        public PointMutate translate(double dx, double dy) {
            x += dx;
            y += dy;
            return this;
        }

        public PointMutate scale(double factor) {
            x *= factor;
            y *= factor;
            return this;
        }
    }
}