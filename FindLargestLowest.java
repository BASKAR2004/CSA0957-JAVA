public class FindLargestLowest{
    public static void main(String[] args) {
        int[] numbers = {10, 5, 20, 30, 15};
        int largest = numbers[0];
        int lowest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
            if (numbers[i] < lowest) {
                lowest = numbers[i];
            }
        }
        System.out.println("Largest number: " + largest);
        System.out.println("Lowest number: " + lowest);
    }
}
