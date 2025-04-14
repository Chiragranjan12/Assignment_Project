package jdbc;

public class CalculatorWithCasting {

	public static void main(String[] args) {
        int a = 10;
        int b = 3;

        // Arithmetic operations
        int sum = a + b;
        int diff = a - b;
        int prod = a * b;
        int mod = a % b;

        // Implicit type casting: int to double
        double div = a / b;             // integer division, still gives int
        double accurateDiv = (double) a / b; // explicit casting to get accurate result

        // Relational operations
        boolean isEqual = a == b;
        boolean isGreater = a > b;
        boolean isSmallerOrEqual = a <= b;

        // Output
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Product: " + prod);
        System.out.println("Integer Division: " + div);
        System.out.println("Accurate Division (with casting): " + accurateDiv);
        System.out.println("Modulus: " + mod);
        System.out.println("Is Equal: " + isEqual);
        System.out.println("Is Greater: " + isGreater);
        System.out.println("Is Smaller or Equal: " + isSmallerOrEqual);

        // Explicit type casting: double to int
        double x = 7.89;
        int y = (int) x;
        System.out.println("Explicit Casting of 7.89 to int: " + y);
    }
}
