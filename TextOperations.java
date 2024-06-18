import java.util.Scanner;

public class TextOperations {
    
    // Method to get the length of the text
    public static int getLength(String text) {
        return text.length();
    }

    // Method to get the subset of the text
    public static String getSubset(String text, int start, int end) {
        if (start < 0 || end > text.length() || start > end) {
            return "Invalid range";
        }
        return text.substring(start, end);
    }

    // Method to count vowels and consonants
    public static void countVowelsAndConsonants(String text) {
        int vowels = 0;
        int consonants = 0;
        String vowelsList = "aeiouAEIOU";

        for (char ch : text.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (vowelsList.indexOf(ch) >= 0) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    // Method to count words and sentences
    public static void countWordsAndSentences(String text) {
        String[] words = text.split("\\s+");
        String[] sentences = text.split("[.!?]");
        System.out.println("Number of words: " + words.length);
        System.out.println("Number of sentences: " + sentences.length);
    }

    // Method to check if the text is a palindrome
    public static boolean isPalindrome(String text) {
        String cleanText = text.replaceAll("[\\W_]", "").toLowerCase();
        String reversedText = new StringBuilder(cleanText).reverse().toString();
        return cleanText.equals(reversedText);
    }

    // Method to convert text to uppercase and lowercase
    public static void convertCase(String text) {
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text;
        int choice;

        System.out.println("Enter the text: ");
        text = scanner.nextLine();

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Length of the given text");
            System.out.println("2. Find the subset of the given text");
            System.out.println("3. Count vowels and consonants of the given text");
            System.out.println("4. Count number of words and sentences in the given text");
            System.out.println("5. Check if the given text is palindrome or not");
            System.out.println("6. Convert the given text into uppercase and lowercase");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Length: " + getLength(text));
                    break;
                case 2:
                    System.out.print("Enter start index: ");
                    int start = scanner.nextInt();
                    System.out.print("Enter end index: ");
                    int end = scanner.nextInt();
                    System.out.println("Subset: " + getSubset(text, start, end));
                    break;
                case 3:
                    countVowelsAndConsonants(text);
                    break;
                case 4:
                    countWordsAndSentences(text);
                    break;
                case 5:
                    System.out.println("Is palindrome: " + isPalindrome(text));
                    break;
                case 6:
                    convertCase(text);
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 7);

        scanner.close();
    }
}
