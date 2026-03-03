import java.util.Scanner;

public class PalindromeCheckerApp {

    // Method to check palindrome (ignores case and spaces)
    public static boolean isPalindrome(String input) {

        // Remove all spaces
        String cleaned = input.replaceAll("\\s+", "");

        // Convert to lowercase
        cleaned = cleaned.toLowerCase();

        // Reverse the string
        String reversed = new StringBuilder(cleaned).reverse().toString();

        // Compare original cleaned string with reversed string
        return cleaned.equals(reversed);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("It is a palindrome (ignoring case and spaces).");
        } else {
            System.out.println("It is NOT a palindrome.");
        }

        scanner.close();
    }
}