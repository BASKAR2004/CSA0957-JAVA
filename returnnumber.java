import java.awt.*;
import java.util.Scanner;
public class returnnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        System.out.print("Enter N : ");
        int n = scanner.nextInt();
        while (n > 0) {
            if (n % 2 == 0) {
                int sum = n / 2;
                n=sum;

            } else {
                n = n - 1;
            }
            i++;
        }
        System.out.print(i);
    }
}
