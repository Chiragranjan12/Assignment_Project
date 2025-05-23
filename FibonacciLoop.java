package jdbc;

public class FibonacciLoop {

	public static void main(String[] args) {
        int n = 10; // Number of terms in Fibonacci series
        int a = 0, b = 1;

        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
