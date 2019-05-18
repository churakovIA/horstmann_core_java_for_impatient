package ch5.exceptions;

import utils.RandomNumbers;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Write a method int min(int[] values) that, just before returning the
 * smallest value, asserts that it is indeed ≤ all values in the array. Use a private helper
 * method or, if you already peeked into Chapter 8, Stream.allMatch. Call the
 * method repeatedly on a large array and measure the runtime with assertions enabled,
 * disabled, and removed.
 */
public class Task12 {
    private static final int ITERATIONS = 10000;

    public static void main(String[] args) {

        int[] values = generateArray(500);
        int counter = 0;

        long start = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) {
            try {
                min(values);
                counter++;
            } catch (Throwable e) {}
        }
        System.out.printf("%s ms - regular method call\n" +
                "right %s of %s", System.currentTimeMillis() - start, counter, ITERATIONS);
    }

    private static int min(int[] values) {
//        final int result = Arrays.stream(values).min().getAsInt();
        final int result = RandomNumbers.randomElement(values);

        assert Arrays.stream(values).allMatch(v -> v >= result) : String.format("%s is not min", result);

        return result;
    }

    private static int[] generateArray(int length) {
        return Stream.generate(RandomNumbers::nextInt).limit(length).mapToInt(Integer::intValue).toArray();
    }
}
