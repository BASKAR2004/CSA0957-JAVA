import java.util.Scanner;
public class convertdays {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter No. of days : ");
        int days = scanner.nextInt();
        int year = days / 365;
        int remainingdays = days % 365;
        int weeks = remainingdays / 7;
        remainingdays = remainingdays % 7;
        System.out.println("No. of Years : "+year);
        System.out.println("No. of weeks : "+weeks);
        System.out.println("No. of Days : "+remainingdays);
    }
}
