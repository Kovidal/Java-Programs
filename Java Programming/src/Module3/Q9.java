class Q9 {

    static Object fork1 = new Object();
    static Object fork2 = new Object();

    public static void main(String[] args) {

        Thread philosopher1 = new Thread(() -> {

            synchronized (fork1) {

                System.out.println("Philosopher 1 picked fork 1.");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }

                synchronized (fork2) {
                    System.out.println("Philosopher 1 picked fork 2.");
                }
            }
        });

        Thread philosopher2 = new Thread(() -> {

            synchronized (fork2) {

                System.out.println("Philosopher 2 picked fork 2.");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }

                synchronized (fork1) {
                    System.out.println("Philosopher 2 picked fork 1.");
                }
            }
        });

        philosopher1.start();
        philosopher2.start();
    }
}