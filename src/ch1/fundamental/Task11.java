package ch1.fundamental;

import java.nio.charset.Charset;

/**
 * Write a program that reads a line of text and prints all characters that are not ASCII,
 * together with their Unicode values.
 */
public class Task11 {
    public static void main(String[] args) {
        String test = "Réal";
        System.out.println(test + " isPureAscii() : " + isPureAscii(test));
        test = "Real";
        System.out.println(test + " isPureAscii() : " + isPureAscii(test));
    }

    private static boolean isPureAscii(String v) {
        return Charset.forName("US-ASCII").newEncoder().canEncode(v);
        // or "ISO-8859-1" for ISO Latin 1
        // or StandardCharsets.US_ASCII with JDK1.7+
    }
}
