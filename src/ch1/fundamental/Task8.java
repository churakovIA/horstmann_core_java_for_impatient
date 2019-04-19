package ch1.fundamental;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Stream;

/**
 * Write a program that reads a string and prints all of its nonempty substrings
 */
public class Task8 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter string: ");
        String s = br.readLine();
        Stream.of(s.split("\\s+")).forEach(System.out::println);
/*
        String[] strings = s.split("\\s+");
        for (String str : strings) {
            System.out.println(str);
        }
*/
    }
}
