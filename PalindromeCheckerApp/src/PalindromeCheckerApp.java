import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class PalindromeCheckerApp {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Recursive Palindrome Checker ===");
        System.out.print("Input : ");
        String input = sc.nextLine();

        boolean result = check(input, 0, input.length() - 1);

        System.out.println("Is Palindrome? : " + result);

        sc.close();
    }

    /**
     * Recursively checks whether a string is palindrome.
     *
     * @param s     Input string
     * @param start Starting index
     * @param end   Ending index
     * @return true if palindrome, otherwise false
     */
    private static boolean check(String s, int start, int end) {

        // Base case: if pointers cross, string is palindrome
        if (start >= end) {
            return true;
        }

        // If mismatch found, not palindrome
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive call for inner substring
        return check(s, start + 1, end - 1);
    }
}

