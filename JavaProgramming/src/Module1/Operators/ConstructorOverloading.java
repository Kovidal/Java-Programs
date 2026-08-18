public class ConstructorOverloading {

    int id;
    String name;

    // Default constructor
    ConstructorOverloading() {
        id = 0;
        name = "Unknown";
    }

    // Parameterized constructor
    ConstructorOverloading(int i, String n) {
        id = i;
        name = n;
    }

    // Constructor with one parameter
    ConstructorOverloading(int i) {
        id = i;
        name = "Student";
    }

    void display() {
        System.out.println("ID = " + id + ", Name = " + name);
    }

    public static void main(String[] args) {
        ConstructorOverloading obj1 = new ConstructorOverloading();
        ConstructorOverloading obj2 = new ConstructorOverloading(101);
        ConstructorOverloading obj3 = new ConstructorOverloading(102, "Rahul");

        obj1.display();
        obj2.display();
        obj3.display();
    }
}