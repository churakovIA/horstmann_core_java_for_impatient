package ch2.oop;

import java.io.PrintStream;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Implement a class Queue, an unbounded queue of strings. Provide methods add,
 * adding at the tail, and remove, removing at the head of the queue. Store elements
 * as a linked list of nodes. Make Node a nested class. Should it be static or not?
 */
public class Task16 {
    public static void main(String[] args) {
        PrintStream out = System.out;
        new Queue()
                .add("a").print(out)
                .add("b").print(out)
                .add("c").print(out)
                .remove().print(out)
                .remove().print(out);
    }

    static class Queue {
        Node first;
        Node last;

        Queue add(String val) {
            Node l = last;
            last = new Node(l, null, val);
            if (l != null) {
                l.next = last;
            } else {
                first = last;
            }
            return this;
        }

        Queue remove() {
            first = first.next;
            return this;
        }

        Queue print(PrintStream out) {
            String queueString = Stream.iterate(first, Objects::nonNull, node -> node.next)
                    .map(node -> node.item)
                    .collect(Collectors.joining(" "));
            out.println(queueString);
            return this;
        }

        static class Node {
            Node next;
            Node prev;
            String item;

            Node(Node prev, Node next, String item) {
                this.prev = prev;
                this.next = next;
                this.item = item;
            }
        }

    }

    private static void print2(Queue q) {
        for (Task16.Queue.Node node = q.first; node != null; node = node.next) {
            System.out.print(node.item + " ");
        }
        System.out.println();
    }

    private static void print3(Queue q) {
        Task16.Queue.Node node = q.first;
        while (node != null) {
            System.out.print(node.item + " ");
            node = node.next;
        }
    }
}
