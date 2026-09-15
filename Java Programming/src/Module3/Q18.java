import java.io.FileWriter;
import java.io.IOException;

class Q18 {

    public static void main(String[] args) {

        try {

            FileWriter file = new FileWriter("example.txt");

            file.write("Java FileWriter Example");

            file.close();

            System.out.println("Data written successfully.");

        } catch (IOException e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}
