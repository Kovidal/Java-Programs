public class ConstructorOverloadingDemo {

    int id;
    String name;

    // Default constructor
    ConstructorOverloadingDemo() {
        id = 0;
        name = "Unknown";
    }

    // One-parameter constructor
    ConstructorOverloadingDemo(int id) {
        this.id = id;
        this.name = "Unknown";
    }

    // Two-parameter constructor
    ConstructorOverloadingDemo(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("ID = " + id + ", Name = " + name);
    }

    public static void main(String[] args) {
        ConstructorOverloadingDemo obj1 = new ConstructorOverloadingDemo();
        ConstructorOverloadingDemo obj2 = new ConstructorOverloadingDemo(101);
        ConstructorOverloadingDemo obj3 = new ConstructorOverloadingDemo(102, "Rahul");

        obj1.display();
        obj2.display();
        obj3.display();
    }
}