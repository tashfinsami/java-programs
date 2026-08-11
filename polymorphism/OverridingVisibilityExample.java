package polymorphism;

class Vehicle {

    // protected method
    protected void start() {
        System.out.println("Vehicle is starting");
    }
}

/*class Bus extends Vehicle {

    // Reduced visibility: protected → default
    // Visibility of inherited method (overriding) cannot be reduced
    @Override
    void start() {
        System.out.println("Bus is starting");
    }
}*/

class Car extends Vehicle {

    // Increased visibility: protected → public
    // Visibility of inherited method (overriding) must be similar or increased
    @Override
    public void start() {
        System.out.println("Car is starting");
    }
}

public class OverridingVisibilityExample {

    public static void main(String[] args) {

        Car car = new Car();

        car.start();

        // Bus bus = new Bus();

        // bus.start();
        
    }
}