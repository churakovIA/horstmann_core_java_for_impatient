package ch3.interfaces;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

import static utils.PrintUtil.print;

/**
 * Given an array of File objects, sort it so that directories come before files, and
 * within each group, elements are sorted by path name. Use a lambda expression to
 * specify the Comparator.
 */
public class Task12 {

    private static final String DIR = System.getProperty("java.io.tmpdir");

    public static void main(String[] args) {
        File[] files = new File(DIR).listFiles();
        sort(files);
        print(files);
    }

    private static void sort(File[] files) {
        Arrays.sort(files, Comparator.comparing(File::isFile).thenComparing(File::getPath));
    }
}
