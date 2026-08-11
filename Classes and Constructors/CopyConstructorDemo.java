public class CopyConstructorDemo {

    int id;
    String name;

    // Parameterized constructor
    CopyConstructorDemo(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Copy constructor
    CopyConstructorDemo(CopyConstructorDemo obj) {
        this.id = obj.id;
        this.name = obj.name;
    }

    void display() {
        System.out.println("ID = " + id + ", Name = " + name);
    }

    public static void main(String[] args) {
        CopyConstructorDemo obj1 = new CopyConstructorDemo(101, "Rahul");

        // Creating a copy of obj1
        CopyConstructorDemo obj2 = new CopyConstructorDemo(obj1);

        System.out.println("Original Object:");
        obj1.display();

        System.out.println("Copied Object:");
        obj2.display();
    }
}
