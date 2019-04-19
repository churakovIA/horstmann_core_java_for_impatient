package utils;

import java.util.List;
import java.util.Random;

public class RandomNumbers {
    private static final Random generator = new Random();

    public static int nextInt(int low, int high) {
        return low + generator.nextInt(high - low + 1);
    }

    public static int nextInt() {
        return nextInt(0, Integer.MAX_VALUE - 1);
    }

    public static int randomElement(int[] ints) {
        return ints.length == 0 ? 0 : ints[nextInt(0, ints.length - 1)];
    }

    public static int randomElement(List<Integer> ints) {
        return ints.size() == 0 ? 0 : ints.get(nextInt(0, ints.size() - 1));
    }
}
