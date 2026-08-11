class Parent {
    void display() {
        System.out.println("This is the parent class method.");
    }
}

class Child extends Parent {
    @Override
    void display() {
        System.out.println("This is the child class method.");

        // Calling parent class method
        super.display();
    }
}

public class MethodOverridingSuperDemo {
    public static void main(String[] args) {
        Child obj = new Child();

        obj.display();
    }
}