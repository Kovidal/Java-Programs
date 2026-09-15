import java.io.FileOutputStream;
import java.io.IOException;

class Q16 {

    public static void main(String[] args) {

        try {

            FileOutputStream file = new FileOutputStream("output.txt");

            String text = "Java I/O Streams Example";

            file.write(text.getBytes());

            file.close();

            System.out.println("Data written successfully.");

        } catch (IOException e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}
