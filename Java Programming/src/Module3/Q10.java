class Q10 {

    static int item;
    static boolean available = false;

    static synchronized void produce(int value) {

        while (available) {
            try {
                Q10.class.wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        item = value;
        available = true;

        System.out.println("Produced: " + item);

        Q10.class.notify();
    }

    static synchronized void consume() {

        while (!available) {
            try {
                Q10.class.wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        System.out.println("Consumed: " + item);

        available = false;

        Q10.class.notify();
    }

    public static void main(String[] args) {

        Thread producer = new Thread(() -> {

            for (int i = 1; i <= 5; i++) {
                produce(i);

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        });

        Thread consumer = new Thread(() -> {

            for (int i = 1; i <= 5; i++) {
                consume();

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        });

        producer.start();
        consumer.start();
    }
}
