package ch5.exceptions;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Design a helper method so that one can use a ReentrantLock in a try-withresources
 * statement. Call lock and return an AutoCloseable whose close
 * method calls unlock and throws no exceptions.
 */
public class Task8 {
    public static void main(String[] args) {

        try (ClosableClass lock = getLock()) {
        }

    }

    private static ClosableClass getLock() {
        ClosableClass closableClass = new ClosableClass(new ReentrantLock());
        closableClass.lock();
        return closableClass;
    }

    private static class ClosableClass implements AutoCloseable{
        private ReentrantLock lock;

        ClosableClass(ReentrantLock lock) {
            this.lock = lock;
        }

        @Override
        public void close() {
            try {
                lock.unlock();
                System.out.println("unlock");
            } catch (Exception e) {

            }
        }

        void lock(){
            lock.lock();
            System.out.println("lock");
        }

    }

}
