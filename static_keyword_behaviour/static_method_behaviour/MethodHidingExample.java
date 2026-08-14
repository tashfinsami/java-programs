package static_keyword_behaviour.static_method_behaviour;

class Animal {

    static void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    // static method can be hidden not overriden
    // parent class or child class method of same name selected based on reference type
    // @Override // static method cannot be overriden // restricted
    static void sound() {
        System.out.println("Dog says Woof");
    }
}

public class MethodHidingExample {

    public static void main(String[] args) {

        // use of method hiding
        Animal a = new Dog();

        // parent class (Animal) sound() method accessed even though object belongs to child class (Dog)
        // as parent class (Animal) used as reference type 
        a.sound();

        // method hiding not needed
        Dog d = new Dog();

        // child class (Dog) sound() method accessed
        // as child class (Dog) used as reference type (expected behaviour)
        d.sound();
    }
}