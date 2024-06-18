import java.util.Scanner;
public class SecondLargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        if (size < 2) {
            System.out.println("Array size must be at least 2 to find the second largest element.");
            return;
        }
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int secondLargest = findSecondLargest(array);
        System.out.println("\nThe second largest number in the array is: " + secondLargest);
        scanner.close();
    }
    public static int findSecondLargest(int[] array) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int element : array) {
            if (element > largest) {
                secondLargest = largest;
                largest = element;
            } else if (element > secondLargest && element < largest) {
                secondLargest = element;
            }
        }

        return secondLargest;
    }
}
