import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class Q22 {

    public static void main(String[] args) {

        try {

            FileInputStream input = new FileInputStream("input.txt");
            FileOutputStream output = new FileOutputStream("copy.txt");

            int data;

            while ((data = input.read()) != -1) {
                output.write(data);
            }

            input.close();
            output.close();

            System.out.println("File copied successfully.");

        } catch (IOException e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}
