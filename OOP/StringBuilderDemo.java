public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");

        // Append
        sb.append(" Programming");

        // Insert
        sb.insert(5, "Language ");

        // Replace
        sb.replace(0, 4, "Core");

        // Delete
        sb.delete(5, 14);

        // Reverse
        StringBuilder reverse = new StringBuilder(sb);
        reverse.reverse();

        System.out.println("Final String : " + sb);
        System.out.println("Reversed String : " + reverse);
    }
}