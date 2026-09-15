class Q6 {

    public static void main(String[] args) {

        Thread autoSave = new Thread(() -> {

            while (true) {

                System.out.println("Auto-Save in progress...");

                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        });

        autoSave.setDaemon(true);
        autoSave.start();

        System.out.println("Main thread: File processing started...");

        for (int i = 1; i <= 5; i++) {

            System.out.println("Processing file " + i);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        System.out.println("Main thread: File processing completed.");
    }
}
