import java.util.Scanner;
public class test2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = scanner.nextInt();
        int number=1;
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
