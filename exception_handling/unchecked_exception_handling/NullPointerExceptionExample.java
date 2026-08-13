package exception_handling.unchecked_exception_handling;

public class NullPointerExceptionExample {

    public static void main(String[] args) {

        try {

            String name = null;

            System.out.println(name.length()); // a very common unchecked exception

        }
        catch (NullPointerException e) { // catching NullPointerException optional

            System.out.println(e.getMessage());
            System.out.println("Name is null");
        }
    }
}