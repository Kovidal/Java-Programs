abstract class Shape {

    // Abstract method
    abstract void draw();

    // Normal method
    void display() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {

    // Overriding abstract method
    @Override
    void draw() {
        System.out.println("Drawing a circle.");
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        Circle obj = new Circle();

        obj.display();
        obj.draw();
    }
}
