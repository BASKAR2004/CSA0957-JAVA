public class reverse {
    public static void main(String[] args) {
        int n = 950016;
        int reversedNumber = 0;

        while (n != 0) {
            int r = n % 10;
            reversedNumber = reversedNumber * 10 + r;
            n /= 10;
        }

        System.out.println("Reversed number: " + reversedNumber);
    }
}
