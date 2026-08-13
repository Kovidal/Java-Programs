public class ParameterizedConstructorDemo {

    int rollNo;
    String name;
    double marks;

    // Parameterized constructor
    ParameterizedConstructorDemo(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("Roll No = " + rollNo);
        System.out.println("Name = " + name);
        System.out.println("Marks = " + marks);
    }

    public static void main(String[] args) {
        ParameterizedConstructorDemo student =
                new ParameterizedConstructorDemo(30, "kovida", 95.5);

        student.display();
    }
}
