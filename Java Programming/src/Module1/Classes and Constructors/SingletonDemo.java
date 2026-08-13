public class SingletonDemo {

    // Private static instance
    private static SingletonDemo instance;

    // Private constructor
    private SingletonDemo() {
        System.out.println("Singleton object created.");
    }

    // Public static method to get the instance
    public static SingletonDemo getInstance() {
        if (instance == null) {
            instance = new SingletonDemo();
        }
        return instance;
    }

    void display() {
        System.out.println("This is a Singleton class.");
    }

    public static void main(String[] args) {

        // Getting the Singleton object
        SingletonDemo obj1 = SingletonDemo.getInstance();
        SingletonDemo obj2 = SingletonDemo.getInstance();

        obj1.display();

        // Checking whether both references point to the same object
        if (obj1 == obj2) {
            System.out.println("Both objects are the same.");
        } else {
            System.out.println("Objects are different.");
        }
    }
}
