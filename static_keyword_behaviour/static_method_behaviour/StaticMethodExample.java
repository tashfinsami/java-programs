package static_keyword_behaviour.static_method_behaviour;

class Geometry {

    static int slope = 2;

    static int line(int x, int c) {

        // static method can directly access static variable 
        // as both belong to class
        return slope * x + c; 
    }

    int radius;

    static double circle(Geometry g, int x) {

        // static method cannot directly access instance variable
        // as compiler cannot determine instance variable belongs to which object
        // object needed as method parameter to access instance variable inside static method
        return Math.sqrt(g.radius * g.radius - x * x);

        // static method also cannot use this keyword
        // as this keyword refers to current object but static method has no current object as it belongs to the class
        //return Math.sqrt(g.radius * g.radius - this.x * this.x); // restricted

    }

    // however instance method can access both instance and static variables directly
    /* static int x = 1;
    double circle() {

        return Math.sqrt(radius * radius - x * x); // allowed
    } */
}

public class StaticMethodExample {

    public static void main(String[] args) {

        // static method can be accessed without object as it belongs to the class
        int yLine = Geometry.line(10, 5);

        System.out.println(yLine);

        // technically possible to access static method with object but not recommended
        Geometry obj = new Geometry();
        int yLine2 = obj.line(10, 5);


        // object needed to be passed as method argument to use instance variable inside static method
        Geometry g = new Geometry();

        g.radius = 10;

        // object passed as method argument but method itself accessed without any object
        double yCircle = Geometry.circle(g, 2);

        System.out.println(yCircle);
    }
}