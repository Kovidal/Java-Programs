import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Q19 {

    public static void main(String[] args) {

        try {

            BufferedWriter writer = new BufferedWriter(
                    new FileWriter("buffered.txt"));

            writer.write("Java BufferedReader and BufferedWriter Example");

            writer.close();

            BufferedReader reader = new BufferedReader(
                    new FileReader("buffered.txt"));

            String line;

            while ((line = reader.readLine()) != null) {

                System.out.println(line);
            }

            reader.close();

        } catch (IOException e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}
