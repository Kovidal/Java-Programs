public class PrimitiveDataTypes {
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    char c;
    boolean bool;

    public static void main(String[] args) {
        PrimitiveDataTypes obj = new PrimitiveDataTypes();

        System.out.println("byte = " + obj.b);
        System.out.println("short = " + obj.s);
        System.out.println("int = " + obj.i);
        System.out.println("long = " + obj.l);
        System.out.println("float = " + obj.f);
        System.out.println("double = " + obj.d);
        System.out.println("char = " + (int) obj.c);
        System.out.println("boolean = " + obj.bool);
    }
}
