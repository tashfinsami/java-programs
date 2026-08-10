package interface_abstraction;

interface Flyable { // work as both abstraction and inheritance mechanisms

    // Flyable() { } // constructors restricted in interface

    void fly();
    
    //void rest(); //all inherited classes must implement all methods
}

/* interface Altitude implements Flyable {
    void alt();
} */ // one interface cannot implement another only can extend 

class Bird implements Flyable {

    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }
}

class Airplane implements Flyable {

    @Override
    public void fly() {
        System.out.println("Airplane is flying");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {

        Bird bird = new Bird();
        Airplane plane = new Airplane();

        bird.fly();
        plane.fly();
    }
}