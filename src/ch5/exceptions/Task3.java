package ch5.exceptions;

import java.io.FileNotFoundException;

/**
 * Write a program that calls the preceding method and prints the result. Catch the
 * exceptions and provide feedback to the user about any error conditions.
 */
public class Task3 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("missing first parameter");
            return;
        }
        try {
            System.out.println(Task2.sumOfValues(args[0]));
        } catch (FileNotFoundException e) {
            System.err.printf("File %s not found\n", args[0]);
        }
    }
}
