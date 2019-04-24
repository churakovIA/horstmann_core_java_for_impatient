package ch3.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Implement methods
 * public static void runTogether(Runnable… tasks)
 * public static void runInOrder(Runnable… tasks)
 * The first method should run each task in a separate thread and then return. The
 * second method should run all methods in the current thread and return when the last
 * one has completed.
 */
public class Task9 {

    public static void main(String[] args) throws Exception {

        Runnable[] tasks = generateTasks(50);

        runTogether(tasks);

        System.out.println("------------------------------------------------------");

        runInOrder(tasks);
    }

    private static Runnable[] generateTasks(int count) {
        List<Runnable> list = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            String x = String.valueOf(i + 1);
            list.add(() -> {
                for (int j = 0; j < 1000; j++) {
                }
                System.out.println(x);
            });
        }

        return list.toArray(new Runnable[]{});
    }

    private static void runTogether(Runnable... tasks) throws Exception {
        ExecutorService exec = Executors.newFixedThreadPool(tasks.length);
        for (Runnable task : tasks) {
            exec.execute(task);
        }
        exec.shutdown();
        exec.awaitTermination(5000, TimeUnit.MILLISECONDS);
    }

    private static void runInOrder(Runnable... tasks) {
        for (Runnable task : tasks) {
            task.run();
        }
    }
}
