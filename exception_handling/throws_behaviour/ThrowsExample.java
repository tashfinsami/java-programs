package exception_handling.throws_behaviour;

public class ThrowsExample {

    // using throws is only way to handle checked exception by a caller outside the inner method
    // using throws is optional for unchecked exceptions
    static void test() throws Exception { // must use same exception class or a superclass here

        throw new Exception("Something went wrong");
    }

    public static void main(String[] args) {

        try {
            test();
        }
        catch (Exception e) { // must use same exception class or a superclass here
            System.out.println(e.getMessage());
            System.out.println("Error occured");
        }
    }
}