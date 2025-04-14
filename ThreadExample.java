package jdbc;

//Creating a custom Thread class
class CounterThread extends Thread {
 private int count;

 public CounterThread(String name) {
     super(name);
     this.count = 0;
 }

 @Override
 public void run() {
     synchronized (this) {
         while (count < 5) {
             try {
                 // Simulate work
                 System.out.println(Thread.currentThread().getName() + " - Count: " + count);
                 count++;
                 // Notify other thread waiting on the same object
                 notify();
                 // Make the current thread wait
                 if (count < 5) {
                     wait();
                 }
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
         }
     }
 }
}

//Main class to create and run threads
public class ThreadExample {
 public static void main(String[] args) throws InterruptedException {
     CounterThread thread1 = new CounterThread("Thread 1");
     CounterThread thread2 = new CounterThread("Thread 2");

     // Start threads
     thread1.start();
     thread2.start();

     // Wait for both threads to finish
     thread1.join();
     thread2.join();
 }
}

