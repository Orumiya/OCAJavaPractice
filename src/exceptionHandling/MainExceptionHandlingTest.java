package exceptionHandling;

import java.io.File;
import java.io.IOException;

public class MainExceptionHandlingTest {
    public static void main(String[] args) {

        //java.lang.ArrayIndexOutOfBoundsException
        int[] numbers = new int[] {1,2,3};
        // System.out.println(numbers[5]);

        //java.lang.ClassCastException
        Shirt sh = new Shirt();
        Trousers t = new Trousers();
        Clothing c = new Shirt();
       // ((Trousers)c).display();

        //java.lang.NullPointerException
        Shirt[] shirts = new Shirt[2];
        // shirts[0].display();

        //java.lang.ArithmeticException
       // double num = 3 / 0;

        /**
         * Exceptions are subclass of THROWABLE
         * THROWABLE main subclasses:
         * Error / Exception
         * Error : unrecoverable external error UNCHECKED  (OutOfMemoryError - végtelen ciklusnál pl)
         * Exception : recoverable error (CHECKED: must be caught or thrown)
         *  --RuntimeException : usually caused by programming mistake UNCHECKED (and it's a SUBCLASS of Exception!!!)
          */

        // TRY-CATCH
        try{
            throw new Exception("woohoo");
        } catch (Exception e) {
            System.out.println("Exception handled: " + e.getMessage());
        }

        // THROW
        try{
            doRiskyCode();
        } catch (Exception e) {
            System.out.println("Exception handled: " + e.getMessage());
        }

        // CHECKED EXCEPTION
        try{

            testCheckedException();
        } catch (IOException e) {
            System.out.println("exception caught: " + e);
        }


    }

    public static void doRiskyCode() throws myException {
        System.out.println("risky part");
        throw new myException("exception from risky code");
    }

    public static void testCheckedException() throws IOException {
        File testfile = new File("//testFile.txt");
        testfile.createNewFile();
        System.out.println("testfile exists: " + testfile.exists());
    }
}

// creating custom exceptions
class myException extends Exception {

    String message;
    public myException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
