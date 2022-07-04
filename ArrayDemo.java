import java.util.Scanner;
import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int[] demoArray = new int[5];
            System.out.print("Enter elements of array: ");
            for (int i = 0; i < 5; i++) {
                demoArray[i] = input.nextInt();
            }
            int[] copiedArray = new int[5];
            copiedArray = Arrays.copyOfRange(demoArray, 0, demoArray.length);
            System.out.println("Real Array is " + Arrays.toString(demoArray));
            System.out.println("Length of array is " + demoArray.length);
            System.out.println("Copied Array is " + Arrays.toString(copiedArray));
            System.out.println("Comparing two arrays: " + Arrays.equals(demoArray, copiedArray));
            Arrays.sort(demoArray);
            System.out.println("Sorting: " + Arrays.toString(demoArray));
            System.out.println("Searching for 5: " + Arrays.binarySearch(demoArray, 5));
        }
    }
}
