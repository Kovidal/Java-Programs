import java.util.Scanner;

public class PrimeWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int i = 2;
        boolean prime = true;

        while (i <= n / 2) {
            if (n % i == 0) {
                prime = false;
                break;
            }
            i++;
        }

        if (n <= 1)
            prime = false;

        if (prime)
            System.out.println(n + " is Prime");
        else
            System.out.println(n + " is Not Prime");

        sc.close();
    }
}
