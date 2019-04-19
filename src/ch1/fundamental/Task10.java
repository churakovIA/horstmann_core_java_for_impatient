package ch1.fundamental;

import java.util.Random;

/**
 * Write a program that produces a random string of letters and digits by generating a
 * random long value and printing it in base 36.
 */
public class Task10 {

    private static final Random rndLetters = new Random();

    public static void main(String[] args) {
        int leight = 6;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < leight; i++) {
            sb.append(getBoolean() ? getRandom(0, 9) :
                    getBoolean() ? getLowerCaseLetter() : getUpperCaseLetter());
        }

        String s = sb.toString();
        long l = 0;

        for (char c : s.toCharArray()) {
            l += c;
        }
        System.out.printf("%-9s %s\n","string:", sb);
        System.out.printf("%-9s %s\n","long:", l);
        System.out.printf("%-9s %s\n","base 36:", Long.toString(l, 36));
    }

    private static CharSequence getLowerCaseLetter() {
        return String.valueOf((char) getRandom(97, 122));
    }

    private static CharSequence getUpperCaseLetter() {
        return String.valueOf((char) getRandom(65, 90));
    }

    private static boolean getBoolean() {
        return getRandom(0, 1) == 0;
    }

    private static int getRandom(int a, int b) {
        return (int) (Math.random() * (b - a + 1)) + a;
    }
}
