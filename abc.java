public class abc {
    public static void main(String[] args) {
        int n = 100; // Change 'n' to the desired value
        System.out.println("Prime Numbers from 1 to " + n + " are:");
        int number = 2;
        while (number <= n) {
            boolean isPrime = true;
            int i = 2;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            }
            if (isPrime) {
                System.out.print(number + " ");
            }
            number++;
        }
    }
}
