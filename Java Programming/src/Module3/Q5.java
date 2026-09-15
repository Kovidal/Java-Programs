class Q5 {

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            System.out.println("Worker-1");
        });

        Thread t2 = new Thread(() -> {
            System.out.println("Worker-2");
        });

        Thread t3 = new Thread(() -> {
            System.out.println("Worker-3");
        });

        t1.setPriority(Thread.MIN_PRIORITY);   // Priority 1
        t2.setPriority(Thread.NORM_PRIORITY);  // Priority 5
        t3.setPriority(Thread.MAX_PRIORITY);   // Priority 10

        t1.start();
        t2.start();
        t3.start();
    }
}
