import java.util.concurrent.locks.ReentrantLock;

class Q13 {

    static int counter = 0;

    static ReentrantLock lock = new ReentrantLock();

    static void incrementWithoutLock() {

        counter++;
    }

    static void incrementWithLock() {

        lock.lock();

        try {
            counter++;
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {

            for (int i = 0; i < 1000; i++) {
                incrementWithLock();
            }
        });

        Thread t2 = new Thread(() -> {

            for (int i = 0; i < 1000; i++) {
                incrementWithLock();
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Counter with ReentrantLock: " + counter);
    }
}
