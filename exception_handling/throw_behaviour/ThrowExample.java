package exception_handling.throw_behaviour;

public class ThrowExample {

    public static void main(String[] args) {

        int age = -5;

        if (age < 0) {
            
            // can only handle unchecked exception in this way
            throw new IllegalArgumentException( // used to manually throw an exception
                "Age cannot be negative"
            );
        }

        System.out.println("Age: " + age);
    }
}