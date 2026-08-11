public class CharacterFrequencyDemo {
    public static void main(String[] args) {
        String str = "hello";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if character was already counted
            boolean alreadyCounted = false;

            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == ch) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (!alreadyCounted) {
                int count = 0;

                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(j) == ch) {
                        count++;
                    }
                }

                System.out.println(ch + " = " + count);
            }
        }
    }
}