package ch2.oop;

/**
 * Why can’t you implement a Java method that swaps the contents of two int
 * variables? Instead, write a method that swaps the contents of two IntHolder
 * objects. (Look up this rather obscure class in the API documentation.) Can you swap
 * the contents of two Integer objects?
 * <p>
 * answer:
 * Integer is immutable
 * https://stackoverflow.com/questions/8238415/how-to-swap-two-integer-wrapper-objects
 */
public class Task4 {
/*
    public static void main(String[] args) {
        IntHolder a = new IntHolder();
        a.value = 5;
        IntHolder b = new IntHolder();
        a.value = 9;

        System.out.printf("Before: a=%s, b=%s", a, b);

        swap(a,b);

        System.out.printf("After: a=%s, b=%s", a, b);
    }

    private static void swap(IntHolder a, IntHolder b) {
        int c = a.value;
        a.value = b.value;
        b.value = c;
    }
*/
}
