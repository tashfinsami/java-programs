package exception_handling.try_catch_finally_block_behaviour;

public class TryCatchFinallyExample {

    public static void main(String[] args) {

        // error occurs in try block
        try {
            
            int result = 10 / 0; // stops where error occured
            System.out.println("test");
            System.out.println(result);
        }

        // error handled in catch block
        catch (Exception e) { // Exception -> catches all types of exceptions // e -> reference to Exception object, not fixed name, can be named anything
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace()); // stack trace records the call path leading to the exception
            System.out.println("Error occurred");
        }

        // further execution happens in finally block
        finally {
            System.out.println("Finally executed");
        }

        // catch and finally both optional but at least one must be included
    }
}