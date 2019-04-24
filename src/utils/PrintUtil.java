package utils;

import java.util.Objects;

public class PrintUtil {
    public static <T> void print(T[] values) {
        Objects.requireNonNull(values);
        for (T v : values) {
            System.out.println(v);
        }
    }
}
