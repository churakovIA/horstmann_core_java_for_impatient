package ch3.interfaces;

import java.io.File;

import static utils.PrintUtil.print;

/**
 * Using the list(FilenameFilter) method of the java.io.File class,
 * write a method that returns all files in a given directory with a given extension. Use
 * a lambda expression, not a FilenameFilter. Which variable from the enclosing
 * scope does it capture?
 */
public class Task11 {

    private static final String DIR = System.getProperty("java.io.tmpdir");

    public static void main(String[] args) {
        System.out.println("*.tmp in the folder " + DIR + ":\n");
        print(withExtension(DIR, ".tmp"));
    }

    private static String[] withExtension(String path, String extension) {
        return new File(path).list((dir, name) -> name.endsWith(extension));
    }
}
