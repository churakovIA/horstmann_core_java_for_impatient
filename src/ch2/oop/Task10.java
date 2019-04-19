package ch2.oop;

import utils.RandomNumbers;

import java.io.PrintStream;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

import static utils.RandomNumbers.randomElement;

/**
 *In the RandomNumbers class, provide two static methods randomElement that
 * get a random element from an array or array list of integers. (Return zero if the array
 * or array list is empty.) Why couldn’t you make these methods into instance methods
 * of int[] or ArrayList<Integer>?
 */
public class Task10 {

    private static final PrintStream out = System.out;

    public static void main(String[] args) {
        int[] ints = IntStream.generate(RandomNumbers::nextInt).limit(100).toArray();
        out.println(randomElement(ints));

        out.println(randomElement(new int[]{1,2,3,4,5}));
        out.println(randomElement(List.of(1,2,3,4,5)));
        out.println(randomElement(new int[0]));
        out.println(randomElement(Collections.emptyList()));
    }
}
