package access_control;

class Vehicle {

    private void start() {
        System.out.println("Vehicle start() method");
    }

    void callStart() {
        start();
    }
}

class Car extends Vehicle {

    // this is a new method, not an override
    // @Override // restricted as private methods cannot be overridden as they are not inherited
    void start() {
        System.out.println("Car start() method");
    }
}

public class PrivateMethodScopeExample {

    public static void main(String[] args) {

        Car car = new Car();

        // calls Car's method
        car.start();

        // calls Vehicle's callStart()
        // which internally calls Vehicle's private start() (encapsulation)
        car.callStart();
    }
}