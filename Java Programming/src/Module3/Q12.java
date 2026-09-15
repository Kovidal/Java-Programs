class Q12 {

    static boolean running = true;

    public static void main(String[] args) {

        Thread download = new Thread(() -> {

            for (int i = 1; i <= 100 && running; i++) {

                System.out.println("Downloading... " + i + "%");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }

            System.out.println("Download stopped.");
        });

        download.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        running = false;

        System.out.println("Stopping download...");
    }
}