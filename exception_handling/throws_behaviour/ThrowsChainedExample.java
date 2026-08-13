package exception_handling.throws_behaviour;

public class ThrowsChainedExample {

    // exception handling can be propagated by chain of methods by using throws
    static void method3() throws Exception { // must use same exception class or a superclass here
        throw new Exception("Something went wrong.");
    }

    static void method2() throws Exception { // must use same exception class or a superclass here
        method3();
    }

    static void method1() throws Exception { // must use same exception class or a superclass here
        method2();
    }

    // exception type can also be changed while propagating
    /* static void method1() throws RuntimeException { // RuntimeException here not related to Exception in catch, only related to RuntimeException in throw
        try {                                        // must use same exception class or a superclass here (related to RuntimeException in throw)
            method2();
        }
        catch (Exception e) { 
            throw new RuntimeException("Converted error", e);
        }
    } */

    public static void main(String[] args) {

        try {
            method1();
        }
        catch (Exception e) { // must use same exception class or a superclass here

            System.out.println(e.getMessage());
            System.out.println("Error propagated by chain of methods");
        }
    }
}