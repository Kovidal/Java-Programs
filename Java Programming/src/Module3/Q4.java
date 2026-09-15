class Q4 {

    public static void main(String[] args) {

        Thread countdown = new Thread(() -> {

            for (int i = 10; i >= 1; i--) {

                System.out.println(i);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        });

        Thread tick = new Thread(() -> {

            for (int i = 1; i <= 20; i++) {

                System.out.println("Tick...");

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        });

        countdown.start();
        tick.start();
    }
}
