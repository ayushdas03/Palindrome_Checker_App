import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println(" Stack-Based Palindrome Checker ");
        System.out.println("======================================");

        System.out.print("Input : ");
        String input = sc.nextLine();

        boolean result = checkUsingStack(input);

        System.out.println("Is Palindrome? : " + result);

        sc.close();
    }

    /**
     * Checks whether a string is palindrome using Stack.
     *
     * @param s Input string
     * @return true if palindrome, otherwise false
     */
    private static boolean checkUsingStack(String s) {

        Stack<Character> stack = new Stack<>();

        // Push all characters onto stack
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }

        // Compare characters while popping
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}
