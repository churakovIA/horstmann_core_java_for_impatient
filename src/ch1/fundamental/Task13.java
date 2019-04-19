package ch1.fundamental;

import utils.RandomNumbers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 *Write a program that prints a lottery combination, picking six distinct numbers
 * between 1 and 49. To pick six distinct numbers, start with an array list filled with 1
 * … 49. Pick a random index and remove the element. Repeat six times. Print the
 * result in sorted order.
 */
public class Task13 {
    public static void main(String[] args) {
/*
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < 50; i++) {
            list.add(i);
        }
*/
//        List<Integer> collect = Stream.iterate(1, i -> i + 1).limit(49).collect(Collectors.toList());
        List<Integer> list = IntStream.rangeClosed(1,49).boxed().collect(Collectors.toList());
        int[] res = new int[6];
        for (int i = 0; i < 6; i++) {
            int idx = RandomNumbers.nextInt(0, list.size() - 1);
            res[i] = list.remove(idx);
        }
        Arrays.sort(res);
        System.out.println(Arrays.toString(res));
    }
//    private static int getRandom(int a, int b) {
//        return (int) (Math.random() * (b - a + 1)) + a;
//    }

}
