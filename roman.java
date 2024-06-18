import java.util.Scanner;

public class romannumbers {

    public static int romanToInt(String s) {
        int total = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            int currentValue = valueOfRoman(currentChar);

            if (currentValue < prevValue) {
                total -= currentValue;
            } else {
                total += currentValue;
            }
            prevValue = currentValue;
        }

        return total;
    }

    public static int valueOfRoman(char ch) {
        if (ch == 'I') return 1;
        if (ch == 'V') return 5;
        if (ch == 'X') return 10;
        return 0;  
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Roman numeral (I to X): ");
        String roman = scanner.nextLine().toUpperCase();

        int result = romanToInt(roman);

        System.out.println("Roman numeral " + roman + " is " + result);

        scanner.close();
    }
}