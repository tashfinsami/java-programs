package exception_handling.throw_behaviour;

public class DoubleExceptionExample {

    static void test() {

        try {
            int x = 10 / 0;

            System.out.println(x);
        }
        catch (ArithmeticException e) {

            System.out.println(e.getMessage());
            System.out.println("Caught in original exception");
            // Exception caught in try catch block of inner method

            throw new RuntimeException("Something went wrong", e); // current exception ( in inner method) inserted as cause of the later exception ( in caller method)
            // will be caught in try catch block of caller method

        }
    }

    public static void main(String[] args) {

        try {
            test();
        }
        catch (RuntimeException e) {

            System.out.println(e.getMessage()); // message in exception inserted in 'throw new RuntimeException(message, cause)'
            System.out.println(e.getCause().getMessage()); // cause of exception inserted in 'throw new RuntimeException(message, cause)'
            System.out.println("Caught again in main");
            // caught RuntimeException thrown by called method           
        }
    }
}