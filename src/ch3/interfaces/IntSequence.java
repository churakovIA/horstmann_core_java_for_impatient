package ch3.interfaces;

import java.util.Arrays;
import java.util.NoSuchElementException;

public interface IntSequence {
    int next();

    default boolean hasNext(){
        return true;
    }

    static IntSequence of(int... values) {
        return new IntSequence() {

            int[] elementData = Arrays.copyOf(values, values.length);
            int cursor;

            @Override
            public int next() {
                if (cursor >= elementData.length) {
                    throw new NoSuchElementException();
                } else {
                    return elementData[cursor++];
                }
            }

            @Override
            public boolean hasNext() {
                return cursor < elementData.length;
            }
        };
    }

    static IntSequence constantLambda(final int i) {
        return () -> i;
    }

    static IntSequence constant(int i) {
        return new IntSequence() {
            @Override
            public int next() {
                return value;
            }

            @Override
            public boolean hasNext() {
                return true;
            }

            final int value = i;

        };
    }

}
