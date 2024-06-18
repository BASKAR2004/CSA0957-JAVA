import java.util.Scanner;

public class length {
    public static int length(String s) {
        String[] words = s.split(" ");
        if (words.length == 0) {
            return 0;
        }
        return words[words.length - 1].length();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();
        int length = length(s);
        System.out.println("Length of the last word: " + length);
        scanner.close();
    }
}

