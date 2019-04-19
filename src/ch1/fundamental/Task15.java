package ch1.fundamental;

import java.util.*;

/**
 * Write a program that stores Pascal’s triangle up to a given n in an
 * ArrayList<ArrayList<Integer>>.
 */
public class Task15 {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int size = enterInt("Enter size: ");
        List<List<Integer>> triangle = new ArrayList<>() {{
            add(List.of(1));
        }};

        for (int i = 1; i < size; i++) {
            List<Integer> row = new ArrayList<>() {{
                add(1);
            }};
            for (int j = 1; j < i; j++) {
                List<Integer> previous = triangle.get(i - 1);
                row.add(Integer.sum(previous.get(j - 1), previous.get(j)));
            }
            row.add(1);
            triangle.add(row);
        }

        print(triangle);
    }

    private static void print(List<List<Integer>> triangle) {
        for (List<Integer> row : triangle) {
            System.out.println(row);
        }

    }

    private static int enterInt(String caption) {
        System.out.print(caption);
        return sc.nextInt();
    }

}
