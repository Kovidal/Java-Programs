import java.io.IOException;
import java.io.RandomAccessFile;

class Q24 {

    public static void main(String[] args) {

        try {

            RandomAccessFile file =
                    new RandomAccessFile("random.txt", "rw");

            file.writeBytes("Hello Java World");

            file.seek(6);

            file.writeBytes("Programming");

            file.close();

            System.out.println("Data written successfully.");

        } catch (IOException e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}
