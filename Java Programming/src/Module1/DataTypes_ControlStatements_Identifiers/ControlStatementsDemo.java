public class ControlStatementsDemo {
    public static void main(String[] args) {
        int number = 2;

        if (number % 2 == 0)
            System.out.println(number + " is Even");
        else
            System.out.println(number + " is Odd");

        switch (number) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Other Number");
        }

        System.out.println("For Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
    }
}
