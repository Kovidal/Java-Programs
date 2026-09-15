import java.io.FileReader;
import java.io.IOException;

class Q17 {

    public static void main(String[] args) {

        try {

            FileReader file = new FileReader("input.txt");

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