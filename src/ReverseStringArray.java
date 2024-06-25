import java.util.Scanner;

public class ReverseStringArray
{
    public static void main(String[] args)
    {
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

        // Reverse the array
        reverseArray(array);

        // Print the reversed array
        System.out.println("Reversed array:");
        for (String str : array) {
            System.out.println(str);
        }

        // Close the scanner
        scanner.close();
    }

    // Method to reverse the array
    public static void reverseArray(String[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            // Swap the elements
            String temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            // Move the pointers towards the center
            left++;
            right--;
        }

    }
}
