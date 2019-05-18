package ch5.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Section 5.1.6, “The finally Clause,” on p. 181 has an example of a broken try
 * statement with catch and finally clauses. Fix the code with (a) catching the
 * exception in the finally clause, (b) a try/catch statement containing a
 * try/finally statement, and (c) a try-with-resources statement with a catch
 * clause.
 */
public class Task6 {
    public static void main(String[] args) {

        Path path = Paths.get(args[0]);

        try (BufferedReader in = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
            //Читать из стандартного потока ввода in
        } catch (IOException ex) {
            System.err.println("Caught IOException: " + ex.getMessage());
        }

/**
        BufferedReader in = null;
        try {
            in = Files.newBufferedReader(path, StandardCharsets.UTF_8);
//            Читать из стандартного потока ввода in
        } catch (IOException ex) {
            System.err.println("Caught IOException: " + ex.getMessage());
        } finally {
            if (in != null) {
                in.close(); // ВНИМАНИЕ: может быть сгенерировано исключение!
            }
        }
*/
    }
}
