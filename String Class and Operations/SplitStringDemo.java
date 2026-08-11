public class SplitStringDemo {
    public static void main(String[] args) {
        String str = "Java is a powerful language";

        String[] words = str.split(" ");

        System.out.println("Words:");

        for (String word : words) {
            System.out.println(word);
        }
    }
}