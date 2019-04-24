package ch3.interfaces;

/**
 * Implement a class Greeter that implements Runnable and whose run method
 * prints n copies of "Hello, " + target, where n and target are set in the
 * constructor. Construct two instances with different messages and execute them
 * concurrently in two threads.
 */
public class Task8 {
    public static void main(String[] args) throws Exception {
        Thread thread1 = new Thread(new Greeter(5, "Java"));
        Thread thread2 = new Thread(new Greeter(5, "World"));
        thread1.start();
        thread2.start();
    }
}
