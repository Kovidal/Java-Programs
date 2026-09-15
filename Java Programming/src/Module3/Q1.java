class Q1 extends Thread {

    public void run() {

        for (int i = 2; i <= 20; i += 2) {

            System.out.println(i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {

        Q1 t = new Q1();

        t.start();
    }
}