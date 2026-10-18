package jdbc;

//Abstract class
abstract class Shape {
 // Abstract method (no implementation)
 abstract void draw();

 // Concrete method (with implementation)
 void display() {
     System.out.println("Displaying the shape.");
 }
}

//Subclass that implements the abstract method
class Circle extends Shape {
 void draw() {
     System.out.println("Drawing a Circle.");
 }
}

//Interface for Payment Gateway
interface PaymentGateway {
 void initiatePayment(double amount);
 void confirmPayment();
}

//Another Interface for FraudDetection
interface FraudDetection {
 void checkFraud(double amount);
}

//Class implementing multiple interfaces
class PaymentSystem implements PaymentGateway, FraudDetection {
 public void initiatePayment(double amount) {
     System.out.println("Initiating payment of $" + amount);
 }

 public void confirmPayment() {
     System.out.println("Payment confirmed.");
 }

 public void checkFraud(double amount) {
     if (amount > 1000) {
         System.out.println("Warning: High value transaction! Fraud check initiated.");
     } else {
         System.out.println("Transaction value is normal.");
     }
 }
}

public class AbstractAndInterfaceExample {
 public static void main(String[] args) {
     // Abstract class and subclass
     Shape shape = new Circle();
     shape.draw();
     shape.display();

     System.out.println();

     // Implementing multiple interfaces
     PaymentSystem payment = new PaymentSystem();
     payment.initiatePayment(500);
     payment.checkFraud(500);
     payment.confirmPayment();

     System.out.println();

     payment.initiatePayment(1500);
     payment.checkFraud(1500);
     payment.confirmPayment();
 }
}

