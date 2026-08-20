public class TestException {

    public static void main(String[] args) {

        // try-catch
        try {
            int a = 10;
            int b = 0;
            int result = a / b;

            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Try-Catch: Cannot divide by zero.");
        }

        // try-catch-finally
        try {
            int a = 20;
            int b = 0;
            int result = a / b;

            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Try-Catch-Finally: Cannot divide by zero.");
        } finally {
            System.out.println("Finally block is always executed.");
        }
    }
}
