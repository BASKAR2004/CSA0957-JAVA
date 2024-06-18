import java.util.Scanner;
public class test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string or text (enter '.' to stop):");
        int count = 0;
        String input;
        while (true) {
            input = sc.nextLine();
            if (input.equals(".")) {
                break;
            }
            count++;
        }
        System.out.println("Number of lines: " + count);
    }
}