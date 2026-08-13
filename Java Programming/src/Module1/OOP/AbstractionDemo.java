interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
    }
}