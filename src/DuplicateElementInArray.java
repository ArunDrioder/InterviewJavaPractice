import java.util.HashSet;
import java.util.Scanner;

public class DuplicateElementInArray
{
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Create an array to hold the strings
        String[] array = new String[size];

        // Ask the user to enter each string
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {

            array[i] = scanner.nextLine();
        }

        // Find and print duplicate elements in the array
        findAndPrintDuplicates(array);

        // Close the scanner
        scanner.close();
    }

    private static void findAndPrintDuplicates(String[] array)
    {
        // Use a HashSet to store unique elements
        HashSet<String> set = new HashSet<>();
        // HashSet to store duplicate elements
        HashSet<String> duplicates = new HashSet<>();

        for (String element : array) {
            if (!set.add(element)) { // If element is already in set, add to duplicates
                duplicates.add(element);
            }
        }

        // Print duplicate elements
        if (duplicates.isEmpty()) {
            System.out.println("No duplicate elements found.");
        } else {
            System.out.println("Duplicate elements in the array:");
            for (String duplicate : duplicates) {
                System.out.println(duplicate);
            }
        }
    }

    }

