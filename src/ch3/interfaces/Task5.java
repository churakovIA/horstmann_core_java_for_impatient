package ch3.interfaces;

import java.util.stream.Stream;

/**
 * Implement a static constant method of the IntSequence class that yields an
 * infinite constant sequence. For example, IntSequence.constant(1) yields
 * values 1 1 1 … , ad infinitum. Extra credit if you do this with a lambda
 * expression.
 */
public class Task5 {
    public static void main(String[] args) {
        print(IntSequence.constant(1), 7);
        print(IntSequence.constantLambda(7), 4);
    }

    private static void print(IntSequence sequence, int limit) {
        Stream.generate(sequence::next).limit(limit).forEach(System.out::print);
        System.out.println();
    }
}
