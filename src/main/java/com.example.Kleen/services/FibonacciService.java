package com.example.Kleen.services;

public class FibonacciService {

    // Method to calculate the nth Fibonacci number recursively
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        // Example usage:
        int n = 10; // Calculate the 10th Fibonacci number
        int fibNumber = fibonacci(n);
        System.out.printf("The %dth Fibonacci number is: %d%n", n, fibNumber);
    }
}
