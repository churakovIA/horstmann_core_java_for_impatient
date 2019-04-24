package ch3.interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Implement the method void luckySort(ArrayList<String>
 * strings, Comparator<String> comp) that keeps calling
 * Collections.shuffle on the array list until the elements are in increasing
 * order, as determined by the comparator.
 */
public class Task7 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>(List.of("aaa", "bb", "c"));
        System.out.println(strings);
        luckySort(strings, Comparator.comparing(String::length));
        System.out.println(strings);
    }

    static void luckySort(ArrayList<String> strings, Comparator<String> comp) {
        while (true) {
            Collections.shuffle(strings);
            for (int i = 0; i < strings.size() - 1; i++) {
                if (comp.compare(strings.get(i + 1), strings.get(i)) < 0) {
                    return;
                }
            }
        }
    }
}
