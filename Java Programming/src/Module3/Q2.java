class Q2 implements Runnable {

    public void run() {

        String str = "MULTITHREADING";

        for (int i = str.length() - 1; i >= 0; i--) {

            System.out.println(str.charAt(i));

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {

        Q2 obj = new Q2();

        Thread t = new Thread(obj);

        t.start();
    }
}
