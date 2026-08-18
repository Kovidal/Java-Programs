final class FinalClass {
    final int value = 100;

    final void display() {
        System.out.println("Final Variable = " + value);
        System.out.println("Final Method Executed");
    }
}

public class FinalKeywordDemo {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.display();
    }
}