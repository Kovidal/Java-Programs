public class StringImmutabilityDemo {
    public static void main(String[] args) {
        String str = "Hello";

        System.out.println("Original String = " + str);

        str.concat(" World");

        System.out.println("After concat without assignment = " + str);

        str = str.concat(" World");

        System.out.println("After assigning the result = " + str);
    }
}

