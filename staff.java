import java.util.Scanner;
public class staff {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Total no. of users : ");
        int total = scanner.nextInt();
        System.out.println("Enter No. of Staff users : ");
        int staff = scanner.nextInt();
        int nonteaching = staff / 3;
        int total_staff = staff + nonteaching;
        int students = total - total_staff;
        System.out.println("Total No. of student Users : "+students);
    }
}
