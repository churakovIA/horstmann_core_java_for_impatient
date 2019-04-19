package ch1.fundamental;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

/**
 * Using only the conditional operator, write a program that reads three integers and
 * prints the largest. Repeat with Math.maxByMathMax.
 */
public class Task3 {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int a = enterInt();
        int b = enterInt();
        int c = enterInt();

        System.out.print("maxByMathMax: ");
        testF(Task3::maxByMathMax, a, b, c);
        System.out.print("maxByConditionalOperator: ");
        testF(Task3::maxByConditionalOperator, a, b, c);
    }

    private static void testF(Function<Iterable<Integer>, Integer> f, Integer... vals) {
        List<Integer> list = Arrays.asList(vals);
        System.out.println(String.format("%s - max is %s", list, f.apply(list)));
    }

    private static int maxByMathMax(Iterable<Integer> integers) {
        Iterator<Integer> iter = integers.iterator();
        return maxByMathMax(iter.next(), iter.next(), iter.next());
    }

    private static int maxByConditionalOperator(Iterable<Integer> integers) {
        Iterator<Integer> iter = integers.iterator();
        return maxByConditionalOperator(iter.next(), iter.next(), iter.next());
    }

    private static int maxByConditionalOperator(int a, int b, int c) {
        int max = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        return max;
    }

    private static int maxByMathMax(int a, int b, int c) {
        return Math.max(
                Math.max(a, b),
                c
        );
    }

    private static int enterInt() {
        System.out.print("Enter integer: ");
        return sc.nextInt();
    }
}
