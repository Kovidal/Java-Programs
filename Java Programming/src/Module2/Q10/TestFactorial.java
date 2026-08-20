import java.util.Scanner;

public class TestFactorial {

    static long factorial(int n) throws Exception {

        if (n < 0) {
            throw new Exception("Factorial is not defined for negative numbers.");
        }

        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        try {
            long result = factorial(number);
            System.out.println("Factorial of " + number + " is: " + result);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}