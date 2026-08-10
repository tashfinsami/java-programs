package class_abstraction; // separates from same set of classes in inheritance package

abstract class Animal {
    String name;

    // constructor allowed but only concrete subclass object can call it
    Animal(String name) {
        this.name = name;
    }

    // normal method allowed in abstract class
    void eat() { 
        System.out.println("Animal is eating");
    }

    // abstract method
    abstract void makeSound();

    //abstract void size(); // all inherited classes must implement all abstract methods
}

class Dog extends Animal {

    Dog(String name) {
        super(name);  // calls Animal constructor
    }

    @Override
    void makeSound() {
        System.out.println(name + "(dog) says Woof");
    }
}

class Cat extends Animal {

    Cat(String name) {
        super(name);  // calls Animal constructor
    }

    @Override
    void makeSound() {
        System.out.println(name + "(cat) says Meow");
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {

        Dog dog = new Dog("Spike");
        Cat cat = new Cat("Tom");
        //Animal animal1 = new Dog(); // allowed
        //Animal animal2 = new Cat(); // allowed
        //Animal animal3 = new Animal(); // restricted in abstract class

        dog.eat();
        dog.makeSound();

        cat.eat();
        cat.makeSound();
    }
}