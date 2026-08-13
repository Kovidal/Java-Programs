class Test {
    public int a = 10;
    private int b = 20;
    protected int c = 30;
    int d = 40;

    void display() {
        System.out.println("Public = " + a);
        System.out.println("Private = " + b);
        System.out.println("Protected = " + c);
        System.out.println("Default = " + d);
    }
}

public class AccessModifierDemo {
    public static void main(String[] args) {
        Test t = new Test();
        t.display();
    }
}