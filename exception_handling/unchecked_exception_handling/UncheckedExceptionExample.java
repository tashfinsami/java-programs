package exception_handling.unchecked_exception_handling;

public class UncheckedExceptionExample {

    public static void main(String[] args) {

        int x = 10;
        int y = 0;

        System.out.println(x / y);
        // unchecked exception no need to be caught as catching unchecked exception optional
        // compiler automatically handles it
    }
}

/* common unchecked exceptions
        ArithmeticException
        NullPointerException
        ArrayIndexOutOfBoundsException
        IllegalArgumentException
*/