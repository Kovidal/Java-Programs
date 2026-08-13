class Parent {
    String name = "Parent";

    void display() {
        System.out.println("Parent Method");
    }
}

class Child extends Parent {
    String name = "Child";

    void show() {
        System.out.println("Using this: " + this.name);
        System.out.println("Using super: " + super.name);

        this.displayChild();
        super.display();
    }

    void displayChild() {
        System.out.println("Child Method");
    }
}

public class ThisSuperDemo {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}