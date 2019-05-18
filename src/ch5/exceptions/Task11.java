package ch5.exceptions;

import java.util.Objects;

/**
 * Compare the use of Objects.requireNonNull(obj) and assert obj
 * != null. Give a compelling use for each.
 */
public class Task11 {
    public static void main(String[] args) {
//        testObjects(null);
        factorial(99);
    }

    private static void testObjects(String obj) {
        Objects.requireNonNull(obj, "obj must not be null");
        System.out.println(obj + " length is " + obj.length());
    }

    private static int factorial(int n) {
        assert n > 0 : "n must be greater 0";
        int result = 1;
        if (n < 2) {
            return result;
        }
        result = n * factorial(n - 1);

        assert result > 0 : "integer overflow";

        return result;
    }


}
