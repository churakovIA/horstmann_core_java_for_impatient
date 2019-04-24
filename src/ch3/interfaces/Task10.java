package ch3.interfaces;

import java.io.File;
import java.io.FileFilter;

import static utils.PrintUtil.print;

/**
 * Using the listFiles(FileFilter) and isDirectory methods of the
 * java.io.File class, write a method that returns all subdirectories of a given
 * directory. Use a lambda expression instead of a FileFilter object. Repeat with a
 * method expression and an anonymous inner class.
 */
public class Task10 {
    public static void main(String[] args) throws Exception {
        //String classpath = System.getProperty("java.class.path");
        String classpath = Task10.class.getProtectionDomain().getCodeSource().getLocation().getPath();

        System.out.println("---With method reference:");
        print(getSubdirectories(classpath));
        System.out.println("---With lambda expression:");
        print(getSubdirectoriesLambda(classpath));
        System.out.println("---With anonymous inner class:");
        print(getSubdirectoriesInnerClass(classpath));

    }

    private static File[] getSubdirectories(String path) {
        File[] dirs = new File(path).listFiles(File::isDirectory);
        return dirs == null ? new File[0] : dirs;
    }

    private static File[] getSubdirectoriesInnerClass(String path) {
        File[] dirs = new File(path).listFiles(new FileFilter() {
            @Override
            public boolean accept(File f) {
                return f.isDirectory();
            }
        });
        return dirs == null ? new File[0] : dirs;
    }

    private static File[] getSubdirectoriesLambda(String path) {
        File[] dirs = new File(path).listFiles(f -> f.isDirectory());
        return dirs == null ? new File[0] : dirs;
    }

}
