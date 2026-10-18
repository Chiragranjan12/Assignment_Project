package jdbc;

import java.util.Scanner;

public class JavaTasks {

    // 1. Matrix Addition and Subtraction
    public static void matrixOperations() {
        int[][] a = { {1, 2}, {3, 4} };
        int[][] b = { {5, 6}, {7, 8} };
        int[][] sum = new int[2][2];
        int[][] diff = new int[2][2];

        System.out.println("Matrix Addition:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                sum[i][j] = a[i][j] + b[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matrix Subtraction:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                diff[i][j] = a[i][j] - b[i][j];
                System.out.print(diff[i][j] + " ");
            }
            System.out.println();
        }
    }

    // 2. String Reverse and Palindrome Check
    public static void stringReverseAndPalindrome(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        System.out.println("Original: " + str);
        System.out.println("Reversed: " + reversed);

        if (str.equals(reversed)) {
            System.out.println("It's a palindrome.");
        } else {
            System.out.println("Not a palindrome.");
        }
    }

    // 3. String Comparison
    public static void stringComparison(String s1, String s2) {
        System.out.println("Using equals(): " + s1.equals(s2));
        System.out.println("Using compareTo(): " + s1.compareTo(s2));
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Matrix operations
        matrixOperations();

        // String reverse & palindrome
        System.out.print("\nEnter a string to check palindrome: ");
        String input = sc.nextLine();
        stringReverseAndPalindrome(input);

        // String comparison
        System.out.print("\nEnter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();
        stringComparison(str1, str2);

        sc.close();
    }
}
