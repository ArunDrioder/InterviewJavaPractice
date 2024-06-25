import java.util.Arrays;
import java.util.Scanner;

public class AscendingOrder
{
    public static void main(String[] args)
    {
        System.out.println("Enter the Size of Array");
        Scanner scan = new Scanner(System.in);
        int  arraySize = scan.nextInt();
        int[] ascendingOrderArray = new int[arraySize];
        System.out.println("Enter the elements");
        for (int i = 0; i<arraySize;i++)
        {
            ascendingOrderArray[i] = scan.nextInt();
        }

        Arrays.sort(ascendingOrderArray);
        System.out.println("Ascending Order is");
        for (int arrayInt : ascendingOrderArray)
            System.out.println(arrayInt);

    }
}
