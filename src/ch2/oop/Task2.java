package ch2.oop;

import java.util.Random;
import java.util.Scanner;

/**
 * Consider the nextInt method of the Scanner class. Is it an accessor or mutator?
 * Why? What about the nextInt method of the Random class?
 */
public class Task2 {
    public static void main(String[] args) {
        /**
         * https://stackoverflow.com/questions/40066601/is-the-nextint-method-of-the-scanner-class-an-accessor-or-a-mutator-in-java
         * nextInt is both a mutator and an accesor.
         */
        Scanner scanner = new Scanner(System.in);
        int j = scanner.nextInt();
        /**
         *          * We say that a method is a mutator if it changes the object on which it was invoked.
         *          * It is an accessor if it leaves the object unchanged.
         *          * The plusDays method of the LocalDate class is an accessor
         *          * The nextInt of the Scanner is an accessor
         *          * The nextInt of the Random is an accessor
         */
        Random random = new Random();
        int i = random.nextInt();
    }
}
