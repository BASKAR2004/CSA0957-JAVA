import java.util.ArrayList;
import java.util.Scanner;

public class PerfectSquaresInRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter lower range: ");
        int lowerRange = input.nextInt();
        System.out.print("Enter upper range: ");
        int upperRange = input.nextInt();
        ArrayList<Integer> perfectSquares = new ArrayList<>();
        for (int num = lowerRange; num <= upperRange; num++) {
            if (isPerfectSquare(num) && sumOfDigits(num) < 10) {
                perfectSquares.add(num);
            }
        }
        System.out.println("Perfect squares with sum of digits less than 10:");
        System.out.println(perfectSquares);
    }
    private static boolean isPerfectSquare(int num) {
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }
    private static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}