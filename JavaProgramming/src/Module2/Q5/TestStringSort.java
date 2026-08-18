import java.util.ArrayList;
import java.util.Collections;

public class TestStringSort {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Kovida");
        names.add("Tanishq");
        names.add("Pari");
        names.add("Sania");
        names.add("Alisha");

        Collections.sort(names, (a, b) -> b.compareTo(a));

        System.out.println("Strings in descending order:");
        System.out.println(names);
    }
}
