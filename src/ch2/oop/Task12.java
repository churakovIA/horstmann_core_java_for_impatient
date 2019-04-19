package ch2.oop;

/**
 * Make a file HelloWorld.java that declares a class HelloWorld in a package
 * ch01.sec01. Put it into some directory, but not in a ch01/sec01 subdirectory.
 * From that directory, run javac HelloWorld.java. Do you get a class file?
 * Where? Then run java HelloWorld. What happens? Why? (Hint: Run javap
 * HelloWorld and study the warning message.) Finally, try javac -d .
 * HelloWorld.java. Why is that better?
 * <p>
 * answer:
 * <p>
 * $ java HelloWorld
 * Error: Could not find or load main class HelloWorld
 * Caused by: java.lang.NoClassDefFoundError: chOl/secOl/HelloWorld (wrong name: HelloWorld)
 * <p>
 * $ javap HelloWorld
 * Warning: File .\HelloWorld.class does not contain class HelloWorld
 * Compiled from "HelloWorld.java"
 * public class chOl.secOl.HelloWorld {
 * public chOl.secOl.HelloWorld();
 * public static void main(java.lang.String...);
 */
public class Task12 {
    public static void main(String[] args) {

    }
}
