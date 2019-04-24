package ch3.interfaces;

import java.util.Random;

/**
 * Implement the RandomSequence in Section 3.9.1, “Local Classes,” on p. 122 as
 * a nested class, outside the randomInts method.
 */
public class Task15 {

    private static final Random generator = new Random();

    public static void main(String[] args) {
        IntSequence sequence = randomInts(4, 9);
        for (int i = 0; i < 9; i++) {
            System.out.println(sequence.next());
        }

    }

    private static IntSequence randomInts(int low, int high) {
        return new RandomSequence(low, high);
    }

    private static class RandomSequence implements IntSequence {
        private int low, high;

        RandomSequence(int low, int high) {
            this.low = low;
            this.high = high;
        }

        public int next() {
            return low + generator.nextInt(high - low + 1);
        }

        public boolean hasNext() {
            return true;
        }
    }

}
