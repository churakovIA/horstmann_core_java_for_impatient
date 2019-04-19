package ch1.fundamental;

import java.util.HashSet;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Write a program that reads a two-dimensional array of integers and determines
 * whether it is a magic square (that is, whether the sum of all rows, all columns, and
 * the diagonals is the same). Accept lines of input that you break up into individual
 * integers, and stop when the user enters a blank line. For example, with the input
 * 16 3 2 13
 * 9 10 11 8
 * 9 6 7 12
 * 4 15 14 1
 * (Blank line)
 * your program should respond affirmatively.
 * Albrecht Dürer's magic square
 */
public class Task14 {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int length = enterInt("Enter size: ");
        int[][] square = new int[length][length];
        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square[0].length; j++) {
                square[i][j] = enterInt(String.format("[%s,%s]: ", i, j));
            }
        }
        System.out.println("---------------------------------------");
        printMatrix(square);
        System.out.println(isMagicSquare(square) ? "It`s a magic square" : "It`s ordinary square");
    }

    private static boolean isMagicSquare(int[][] square) {
        HashSet<Integer> set = new HashSet<>();
        //rows
        for (int[] ints : square) {
            set.add(IntStream.of(ints).sum());
        }
        //columns
        for (int i = 0; i < square.length; i++) {
            int s = 0;
            for (int j = 0; j < square[0].length; j++) {
                s += square[j][i];
            }
            set.add(s);
        }
        //diagonals
        int d1 = 0;
        int d2 = 0;
        for (int i = 0; i < square.length; i++) {
            d1 += square[i][i];
            d2 += square[i][square.length - 1 - i];
        }
        set.add(d1);
        set.add(d2);
        return set.size() <= 1;
    }

    private static int enterInt(String caption) {
        System.out.print(caption);
        return sc.nextInt();
    }

    private static void printMatrix(int[][] array) {
        for (int[] ints : array) {
            for (int y = 0; y < ints.length; y++) {
                int day = ints[y];
                System.out.print(day == 0 ? "   " : String.format("%3d", day));
            }
            System.out.println();
        }
    }

}
