import java.util.Scanner;

public class test8 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Account Number : ");
        int account_number = scanner.nextInt();
        System.out.print("Enter your name : ");
        String name = scanner.next();
        System.out.print("Enter the Type of your Account (Savings/Current) : ");
        String type = scanner.next();
        int balance = 10000;
        System.out.println("Enter an Operation : " +
                "1) Deposit " +
                "2) Withdrawl : ");
        int operation = scanner.nextInt();
        int total = 0;
        switch (operation) {
            case 1:
                System.out.print("Enter the Deposit Amount : ");
                int deposit = scanner.nextInt();
                total = balance + deposit;
            case 2:
                System.out.print("Enter the Withdrawl Amount : ");
                int withdrawl = scanner.nextInt();
                total = balance - withdrawl;
                System.out.println("Balance After withdrawl : " + total);
        }
        System.out.print("Account Number : " + account_number + " Name : " + name + " Account Type : " + type + " Balance : " + total);

    }

}
