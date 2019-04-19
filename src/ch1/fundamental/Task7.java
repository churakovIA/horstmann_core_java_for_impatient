package ch1.fundamental;

import java.util.Scanner;

/**
 *Write a program that reads in two numbers between 0 and 65535, stores them in
 * short variables, and computes their unsigned sum, difference, product, quotient,
 * and remainder, without converting them to int.
 */
public class Task7 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        short a = enterShort();
        short b = enterShort();
        System.out.println("sum: "+(short)(a+b));
        System.out.println("difference: "+(short)(a-b));
        System.out.println("product: "+(short)(a*b));
        System.out.println("quotient: "+(short)(a/b));
        System.out.println("remainder: "+(short)(a%b));

    }
    private static short enterShort() {
        System.out.print("Enter short: ");
        return sc.nextShort();
    }

}
