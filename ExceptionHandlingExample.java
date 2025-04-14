package jdbc;

//Custom Exception Class
class InvalidAgeException extends Exception {
 public InvalidAgeException(String message) {
     super(message);
 }
}

public class ExceptionHandlingExample {

 public static void main(String[] args) {
     // Example 1: Multiple catch blocks for different types of exceptions
     try {
         int[] arr = new int[5];
         arr[6] = 10;  // ArrayIndexOutOfBoundsException

     } catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
     } catch (ArithmeticException e) {
         System.out.println("ArithmeticException caught: " + e.getMessage());
     } catch (Exception e) {
         System.out.println("Generic exception caught: " + e.getMessage());
     } finally {
         System.out.println("Finally block for array exception executed.");
     }

     // Example 2: Using a custom exception
     try {
         checkAge(15);  // Will throw InvalidAgeException
     } catch (InvalidAgeException e) {
         System.out.println("Caught custom exception: " + e.getMessage());
     } finally {
         System.out.println("Finally block for custom exception executed.");
     }
 }

 // Method to demonstrate custom exception
 static void checkAge(int age) throws InvalidAgeException {
     if (age < 18) {
         throw new InvalidAgeException("Age must be 18 or older to proceed.");
     } else {
         System.out.println("Age is valid: " + age);
     }
 }
}

