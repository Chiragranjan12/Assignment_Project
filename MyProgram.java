package jdbc;

public class MyProgram {

	public int max(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }

    // Method overloading for double
    public double max(double a, double b, double c) {
        double max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }

    // Static variable
    static int count = 0;

    // Static method
    public static void incrementCount() {
        count++;
        System.out.println("Count is now: " + count);
    }

    // Main method to test
    public static void main(String[] args) {
        MyProgram obj = new MyProgram();

        // Testing max methods
        int maxInt = obj.max(10, 20, 15);
        double maxDouble = obj.max(3.5, 6.7, 2.8);

        System.out.println("Max of 10, 20, 15 (int): " + maxInt);
        System.out.println("Max of 3.5, 6.7, 2.8 (double): " + maxDouble);

        // Testing static members
        MyProgram.incrementCount();
        MyProgram.incrementCount();
    }
}
