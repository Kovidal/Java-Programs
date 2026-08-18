class Calculator {

    // Method Overloading
    void add(int a, int b) {
        System.out.println("Integer Sum = " + (a + b));
    }

    void add(double a, double b) {
        System.out.println("Double Sum = " + (a + b));
    }
}

class Parent {
    void display() {
        System.out.println("Parent Method");
    }
}

class Child extends Parent {

    // Method Overriding
    @Override
    void display() {
        System.out.println("Child Method");
    }
}

public class OverloadingOverridingDemo {
    public static void main(String[] args) {

        Calculator c = new Calculator();

        c.add(10, 20);
        c.add(10.5, 20.5);

        Child obj = new Child();
        obj.display();
    }
}