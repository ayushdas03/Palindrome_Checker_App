import java.util.Scanner;

// Strategy Interface
interface PalindromeStrategy {
    boolean isPalindrome(String input);
}

// Strategy 1: Reverse String Method
class ReversePalindromeStrategy implements PalindromeStrategy {

    public boolean isPalindrome(String input) {
        String cleaned = input.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }
}

// Strategy 2: Two Pointer Method
class TwoPointerPalindromeStrategy implements PalindromeStrategy {

    public boolean isPalindrome(String input) {
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

// Main Application
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        PalindromeStrategy reverseStrategy = new ReversePalindromeStrategy();
        PalindromeStrategy twoPointerStrategy = new TwoPointerPalindromeStrategy();

        // Measure Reverse Strategy Time
        long start1 = System.nanoTime();
        boolean result1 = reverseStrategy.isPalindrome(input);
        long end1 = System.nanoTime();
        long time1 = end1 - start1;

        // Measure Two Pointer Strategy Time
        long start2 = System.nanoTime();
        boolean result2 = twoPointerStrategy.isPalindrome(input);
        long end2 = System.nanoTime();
        long time2 = end2 - start2;

        System.out.println("\nReverse Method Result: " + result1);
        System.out.println("Reverse Method Time (nanoseconds): " + time1);

        System.out.println("\nTwo Pointer Method Result: " + result2);
        System.out.println("Two Pointer Method Time (nanoseconds): " + time2);

        if (time1 < time2) {
            System.out.println("\nReverse Method is faster.");
        } else if (time2 < time1) {
            System.out.println("\nTwo Pointer Method is faster.");
        } else {
            System.out.println("\nBoth methods took equal time.");
        }

        scanner.close();
    }
}