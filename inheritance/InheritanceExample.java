package inheritance; // separates from same set of classes in abstraction package

class Animal {

    String name;

    Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + " is eating");
    }
}

class Dog extends Animal {

    Dog(String name) {
        super(name);
    }

    void bark() {
        System.out.println(name + " says Woof");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {

        Dog dog = new Dog("Tom");

        dog.eat();   // inherited from Animal
        dog.bark();  // Dog's own method

        // other use cases
        Animal animal = new Dog("Spike"); // allowed as Dog is an example of Animal (parent child IS-A relation maintained)
        animal.eat(); // allowed as Animal class (reference type) contains eat()
        // animal.bark(); //restriced as Animal class (reference type) does not contain bark()

        // Dog dog = new Animal("Tim"); // restricted as Animal is not necessarily an example of Dog (parent child IS-A relation broken)
    }
}