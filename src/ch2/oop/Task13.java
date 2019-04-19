package ch2.oop;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.util.Arrays;

/**
 * Download the JAR file for OpenCSV from
 * http://opencsv.sourceforge.net. Write a class with a main method that
 * reads a CSV file of your choice and prints some of the content. There is sample code
 * on the OpenCSV web site. You haven’t yet learned to deal with exceptions. Just use
 * the following header for the main method:
 * public static void main(String[] args) throws Exception
 * The point of this exercise is not to do anything useful with CSV files, but to practice
 * using a library that is delivered as a JAR file.
 */
public class Task13 {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("src/resources/test_case.csv");
             CSVReader csvReader = new CSVReader(reader)) {
            csvReader.readAll().stream().limit(10).map(Arrays::toString).forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
