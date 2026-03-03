import java.util.Scanner;

// Service class (Business Logic)
class PalindromeService {

    // Method to check palindrome (case-insensitive & space-ignored)
    public boolean isPalindrome(String input) {
        if (input == null) {
            return false;
        }

        // Remove spaces and convert to lowercase
        String cleaned = input.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}

// Main Application Class
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PalindromeService service = new PalindromeService();

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        boolean result = service.isPalindrome(input);

        if (result) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is NOT a palindrome.");
        }

        scanner.close();
    }
}