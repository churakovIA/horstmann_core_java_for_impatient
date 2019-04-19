package ch1.fundamental;

import java.math.BigInteger;
import java.util.stream.IntStream;

/**
 * Write a program that computes the factorial n! = 1 × 2 × … × n, using
 * BigInteger. Compute the factorial of 1000.
 */
public class Task6 {
    public static void main(String[] args) {
        System.out.println(factorial(1000));
    }

    public static String factorial(int n) {
        return String.valueOf(n < 0 ? 0 : IntStream.rangeClosed(1, n)       // получаем поток значений int от 1 до n включительно
                .mapToObj(BigInteger::valueOf)  // приводим значения int в потоке к типу BigInteger
                .reduce(BigInteger.ONE, BigInteger::multiply)); // сводим поток к одному значению BigInteger путем перемножения (multiply)
    }

}
