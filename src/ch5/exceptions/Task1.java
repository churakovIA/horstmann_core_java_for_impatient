package ch5.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

/**
 * Write a method public ArrayList<Double> readValues(String
 * filename) throws… that reads a file containing floating-point numbers. Throw
 * appropriate exceptions if the file could not be opened or if some of the inputs are not
 * floating-point numbers.
 */
public class Task1 {
    public static void main(String[] args) {
        try {
            readValues("test");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Double> readValues(String filename) throws FileNotFoundException {
        Objects.requireNonNull(filename, "filename must not be null");
        ArrayList<Double> list = new ArrayList<>();
        try (Scanner sc = new Scanner(new File(filename))) {
            while (sc.hasNext()) {
                list.add(Double.parseDouble(sc.next()));
            }
        }
        return list;
    }
}
