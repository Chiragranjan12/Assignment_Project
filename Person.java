package jdbc;

public class Person1 {

	
	    String name;
	    int age;

	    // Constructor 1: Parameterized constructor with name and age
	    public Person1(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    // Constructor 2: Overloaded with only name
	    public Person1(String name) {
	        this.name = name;
	        this.age = 0; // default age
	    }

	    // Constructor 3: Overloaded with only age
	    public Person1(int age) {
	        this.name = "Unknown";
	        this.age = age;
	    }

	    // Method to display person details
	    public void showDetails() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	    }

	    // Main method to test
	    public static void main(String[] args) {
	        // Using different constructors
	        Person p1 = new Person("Alice", 22);
	        Person p2 = new Person("Bob");
	        Person p3 = new Person(30);

	        // Displaying details
	        System.out.println("Person 1:");
	        p1.showDetails();

	        System.out.println("\nPerson 2:");
	        p2.showDetails();

	        System.out.println("\nPerson 3:");
	        p3.showDetails();
	    }
	}


