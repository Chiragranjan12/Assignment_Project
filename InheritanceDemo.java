package jdbc;

//Parent class
class Animal {
 void sound() {
     System.out.println("Animal makes a sound");
 }
}

//Single Inheritance: Dog extends Animal
class Dog extends Animal {
 void bark() {
     System.out.println("Dog barks");
 }

 // Overriding the sound() method
 @Override
 void sound() {
     System.out.println("Dog says: Woof!");
 }
}

//Multilevel Inheritance: Puppy extends Dog
class Puppy extends Dog {
 void weep() {
     System.out.println("Puppy weeps");
 }

 // Overriding sound() method again
 @Override
 void sound() {
     System.out.println("Puppy says: Yip!");
 }
}

public class InheritanceDemo {
 public static void main(String[] args) {

     // Single Inheritance
     Dog d = new Dog();
     System.out.println("Single Inheritance:");
     d.bark();       // Dog class
     d.sound();      // Overridden method

     // Multilevel Inheritance
     Puppy p = new Puppy();
     System.out.println("\nMultilevel Inheritance:");
     p.weep();       // Puppy class
     p.bark();       // Inherited from Dog
     p.sound();      // Overridden by Puppy

     // Polymorphism using method overriding
     Animal a;
     a = new Puppy(); // Reference of parent, object of child
     System.out.println("\nPolymorphism in Action:");
     a.sound(); // Executes Puppy’s overridden method
 }
}


