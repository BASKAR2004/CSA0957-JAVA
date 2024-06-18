import java.util.Scanner;
public class sumofodd {
    public static void main(String[] args) {
        int sum = 0;
        System.out.print("Enter a number : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int length = String.valueOf(n).length();
        while(n!=0) {
            int r = n % 10;
            sum = (int) (sum + Math.pow(r, length));
            n /= 10;
            }
        System.out.print(sum);
        }
    }


