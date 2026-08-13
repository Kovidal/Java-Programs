class Animal {
    void sound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks.");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows.");
    }
}

public class RuntimePolymorphismDemo {
    public static void main(String[] args) {

        Animal obj;

        // Parent reference refers to Dog object
        obj = new Dog();
        obj.sound();

        // Parent reference refers to Cat object
        obj = new Cat();
        obj.sound();
    }
}
