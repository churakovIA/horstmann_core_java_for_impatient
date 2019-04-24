package ch3.interfaces;

import java.util.Iterator;
import java.util.stream.Stream;

/**
 * In this exercise, you will try out what happens when a method is added to an
 * interface. In Java 7, implement a class DigitSequence that implements
 * Iterator<Integer>, not IntSequence. Provide methods hasNext, next,
 * and a do-nothing remove. Write a program that prints the elements of an instance.
 * In Java 8, the Iterator class gained another method, forEachRemaining.
 * Does your code still compile when you switch to Java 8? If you put your Java 7 class
 * in a JAR file and don’t recompile, does it work in Java 8? What if you call the
 * forEachRemaining method? Also, the remove method has become a default
 * method in Java 8, throwing an UnsupportedOperationException. What
 * happens when remove is called on an instance of your class?
 */
public class Task6 {
    public static void main(String[] args) {
        Iterator<Integer> sequence = new DigitSequence();
        print(sequence, 10);
        sequence.remove();
    }

    private static void print(Iterator<Integer> sequence, int limit) {
        Stream.generate(sequence::next).limit(limit).forEach(System.out::print);
        System.out.println();
    }

    static class DigitSequence implements Iterator<Integer> {

        private int value = 0;

        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Integer next() {
            return value++;
        }

        public void remove() {
        }
    }
}
