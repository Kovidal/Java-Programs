public class StaticNonStaticDemo {

    // Static method
    static void staticMethod() {
        System.out.println("This is a static method.");
    }

    // Non-static method
    void nonStaticMethod() {
        System.out.println("This is a non-static method.");
    }

    public static void main(String[] args) {

        // Calling static method directly
        staticMethod();

        // Creating object to call non-static method
        StaticNonStaticDemo obj = new StaticNonStaticDemo();
        obj.nonStaticMethod();
    }
}
