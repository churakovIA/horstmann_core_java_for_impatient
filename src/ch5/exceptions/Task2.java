package ch5.exceptions;

import java.io.FileNotFoundException;

/**
 * Write a method public double sumOfValues(String filename)
 * throws… that calls the preceding method and returns the sum of the values in the
 * file. Propagate any exceptions to the caller.
 */
public class Task2 {
    public static void main(String[] args) {

    }

    public static double sumOfValues(String filename) throws FileNotFoundException {
        return Task1.readValues(filename).stream()
                .mapToDouble(Double::doubleValue)
                .sum();
    }
}
