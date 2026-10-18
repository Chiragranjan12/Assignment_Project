package jdbc;

public class Student {
    // Attributes (Encapsulation: private)
    private String name;
    private int age;

    // Default constructor
    public Student() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Constructor with one parameter
    public Student(String name) {
        this.name = name;
        this.age = 0;
    }

    // Constructor with both parameters
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters and Setters (Encapsulation)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Main method to test
    public static void main(String[] args) {
        
        Student s1 = new Student();                
        Student s2 = new Student("Raj");           
        Student s3 = new Student("Simran", 20);    

        System.out.println("Student 1:");
        s1.displayDetails();

        System.out.println("\nStudent 2:");
        s2.displayDetails();

        System.out.println("\nStudent 3:");
        s3.displayDetails();

        // Using setters to change data
        s1.setName("Amit");
        s1.setAge(18);
        System.out.println("\nStudent 1 (after using setters):");
        s1.displayDetails();
    }
}

