package exception_handling.try_catch_finally_block_behaviour;

public class NestedExceptionExample {

    public static void main(String[] args) {

        try {

            System.out.println("Outer try starts");

            try {

                System.out.println("Inner try starts");
                int result = 10 / 0; // inner try execution stops here
                System.out.println(result);
            }

            // inner catch successfully handled exception
            // outer catch no longer executed
            /* catch (ArithmeticException e) { 

                System.out.println("Inner catch");
            } */

            // inner catch failed to handle exception
            // outer catch executed immediately after inner finally if present
            catch (IllegalArgumentException e) { 

                System.out.println("Inner catch");
            } 

            // always executed
            finally {

                System.out.println("Inner finally");
            }

            // executed only if inner catch handled exception successfully
            // otherwise omitted
            System.out.println("Outer try continues");

        }

        // executed only if inner catch missing or failed to handle exception
        catch (Exception e) { // no need to maintain exception class hierarchy here

            System.out.println("Outer catch");
        }

        // always executed
        finally {

            System.out.println("Outer finally");
        }
        
        // executed only if one of inner or outer catches handled exception successfully
        // otherwise omitted
        System.out.println("Program continues");
    }
}