public class ArmstrongNumbers {
    public static void main(String[] args) {
        for (int num = 1; num <= 600; num++) {
            // Check if the number is an Armstrong number
            if (isArmstrong(num)) {
                System.out.println(num);
            }
        }
    }
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;
        int numDigits = String.valueOf(number).length();

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numDigits);
            number /= 10;
        }
        return sum == originalNumber;
    }
}
