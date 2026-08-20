import java.util.function.Function;

public class TestMethodReference {

    static int square(int n) {
        return n * n;
    }

    public static void main(String[] args) {

        Function<Integer, Integer> findSquare = TestMethodReference::square;

        int number = 5;

        System.out.println("Square of " + number + " is: " + findSquare.apply(number));
    }
}
