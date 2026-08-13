package exception_handling.try_catch_finally_block_behaviour;

public class MultipleCatchExample {

    public static void main(String[] args) {

        try {

            int[] numbers = {10, 20, 30};

            System.out.println(numbers[5]); // 1st error (catched)

            int x = 10 / 0; // 2nd error (not catched)

            System.out.println(x);

            // stops catching the first error

        }
        catch (ArithmeticException e) { // specific exceptions first as only first matched catch will be processed
            System.out.println(e.getMessage());
            System.out.println("Arithmetic problem");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            System.out.println("Invalid array index");
        }
        catch (Exception e) { // general exceptions later
            System.out.println(e.getMessage());
            System.out.println("Invalid array index");
        }
    }
}