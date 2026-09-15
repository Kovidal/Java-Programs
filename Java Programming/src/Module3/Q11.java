class Q11 {

    static int number = 1;

    static synchronized void printOdd() {

        while (number <= 20) {

            while (number % 2 == 0) {
                try {
                    Q11.class.wait();
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }

            if (number <= 20) {
                System.out.println("Odd: " + number);
                number++;
                Q11.class.notify();
            }
        }
    }

    static synchronized void printEven() {

        while (number <= 20) {

            while (number % 2 != 0) {
                try {
                    Q11.class.wait();
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }

            if (number <= 20) {
                System.out.println("Even: " + number);
                number++;
                Q11.class.notify();
            }
        }
    }

    public static void main(String[] args) {

        Thread oddThread = new Thread(() -> {
            printOdd();
        });

        Thread evenThread = new Thread(() -> {
            printEven();
        });

        oddThread.start();
        evenThread.start();
    }
}
