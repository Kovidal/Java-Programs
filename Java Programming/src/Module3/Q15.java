import java.io.FileInputStream;
import java.io.IOException;

class Q15 {

    public static void main(String[] args) {

        try {

            FileInputStream file = new FileInputStream("input.txt");

            int data;

            while ((data = file.read()) != -1) {

                System.out.print((char) data);
            }

            file.close();

        } catch (IOException e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}
