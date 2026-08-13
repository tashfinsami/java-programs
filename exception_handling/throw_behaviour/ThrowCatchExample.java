package exception_handling.throw_behaviour;

public class ThrowCatchExample {

    public static void main(String[] args) {

        try {

            int age = -5;

            if (age < 0) {
                throw new IllegalAccessException(
                    "Age cannot be negative."
                );
            }

        }
        catch (IllegalAccessException e) { // must use same exception class or a superclass here

            System.out.println(e.getMessage());
            System.out.println("Error occured");
        }
        // unchecked throw handled by try catch block if defined, otherwise handled without try catch block
        // checked throw must be handled by try catch block
    }
}