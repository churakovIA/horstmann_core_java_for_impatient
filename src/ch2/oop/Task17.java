package ch2.oop;

import java.io.PrintStream;

/**
 * Provide an iterator—an object that yields the elements of the queue in turn—for the
 * queue of the preceding class. Make Iterator a nested class with methods next
 * and hasNext. Provide a method iterator() of the Queue class that yields a
 * Queue.Iterator. Should Iterator be static or not?
 */
public class Task17 {
    public static void main(String[] args) {
        PrintStream out = System.out;
        new IterableQueue()
                .add("a").print(out)
                .add("b").print(out)
                .add("c").print(out)
                .remove().print(out)
                .remove().print(out);
    }

    private static class IterableQueue extends Task16.Queue {

        IterableQueue print(PrintStream out){
            for (IterableQueue.Iterator iterator = iterator(); iterator.hasNext(); ) {
                out.print(iterator.next().item + " ");
            }
            out.println();
            return this;
        }

        Iterator iterator() {
            return new Iterator();
        }

        private class Iterator {
            Node node;

            Iterator() {
                this.node = first;
            }

            Node next() {
                Node tmp = node;
                node = node.next;
                return tmp;
            }

            boolean hasNext() {
                return node != null;
            }
        }
    }
}
