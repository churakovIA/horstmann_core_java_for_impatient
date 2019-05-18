package ch5.exceptions;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Implement a method that contains the code with a Scanner and a PrintWriter
 * in Section 5.1.5, “The Try-with-Resources Statement,” on p. 179. But don’t use the
 * try-with-resources statement. Instead, just use catch clauses. Be sure to close both
 * objects, provided they have been properly constructed. You need to consider the
 * following conditions:
 * • The Scanner constructor throws an exception.
 * • The PrintWriter constructor throws an exception.
 * • hasNext, next, or println throw an exception.
 * • out.close() throws an exception.
 * • in.close() throws an exception.
 */
public class Task5 {
    public static void main(String[] args) {
    }

    public static void copy(String from, String to) {
        Scanner sc = null;
        PrintWriter pw = null;
        try {
            sc = new Scanner(Paths.get(from));
            pw = new PrintWriter(to);
            while (sc.hasNextLine()) {
                pw.println(sc.nextLine().toLowerCase());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (sc != null) {
                sc.close();
            }
            if (pw != null) {
                pw.close();
            }
        }
    }
}
