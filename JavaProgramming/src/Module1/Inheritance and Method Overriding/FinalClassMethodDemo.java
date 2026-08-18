class Parent {

    // Final method
    final void display() {
        System.out.println("This is a final method.");
    }
}

// Final class cannot be inherited
final class FinalClass {
    void show() {
        System.out.println("This is a final class.");
    }
}

public class FinalClassMethodDemo {
    public static void main(String[] args) {

        Parent obj1 = new Parent();
        obj1.display();

        FinalClass obj2 = new FinalClass();
        obj2.show();
    }
}
