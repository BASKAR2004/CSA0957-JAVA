import java.util.Scanner;
public class RomanToNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Roman : ");
        String roman = scanner.nextLine();

        int result = romanToNumber(roman);

        if (result == -1) {
            System.out.println("Invalid Roman numeral.");
        } else {
            System.out.println("The Roman numeral " + roman + " is: " + result);
        }
    }
    public static int romanToNumber(String roman) {
        int result = 0;
        int[] values = new int[roman.length()];
        for (int i = 0; i < roman.length(); i++) {
            char c = roman.charAt(i);
            switch (c) {
                case 'I':
                    values[i] = 1;
                    break;
                case 'V':
                    values[i] = 5;
                    break;
                case 'X':
                    values[i] = 10;
                    break;
                case 'L':
                    values[i] = 50;
                    break;
                case 'C':
                    values[i] = 100;
                    break;
                case 'D':
                    values[i] = 500;
                    break;
                case 'M':
                    values[i] = 1000;
                    break;
                default:
                    return -1;
            }
        }
        for (int i = 0; i < values.length; i++) {
            if (i < values.length - 1 && values[i] < values[i + 1]) {
                result -= values[i];
            } else {
                result += values[i];
            }
        }
        return result;
    }
}