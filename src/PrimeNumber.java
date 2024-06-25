import java.util.Scanner;

public class PrimeNumber
{
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array to hold the integers
        int[] array = new int[size];

        // Ask the user to enter each integer
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {

            array[i] = scanner.nextInt();
        }

        // Find and print prime numbers in the array
        System.out.println("Prime numbers in the array:");
        for (int number : array) {
            if (isPrime(number)) {
                System.out.println(number);
            }
        }

        // Close the scanner
        scanner.close();
    }

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        // Handle edge cases
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
