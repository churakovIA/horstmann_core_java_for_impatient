package ch1.fundamental;

import java.util.Scanner;
import java.util.stream.Stream;

/**
 * Write a program that reads an integer and prints it in binary, octal, and hexadecimal.
 * Print the reciprocal as a hexadecimal floating-point number
 */
public class Task1 {
    public static void main(String[] args) {
        System.out.print("Enter integer: ");
        Scanner sc = new Scanner(System.in);
        int r10 = sc.nextInt(10);
//        System.out.println(Integer.toBinaryString(r10));
        Stream.of(2, 8, 16)
                .map(r -> String.format("Radix %s: %s", r, Integer.toString(r10, r)))
                .forEach(System.out::println);
        System.out.println("Hexadecimal floating-point number: " + Double.toHexString(r10));
    }
}
