public class IdentifierDemo {
    public static void main(String[] args) {

        // Valid Identifiers
        int age = 20;
        int student_ID = 101;
        int $salary = 50000;
        int _marks = 95;

        System.out.println("Valid Identifiers:");
        System.out.println("age = " + age);
        System.out.println("student_ID = " + student_ID);
        System.out.println("$salary = " + $salary);
        System.out.println("_marks = " + _marks);

        System.out.println("\nInvalid Identifiers (Examples):");
        System.out.println("1name");
        System.out.println("student-name");
        System.out.println("class");
        System.out.println("my name");
    }
}
