import java.util.Scanner;
public class integern {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = scanner.nextInt();
        int a = n + n*n + n*n*n;
        System.out.println(a);
    }
}
