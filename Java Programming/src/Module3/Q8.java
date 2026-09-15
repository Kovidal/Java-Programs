class Q8 {

    static int inventory = 10;

    public static void updateInventory(String name, int quantity) {

        synchronized (Q8.class) {

            System.out.println(name + " is updating inventory...");

            inventory += quantity;

            System.out.println(name + " added " + quantity + " items.");
            System.out.println("Current inventory: " + inventory);

        }
    }

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            updateInventory("Thread 1", 5);
        });

        Thread t2 = new Thread(() -> {
            updateInventory("Thread 2", 10);
        });

        t1.start();
        t2.start();
    }
}
