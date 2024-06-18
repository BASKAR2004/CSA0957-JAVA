import java.util.Scanner;
public class oddfebino {
    public static void main(String[] args) {
        int a = 0, b = 1, n, sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the limit for febinocci : ");
        n = scanner.nextInt();
        System.out.println("Fibonacci sequence up to " + n + " terms:");
        System.out.println(a);
        System.out.println(b);
        for (int i = 3; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
            System.out.println(c);
            if (c % 2 != 0) {
                sum = sum + c;
            }
        }
        System.out.println("The sum of odd Fibonacci numbers: " + sum);
    }
    }

