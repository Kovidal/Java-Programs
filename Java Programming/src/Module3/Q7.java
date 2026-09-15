class Q7 {

    static int tickets = 5;

    static synchronized void bookTicket(String name) {

        if (tickets > 0) {

            System.out.println(name + " is booking a ticket...");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            tickets--;

            System.out.println(name + " booked a ticket.");
            System.out.println("Tickets remaining: " + tickets);

        } else {

            System.out.println(name + ": No tickets available.");
        }
    }

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> bookTicket("Person 1"));
        Thread t2 = new Thread(() -> bookTicket("Person 2"));
        Thread t3 = new Thread(() -> bookTicket("Person 3"));
        Thread t4 = new Thread(() -> bookTicket("Person 4"));
        Thread t5 = new Thread(() -> bookTicket("Person 5"));
        Thread t6 = new Thread(() -> bookTicket("Person 6"));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
    }
}
