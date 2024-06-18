import java.util.Scanner;
public class DaysToYearsWeeksDays{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the no of days  :");
        int days =scanner.nextInt();
        int years = days / 365;
        int remainingDays = days % 365;
        int weeks = remainingDays / 7;
        remainingDays=remainingDays %7;
        System.out.println(days + " days is equivalent to:");
        System.out.println("Years: " + years);
        System.out.println("Weeks: " + weeks);
        System.out.println("Days: " + remainingDays);
    }
}