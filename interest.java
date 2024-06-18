import java.util.Scanner;

public class interest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter the years: ");
        double time = scanner.nextDouble();
        double rate;
        System.out.print("Are you a senior citizen? (yes/no): ");
        String seniorCitizen = scanner.next();
        if (seniorCitizen.equalsIgnoreCase("yes")) {
            rate = 0.10;
        } else {
            rate = 0.05;         }
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple interest: " + simpleInterest);
    }
}
