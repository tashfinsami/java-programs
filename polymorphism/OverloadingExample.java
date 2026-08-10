package polymorphism;

class Calculator {

    int x;
    int y;
    int z;

    // Constructor 1
    Calculator() {
        x = 0;
        y = 0;
        z = 0;
    }

    // Constructor 2
    Calculator(int x, int y) {
        this.x = x;
        this.y = y;
        z = 0;
    }

    // Constructor 3
    Calculator(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Method overloading 1
    int add(int a, int b) {
        return a * x + b * y;
    }

    // Method overloading 2
    int add(int a, int b, int c) {
        return a * x + b * y + c * z;
    }

    // Method overloading 3
    double add(double a, double b) {
        return a * x + b * y;
    }
}

public class OverloadingExample {
    public static void main(String[] args) {

        // Constructor overloading
        Calculator c1 = new Calculator();
        Calculator c2 = new Calculator(10, 20);
        Calculator c3 = new Calculator(10, 20, 30);

        // Method overloading
        System.out.println(c1.add(2, 3));
        System.out.println(c2.add(2.5, 3.5));
        System.out.println(c3.add(2, 3, 4));
    }
}