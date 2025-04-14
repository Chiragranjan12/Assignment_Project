package jdbc;

import java.io.*;

//Demonstrating FileReader and FileWriter for reading and writing content to a file
class FileOperations {
 public static void writeToFile(String filename, String content) {
     try (FileWriter writer = new FileWriter(filename)) {
         writer.write(content);
         System.out.println("Content written to file.");
     } catch (IOException e) {
         System.out.println("An error occurred while writing to the file: " + e.getMessage());
     }
 }

 public static void readFromFile(String filename) {
     try (FileReader reader = new FileReader(filename)) {
         int i;
         while ((i = reader.read()) != -1) {
             System.out.print((char) i);
         }
         System.out.println();
     } catch (IOException e) {
         System.out.println("An error occurred while reading the file: " + e.getMessage());
     }
 }

 public static void readFileLineByLine(String filename) {
     try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
         String line;
         while ((line = reader.readLine()) != null) {
             System.out.println(line);
         }
     } catch (IOException e) {
         System.out.println("An error occurred while reading the file line by line: " + e.getMessage());
     }
 }
}

//Demonstrating Object Serialization and Deserialization
class Person implements Serializable {
 private static final long serialVersionUID = 1L;
 String name;
 int age;

 public Person(String name, int age) {
     this.name = name;
     this.age = age;
 }

 @Override
 public String toString() {
     return "Person{name='" + name + "', age=" + age + "}";
 }
}

public class FileAndSerializationDemo {
 public static void main(String[] args) {
     // File writing and reading demonstration
     String filename = "example.txt";
     String content = "Hello, this is a test file!\nThis is the second line of the file.";
     
     // Write to file
     FileOperations.writeToFile(filename, content);
     
     // Read from file
     System.out.println("Reading from file using FileReader:");
     FileOperations.readFromFile(filename);

     // Read file line by line using BufferedReader
     System.out.println("\nReading file line by line using BufferedReader:");
     FileOperations.readFileLineByLine(filename);

     // Object Serialization and Deserialization
     String serializedFile = "person.ser";

     // Create a Person object and serialize it
     Person person = new Person("Alice", 30);
     try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(serializedFile))) {
         out.writeObject(person);
         System.out.println("\nObject serialized and saved to file: " + serializedFile);
     } catch (IOException e) {
         System.out.println("Error serializing object: " + e.getMessage());
     }

     // Deserialize the Person object
     try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(serializedFile))) {
         Person deserializedPerson = (Person) in.readObject();
         System.out.println("\nObject deserialized: " + deserializedPerson);
     } catch (IOException | ClassNotFoundException e) {
         System.out.println("Error deserializing object: " + e.getMessage());
     }
 }
}

