package exception_handling.checked_exception_handling;

import java.io.FileReader;
import java.io.FileNotFoundException;

public class CheckedExceptionThrowsExample {

    static void openFile() throws FileNotFoundException { // must use same exception class or a superclass here

        FileReader file = 
            new FileReader("test.txt"); // FileReader constructor internally throws FileNotFoundException

        System.out.println(file);
    }

    public static void main(String[] args) {

        try {
            openFile();
        }
        // checked exception must be catched somewhere in program
        catch (FileNotFoundException e) { // must use same exception class or a superclass here

            System.out.println(e.getMessage());
            System.out.println("File not found...");
        }
    }
}