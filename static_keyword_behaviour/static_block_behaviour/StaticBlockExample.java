package static_keyword_behaviour.static_block_behaviour;

class Test {

    // static method executes during class initialization no matter where placed
    static {

        System.out.println("Static block 1 of test class");
    }

    Test() {

        System.out.println("Constructor of test class");
    }
    // static method executes during class initialization no matter where placed
    static {
        
        System.out.println("Static block 2 of test class");
    }
}

public class StaticBlockExample {

    // static method executes during class initialization no matter where placed
    // even before main method if present in main class
    static {

        System.out.println("Static block 1 of main class");
    }

    public static void main(String[] args) {

        System.out.println("Main method");

        // static block runs only once per class initialization
        // no matter how many objects created
        Test t1 = new Test();
        Test t2 = new Test();
        Test t3 = new Test();
    }

    // static method executes during class initialization no matter where placed
    // even before main method if present in main class
    static {

        System.out.println("Static block 2 of main class");
    }
}