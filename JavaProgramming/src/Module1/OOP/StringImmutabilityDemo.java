public class StringImmutabilityDemo {
    public static void main(String[] args) {
        String str1 = "Java";

        System.out.println("Original String : " + str1);

        // Creates a new object instead of modifying the original one
        str1.concat(" Programming");

        System.out.println("After concat() without assignment : " + str1);

        // Assigning the new object
        str1 = str1.concat(" Programming");

        System.out.println("After concat() with assignment : " + str1);
    }
}