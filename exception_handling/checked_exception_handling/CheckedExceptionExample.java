package exception_handling.checked_exception_handling;

import java.io.FileReader;
import java.io.FileNotFoundException;

public class CheckedExceptionExample {

    public static void main(String[] args) {

        try {

            FileReader file =
                new FileReader("test.txt"); // FileReader constructor internally throws FileNotFoundException

            System.out.println(file);

        }
        // checked exception must be catched somewhere in program
        catch (FileNotFoundException e) { // FileNotFoundException -> checked exception

            System.out.println(e.getMessage());
            System.out.println("File not found");
        }
    }
}