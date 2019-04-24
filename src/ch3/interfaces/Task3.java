package ch3.interfaces;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Scanner;

/**
 * What are all the supertypes of String? Of Scanner? Of
 * ImageOutputStream? Note that each type is its own supertype. A class or
 * interface without declared supertype has supertype Object.
 * <p>
 * answer:
 * String: Serializable, Comparable<String>, CharSequence
 * Scanner: Iterator<String>, Closeable, AutoCloseable
 * ImageOutputStream: ImageInputStream, DataOutput, DataInput, Closeable, AutoCloseable
 */
public class Task3 {
    public static void main(String[] args) {
        Serializable s = "sxsxsa";
        Iterator<String> sc = new Scanner(System.in);

    }
}
