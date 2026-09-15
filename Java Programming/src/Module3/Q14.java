import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class Q14 {

    static ReentrantLock lock1 = new ReentrantLock();
    static ReentrantLock lock2 = new ReentrantLock();

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {

            try {
                if (lock1.tryLock(1, TimeUnit.SECONDS)) {

                    try {
                        System.out.println("Thread 1 acquired Lock 1.");

                        Thread.sleep(100);

                        if (lock2.tryLock(1, TimeUnit.SECONDS)) {

                            try {
                                System.out.println("Thread 1 acquired Lock 2.");
                            } finally {
                                lock2.unlock();
                            }

                        } else {
                            System.out.println("Thread 1 could not acquire Lock 2.");
                        }

                    } finally {
                        lock1.unlock();
                    }
                }

            } catch (InterruptedException e) {
                System.out.println(e);
            }
        });

        Thread t2 = new Thread(() -> {

            try {
                if (lock2.tryLock(1, TimeUnit.SECONDS)) {

                    try {
                        System.out.println("Thread 2 acquired Lock 2.");

                        Thread.sleep(100);

                        if (lock1.tryLock(1, TimeUnit.SECONDS)) {

                            try {
                                System.out.println("Thread 2 acquired Lock 1.");
                            } finally {
                                lock1.unlock();
                            }

                        } else {
                            System.out.println("Thread 2 could not acquire Lock 1.");
                        }

                    } finally {
                        lock2.unlock();
                    }
                }

            } catch (InterruptedException e) {
                System.out.println(e);
            }
        });

        t1.start();
        t2.start();
    }
}
