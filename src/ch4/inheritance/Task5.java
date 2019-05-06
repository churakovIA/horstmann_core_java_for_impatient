package ch4.inheritance;

/**
 * Define clone methods for the classes of the preceding exercise.
 */
public class Task5 {
    public static void main(String[] args) {
        Task4.Rectangle rectangle = new Task4.Rectangle(new Point(1, 1), 100, 50);
        Task4.Rectangle cloned = rectangle.clone();
        cloned.moveBy(0, 40);
        System.out.println("rectangle: " + rectangle);
        System.out.println("cloned: " + cloned);

        Task4.Circle circle = new Task4.Circle(new Point(2, 5), 10);
        Task4.Circle cloneOfCircle = circle.clone();
        System.out.println("circle: " + circle);
        System.out.println("cloneOfCircle: " + cloneOfCircle);
    }
}
