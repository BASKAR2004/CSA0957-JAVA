public class reversedigit {
    public static void main(String[] args) {
        int num = 12345;
        int reversedNum = 0;

        while (num > 0) {
            reversedNum = reversedNum * 10 + num % 10;
            num /= 10;
        }

        System.out.println("Reversed number: " + reversedNum);
    }
}
