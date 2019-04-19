package ch1.fundamental;

import java.util.Scanner;

/**
 * Write a program that reads an integer angle (which may be positive or negative) and
 * normalizes it to a value between 0 and 359 degrees. Try it first with the % operator,
 * then with floorMod.
 */
public class Task2 {
    public static void main(String[] args) {
        System.out.print("Enter integer: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 360;
        System.out.println("% : " + (a % b + b) % b);
        System.out.println("floorMod: " + Math.floorMod(a, b));
    }
}
