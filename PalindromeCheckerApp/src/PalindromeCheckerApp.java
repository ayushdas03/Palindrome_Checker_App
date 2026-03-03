import java.util.Scanner;

// Strategy Interface
interface PalindromeStrategy {
    boolean isPalindrome(String input);
}

// Strategy 1: Reverse String Method
class ReversePalindromeStrategy implements PalindromeStrategy {

    public boolean isPalindrome(String input) {
        if (input == null) return false;

        String cleaned = input.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }
}

// Strategy 2: Two-Pointer Method
class TwoPointerPalindromeStrategy implements PalindromeStrategy {

    public boolean isPalindrome(String input) {
        if (input == null) return false;

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

// Context Class
class PalindromeContext {

    private PalindromeStrategy strategy;

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean executeStrategy(String input) {
        return strategy.isPalindrome(input);
    }
}

// Main Application
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PalindromeContext context = new PalindromeContext();

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        System.out.println("Choose Algorithm:");
        System.out.println("1. Reverse String Method");
        System.out.println("2. Two Pointer Method");

        int choice = scanner.nextInt();

        if (choice == 1) {
            context.setStrategy(new ReversePalindromeStrategy());
        } else {
            context.setStrategy(new TwoPointerPalindromeStrategy());
        }

        boolean result = context.executeStrategy(input);

        if (result) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is NOT a palindrome.");
        }

        scanner.close();
    }
}