import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class TestAgeLogging {

    private static final Logger logger =
            Logger.getLogger(TestAgeLogging.class.getName());

    static void checkAge(int age) throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above.");
        }

        System.out.println("You are eligible.");
    }

    public static void main(String[] args) {

        try {
            FileHandler fileHandler = new FileHandler("error.log", true);
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            try {
                checkAge(age);
            } catch (InvalidAgeException e) {
                System.out.println("Exception: " + e.getMessage());
                logger.severe("Invalid age entered: " + age);
            }

            sc.close();
            fileHandler.close();

        } catch (Exception e) {
            System.out.println("Logging error: " + e.getMessage());
        }
    }
}
