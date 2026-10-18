package jdbc;

//Parent class
class Vehicle {
 String type;

 // Constructor
 Vehicle(String type) {
     this.type = type;
     System.out.println("Vehicle constructor called");
 }

 // Method to be overridden
 void start() {
     System.out.println("Vehicle is starting");
 }

 void showType() {
     System.out.println("Vehicle type: " + type);
 }
}

//Child class using inheritance and overriding
class Car extends Vehicle {

 // Constructor
 Car(String type) {
     super(type); // Call parent class constructor
     System.out.println("Car constructor called");
 }

 // Overriding the method
 @Override
 void start() {
     super.start(); // Call parent method
     System.out.println("Car is starting with a key");
 }
}

//Main class to run the program
public class InheritanceExample {
 public static void main(String[] args) {
     Vehicle v = new Vehicle("Generic Vehicle");
     v.start();

     System.out.println();

     Vehicle myCar = new Car("Sedan"); // Runtime Polymorphism
     myCar.start();                    // Calls overridden method in Car
     myCar.showType();                 // Inherited method from Vehicle
 }
}

